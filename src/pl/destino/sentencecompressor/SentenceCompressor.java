/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.destino.sentencecompressor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Patryk.Wierzchon
 */
public class SentenceCompressor {

    String regex = "(\\w+)\\s+\\1";
    
    public String compressSentence(String input) {
        String output = "";
        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(input);
        while (match.find()) {
            output = input.replaceAll(regex, match.group(1));
        }
        if("".equals(output)){
            output = input;
        }
        return output;
    }

}
