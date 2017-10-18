/**
 * 
 */
package StatusCodes;

/**
 * @author vamsiravi
 *
 */
public class HttpStatusCode {

	
	Integer okStatus = 200;
	
	Integer patialContent = 206;
	
	Integer badRequest = 400;
	
	Integer notFound = 404; 
	
	Integer internalServerError = 500;
	
	Integer forbiddenError = 403;

	public Integer getOkStatus() {
		return okStatus;
	}

	public void setOkStatus(Integer okStatus) {
		this.okStatus = okStatus;
	}

	public Integer getPatialContent() {
		return patialContent;
	}

	public void setPatialContent(Integer patialContent) {
		this.patialContent = patialContent;
	}

	public Integer getBadRequest() {
		return badRequest;
	}

	public void setBadRequest(Integer badRequest) {
		this.badRequest = badRequest;
	}

	public Integer getNotFound() {
		return notFound;
	}

	public void setNotFound(Integer notFound) {
		this.notFound = notFound;
	}

	public Integer getInternalServerError() {
		return internalServerError;
	}

	public void setInternalServerError(Integer internalServerError) {
		this.internalServerError = internalServerError;
	}

	public Integer getForbiddenError() {
		return forbiddenError;
	}

	public void setForbiddenError(Integer forbiddenError) {
		this.forbiddenError = forbiddenError;
	}
	
	
}
