<%@ page import="java.util.*" %>
<%@ page import="com.mycompany.mavenproject5.cmodel.Employee" %>
<%@ page import="com.mycompany.mavenproject5.cmodel.EmployeeDAO" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Insert Employee</title>
    </head>
    <body>
        <h2>Insert New customer</h2>
        <form action="insertEmployee.jsp" method="post">
            Name: <input type="text" name="name"><br>
            Address: <input type="text" name="address"><br>
            Tel number: <input type="text" name="tnumber"><br>
            Guests: <input type="text" name="guests"><br>
            Vehicle Type: <input type="text" name="vehicle"><br>
             Destinanation: <input type="text" name="destinanation"><br>
            <input type="submit" value="Insert">
        </form>

        <%
            //        if ("POST".equalsIgnoreCase(request.getMethod())) {
            //            String name = request.getParameter("name");
            //            int age = Integer.parseInt(request.getParameter("age"));
            //            String department = request.getParameter("department");
            //
            //            Employee employee = new Employee(name, age, department);
            //            EmployeeDAO dao = new EmployeeDAO();
            //            dao.addEmployee(employee);
            //            out.println("<p>Employee added successfully!</p>");
            //        }


        %>


        <%            if ("POST".equalsIgnoreCase(request.getMethod())) {
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String tnumber = request.getParameter("tnumber");
                int guests = Integer.parseInt(request.getParameter("guests"));
                String vehicle = request.getParameter("vehicle");
                String destinanation = request.getParameter("destinanation");


                Employee employee = new Employee(name, address, tnumber, guests, vehicle, destinanation);
                EmployeeDAO dao = new EmployeeDAO();

                if (dao.getConnection() != null) {
                    dao.addEmployee(employee);
                    out.println("<p> added successfully!</p>");
                } else {
                    out.println("<p>Error: Database connection failed!</p>");
                }

                dao.closeConnection();
            }
        %>

    </body>
</html>
