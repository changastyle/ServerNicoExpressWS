package controller;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Main 
{
    public static void main(String args[])
    {
        Path workingDirectory=Paths.get(".").toAbsolutePath();
        System.out.println("PATH:" + workingDirectory);
        
        controller.Controller.recargarParametrosNicoExpress();
    }
}
