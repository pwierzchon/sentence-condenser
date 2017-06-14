/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.destino.sentencecompressor;

/**
 *
 * @author Patryk.Wierzchon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SentenceCompressor compressor = new SentenceCompressor();
        String input = "Digital alarm clocks scare area children.";
        String compressSentence = compressor.compressSentence(input);
        System.out.println("result: "+compressSentence);
    }
    
}
