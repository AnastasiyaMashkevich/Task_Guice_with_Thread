package epam.page;


public class GooglePage implements Page, Runnable {

    public void openPage(String url) {
        System.out.println("Work with GooglePage, url: " + url);
    }

    public void isNeedPageOpen () {
        System.out.println("GooglePage: Нужная старница открыта. ");
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}

