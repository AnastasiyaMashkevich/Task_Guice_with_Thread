package epam.util;


import epam.page.Page;
import com.google.inject.Inject;


public class MyApplication {

    private Page page;

    @Inject
    MyApplication (Page page1) {
        this.page = page1;
    }

    public void openPage (String url) {
        page.openPage(url);
    }

    public void isNeedPageOpen () {
         page.isNeedPageOpen();
    }

}
