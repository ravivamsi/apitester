/**
 * 
 */
package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author vamsiravi
 *
 */
public class PutRequest {
	
	public final static String USER_AGENT = "Mozilla/5.0";

	public static JSONObject getRequest(URL url, List<String> parameters) throws IOException, JSONException{
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("User-Agent", USER_AGENT);
		
//		int responseCode = connection.getResponseCode();
		
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
