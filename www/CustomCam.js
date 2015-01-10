var exec = require('cordova/exec');
function CustomCam() { console.log("CoolPlugin.js: is created");
}
CoolPlugin.prototype.showToast = function(aString){ console.log("CoolPlugin.js: showToast"); exec(function(result){/*alert("OK" + reply);*/}, function(result){/*alert("Error" + reply);*/} ,"CoolPlugin",aString,[]);
} var customCam = new CustomCam(); module.exports = customCam;
}