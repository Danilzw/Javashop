package ex001;



import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;



import ex001.Models.Editor;
import ex001.Models.Toys;
import ex001.Presenters.EditorModel;
import ex001.Presenters.MainPresenter;
import ex001.Presenters.View;
import ex001.Views.MainView;

public class Program {
    public static void main(String[] args) {
        EditorModel model1 = new Editor();
        View view1 = new MainView();
        Toys toy1 = new Toys("Машинка", 8);
        Toys toy2 = new Toys("Динозавр", 3);
        MainPresenter presenter = new MainPresenter(model1, view1);


        presenter.addToy(toy1);
        presenter.addToy(toy2);

        System.out.println("---------------------");
        presenter.giftToy();


        
    }



}
