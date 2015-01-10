import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.provider.Settings;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;


public class CustomCam extends CordovaPlugin {
	public static final String TAG = "Custom Cam";
	private CallbackContext mCallContext;
	/**
	* Constructor.
	*/
	public CustomCam() {}
	/**
	* Sets the context of the Command. This can then be used to do things like
	* get file paths associated with the Activity.
	*
	* @param cordova The context of the main Activity.
	* @param webView The CordovaWebView Cordova is running in.
	*/
	
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		Log.v(TAG,"Init CustomCam");
	}



	public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		mCallContext = callbackContext;
		Context context = cordova.getActivity().getApplicationContext();
		Intent mIntent = new Intent(context, CameraActivity.class);
		cordova.startActivityForResult(this, mIntent, 0);
		return true;
	}

}