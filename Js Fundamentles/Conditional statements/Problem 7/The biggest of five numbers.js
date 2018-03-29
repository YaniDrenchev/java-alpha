function fiveNumbers(a,b,c,d,e) {
	if (a>=b && a>=c && a>=d && a>=e) {
		console.log("The biggest is " + a);
	}else if(b>=a && b>=c && b>=d && b>=e){
		console.log("The biggest is " + b);
	}else if(c>=a && c>=b && c>=d && c>=e){
		console.log("The biggest is " + c);
	}else if(d>=a && d>=c && d>=b && d>=e){
		console.log("The biggest is " + d);
	}else if(e>=a && e>=c && e>=d && e>=b){
		console.log("The biggest is " + e);
	}
}
fiveNumbers(-3,-0.5,-1.1,-2,-0.1)