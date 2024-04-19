package org.example;

/**
 * This programme identifies whether a DNA nucleotides strip contains a protein or not
 *
 */
public class Dna {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        System.out.println(dna.length());
        System.out.println(dna.indexOf("ATG"));
        System.out.println(dna.indexOf("TGA"));

        if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1) {
            //the indexOf() method will return -1 if the substring (chars being checked
            //does not exist

            if (dna.length() %3 == 0) {
                String protein = dna.substring(0, 15);

                System.out.println("This is a protein: " + protein);
            } else {
                System.out.println("This is not a protein");
            }
        }
    }
}
