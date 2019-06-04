
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kruko
 */
public class Languages {
    private ResourceBundle messages;
    public ResourceBundle locale(String language, String country){
        Locale currentLocale = new Locale(language, country);
        return messages = ResourceBundle.getBundle("Bundle", currentLocale);
    }
}
