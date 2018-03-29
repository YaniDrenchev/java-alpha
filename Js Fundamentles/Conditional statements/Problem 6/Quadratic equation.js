function quadratic (a,b,c) {
	var a = a;
	var b = b;
	var c = c;
	var discriminant = Math.pow(b, 2) - (4*a*c);
	var x1;
	var x2;
	if (discriminant < 0) {
		console.log("No real roots");
	}else if(discriminant==0){
		x1 = -b/(2*a);
		console.log("x1 = x2 = "+ x1);
	}
	else{
		x1 = (-b - Math.sqrt(discriminant))/(2*a);
		x2 = (-b + Math.sqrt(discriminant))/(2*a);
		console.log("x1=" + x1 + ";" + "x2=" + x2);
	}

}
quadratic(-1,3,0)