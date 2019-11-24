package run;
import java.util.*;
import java.net.Socket;
import java.io.*;

public class ServerThread extends Thread{
	Socket s=null;
	public ServerThread(Socket s1) {this.s=s1;}
	public void run() {
		try {
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String str=br.readLine();
		}
		catch(Exception e) {
			
		}
	}
}
