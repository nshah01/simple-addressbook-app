import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.qos.logback.core.net.SyslogOutputStream;


 public class test {
	 public static void main(String a[]){
	 
		 boolean keepGoing = true;
		 int count = 0;
		 int x=3;
		 while(count++<3) {
			 System.out.println(count);
			 int y = (1+2 *count)%3; //3*0%3 = 0 switch(0) case 0: x = 3-1 =2;1;
			 switch(y) {
			 default:
			 case 0: x-=1;break;//x=2;x=1
			 case 1: x+=5;
			 //System.out.println(x);
			 }
		 }
		 //System.out.println(x);
	 }	 
	 }
