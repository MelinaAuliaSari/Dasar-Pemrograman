import java.util.Scanner;

 public class Kelajuan {
	public static void main (String args[]) {
 	
	Scanner masuk = new Scanner(System.in);
 
	 System.out.println ("====Menghitung Kelajuan====");
 double s1,s2,totaljarak;
 System.out.println (" data jarak ");
 System.out.print (" s1 : ");
 s1 = masuk.nextDouble () ;
 System.out.print (" s2 : ");
 s2 = masuk.nextDouble () ;
 totaljarak = s1+s2;
 System.out.println (" total jarak = "+totaljarak+"meter");
 double t1,t2,totalwaktu;
 System.out.println (" Data Waktu "); 
 System.out.print (" t1 :  ");
 t1 = masuk.nextDouble () ;
 System.out.print (" t2 :  ");
 t2 = masuk.nextDouble () ;
 totalwaktu = t1+t2;
 System.out.println(" total waktu = "+totalwaktu+"sekon");
 
 	System.out.println ("====Kelajuan adalah Total jarak dibagi Total waktu====");

 double kelajuan = totaljarak/totalwaktu;
 System.out.println ("kelajuan = "+kelajuan+"meter persekon");

}
}