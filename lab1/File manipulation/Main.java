package lab_np1;

import java.io.*;
import java.util.Scanner;
public class Read_File {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int inp1 = sc.nextInt();
		
		switch (inp1) {
		case 1:
			String inn = sc.next();
			System.out.println( makeFile(inn));
		break;
		case 2:
			String inn2 = sc.next();
			readFile(inn2);
			break;
		case 3:
			String inn3 = sc.next();
			String inn4 = sc.nextLine();
			writeFile(inn3,inn4);
			break;
		case 4:
			String inn5 = sc.next();
			System.out.println(delFile(inn5));
			break;
			default :
			System.out.println("heyy");
		}
		
	}public static String makeFile(String s) {
		
		String k = "";
		 try {
	            File Obj = new File(s);
	            if (Obj.createNewFile()) {
	                k = ("File created: "+ Obj.getName());
	            }
	            else {
	                k = ("File already exists.");
	            }
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
		 return k;
	}public static void readFile(String s) {
		
		try {
            File Obj1 = new File(s);
            Scanner Reader = new Scanner(Obj1);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}public static void writeFile(String s,String s2) {
		try {
            FileWriter Writer = new FileWriter(s);
            Writer.write(s2);
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}public static String delFile(String s) {
		String k = "";
		File Obj11 = new File(s);
        if (Obj11.delete()) {
            k = ("The deleted file is : "
                               + Obj11.getName());
        }
        else {
            k = ("Failed in deleting the file.");
        }
        return k;
	}
}
