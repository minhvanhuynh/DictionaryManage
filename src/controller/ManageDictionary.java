/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.DictionaryRepository;
import Repository.IDictionaryRepository;
import java.util.HashMap;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageDictionary extends Menu<String>{
    
    private IDictionaryRepository idr= new DictionaryRepository();
    private HashMap<String, String> hm= new HashMap<>();
    private String fileName= "dictionary.txt";
    
    public ManageDictionary(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                idr.addWord(hm,fileName);
                break;
            case 2:
                idr.deleteWord(hm,fileName);
                break;
            case 3:
                idr.translateWord(hm);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    
}
