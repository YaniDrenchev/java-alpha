function digit (number) {
	var num = number;
	var text;
	switch(num){
		case 1:
			text = "One";
			break;
		case 2:
			text = "Two"
			break;
		case 3: 
		 	text = 'Three'
		 	break;
		 case 4: 
		 	text = 'Four'
		 	break;
		 case 5: 
		 	text = 'Five'
		 	break;
		 case 6:
		 	text = 'Six';
		 	break;
		case 7:
			text = 'Seven';
			break;
		case 8:
			text = 'Eight';
			break;
		case 9:
			text = 'Nine';
			break;
		case 0:
			text = 'Zero';
			break;
		default:
			text = "Ivalid number!";
	}
	console.log(text);
}
digit(-1)