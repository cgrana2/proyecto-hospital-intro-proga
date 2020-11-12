
package proyecto;

public class Hemograma {
    public String operar(int linfocitos, int neutrofilos){
         if(linfocitos>60 && neutrofilos<60){
             return "virus";
             
        } else {
            return "bacteria";
        }
    }
}
