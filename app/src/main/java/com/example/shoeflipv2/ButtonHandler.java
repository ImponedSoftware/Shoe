package com.example.shoeflipv2;

import android.widget.Button;

public class ButtonHandler
{
    private static final ButtonHandler INSTANCE = new ButtonHandler();

    private ButtonHandler()
    {
        System.out.println("hey yaaaaaaaaaaaaaaaaaaa");
    }

    public static ButtonHandler getInstance() {
        return INSTANCE;
    }
}
