package zinterview;

public class IcArrayErinToplami {

    public static void main(String[] args) {


        //INTERWIEW SORUSU
        //Aşağıdaki multidimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // int arr1[][] = {{1, 2}  , { 3, 4, 5},{6}};
        // int arr2[][] = {{7, 8,9},  {10,11 },       {12}};


        int sinir = 0;

        int toplam = 0;
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        if (arr1.length <= arr2.length) {

            for (int i = 0; i < arr1.length; i++) {//kisa olan kat secildi
                sinir = arr1[i].length;//kisa olan daire
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }//if
                for (int j = 0; j < sinir; j++) {//asil islem
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " indexindeki elemanlarin toplami " + toplam);
                }//for j
            }//for i

        } else{

        for (int i = 0; i < arr2.length; i++) {//kisa olan kat secildi
            sinir = arr1[i].length;//kisa olan daire
            if (arr1[i].length > arr2[i].length) {
                sinir = arr2[i].length;
            }//if
            for (int j = 0; j < sinir; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println("["+ i +","+ j+"]"+" indexindeki elemanlarin toplami "+toplam);
            }//for j
        }//for i
    }
    }
}
