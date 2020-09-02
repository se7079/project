<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../boardHeader.jsp"%>
<title>회원가입</title>
</head>
<body class="is-preload">
	<div id="wrapper">
		<div id="main">
			<section class="post">
				<div align="center">
					<h1>회원가입</h1>
					<form action="joinAction" method="post">
						<table>
							<tr>
								<td>아이디</td>
							</tr>
							<tr>
								<td><input name="MEMBER_ID" placeholder="ex)abc1234"></td>
							</tr>

							<tr>
								<td>비밀번호</td>
							</tr>
							<tr>
								<td><input type="password" name="MEMBER_PW"
									placeholder="4~16자리의 숫자와 영어"></td>
							</tr>

							<tr>
								<td>비밀번호 확인</td>
							</tr>
							<tr>
								<td><input type="password" name="PW_Check"
									placeholder="4~16자리의 숫자와 영어"></td>
							</tr>

							<tr>
								<td>이름(닉네임)</td>
							</tr>
							<tr>
								<td><input name="MEMBER_NAME" placeholder="ex)취직하고싶다">
								</td>
							</tr>

							<tr>
								<td>이메일</td>
							</tr>
							<tr>
								<td><input name="MEMBER_MAIL"
									placeholder="ex)abc1234@naver.com"></td>
							</tr>

							<tr>
								<td>전화번호</td>
							</tr>
							<tr>
								<td><input name="MEMBER_PHONE" placeholder="ex)01012345678">
								</td>
							</tr>
						</table>

						<input type="submit" value="가입하기"> <input type="button"
							value="취소하기" onclick="location.href='login'">

					</form>
				</div>
			</section>
		</div>
	</div>
	<%@ include file="../boardFooter.jsp"%>