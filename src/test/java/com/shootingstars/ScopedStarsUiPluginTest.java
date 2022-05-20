package com.shootingstars;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ScopedStarsUiPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ScopedStarsUiPlugin.class);
		RuneLite.main(args);
	}
}