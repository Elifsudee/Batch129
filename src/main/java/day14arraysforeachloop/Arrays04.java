package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //Example= string bir array olusturunuz , 6 eleman ekleyiniz, Yellow dan onceki elemanlari yazdiriniz


        String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";


        for(String w: colors){

            if(w.equals("Yellow")){
               break;
            }
            System.out.println(w);
        }


//  //Example= string bir array olusturunuz , 6 eleman ekleyiniz, Yellow dan sonraki elemanlari yazdiriniz

        String color[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        //Note :Elemanlari almaya son elemandan baslayacagim icin for-each loop kullanamam , bu yuzden for-loop kullandim
  for( int i=color.length-1 ; i>=0 ; i--){

      if(color[i].equals("Yellow")){

          break;
      }
      System.out.println(color[i]);
  }





    }
}
