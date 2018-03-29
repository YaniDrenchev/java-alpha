function divisible (arg) {
	var number = arg;
	if (number%7 == 0 && number%5 == 0) {
		console.log("number:" + number + "--->"+"True");
	}else{
		console.log("number:" + number + "--->" +"False");
	}
}
divisible(35)