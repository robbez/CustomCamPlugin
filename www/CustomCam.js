var exec = require('cordova/exec');
function CustomCam() { 
	console.log("CustomCam.js: is created");
}

CustomCam.prototype.showToast = function(aString){ 
	console.log("CustomCam.js: showToast"); 
	exec(function(result){/*alert("OK" + reply);*/}, 
		function(result){/*alert("Error" + reply);*/} ,
		"CustomCam",aString,[]);
} 


var customCam = new CustomCam(); 
module.exports = customCam;
