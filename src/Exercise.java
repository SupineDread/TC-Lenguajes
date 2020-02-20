import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    Scanner l = new Scanner(System.in);

    ArrayList<Character> alphabetA = new ArrayList<>();
    ArrayList<Character> alphabetB = new ArrayList<>();

    String W1;
    String W2;

    ArrayList<String> alphabetPow = new ArrayList<>();
    ArrayList<String> alphabetMultiplySimple = new ArrayList<>();
    ArrayList<String> alphabetMultiply = new ArrayList<>();

    public void incisoA() {
        insertAlphabet(alphabetA);
    }

    public void incisoB() {
        insertAlphabet(alphabetB);
    }

    public void incisoC() {
        System.out.println("Inserte la cadena W1: ");
        W1 = l.nextLine();
        for (int i = 0; i < W1.length(); i++) {
            char c = W1.charAt(i);
            int pos = alphabetA.indexOf(c);
            if (pos < 0) {
                System.out.println("Esta cadena no es valida en el alfabeto");
                incisoC();
            }
        }
    }

    public void incisoCB() {
        System.out.println("Inserte la cadena W2: ");
        W2 = l.nextLine();
        for (int i = 0; i < W2.length(); i++) {
            char c = W2.charAt(i);
            int pos = alphabetA.indexOf(c);
            if (pos < 0) {
                System.out.println("Esta cadena no es valida en el alfabeto");
                incisoCB();
            }
        }
    }

    public void incisoD() {
        System.out.println("Ingrese el valor de N");
        int n = l.nextInt();
        if (n < 0) {
            String reverseA = "";
            String reverseB = "";
            for (int i = W1.length() - 1; i >= 0; i--) reverseA = reverseA + W1.charAt(i);
            for (int i = W2.length() - 1; i >= 0; i--) reverseB = reverseB + W2.charAt(i);
            for (int i = 0; i < (n * -1); i++) {
                System.out.print(reverseB + reverseA);
                if (i == (n * -1) - 1) System.out.print("\n");
            }
        } else if (n == 0) {
            System.out.println("lambda");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(W1 + W2);
                if (i == n - 1) System.out.print("\n");
            }
        }
    }

    public void incisoE() {
        System.out.println("Ingrese el simbolo a buscar:");
        char c = l.next().charAt(0);
        int pos = alphabetA.indexOf(c);
        int count = 0;
        if (pos < 0) {
            System.out.println("Este caracter no pertenece al alfabeto.");
            incisoE();
        } else {
            for (int i = 0; i < W1.length(); i++) {
                char h = W1.charAt(i);
                if (h == c) {
                    count++;
                }
            }
            System.out.println("Esta " + count + " veces ;D");
        }
    }

    public void incisoF() {
        // No está
    }

    public void incisoG() {
        System.out.println("Ingrese el valor de N:");
        int n = l.nextInt();
        if (n == 0 || n == 1) for (Character number : alphabetA) {
            System.out.println(number);
            return;
        }
        pow(n);
        for (String number : alphabetPow) System.out.println(number);
    }

    public void pow(int n) {

        // Se deben usar stacks no arrays

        ArrayList<String> alphabetHelper = new ArrayList<>();
        for (Character ch : alphabetA) alphabetHelper.add(String.valueOf(ch));
        for (char value : alphabetA) {
            for (int counter = 0; counter < alphabetA.size(); counter++) {
                // Esto ya debería ser un stack
                alphabetHelper.set(counter, value + "" + alphabetA.get(counter));
                System.out.println("seteado: " + counter + alphabetHelper.get(counter));
            }
            // for (int i = 0; i < n; i++) {}
        }
    }

    public void incisoH() {
        for (Character value : alphabetA) {
            for (Character character : alphabetB) {
                alphabetMultiplySimple.add((char) value + "" + (char) character);
            }
        }
        for (String number : alphabetMultiplySimple) System.out.println(number);
    }

    public void incisoI() {
        for (Character value : alphabetA) {
            for (Character character : alphabetB) {
                for (Character valor : alphabetA) {
                    alphabetMultiply.add((char) value + "" + (char) character + "" + (char) valor);
                }
            }
        }
        for (String number : alphabetMultiply) System.out.println(number);
    }

    private void insertAlphabet(ArrayList<Character> alphabet) {
        System.out.println("Ingrese un caracter del alfabeto o la expresion de caracteres. \n");
        String c = l.nextLine();
        if (c.length() > 0) {
            if (c.indexOf('-') != -1) {
                int inicio = c.charAt(0);
                int fin = c.charAt(2);
                for (int i = inicio; i <= fin; i++) alphabet.add((char) i);
            } else {
                char ind = c.charAt(0);
                alphabet.add(ind);
                while (ind != 32) {
                    c = l.nextLine();
                    ind = c.length() > 0 ? c.charAt(0) : Character.MIN_VALUE;
                    alphabet.add(ind);
                }
                alphabet.remove(alphabet.size() - 1);
            }
        } else {
            System.out.println("No se ha leido.");
        }
    }

}
