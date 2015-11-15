<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
        br.edu.ifpb.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%
      VolumeDAO dao = new VolumeDAO();
      List<Volume> volumes = dao.getAll();
      
   
      for (Volume volume : volumes ) {
      %>
		<tr>
			<td><%=volume.getTitulo() %></td>
			<td><%=volume.getAutor() %></td>
			<td><%=volume.getDescricao() %></td>
			<td><%=volume.getPags() %></td>
			<td><%=volume.getAno_publicacao() %></td>
			<td><%=volume.getEditora() %></td>
		</tr>
		<%
      }
      %>
	</table>

</body>
</html>