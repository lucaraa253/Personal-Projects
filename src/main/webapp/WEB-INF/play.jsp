<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Yahtzee Board</title>

</head>
<body>
	<h1 class="header">YAHTZEE</h1>
	<h3 class="rollNumber">
		<c:if test="${player.roll >= 1}">
			<p>Roll # <c:out value="${player.roll - 1}"/></p>
		</c:if>
		<c:if test="${player.roll == 0}">
			<p>Next Turn</p>
		</c:if>
	</h3>
	<div class="rollNumber">


		<tr>
		<c:if test="${player.roll >= 1}">
			<td><a href="/${player.id }/rollDice">Roll Dice</a></td>
		</c:if>
		<c:if test="${player.roll == 0}">
			<td><a href="/${player.id }/rollDice">Next Turn</a></td>
		</c:if>
            <td><a href="/${player.id }/reset">Reset</a></td>

        </tr>

	</div>
	<div class="container">
	<div class="dice1"><c:out value="${player.diceOne }"/></div>
	<div class="dice1"><c:out value="${player.diceTwo }"/></div>
	<div class="dice1"><c:out value="${player.diceThree }"/></div>
	<div class="dice1"><c:out value="${player.diceFour }"/></div>
	<div class="dice1"><c:out value="${player.diceFive }"/></div>
	</div>
	<div class="container2">
	<div class="dice2"><a href="/${player.id }/holdDiceOne">Hold Dice</a></div>
	<div class="dice2"><a href="/${player.id }/holdDiceTwo">Hold Dice</a></div>
	<div class="dice2"><a href="/${player.id }/holdDiceThree">Hold Dice</a></div>
	<div class="dice2"><a href="/${player.id }/holdDiceFour">Hold Dice</a></div>
	<div class="dice2"><a href="/${player.id }/holdDiceFive">Hold Dice</a></div>
	</div>
	<table class="scores">
		<thead>
			<tr>
				<td class="data">Upper Section</td>
				<td class="data">Scores</td>
				<td class="data">Actions</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td class="data">1's</td>
				<td class="data"><c:out value="${player.onesVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore1"/>Save 1's Score</button></td>
			</tr>
			<tr>
				<td class="data">2's</td>
				<td class="data"><c:out value="${player.twosVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore2"/>Save 2's Score</button></td>
			</tr>
			<tr>
				<td class="data">3's</td>
				<td class="data"><c:out value="${player.threesVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore3"/>Save 3's Score</button></td>
			</tr>
			<tr>
				<td class="data">4's</td>
				<td class="data"><c:out value="${player.foursVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore4"/>Save 4's Score</button></td>
			</tr>
			<tr>
				<td class="data">5's</td>
				<td class="data"><c:out value="${player.fivesVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore5"/>Save 5's Score</button></td>
			</tr>
			<tr>
				<td class="data">6's</td>
				<td class="data"><c:out value="${player.sixesVal }"/></td>
				<td class="data"><button><a href="/${player.id}/saveScore6"/>Save 6's Score</button></td>
			</tr>
			<tr>
				<td class="data">Upper Total</td>
				<td class="data"><c:out value="${player.lowerTotal }"/></td>
				<td class="data"></td>
			</tr>
			<tr>
				<td class="data">Bonus if total is over 63</td>
				<td class="data">35</td>
				<td class="data"></td>
			</tr>
			<tr>
				<td class="data">Final Total</td>
				<td class="data"><c:out value="${player.upperTotal }"/></td>
				<td class="data"></td>
			</tr>
		</tbody>
	</table>
</body>
</html>