/**
 * 
 */
package RequestUtilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import StatusCodes.HttpStatusCode;

/**
 * @author vamsiravi
 *
 */
public class GetRequest {
	
	public final static String USER_AGENT = "Mozilla/5.0";
	
	

	public static JSONObject getRequest(URL url, List<String> parameters, ExtentTest test) throws IOException, JSONException{
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		HttpStatusCode httpStatusCode = new HttpStatusCode();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", USER_AGENT);
		
		Integer responseCode = connection.getResponseCode();
		
		if(responseCode.equals(httpStatusCode.getOkStatus())){
			 test.log(LogStatus.PASS, "Response Code is "+httpStatusCode.getOkStatus());
		}else{
			test.log(LogStatus.FAIL, "Response Code is "+responseCode);
		}
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer responseString = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			responseString.append(inputLine);
		}
		in.close();
		
		JSONObject jsonResponse = new JSONObject(responseString.toString());
		
		return jsonResponse;
		
		
	}
	
	
public static JSONObject getRequest(URL url, List<String> parameters) throws IOException, JSONException{
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//		HttpStatusCode httpStatusCode = new HttpStatusCode();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", USER_AGENT);
		
//		Integer responseCode = connection.getResponseCode();
		
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer responseString = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			responseString.append(inputLine);
		}
		in.close();
		
		JSONObject jsonResponse = new JSONObject(responseString.toString());
		
		return jsonResponse;
		
		
	}
}
