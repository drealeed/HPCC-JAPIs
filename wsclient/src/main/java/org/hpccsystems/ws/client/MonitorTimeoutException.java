package org.hpccsystems.ws.client;

public class MonitorTimeoutException extends Exception {
	
	private String wuid;
	
	public MonitorTimeoutException() {
		super();
	}
	
	public MonitorTimeoutException(Exception e) {
		super(e);
	}
	public MonitorTimeoutException(String message,Exception e) {
		super(message,e);
	}
	public MonitorTimeoutException(String message) {
		super(message);
	}
	public MonitorTimeoutException(String message,String wuid,Exception e) {
		super(message,e);
		this.wuid=wuid;
	}
	public MonitorTimeoutException(String message,String wuid) {
		super(message);
		this.wuid=wuid;
	}

	public String getWuid() {
		return wuid;
	}

	public void setWuid(String wuid) {
		this.wuid = wuid;
	}

}
