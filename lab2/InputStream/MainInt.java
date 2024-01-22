package lab_np1;


import java.io.FileOutputStream;
import java.io.OutputStream;


public class JstreamsAscii {
	public static void main(String[] args) {
		
		
		int i =33;
		int j =126;
		int ll = 0;
		long d1 = System.nanoTime();
		
		int it =0;
		int noOfIterations = 50;
		while(it<noOfIterations) {
		kar(i,j,ll);
		it++;
		}
		
		
		
		
		long d2 = System.nanoTime();
		
		System.out.println(d2-d1);
		
	}public static void ascii(int i, int j) {
		
		
		char c = (char) (i) ;
		String s = "";
		for (int k = i;k<=126;k++) {
			c = (char)(k);
			s +=c;
			if(s.length()>72) {
				System.out.println(s);
				
				String data = s;

		        try {
		            OutputStream out = new FileOutputStream("output.txt", true);

		            // Converts the string into bytes
		            
		            byte[] dataBytes = s.getBytes();

		            // Writes data to the output stream
		            out.write(dataBytes);
		            
		            

		            // Closes the output stream
		            out.close();
		        }

		        catch (Exception e) {
		            e.getStackTrace();
		        }
				
				
				break;
			}
		}
		
		
		
	}public static void asciiInt(int i, int j) {
		
		
		char c = (char) (i) ;
		String s = "";
		for (int k = i;k<=126;k++) {
			c = (char)(k);
			s +=c;
			if(s.length()>72) {
				System.out.println(s);
				
				String data = s;

		        try {
		            OutputStream out = new FileOutputStream("output.txt", true);

		            // Converts the string into bytes
		            
		            int dataBytes = s();

		            // Writes data to the output stream
		            out.write((char)dataBytes);
		            
		            

		            // Closes the output stream
		            out.close();
		        }

		        catch (Exception e) {
		            e.getStackTrace();
		        }
				
				
				break;
			}
		}
		
		
		
	}


	private static int s() {
		// TODO Auto-generated method stub
		return 0;
	}public static void kar(int i,int j,int ll) {
		while(ll <=22) {
			ascii(i,j);
			i++;
			j++;
			if(j>=126 ) {
				j = i;
			}
			if(i>126) {
				i =33;
			}
			ll++;
		}
	}
	
	
	
}
