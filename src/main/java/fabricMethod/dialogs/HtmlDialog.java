package fabricMethod.dialogs;

import fabricMethod.buttons.IButton;
import fabricMethod.buttons.impl.HtmlButton;


public class HtmlDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
