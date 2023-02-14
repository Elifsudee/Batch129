package miniproject.loginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5=user objesi ile ilgili islemler
public class UserService {
    //6=kullanici bilgilerini tutmak icin list olusturalim

    List<User> userList=new ArrayList<>();
    //tum methodlarda kullanicidan bilgi almak icin scanner olusturduk
    Scanner input=new Scanner(System.in);

    //7=username veya email ile kayitli useri getirme methodu olusturalim
    private User getUser(String useNameOrEmail){
        for(User user:userList){

            if (user.getUsername().equals(useNameOrEmail)){
                return user;
            }else if(user.getEmail().equals(useNameOrEmail)){
                return user;
            }
        }
        return null;
    }

    //8=e mail validation gecerli mi
    private static boolean validation(String email){
        boolean isValid;
        boolean isExistSpace=email.contains(" ");
        boolean isContainAt=email.contains("@");
        if(isExistSpace){
            System.out.println("Email bosluk iceremez");
            isValid=false;
        }else if(!isContainAt){

            System.out.println("e mail @ sembolu icermeli");
            isValid=false;
        }else{
            String firstPart=email.split("@")[0];//iki parcaya ayirdik kontroletmek icin
            String secondPart=email.split("@")[1];

       boolean valid= firstPart.replaceAll("[a-zA-Z0-9_.-]","").isEmpty();//sildikten sonra bos mu
            boolean checkStart=valid&& firstPart.length()>0;//@ den once en az bir karakter icermeli

            boolean checkEnd=secondPart.equals("gmail.com")||
                    secondPart.equals("hotmail.com")||
                    secondPart.equals("yahoo.com");
            if(!checkStart){
                System.out.println("mailin kullanici adi bolumu en az bir karakter icermeli ve"+
                        "sadece buyuk-kucuk harf,rakam veya -_. icerebilir");
            }
            if(!checkEnd){
                System.out.println("email gmail.com,hotmail.com veya yahoo.com ile bitmeli");
            }
            isValid=checkStart&&checkEnd;
        }
          if(!isValid){
              System.out.println("tekrar deneyiniz");
          }

        return isValid;

    }
    //9=password alidation

    private static boolean validatePassword(String password){

        boolean isValid;
        boolean isExistSpace=password.contains(" ");
        boolean isLengthSix=password.length()>=6;
        boolean  isExistUpperLetter=password.replaceAll("[^A-Z]","").length()>0;
        boolean  isExistLowerLetter=password.replaceAll("[^a-z]","").length()>0;
        boolean  isExistDigit=password.replaceAll("[^0-9]","").length()>0;
        boolean  isExistSymbol=password.replaceAll("[\\P{Punct}]","").length()>0;

        if(isExistSpace){
            System.out.println("sifre bosluk iceremez");
        }else if(!isLengthSix){
            System.out.println("sifre en az 6 karakter icermeli");
        }else if(!isExistUpperLetter){
            System.out.println("sifre en az 1 buyuk harf icermeli");
        }else if(!isExistLowerLetter){
            System.out.println("sifre en az 1 kucuk harf icermeli");
        }else if(!isExistDigit){
            System.out.println("sifre en az 1 rakam harf icermeli");
        }else if(!isExistSymbol){
            System.out.println("sifre en az 1 sembolharf icermeli");
        }
        isValid=!isExistSpace&& isExistLowerLetter&& isExistUpperLetter&& isExistDigit&& isLengthSix&& isExistSymbol;
        if (!isValid){
            System.out.println("Geçersiz şifre, tekrar deneyiniz.");
        }
        return isValid;


    }

    public void register(){
        System.out.println("Ad-Soyad: ");
        String name=input.nextLine();

//10= user name unique/essiz olmali
        String username=getUserName();
    }
    //10-a=username almak icin method olusturalim


    private String getUserName(){

        String username;

        boolean existUsername;
        do {
            System.out.println("kullanici adini giriniz");
            username=input.next();
            existUsername=getUser(username)!=null;

            if(existUsername){
                System.out.println("Bu user name kullanilmis ,farkli bir user name deneyiniz");
            }

        }while (existUsername);

        return username;
    }
}
