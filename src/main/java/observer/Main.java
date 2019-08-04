package observer;

import observer.editors.JournalEditor;
import observer.editors.NewsPaperEditor;
import observer.eventmanager.EventManager;
import observer.subscribers.JournalSubscriber;
import observer.subscribers.NewspaperSubscriber;

public class Main {
    public static void main(String[] args) {

        String[] evTypes = {"journal", "newspaper"};
        EventManager eventManager = new EventManager(evTypes);

        JournalEditor journalEditor = new JournalEditor(eventManager);
        NewsPaperEditor newsPaperEditor = new NewsPaperEditor(eventManager);

        JournalSubscriber journalSubscriber = new JournalSubscriber(journalEditor);
        NewspaperSubscriber newspaperSubscriber = new NewspaperSubscriber(newsPaperEditor);

        eventManager.subscribe("journal", journalSubscriber);
        eventManager.subscribe("newspaper", newspaperSubscriber);

        journalEditor.addArticle("first  article");
        newsPaperEditor.addNews("first  news\n");

        eventManager.unsubscribe("newspaper", newspaperSubscriber);
        newsPaperEditor.addNews("second  news");
        journalEditor.addArticle("second  article");
    }
}
