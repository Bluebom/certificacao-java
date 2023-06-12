package arrays;

public class Main {
    public static void main(String[] args) {

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
