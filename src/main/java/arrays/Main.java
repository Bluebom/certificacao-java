package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       ArrayList<String>  nomes = new ArrayList<>();
       nomes.add("Java");
       nomes.add("Kotlin");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext())
        {
            String atual = it.next();
            System.out.println(atual);
        }
    }

    public static void ArrayListUtils() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Java");
        nomes.add("Ruby");
        nomes.add("PHP");

        System.out.println(nomes.contains("Java"));

        boolean hasRemoved = nomes.remove("Java");

        System.out.println(hasRemoved);

        System.out.println(nomes.contains("JAVA"));

        Object[] oNomes = nomes.toArray();

        for(Object nome : oNomes)
        {
            System.out.println(nome);
        }

        nomes.set(0, "Kotlin");
        for(Object nome : nomes)
        {
            System.out.println(nome);
        }

    }
    public static void MultDimensional(String[] args)
    {
        int[][] strange = new int[2][];
        strange[0] = new int[20];
        strange[1] = new int[30];
        for(int i = 0; i < strange.length; i++)
        {
            System.out.println(strange[i].length);
        }
    }

    public static void clients() {
        Client[] clientes = new Client[10];
        for(int i = 0; i < clientes.length; i++)
        {
            clientes[i] = new Client();
            if(i % 2 == 0)
                clientes[i] = new SpecialClient();
            clientes[i].setNome("Franklin: " + (i + 1));
        }

        for(Client c : clientes){
            System.out.println(c.toString());
        }

        int x[] = new int[3];
        for(x[1]=x.length-1;x[1]>=0;x[1]--) {
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
    }
    public static void FirstArray(){
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

class Client {
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class SpecialClient extends Client {

}
