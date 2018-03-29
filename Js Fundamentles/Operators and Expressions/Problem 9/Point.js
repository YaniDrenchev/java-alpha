function isIn(x, y) {

    var cordinats = (((x - 1) * (x - 1) + (y - 1) * (y - 1)) <= 9) && ((x < -1) || ((x >= -1) && ((y <= -1) || (y >= 1))));
    if (cordinats == true) {
        console.log('The point' +  'is in the circle but not in the rectangle.');
    }
    else {
        console.log('The point' + 'is in the circle and IN the rectangle.');
    }
}

isIn(1, 2);
isIn(4,0)