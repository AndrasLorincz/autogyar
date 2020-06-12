<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div>
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">Megrendelő</th>
	      <th scope="col">Autó típusa</th>
	      <th scope="col">Kialkudott öszeg</th>
	      <th scope="col">Megrendelés státusza</th>
	    </tr>
	    </thead>
	    <tbody>
		<c:forEach var="megrendeles" items="${megrendelesek}">
			<tr>
			<th scope="row">${megrendeles.nev }</th>
			<td>${megrendeles.auto.type}</td>
			<td>${megrendeles.osszeg}</td>
			<td>${megrendeles.status}</td>
			
			
						<!-- Button to Open the Modal -->
			<td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="&#35${megrendeles.nev}">
			  Megjegyzések
			</button></td>
			<!-- The Modal -->
			<c:forEach var="megrendeles" items="${megrendelesek}">
			<div class="modal" id="${megrendeles.nev}">
			  <div class="modal-dialog">
			    <div class="modal-content">
			    
			<c:forEach var="megjegyzes" items="${megrendeles.megjegyzesek}">
			      <!-- Modal Header -->
			      <div class="modal-header">
			        <h4 class="modal-title">${megjegyzes.crd}</h4>
			        <button class="btn btn-danger btn-sm rounded-0" type="button" data-toggle="tooltip" data-placement="top" title="Delete" onclick="window.location.href='/deleteComment?idcomment=${megjegyzes.id}&idmegrendel=${megrendeles.id}'"><i class="fa fa-trash"></i></button>
			      </div>
			
			
			      <!-- Modal body -->
			      <div class="modal-body">
			        ${megjegyzes.text}
			      </div>
			</c:forEach>
			      <!-- Modal footer -->
			      <div class="modal-footer">
			        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
			      </div>
			
			    </div>
			  </div>
			</div>
			</c:forEach>
						
			</tr>
		</c:forEach>
		</tbody>
	</table>

</div>