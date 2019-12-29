<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" class="no-js">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body oncontextmenu="return false">
		<h1>younahShop</h1>
		
		<h2>검색</h2>
		<ul>
			<li>검색어 : <input id="txtSearch" type="text" value="" style="border: 1px solid gray"> <a id="goSearch" href="#" onclick="script:goSearch();">검색</a></li>
		</ul>
		<pre>--------------------------------------------------------------------------------------</pre>
		
		<h2>Goods List</h2>
		<table>
			<colgroup>
				<col width="*" />
				<col width="10%" />
				<col width="30%" />
				<col width="10%" />
			</colgroup>
			<thead>
				<tr>
					<th>Goods Name</th>
					<th>Stock</th>
					<th>Offer</th>
					<th>REG_DATE</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>우산</td>
					<td>1</td>
					<td>신유나</td>
					<td>2019-12-12</td>
				</tr>
				<c:forEach items="${GoodsList}" var="goods" varStatus="status">
				<tr>
					<td>"${Goods.goodsNM}"</td>
					<td>"${Goods.goodsStock}"</td>
					<td>"${Goods.regUser}"</td>
					<td>"${Goods.regDt}"</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>