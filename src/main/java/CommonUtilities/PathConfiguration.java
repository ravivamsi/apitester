/**
 * 
 */
package CommonUtilities;

import java.io.File;

/**
 * @author vamsiravi
 *
 */
public class PathConfiguration {
	
	public String baseDirectory = System.getProperty("user.dir")+File.separator;
	
	public String reportsDirectory = baseDirectory+"reports"+File.separator;

	public String getBaseDirectory() {
		return baseDirectory;
	}

	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	public String getReportsDirectory() {
		return reportsDirectory;
	}

	public void setReportsDirectory(String reportsDirectory) {
		this.reportsDirectory = reportsDirectory;
	}
	

}
