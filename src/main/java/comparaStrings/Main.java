package comparaStrings;

public class Main {
    public static void main(String[] args) {
        TesteCinco();
    }

    public static void TesteUm() {
        String nome1 = "Mario";
        String nome2 = "Mario";
        String nome3 = new String("Mario");
        System.out.println(nome1 == nome1);
        System.out.println(nome1 == nome3);
        System.out.println(nome1.equals(nome3));
    }

    public static void TesteDois() {
        String text = "um texto qualquer";
        String txt = text.substring(3, 8);
        System.out.println(txt == "texto");
        System.out.println(text.toLowerCase() == text);
        System.out.println(text.toString() == text);
    }

    public static void TesteTres() {
        Client c1 = new Client("Mario");
        Client c2 = new Client("Guilherme");
        Client c3 = new Client("Guilherme");

        System.out.println(c1 == c2);
        System.out.println(c1 == c1);
        System.out.println(c1 == c3);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c2.equals(c3));

    }

    public static void TesteCinco()
    {
        String s1 = "s1";
        String s2 = s1.substring(0,2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

class Client {
    String nome;

    public Client(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object o) {
        Client outro = (Client) o;
        return this.nome.equals(outro.nome);
    }
}