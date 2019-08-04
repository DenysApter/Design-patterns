package fabricMethod.dialogs;


import fabricMethod.buttons.IButton;

public abstract class Dialog {

    public void renderWindow() {
        // ... остальной код диалога ...

        IButton okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract IButton createButton();
}

