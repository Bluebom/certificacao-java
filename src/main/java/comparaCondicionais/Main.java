package comparaCondicionais;

public class Main {

    public static void main(String[] args) {
        TestaSwitch();
    }

    public static void TesteIf() {
        boolean autentico = true;

        if (autentico) {
            System.out.println("Ok");
        } else {
            System.out.println("Não autorizado");
        }

        boolean valor = true;

        if (valor == false) {
            System.out.println("false");
        }

        if (valor) {
            System.out.println("valor");
        }

        int a = 0, b = 3;

        if (a != b) {
            System.out.println("iguais");
        }
    }

    public static void TestaSwitch() {
        int option = 1;
        switch (option){
            case 1:
                System.out.println("Primeira Opção");
                break;
            case 2:
                System.out.println("Segunda Opção");
                break;
            case 3:
                System.out.println("Terceira Opção");
                break;
        }
    }
}
