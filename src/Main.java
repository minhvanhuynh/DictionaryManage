
import controller.ManageDictionary;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "====Dictionary program====";
        String[] s= new String[] {"Add Word", "Delete Word", "Translate", "Exit"};
        new ManageDictionary(title, s).run();
    }
}
