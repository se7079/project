<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../boardHeader.jsp"%>
<title>게시글 목록</title>
</head>
<body class="is-preload">
	<div id="wrapper">
		<div id="main">
			<section class="post">
				<div class="table-wrapper">
					<h2>게시글 목록</h2>
					<table>
						<thead>
							<tr>
								<td>글번호</td>
								<td>제목</td>
								<td>조회수</td>
								<td>작성자</td>
							</tr>
						</thead>
						<tbody id="tbody">
							<!-- Ajax로 게시물 불러올 자리 -->
						</tbody>
					</table>
				</div>
				<div>
					<a href="boardWrite" class="button">글 작성</a>
				</div>
			</section>
		</div>
	</div>

	<%@ include file="../boardFooter.jsp"%>