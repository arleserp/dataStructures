import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class TestChainV2 {

    public static void menu(Scanner sc, Chain x) {
        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: //test count
                Integer num = Integer.parseInt(sc.nextLine());
                //System.out.println("x:"  + x);
                System.out.println("count(" + num + ")=" + x.count(num));
                break;
            case 2: //test pop
                System.out.println("size antes:" + x.size());
                System.out.println("pop=" + x.pop());
                System.out.println("size después:" + x.size());
                break;
            case 3: //test contains
                int numc = Integer.parseInt(sc.nextLine());
                System.out.println("contains(" + numc + ")=" + x.contains(numc));
                break;
            case 4: //test howIsSorted                
                System.out.println("howIsSorted()=" + x.howIsSorted());
                break;
            case 5: //test append
                int n = Integer.parseInt(sc.nextLine());
                int i = 0;
                Chain y = new Chain();
                while (i < n) {
                    y.add(i, sc.nextInt());
                    i++;
                }
                System.out.println("primera lista: " + x);
                System.out.println("segunda lista: " + y);
                x.append(y);
                System.out.println("Después de utilizar append");
                System.out.println("primera lista: " + x + " size: " + x.size());
                break;
            case 6: //remove duplicates
                System.out.println("Lista con elementos duplicados: " + x + " size: " + x.size());
                x.removeDuplicates();
                System.out.println("Lista sin duplicados: " + x + " size: " + x.size());
                break;
            case 7: //Last index of
                int to = Integer.parseInt(sc.nextLine());
                System.out.println("El ultimo indice de " + to + " es: " + x.lastIndexOf(to));
                break;
            case 8:
                String[] pals = sc.nextLine().split(" ");
                i = 0;
                Chain<String> palabras = new Chain<>();
                while (i < pals.length) {
                    palabras.add(i, pals[i]);
                    i++;
                }
                while (!palabras.isEmpty()) {
                    System.out.print(palabras.pop().toUpperCase() + " ");
                }
                break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chain x = new Chain();

        //carga una lista enlazada x con elementos de la entrada estándar
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            String[] list = sc.nextLine().split(" ");
            int i = 0;
            while (i < n) {
                x.add(i, Integer.parseInt(list[i]));
                i++;
            }
        }
        menu(sc, x);
    }
}
