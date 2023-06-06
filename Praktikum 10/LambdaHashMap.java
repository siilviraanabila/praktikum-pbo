/* File      : LambdaHashMap.java		
   Penulis   : Silvira Nabila Anggita Giraldi / 24060121120011
   Deskripsi : Ekspresi lambda pada hashmap, digunakan untuk parameter pada method.*/

import java.util.HashMap;
import java.util.Map;
 
public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120011", "Piray");
        mahasiswaMap.put("24060121140143", "Sappa");
        mahasiswaMap.put("24060121140173", "Puti");
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
    }
}