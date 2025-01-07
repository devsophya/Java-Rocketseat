package je_19_arrays;

public class Arrays {
    public static void main(String[] args) {
        Integer [] array = {2,4,10,15,5,3};
        array[2]=33;

        for(int i=0; i <array.length; i++){
            Integer elemento = array [i];
            System.out.println(elemento);
        }
    }
}
