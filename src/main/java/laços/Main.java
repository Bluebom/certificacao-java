package laços;

public class Main {
    public static void main(String[] args) {
        // Interessante em JAVA
        for(int i = 0, j = 10; i < 10; i++, --j)
        {
//            System.out.println(i + " " + j);
        }

        // Labels
        externo: for(int a = 0; a < 10; a++)
        {
            System.out.println("a = "+ a);
            for(int b = 0; b < 10; b++)
            {
                if(a > 5) break;
                if(a > 3 && b == 5) continue externo;
                System.out.println("b = "+ b);
            }
        }
    }
}
