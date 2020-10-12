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


public class DNA {
// Determines if a given sring of DNA represents a protein
  String dna1 = "ATGCGATACGCTTGA";
  String dna2 = "ATGCGATACGTGA";
  String dna3 = "ATTAATATGTACTGA";

  public static void main(String[] args) {

  }
}