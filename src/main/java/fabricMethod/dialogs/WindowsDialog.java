package fabricMethod.dialogs;

import fabricMethod.buttons.IButton;
import fabricMethod.buttons.impl.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
