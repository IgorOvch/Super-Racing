package com.mirea.superracing.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mirea.superracing.MainClass;

import javax.swing.*;
import java.awt.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Super-Racing";
		cfg.fullscreen = true;
		new LwjglApplication(new MainClass(), cfg);
	}
}
