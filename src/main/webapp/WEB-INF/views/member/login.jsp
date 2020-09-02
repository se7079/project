<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../boardHeader.jsp"%>
<title>로그인</title>
</head>
<body class="is-preload">
	<div id="wrapper">
		<div id="main">
			<section class="post">
				<c:if test="${not empty user}">
					<c:redirect url="/board/list" />
				</c:if>
				<div align="center">
					<h1>로그인</h1>
					<form action="loginAction" method="post">
						<table>

							<tr align="center">
								<td><input name="MEMBER_ID" placeholder="아이디"></td>
							</tr>

							<tr align="center">
								<td><input name="MEMBER_PW" placeholder="비밀번호"></td>
							</tr>

							<tr align="center">
								<td><c:if test="${msg == 'fail'}">아이디와 비밀번호를 확인하여 주십시오<br>
									</c:if> <input type="submit" value="로그인"></td>
							</tr>

						</table>
					</form>
					<a style="text-decoration: none;" href="findID">아이디 찾기</a> | <a
						style="text-decoration: none;" href="findPW">비밀번호 찾기</a> | <a
						style="text-decoration: none;" href="join">회원가입</a>
				</div>
			</section>
		</div>
	</div>
	<%@ include file="../boardFooter.jsp"%>