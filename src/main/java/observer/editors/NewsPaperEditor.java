package observer.editors;

import observer.eventmanager.EventManager;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperEditor implements IEditors {

    private  List<String> newsPaper = new ArrayList<>();

    private EventManager eventManager;

    public NewsPaperEditor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public  String getLastProduct() {
        return newsPaper.get(newsPaper.size() -1);
    }

    public  void addNews(String news) {
        newsPaper.add(news);
        eventManager.newNewsPaper();
    }
}
