/**
 * 
 */
package APITestSuite;

import java.io.IOException;

import org.json.JSONException;

import SmokeSuite.GetGuests;

/**
 * @author vamsiravi
 *
 */
public class SmokeTest {
	GetGuests getGuests = new GetGuests();
	public void runSmokeTests() throws IOException, JSONException{
		getGuests.simpleGetRequest();
	}

}
