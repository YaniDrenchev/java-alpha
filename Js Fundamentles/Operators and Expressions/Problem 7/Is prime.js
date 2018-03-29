function isPrime (number) {
	var number = number;
	if (number == 2 || number == 3 || number == 7 || number == 5) {
		console.log("True");
	}else{
	if (number>1) {	
	var buffer = 0;
	for (var i = 0; i<=9;i++) {		
		if (number%i==0) {
			buffer++;
		}		
	}
	if (buffer==1) {
		console.log("True");
	}else{
		console.log("False");
	}
}else{
	console.log("False");
}
}
}
isPrime(9)