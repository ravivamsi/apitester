package SmokeSuite;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import CommonUtilities.PathConfiguration;
import Configuration.DateStringConverter;
import RequestUtilities.GetRequest;

public class SampleGetTest {

	@BeforeTest
  public void beforeTest() throws MalformedURLException  {
	  
  }	
	
  @Test
  public void simpleGetRequest() throws IOException, JSONException {
	  
	  ExtentTest test;
	  ExtentReports extentReports;
	  PathConfiguration pathConfiguration = new PathConfiguration();
		
	  String reportDirectoryPath = pathConfiguration.getReportsDirectory()+this.getClass().getName()+File.separator+DateStringConverter.dateStringConverter()+File.separator;
		
	  extentReports = new ExtentReports(reportDirectoryPath+"SimpleGetRequest.html");
	  
	  
	  test = extentReports.startTest("Testing the Simple Get Request");
	 
	  URL url = new URL("http://urbanscraper.herokuapp.com/define/geometry");
	  List<String> parameters = new ArrayList<String>();	 
	  JSONObject jsonObject = GetRequest.getRequest(url, parameters, test);
	  
	  
	  System.out.println("The response is :"+ jsonObject);
  }
  
  

  

  @AfterTest
  public void afterTest() {
  }
  

}
