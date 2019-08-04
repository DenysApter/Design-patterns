package observer.editors;

import observer.eventmanager.EventManager;

import java.util.ArrayList;
import java.util.List;

public class JournalEditor implements IEditors {

    private EventManager eventManager;

    public JournalEditor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    private  List<String> articles = new ArrayList<>();

    @Override
    public  String getLastProduct() {
        return articles.get(articles.size() -1);
    }

    public  void addArticle(String article) {
        articles.add(article);
        eventManager.newJournal();
    }
}
