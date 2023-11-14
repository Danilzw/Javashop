package ex001.Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import ex001.Presenters.EditorModel;
import ex001.Presenters.Model;

public class Editor implements EditorModel {
    
    private File file1 = new File("text.txt");
    private BufferedWriter writer;

    public Editor()
    {
        try
        {
            writer = new BufferedWriter(new FileWriter(file1,StandardCharsets.UTF_8,true));
        }
        catch (IOException e)
        {
            System.out.println("Проблемы с файлом");
        }
    }

    public void addToy(Toys toys)
    {
        try
        {
            writer.write(String.valueOf(toys));
            writer.newLine();
            writer.flush();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка с файлом");
        }
    }

    
    
}
