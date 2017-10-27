<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <!-- 导入easyui的样式表 -->
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
    <link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
    <h2>平头哥支付后台管理系统</h2>
</div>
<div data-options="region:'south'" style="padding:5px;background:#eee;">
    系统版本：V2.0
</div>
<div data-options="region:'west'" style="width:200px;">
    <div id="menu" class="easyui-accordion">
        <div title="账户管理" data-options="selected:true,iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'account-info'}">账户信息</li>
                <li data-options="attributes:{'href':'account-history'}">账户历史信息</li>
            </ul>
        </div>
        <div title="用户管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'user-info'}">用户信息</li>
            </ul>
        </div>
        <div title="支付管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'pay-product'}">支付产品信息</li>
                <li data-options="attributes:{'href':'user-config'}">用户配置信息</li>
            </ul>
        </div>
        <div title="交易管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'pay-order'}">支付订单管理</li>
                <li data-options="attributes:{'href':'pay-history'}">支付记录管理</li>
            </ul>
        </div>
        <div title="结算管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'clear-record'}">结算记录管理</li>
            </ul>
        </div>
        <div title="对账管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'check-mistake'}">对账差错列表</li>
                <li data-options="attributes:{'href':'check-batch'}">对账批次列表</li>
                <li data-options="attributes:{'href':'check-scratch-pool'}">对账缓冲池列表</li>
            </ul>
        </div>
    </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
    <div id="tab" class="easyui-tabs" data-options="fit:true">
        <div title="欢迎页面" style="padding:20px;">欢迎进入平头哥支付</div>
    </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<!-- 导入moment.js-->
<script src="js/moment/moment-with-locales.js"></script>
<!--使用中文格式-->
<script>
    moment.locale('zh-cn');
</script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->
<script>
    ttshop.registerMenuEvent();
</script>

<%--百度富文本编辑器的添加--%>
<%--配置文件js--%>
<script src="js/ueditor/ueditor.config.js"></script>
<%--脚本文件--%>
<script src="js/ueditor/ueditor.all.js"></script>

</body>
</html>