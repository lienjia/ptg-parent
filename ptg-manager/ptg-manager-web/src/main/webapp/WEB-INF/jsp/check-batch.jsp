<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbar2">
    <div style="padding: 5px; background-color: #fff;">
        <label>账单时间：</label>
        <input class="easyui-datebox" type="text" id="time">
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm2()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>

    </div>
</div>
<table id="table2"></table>
<script>
    function searchForm2(){
        $("#table2").datagrid('load',{
            time:$('#time').datebox('getValue')
        })
    }


    $("#table2").datagrid({
        multiSort:true,
        pageSize:10,
        pageList:[1,10,15,20,25,30,40,50],
        toolbar:'#toolbar2',
        fit:true,
        pagination:true,
        url:'batch',
        columns:[[
            {field:'id',title:'序号',width:100,sortable:true},
            {field:'batchNo',title:'对账批次号',width:100},
            {field:'billType',title:'支付方式',width:100},
            {field:'billDate',title:'账单日期',width:100,formatter:function(value,row,index){
                return moment(value).format('YYYY-MM-DD');
            }},
            {field:'mistakeCount',title:'差错总单数',width:100},
            {field:'tradeCount',title:'平台总交易',width:100},
            {field:'bankTradeCount',title:'银行总交易',width:100},
            {field:'tradeAmount',title:'平台交易总金额',width:100},
            {field:'bankTradeAmount',title:'银行交易总金额',width:100},
            {field:'refundAmount',title:'平台总手续费',width:100},
            {field:'bankRefundAmount',title:'银行总手续费',width:100},
            {field:'status',title:'状态',width:100},
            {field:'bankErrMsg',title:'银行返回的错误信息',width:100},
            {field:'checkFailMsg',title:'解析失败异常',width:100}

        ]]
    });
</script>