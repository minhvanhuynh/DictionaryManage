/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.DictionaryDao;
import java.util.HashMap;

/**
 *
 * @author This PC
 */
public class DictionaryRepository implements IDictionaryRepository{

    @Override
    public void addWord(HashMap<String, String> hm, String fileName) {
        DictionaryDao.Instance().addWord(hm,fileName);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm, String fileName) {
        DictionaryDao.Instance().deleteWord(hm, fileName);
    }

    @Override
    public void translateWord(HashMap<String, String> hm) {
        DictionaryDao.Instance().translateWord(hm);
    }
    
}
