package ex001.Presenters;

import java.util.ArrayList;
import java.util.List;

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

}
