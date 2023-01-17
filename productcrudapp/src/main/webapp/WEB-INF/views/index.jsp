<html>
<head>
<%@include file="./base.jsp" %><!--  base.jsp file ko use karne ke leye kiya gya h  -->
                        <!-- "./ ka mtlb h current directory" -->
                        
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
       <%@page isELIgnored="false" %>                    
</head>
<body>
    <div class="container mt-3">
    
        <div class="row">

           <div class="col-md-12">
           
               <h1 style=color:green class="text-center mb-3">WELCOME TO PRODUCT APP</h1>
               <table class="table table-sm table-dark">
  <thead>
    <tr>
      <th style=color:yellow scope="col">Product Id</th>
      <th style=color:yellow scope="col">Product Name</th>
      <th style=color:yellow scope="col">Product Description</th>
      <th style=color:yellow scope="col">Product Price</th>
      <th style=color:yellow scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${list}" var="p">
  
    <tr>
      <th style=color:green scope="row">${p.productId}</th>
      <td style=color:orange>${p.productName}</td>
      <td style=color:orange>${p.productDescription}</td>
      <td style=color:orange class="font-weight-bold">${p.productPrice}</td>
      <td>
      <a href="delete/${p.productId}"><i class="fa-sharp fa-solid fa-trash"></i></a>
      </td>
    </tr>
    
    </c:forEach>
  </tbody>
</table>
        <div class="container text-center">
        
       <a href="add-product" class="btn btn-outline-success">Add Product</a>
        </div>       
           </div>
</div>
</div>
</body>
</html>