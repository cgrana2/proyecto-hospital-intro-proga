
package proyecto;

public class Hemograma {
    public String operar(int linfocitos, int neutrofilos){
         if(linfocitos>45 && neutrofilos<20){
             return "virus";
             
        } else {
            return "bacteria";
            
        }
    }
}
