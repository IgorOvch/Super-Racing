package com.mirea.superracing.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mirea.superracing.MainClass;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.Graphics.DisplayMode;
import javax.swing.*;
import java.awt.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Super-Racing";
		cfg.height = 800;
		cfg.width = 1400;
		new LwjglApplication(new MainClass(), cfg);
	}
}
