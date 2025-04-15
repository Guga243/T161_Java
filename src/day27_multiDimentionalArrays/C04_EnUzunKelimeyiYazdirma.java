package day27_multiDimentionalArrays;

public class C04_EnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        // verilen iki katli string bir arraydeki en uzun kelimeyi yazdiriin

        String [][] arr ={{"ali","okula","git"},{"merhabalar","arkadaslar"},{"bu","is","olacak"}};

        String enUzunKelime =arr[0][0];

        for (int i = 0; i < arr.length; i++) { // outer arrayleri

            for (int j = 0; j <arr[i].length ; j++) { // inner arrayleri

                if (arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=arr[i][j];

                }

            }

        }
        System.out.println("en uzun kelime :"+enUzunKelime); // merhabalar
    }
}
