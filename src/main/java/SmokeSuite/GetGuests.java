/**
 * 
 */
package SmokeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonUtilities.PathConfiguration;
import Configuration.DateStringConverter;
import RequestUtilities.GetRequest;

/**
 * @author vamsiravi
 *
 */
public class GetGuests {
	
	ExtentReports extentReports;
	ExtentTest test;
	PathConfiguration pathConfiguration = new PathConfiguration();
	String reportDirectoryPath = pathConfiguration.getReportsDirectory()+this.getClass().getName()+File.separator+DateStringConverter.dateStringConverter()+File.separator;
	SmokeTestData testData = new SmokeTestData();
	
	@Test(enabled=true)
	public JSONObject simpleGetRequest() throws IOException, JSONException {
		
		 extentReports = new ExtentReports(reportDirectoryPath+"GetGuests.html");
		 test = extentReports.startTest("Get Guests Test");
		
		
		  URL url = new URL("http://urbanscraper.herokuapp.com/define/"+testData.getTestDataTerm());
		  List<String> parameters = new ArrayList<String>();	 
		  JSONObject jsonObject = GetRequest.getRequest(url, parameters, test );
		  
		  
		  if(jsonObject.get("term").equals(testData.getTestDataTerm())){
			  test.log(LogStatus.PASS, "Response has the Term");
		  }else{
			  test.log(LogStatus.FAIL, "Response doesn't have the Term");
		  }
		  
		  test.log(LogStatus.INFO, jsonObject.toString());
		  
		  
		  extentReports.endTest(test);
			extentReports.flush();
			extentReports.close();
		  return jsonObject;
		  
		  
	  }
	
	@AfterTest
	public void endReport(){
		
	}
	
}
