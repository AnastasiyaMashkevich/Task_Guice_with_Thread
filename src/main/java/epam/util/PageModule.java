package epam.util;

import epam.page.GooglePage;
import epam.page.Page;
import com.google.inject.AbstractModule;



public class PageModule extends AbstractModule {

    protected void configure() {
        bind(Page.class).to(GooglePage.class);
 // --or-- bind(Page.class).to(YandexPage.class);
    }
}
