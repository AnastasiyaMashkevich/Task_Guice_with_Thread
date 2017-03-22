package epam.page;


public class YandexPage implements Page {
    @Override
    public void openPage(String url) {
    }

    @Override
    public void isNeedPageOpen() {
        System.out.println("YandexPage: Нужная старница открыта. ");
    }
}
