package daw2.javaClient;

public class SoapAsyncRequest extends Thread {
	
	private String toModifyTile;
    private String modifiedTitle;

	public SoapAsyncRequest (String toModifyTile) {
		this.toModifyTile = toModifyTile;
		this.modifiedTitle = "";
	}
	
	public String getModifiedTitle() {
		return this.modifiedTitle;
	}
	
	public void run() {
		SimpleService_P1_Client soapClient = new SimpleService_P1_Client();
		this.modifiedTitle = soapClient.modifyDrupalTitle(toModifyTile);
	}
}
