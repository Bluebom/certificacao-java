package barCode;

public class Main {
    public static void main(String[] args) {
//        new BarcodeGenerator(
//                UUID.randomUUID().toString(),
//                "As Crônicas de Nárnia",
//                "O livro que tem tudo isso é 'O leão, a feiticeira e o guarda-roupa', escrito em 1949 por Clive Staples Lewis. MasLewis não parou por aí."
//        );
//        new BarcodeGenerator(
//                UUID.randomUUID().toString(),
//                "O Hobbit",
//                "Bilbo Bolseiro era um dos mais respeitáveis hobbits de todo o Condado até que, um dia, o mago Gandalf bate à sua porta. A partir de então, toda sua vida pacata e campestre soprando anéis de fumaça com seu belo cachimbo começa a mudar."
//        );

        new BarcodeReader("8affdd5a-fbab-4f32-bc11-ec93082e9cdb.png");
        new BarcodeReader("23a238b9-946a-4463-b72e-a9d972633a78.png");
    }
}
