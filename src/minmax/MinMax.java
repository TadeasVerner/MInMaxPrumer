/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;
import java.util.Scanner;
/**
 *
 * @author tadeas.verner
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0, pocet =0;
        // nekonečná smzčka
        while (true) {
            //zvětším počítadlo vloéžených čísel
            System.out.print("vlož "+pocet+". číslo: ");
            int vstup = sc.nextInt ();
            // když uživatel vloží nulu, program skončí
            if (vstup == 0) break;
            soucet = soucet + vstup;
            // pokud vložil menší nebo větší číslo, zamapamatuje si je
            if (vstup < min) min = vstup;
            if (vstup > max) max = vstup;
            System.out.println("minimum: "+min);
            System.out.println("maximum: "+max);
            System.out.println("průměr: "+((float) soucet/pocet));
        }
    }
    
}
