(function agh () {	
var arr1 = [window, navigator, document];	
for(var i = 0; i<3; i++){
	var outTxt = "";
	var arr;
for(var property in arr1[i]){
	outTxt += property+" ";
}
arr = outTxt.split(" ");
arr.sort();	
		outTxt = "Min: "+arr[1]+";\nMax: "+arr[arr.length-1]+";";
var id = "output" + (i+1);
console.log(outTxt);
}
})()