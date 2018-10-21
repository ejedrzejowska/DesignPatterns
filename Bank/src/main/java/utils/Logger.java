package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Logger {
    private static Logger instance;

    private Logger(){

    }

    public static Logger getInstance(){
        if (instance == null){
            synchronized (Logger.class){
                if (instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String text){
        try {
            Files.write(Paths.get("C://Users/Latitude E7440/IdeaProjects/desingPatterns/Bank/plik.txt"), text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
