<!DOCTYPE html>
<html lang="en">
<head>
      
    <meta charset="UTF-8">
      <title>FreeMarkerTest</title>
</head>
<body>
<#--遍历List集合-->
<table border="1">
<#list lists as poe>
    <tr>
        <td>${poe.id}</td>
        <td>${poe.title}</td>
        <td>${poe.createdAt?datetime}</td>
        <td>${poe.updatedAt?datetime}</td>
        <td> ${poe.content}</td>
        <td>${poe.poetId}</td>
    </tr>
</#list>
</table>
</body>
</html>