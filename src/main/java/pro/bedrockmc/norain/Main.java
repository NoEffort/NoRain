package pro.bedrockmc.norain;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	private static Main instance;
	
	public void onEnable() {
		instance = this;
		setupListeners();
	}
	
	private void setupListeners() {
		Bukkit.getPluginManager().registerEvents(new RainListener(), this);
	}
	
	public static Main get() {
		return instance;
	}
	
}
