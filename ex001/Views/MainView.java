package ex001.Views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import ex001.Models.Toys;
import ex001.Presenters.View;

public class MainView implements View{
    
    private File file1 = new File("text.txt");
    private BufferedReader reader;
    List<String>lines = new ArrayList<>();

    public MainView()
    {
        try
        {
            reader = new BufferedReader(new FileReader(file1,StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                lines.add(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Проблемы с файлом");
        }
    }


    public void addToy(Toys toy)
    {
        System.out.println("Успешно добавлено:");
        System.out.println(toy);
    }
    
    public void readFile()
    {
        for(String line : lines)
        {
            System.out.println(line);
        }
    }
}

