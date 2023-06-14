package classes;

class Param {
    void teste(int a, int b){
        System.out.println(a + " " + b);
    }
}

class ClasseComMetodos {

    public int getNumer(int i, String x) throws RuntimeException
    {
        return 1;
    }
    int getNumero(){
        return 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Param p = new Param();
        p.teste(1,2);
        new SobrecargaContrutores();
    }
}


class SobrecargaContrutores{
    SobrecargaContrutores()
    {
        this(1);
    }
    SobrecargaContrutores(int a)
    {
        System.out.println("Com argumento");
    }
}
