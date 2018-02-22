/*
     Filename: main.js
  
     Author: Brady Lange 
     Date: 12/11/17
 */
function computearea(r){
	return Math.PI*r*r;
}

$(document).ready(function(){

	$("#calculatearea").click(function() {
		
		p = $("#precision").val();
		
		r = $("#radius").val();
		
		a = computearea(r);
		
		$("#area").val(a.toPrecision(p));
		
		
	});
});
