package VnekatFrameWork.VenkatRestAutomation;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class LoginCall {

	/*
	 * 1. URL - 164.99.110.98 blr8-110-98.apac.novell.com
	 * 2. Rest End Points - /rest/self or /rest/auth/login
	 * 3. Username = admin \\\\ OAuth1,OAuth2,BASIC Auth, Token
	 * 4. passwor = novell
	 * 5. Headers
	 * 6. Payload = "{"name":"Venkat-NF-110-47"}"
	 * 7. Combine all and hit the server - Entity =Haeders+ URL + Username + password + JSONPayload
	 */
	
	 public static void doRestLogin()
	 {
		 String url="blr8-110-98.apac.novell.com";
		 String restEndPoint="/rest/auth/login";
		 String hostURL ="https://"+url+restEndPoint;
		// System.out.println(hostURL);
		 
		 UsernamePasswordCredentials usernamePass = new UsernamePasswordCredentials("admin", "n");
		 String JsonPayload = "";
		 
		 HttpPost postCall = new HttpPost(hostURL);
		 postCall.addHeader("Content-Type", "application/json");
		 postCall.addHeader("Accept", "*/*");
		 
		 //Combining Steps
		 
		 HttpClientBuilder clientBuilder=HttpClients.custom();
		 
		 //1.username ,password, URL in a single ref
		 HttpHost host = new HttpHost(url);
		 
		 AuthScope scope = new AuthScope(host);
		 
		 CredentialsProvider creds = new BasicCredentialsProvider();
		 creds.setCredentials(scope, usernamePass);
		 clientBuilder=clientBuilder.setDefaultCredentialsProvider(creds);
		 
		
		 
		 CloseableHttpClient httpclient= clientBuilder.build();
		 try {
			System.out.println(httpclient.execute(postCall));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	 }
	
	public static void main(String[] args) {

		System.out.println("hi Himanshu");
		 //doRestLogin();
	}
}
