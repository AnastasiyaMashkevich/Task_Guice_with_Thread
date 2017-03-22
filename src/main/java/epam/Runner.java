package epam;

import com.google.inject.Guice;
import com.google.inject.Injector;
import epam.util.MyApplication;
import epam.util.PageModule;


public class Runner {
    public static void main (String [] args) {

        Injector injector = Guice.createInjector(new PageModule());
        MyApplication app = injector.getInstance(MyApplication.class);
        app.openPage("www.google.ru");
        app.isNeedPageOpen();
    }

}
