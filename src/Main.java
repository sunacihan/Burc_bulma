import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int ay,gun;
        boolean isError=false;
        String burc="";

        System.out.print("Doğum gününüzü giriniz:");
        gun=input.nextInt();
        System.out.print("Doğum ayınızı giriniz:");
        ay=input.nextInt();

        if(ay==1){
            if(gun>=1 && gun<=31){
                if (gun<22){
                    burc="Oğlak";
                }else {
                    burc="Kova";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==2){
            if(gun>=1 && gun<=28){
                if (gun<20){
                    burc="Kova";
                }else {
                    burc="Balık";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==3){
            if(gun>=1 && gun<=31){
                if (gun<21){
                    burc="Balık";
                }else {
                    burc="Koç";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==4){
            if(gun>=1 && gun<=31){
                if (gun<21){
                    burc="Koç";
                }else {
                    burc="Boğa";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==5){
            if(gun>=1 && gun<=31){
                if (gun<22){
                    burc="Boğa";
                }else {
                    burc="İkizler";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==6){
            if(gun>=1 && gun<=31){
                if (gun<23){
                    burc="İkizler";
                }else {
                    burc="Yengeç";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==7){
            if(gun>=1 && gun<=31){
                if (gun<23){
                    burc="Yengeç";
                }else {
                    burc="Aslan";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==8){
            if(gun>=1 && gun<=31){
                if (gun<23){
                    burc="Aslan";
                }else {
                    burc="Başak";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==9){
            if(gun>=1 && gun<=31){
                if (gun<23){
                    burc="Başak";
                }else {
                    burc="Terazi";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==10){
            if(gun>=1 && gun<=31){
                if (gun<23){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==11){
            if(gun>=1 && gun<=31){
                if (gun<22){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else {
                isError=true;
            }
        }
        else if(ay==12){
            if(gun>=1 && gun<=31){
                if (gun<22){
                    burc="Yay";
                }else {
                    burc="Oğlak";
                }
            }else {
                isError=true;
            }
        }
        else {
            isError=true;
        }
        if(isError){
            System.out.println("HATALI GİRİŞ!");
        }else {
            System.out.println("Burcunuz:" + burc);
        }
    }}
