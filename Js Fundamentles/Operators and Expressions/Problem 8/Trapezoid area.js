function trapArea (a,b,h) {
	var a = a;
	var b = b;
	var h = h;
	var area;
	area = ((a+b)/2) * h;
	console.log("Trapezoid with: a = " + a + " b = " + b + " h = " + h + "\nHas area: " + area);
}
trapArea(2,3,5)
