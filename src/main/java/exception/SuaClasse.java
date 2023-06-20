package exception;

public class SuaClasse {
    public void fazAlgo(int[] idades)
    {
        try{
            System.out.println(idades[1]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void metodo1()
    {
        System.out.println("primeiro antes");
        metodo2();
        System.out.println("segundo antes antes");
    }

    public static void metodo2()
    {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }

    public static void main(String[] args) {
//        new SuaClasse().fazAlgo(null);
        metodo1();
    }
}
