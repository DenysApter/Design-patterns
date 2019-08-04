package fabricMethod.buttons.impl;

import fabricMethod.buttons.IButton;

public class WindowsButton implements IButton {
    @Override
    public void render() {
        System.out.println("RENDER WINDOWS BUTTON");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click WINDOWS Button!");
    }
}
