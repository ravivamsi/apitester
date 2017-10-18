package APITesterApplication;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import APITestSuite.EndtoEndTest;
import APITestSuite.PerformanceTest;
import APITestSuite.RegressionTest;
import APITestSuite.SmokeTest;
import SmokeSuite.SampleGetTest;

@SpringBootApplication
public class ApiTesterApplication {

	public static void main(String[] args) throws IOException, JSONException {
		
		EndtoEndTest e2eTestSuite = new EndtoEndTest();
		PerformanceTest performanceTestSuite = new PerformanceTest();
		SmokeTest smokeTest = new SmokeTest();
		RegressionTest regressionTest = new RegressionTest();
		
		
		SpringApplication.run(ApiTesterApplication.class, args);
		smokeTest.runSmokeTests();
//		e2eTestSuite.runE2ETest();
//		performanceTestSuite.runIntervalPerformanceTest();
//		performanceTestSuite.runIterativePerformanceTest();
//		smokeTest.runSmokeTests();
//		regressionTest.runRegressionTests();
		
		
	}
}
