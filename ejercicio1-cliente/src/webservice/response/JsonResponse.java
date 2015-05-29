package webservice.response;

public class JsonResponse {
	private Boolean success;
	private Object result; 
	
	public JsonResponse() {
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
