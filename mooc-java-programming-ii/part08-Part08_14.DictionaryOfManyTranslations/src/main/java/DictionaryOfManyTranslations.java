/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.*;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;
    
    public DictionaryOfManyTranslations(){
        map = new HashMap<>();
    }
    
    public void add(String word, String translation){
        map.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> trans = map.get(word);
        trans.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(!map.containsKey(word)){
            return new ArrayList<String>();
        }
        return map.get(word);
    }
    
    public void remove(String word){
        map.remove(word);
    }
    
}
