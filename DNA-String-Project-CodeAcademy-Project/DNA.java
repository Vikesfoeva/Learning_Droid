/*
Author: Brandon Lenz
Date: 10/11/2020
Description: DNA String Project Code Academy - Learning Java

Instructions - 
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:

ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.
*/

import java.util.ArrayList;

public class DNA {
// Determines if a given sring of DNA represents a protein
  public static void main(String[] args) {
    ArrayList<String> dna = new ArrayList<String>();
    
    DNA test1 = new DNA();

    dna.add("ATGCGATACGCTTGA");
    dna.add("ATGCGATACGTGA");
    dna.add("ATTAATATGTACTGA");

    for (int i = 0; i < dna.size(); i++) {
        test1.dnaCheck(dna.get(i));
    }

  }

  public void dnaCheck(String seq){
    boolean prefixCheck = false;
    boolean suffixCheck = false;
    boolean sizeCheck = false;
    System.out.println("Checking " + seq);
    System.out.println("...");
    if (seq.length()%3 == 0) {
        sizeCheck = true;
    }

    if (seq.subString(0,3).equals("ATG")){
        prefixCheck = true;
    }

    if (seq.subString(seq.length()-3,seq.length()).equals("ATG")){
        suffixCheck = true;
    }
    
    if (suffixCheck && prefixCheck && sizeCheck){
        System.out.println(seq + " is a protien.");
    } else {
        System.out.println(seq + " is not a protien");
    }
  }

}