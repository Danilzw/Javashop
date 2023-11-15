package ex001.Presenters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ex001.Models.Toys;

public class MainPresenter {
    
    private EditorModel model;
    private View view;
    List<Toys>toys = new ArrayList<>();

    public MainPresenter(EditorModel model,View view)
    {
        this.model = model;
        this.view = view;
    }

    public void addToy(Toys toy)
    {
        model.addToy(toy);
        view.addToy(toy);
        toys.add(toy);
    }

    public void readFile()
    {
        view.readFile();
    }

    public void giftToy()
    {
        Random random = new Random();
        List<Toys>toys2 = new ArrayList<>();
        int counter = 0;
        for(Toys toy:toys)
        {
            while (counter <= toy.getWeight()-1) {
                toys2.add(toy);
                counter += 1;
            }
            counter = 0;
        }
        int picked = random.nextInt(toys2.size());
        System.out.println(toys2.get(picked));
        toys2.remove(picked);

        System.out.println("--------------------");
        for(Toys item:toys2)
        {
            System.out.println(item);
        }
        
    }

}
