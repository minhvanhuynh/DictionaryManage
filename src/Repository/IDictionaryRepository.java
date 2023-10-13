/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.HashMap;

/**
 *
 * @author This PC
 */
public interface IDictionaryRepository {
      
    public void addWord(HashMap<String, String> hm, String filename);
    
    public void deleteWord(HashMap<String, String> hm, String filename);
    
    public void translateWord(HashMap<String, String> hm);
    
}
