<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui@next/lib/theme-default/index.css">
</head>
<script src="https://cdn.bootcss.com/jquery/3.0.0/jquery.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.0.0/jquery.min.js"></script>
<style>
.el-row {
	margin-bottom: 20px;
	&:
	last-child
	{
	margin-bottom
	:
	0;
}

}
.el-col {
	border-radius: 4px;
}

.bg-purple-dark {
	background: #99a9bf;
}

.bg-purple {
	background: #d3dce6;
}

.bg-purple-light {
	background: #e5e9f2;
}

.grid-content {
	border-radius: 4px;
	min-height: 36px;
}

.row-bg {
	padding: 10px 0;
	background-color: #f9fafc;
}
</style>
<body>
	<div id="app">
		<el-row :gutter="20"> <el-col :span="8">
		<div class="grid-content bg-purple"></div>
		</el-col> <el-col :span="8">
		<div class="grid-content bg-purple">
			<el-input placeholder="请輸入查询" icon="search" v-model="input2"
				:on-icon-click="handleIconClick"> </el-input>
		</div>
		</el-col> <a href="/SemanticAnalysis/analysis">测试</a> <el-col :span="4">
		<div class="grid-content bg-purple"></div>
		</el-col> <el-col :span="4">
		<div class="grid-content bg-purple"></div>
		</el-col> </el-row>

	</div>
</body>



<!-- 先引入 Vue -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
new Vue({
	  el: '#app',
	  data: {
	    input2: ''
	  },
	methods: {
    	handleIconClick:function(ev) {
      	console.log(this.input2);
      	$.ajax({
			type : "post",
			dataType: "json",
			url : "/SemanticAnalysis/analysis",
			data : {
	            "query": this.input2,
	          },
			success : function(data, status) {
				alert("success")
			}
		});
    	}
  	}
	}) 
</script>

