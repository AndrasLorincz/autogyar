<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="row">
   <c:forEach var = "megrendeles" items="${megrendelesek}">
 <div class="col-sm-4 h-100">
	 <div class="card text-white bg-info mb-3" style="width:100%; margin: 10px;">
	    <div class="card-body">
	     <h4 class="card-title" style="color: #f8b700">Megrendelő lap</h4>
<!-- 	     <hr class="mt-2 mb-3" style="border: 1px solid black;"/> -->
	     <table class="table table-hover">
	     <tr>
	      <th scope="row">Megrendelő neve: </th>
	      <td>${megrendeles.nev}</td>
	      </tr>
	      
	      <tr>
	      <th scope="row">Megrendelt autó: </th>
	      <td>${megrendeles.auto.type}</td>
	      </tr>
	      
	      <tr>
	      <th scope="row">Kialkudott összeg: </th>
	      <td>${megrendeles.osszeg}</td>
	      </tr>
	      
	      <tr>
	      <th scope="row">Megrendelés státusza: </th>
	      <td>${megrendeles.status}</td>
	      </tr>
	      </table>
	      <div class="card-footer" style="margin:-5px;">
	      <center>
	      <table>
	      <tr>
	      <td><a href="/statusModosit" class="btn btn-primary" style="color: #f8b700">Elfogad</a></td>
	      <td><a href="/Modosit" class="btn btn-primary" style="color: #f8b700">Modosít</a></td>
	      <td><a href="/megrendeles" class="btn btn-primary" style="color: #f8b700">Megjegyzések</a></td>
	      </tr>
	      </table>
	      </center>
	      </div>
	      
	      
	    </div>
	 </div>
</div>
 </c:forEach>

 
 </div>