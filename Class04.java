package java14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class04 {
	public static void main(String args[]) {
		char data[]=new char[120];
		FileReader fr=new FileReader("C:\\Users\\a0936\\Desktop\\donkey.txt");
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("字元數="+num);
		System.out.println(str);
	}
}
