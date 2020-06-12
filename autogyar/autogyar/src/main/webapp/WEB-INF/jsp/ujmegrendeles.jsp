<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
<form action="/rogzit" method="post" class="input-append">

<div class="form-group">
<label for="nev">Megrendelő neve: </label><input type="text" name="nev" required>
</div>

<div class="form-group control-group">
<label for="type">Autó típusa: </label>
<select name="type">
	<option disabled selected value="" >Válassz a menüből</option>
        <option>Hatchback</option>
        <option>Sedan</option>
        <option>SUV</option>
</select>
</div>

<div class="form-group">
<label for="nev">Kialkudott összeg: </label><input type="number" name="osszeg" required>
</div>

<!-- Megjegyzéshez dolgok -->
<!-- <div class="form-group"> -->
<!-- <label for="text">Megjegyzés: </label><textarea class="form-control" name="text" rows="4"></textarea> -->
<!-- </div> -->



<div class="form-group">
            <div id="inputFormRow">
                <div class="input-group mb-3">
                    <textarea name="text" class="form-control m-input" placeholder="Enter title" autocomplete="off"></textarea>
                    <div class="input-group-append">
                        <button id="removeRow" type="button" class="btn btn-danger">Remove</button>
                    </div>
                </div>
            </div>

            <div id="newRow"></div>
            <button id="addRow" type="button" class="btn btn-info">Add Row</button>
        </div>
    



<div class="form-group">
<input type="submit" class="btn btn-primary" value="Mentés">
</div>
</form>
</div>

<!-- Javascript add remove -->

<script type="text/javascript">
    // add row
    $("#addRow").click(function () {
        var html = '';
        html += '<div id="inputFormRow">';
        html += '<div class="input-group mb-3">';
        html += '<textarea name="text" class="form-control m-input" placeholder="Enter title" autocomplete="off"></textarea>';
        html += '<div class="input-group-append">';
        html += '<button id="removeRow" type="button" class="btn btn-danger">Remove</button>';
        html += '</div>';
        html += '</div>';

        $('#newRow').append(html);
    });

    // remove row
    $(document).on('click', '#removeRow', function () {
        $(this).closest('#inputFormRow').remove();
    });
</script>

