package arrays;

public class Main {
    public static void main(String[] args) {
        int[] idades = new int[5];

        int[] idades2 = new int[]{0,2,4,6,8};

        for (int i = 0; i < idades.length; i++)
        {
            idades[i] = i*2;
        }

        for(int idade : idades)
            System.out.println(idade);

        System.out.println(idades == idades2);
    }
}