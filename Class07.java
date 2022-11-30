package java14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Class07 {
	public static void main(String args[]) throws IOException{
		String str;
		int count=0;
		FileReader fr=new FileReader("C:\\Users\\a0936\\Desktop\\donkey.txt");
		BufferedReader bfr=new BufferedReader(fr);
		while((str=bfr.readLine())!=null) {
			if(count==1) {
				bfr.skip(14);
			}
			System.out.println(str);
				count++;
		}
		fr.close();
	}
}
