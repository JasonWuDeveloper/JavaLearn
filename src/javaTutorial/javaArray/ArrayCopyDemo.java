package javaTutorial.javaArray;

public class ArrayCopyDemo {
    public static void main(String[] args) {
       String[] copyFrom = {
               "Affogato","Americano", "Cappuccino", "Corretto", "Cortado", "Doppip", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"
       };

       String[] copyTo = new String[12];
       System.arraycopy(copyFrom, 0 ,copyTo, 0, 12);
       for (String coffee : copyTo) {
           System.out.print(coffee + " ");
       }
    }
}
