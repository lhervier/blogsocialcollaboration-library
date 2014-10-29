package fr.asi.xsp.testblog.composants;

import org.eclipse.core.runtime.Plugin;

public class Activator extends Plugin {

	/**
	 * Notre identifiant de plugin
	 */
	public static final String PLUGIN_ID = Activator.class.getPackage().getName();

	/**
	 * L'instance de notre plugin
	 */
	private static Activator instance;
	
	/**
	 * Constructeur
	 */
	public Activator() {
		instance = this;
	}

	/**
	 * Retourne l'instance
	 */
	public static Activator getDefault() {
		return instance;
	}
}
