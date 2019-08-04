package observer.eventmanager;

import observer.subscribers.MyEventListener;

import java.text.SimpleDateFormat;
import java.util.*;

public class EventManager {
    Map<String, List<MyEventListener>> subscribers = new HashMap<>();

    public EventManager(String... typeEvents) {
        Arrays.stream(typeEvents).forEach(t -> subscribers.put(t, new ArrayList<MyEventListener>()));
    }

    public void subscribe(String typeEvent, MyEventListener eventListener) {
        subscribers.get(typeEvent).add(eventListener);
    }

    public void unsubscribe(String typeEvent, MyEventListener eventListener) {
        subscribers.get(typeEvent).remove(eventListener);
    }

    public void newJournal() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String dataUpdate = formatter.format(date);
        subscribers.get("journal").forEach(e -> e.update(String.format("Journal is update!!! %1s", dataUpdate)));
    }

    public void newNewsPaper() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String dataUpdate = formatter.format(date);
        subscribers.get("newspaper").forEach(e -> e.update(String.format("Newspaper is update!!! %1s", dataUpdate)));
    }
}
