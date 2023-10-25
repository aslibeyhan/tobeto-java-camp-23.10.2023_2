package intro1;

public class Main {

	public static void main(String[] args) {
		// Java BootCamp 1.Ders

	   
	        // System.out.println("Hello world !");
	        // String metin = "İlginizi çekebilir ";
	        // Javada değişken isimlendirmeleri camelCase yazılır.

	        //************ Değişkenler****************************

	        String ortaMetin="İlginizi çekebilir" ;
	        String altMetin="Vade süresi";
	        System.out.println(ortaMetin);

	        int vade = 12;
	        double dolarDun = 18.10;
	        double dolarBugun= 18.10;

	        boolean dolarDustuMu = true; // or false

	       //***********Şart Blokları*****************

	        String okYonu = "";   //empty

	        if (dolarBugun<dolarDun){
	            okYonu="down.svg";
	            System.out.println(okYonu);
	        }else if (dolarBugun>dolarDun){
	             okYonu="up.svg";
	             System.out.println(okYonu);
	        }
	        else {
	            okYonu="equal.svg";
	            System.out.println(okYonu);
	        }

	        //*********** Arrray-Diziler **************

	        String[] krediler ={"Emekli Kredisi","İşçi Kredisi","Öğrenci Kredisi"};

	        //******* Loop - Döngüler ****************
	        for (int i=0;i<krediler.length;i++){
	            System.out.println(krediler[i]);
	        }


	}

}
