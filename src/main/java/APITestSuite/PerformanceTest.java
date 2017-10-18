/**
 * 
 */
package APITestSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import RequestUtilities.GetRequest;

/**
 * @author vamsiravi
 *
 */
public class PerformanceTest {
	
	public void runIterativePerformanceTest() throws JSONException, IOException{
		
		for(Integer i=0 ; i<100; i++){
			URL url = new URL("http://urbanscraper.herokuapp.com/define/geometry");
			  List<String> parameters = new ArrayList<String>();	 
			  GetRequest.getRequest(url, parameters);
			  
		}
		
	}
	
	public void runIntervalPerformanceTest(){
		
	}

}
