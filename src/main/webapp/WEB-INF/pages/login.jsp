<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>财务管理系统</title>
<style type="text/css">

*{overflow:hidden; font-size:9pt;}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(<%=request.getContextPath() %>/images/bg.gif);
	background-repeat: repeat-x;
}
#sub:hover{
	cursor: pointer;
}
</style>
<script src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
<script type="text/javascript">
	function checkName(){
		var name=$("#name");
		var v=name.val();
		if(v.length<=0){
			alert("用户名不能为空！");
			return false;
		}
		var flag=false;
    	var pay_id="";
    	$.ajax({
			url:"ice/checkName",
			async : false, 
			type: "post",  
			dataType: "json",
			data: {
				"name":v
			},
			success: function(res){
				if(res==null){
					flag=true;
				}
			}
    	});
    	if(flag){
    		alert("用户名不存在！");
    		return false;
    	}
    	return true;
	}
	function checkPass(){
		var pass=$("#pass");
		var v=pass.val();
		var name=$("#name").val();
		if(v.length<=0){
			alert("密码不能为空！");
			return false;
		}
		var flag=false;
    	var pay_id="";
    	$.ajax({
			url:"ice/checkPass",
			async : false, 
			type: "post",  
			dataType: "json",
			data: {
				"name":name,
				"pass":v
			},
			success: function(res){
				if(res==null){
					flag=true;
				}
			}
    	});
    	if(flag){
    		alert("密码错误！");
    		return false;
    	}
    	return true;
	}
</script>
</head>

<body>
<table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="561" style="background:url(<%=request.getContextPath() %>/images/lbg.gif)"><table width="940" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="238" style="background:url(<%=request.getContextPath() %>/images/login01.jpg)">&nbsp;</td>
          </tr>
          <tr>
            <td height="190"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="208" height="190" style="background:url(<%=request.getContextPath() %>/images/login02.jpg)">&nbsp;</td>
                <td width="518" style="background:url(<%=request.getContextPath() %>/images/login03.jpg)"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="40" height="50"><img src="<%=request.getContextPath() %>/images/user.gif" width="30" height="30"></td>
                    <td width="38" height="50">用户</td>
                    <td width="242" height="50"><input type="text" name="textfield" id="name" style="width:164px; height:32px; line-height:34px; background:url(<%=request.getContextPath() %>/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;"></td>
                  </tr>
                  <tr>
                    <td height="50"><img src="<%=request.getContextPath() %>/images/password.gif" width="28" height="32"></td>
                    <td height="50">密码</td>
                    <td height="50"><input type="password" name="textfield2" id="pass" style="width:164px; height:32px; line-height:34px; background:url(<%=request.getContextPath() %>/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; "></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td height="40">&nbsp;</td>
                    <td height="60" id="sub"><img src="<%=request.getContextPath() %>/images/login.gif" width="95" height="34"></td>
                  </tr>
                </table></td>
                <td width="214" style="background:url(<%=request.getContextPath() %>/images/login04.jpg)" >&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="133" style="background:url(<%=request.getContextPath() %>/images/login05.jpg)">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
