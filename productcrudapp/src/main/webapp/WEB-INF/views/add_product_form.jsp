<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %><!--  base.jsp file ko use karne ke leye kiya gya h  -->
</head>                        <!-- "./ ka mtlb h current directory" -->
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 style=color:green class="text-center mb-3">FILL THE PRODUCT DETAILS</h1>

<form action="handle-product" method="post">

<div class="form-group">
<label for="name">Product Name</label>
<input type="text"
class="form-control"
id="name"
aria-describedby="emailHelp"
name="productName"
placeholder="Enter The Product Name Here"
style=color:blue>
</div>

<div class="form-group">

    <label  for="description">Product Description</label>
    <textarea 
    class="form-control"
    name="productDescription" 
    id="description"
      rows="5" 
      placeholder="Enter The Product Description Here"
      style=color:blue></textarea>
 </div>
 
 <div class="form-group">
<label for="price">Product Price</label>
<input type="text"
class="form-control"
id="price"
name="productPrice"
placeholder="Enter The Product Price Here"
style=color:blue>
</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Add</button>
</div>
</form>
</div>
</div>
</div>
</body>
</html>