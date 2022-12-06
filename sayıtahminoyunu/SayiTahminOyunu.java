
package sayıtahminoyunu;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {

   
    public static void main(String[] args) {
      int tahmin,can=5,i=0;
      Random rand=new Random();
      Scanner scan=new Scanner(System.in);
      int sayi=rand.nextInt(100);
      boolean oyunDurumu=false;
      int[] tahminler=new int[5];
     System.out.println(sayi);
     System.out.println("Sayi Tahmini Oyununa Hos Geldiniz!");
    System.out.println("0-99 arasinda bir sayi tuttum.");
      
      while(can>0){
          System.out.println("Tahmininiz:");
          tahmin=scan.nextInt();
          tahminler[i++]=tahmin;
          if(tahmin<0 || tahmin>99){
              System.out.println("Gecersiz sayi girdiniz! Lutfen 0-99 arasi bir sayi giriniz.");
           continue;   
          }
          
          if(tahmin==sayi){
              oyunDurumu=true;
              break;
          }else{
              System.out.println("Yanlis,tekrar deneyiniz! Kalan can:"+ --can);
          }
      }
      if(oyunDurumu){
       System.out.println("Tebrikler! Dogru tahmin ettiniz."); 
       System.out.println("Sayimi54z:"+ sayi); 
       System.out.println("Kalan Can: "+ can); 
      }
      else{
         System.out.println("Basaramadiniz!"); 
      }
      System.out.print("Tahminleriniz:");
      for(int value:tahminler){
      System.out.print(value+" , ");
      }
    }
    
}
