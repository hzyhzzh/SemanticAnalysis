<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<!-- 引入样式 -->
<link rel="stylesheet" href="https://unpkg.com/element-ui@next/lib/theme-default/index.css">
</head>
<body>
<div id="app">
  <el-button @click.native="visible = true">按钮</el-button>
  <el-dialog v-model="visible" title="Hello world">
    <p>欢迎使用Element</p>
  </el-dialog>
</div>
</body>
<!-- 先引入 Vue -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
  new Vue({
    el: '#app',
    data: function() {
      return { visible: false }
    }
  })
</script>