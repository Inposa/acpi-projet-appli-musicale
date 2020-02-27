package fr.iut.musidex;

import fr.iut.musidex.controller.HomeController;
import fr.iut.musidex.view.HomeWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HomeController controller = new HomeController();
        HomeWindow mainWindow = new HomeWindow(controller);
    }
}
