package observer.subscribers;

import observer.editors.IEditors;

public class JournalSubscriber implements MyEventListener {

    private IEditors editor;

    public JournalSubscriber(IEditors editor) {
        this.editor = editor;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("%1s, new article is %2s", message, editor.getLastProduct()));
    }
}
