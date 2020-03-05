package fr.iut.musidex;

import fr.iut.musidex.controller.*;
import fr.iut.musidex.view.*;
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
