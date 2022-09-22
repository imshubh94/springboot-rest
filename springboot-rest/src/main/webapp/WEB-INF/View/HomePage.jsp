<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Mobile</h1>  
       <form:form method="post" action="add">    
        <table >    
         <tr>    
          <td>id : </td>   
          <td><form:input path="id"  /></td>  
         </tr>    
         <tr>    
          <td>Company :</td>    
          <td><form:input path="Company" /></td>  
         </tr>   
         <tr>    
          <td>Model :</td>    
          <td><form:input path="Model" /></td>  
         </tr>   
          <tr>    
          <td>Price :</td>    
          <td><form:input path="Price" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Add Mobile" /></td>    
         </tr>    
        </table>    
       </form:form>