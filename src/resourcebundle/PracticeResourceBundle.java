package resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PracticeResourceBundle {
    public static void main(String[] args)
    {
        Locale locale = new Locale("vi");

        ResourceBundle bundle = ResourceBundle.getBundle("resourcebundle.messages", locale);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));
    }
}
