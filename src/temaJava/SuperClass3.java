package temaJava;

public class SuperClass3 {

    static void varNumber(int ...a) {
        System.out.println("Number of arguments: " + a.length);

        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
    public void DisplayFrom3() {
        System.out.println("Acesta este textul afisat din clasa SuperClass3");
    }
}