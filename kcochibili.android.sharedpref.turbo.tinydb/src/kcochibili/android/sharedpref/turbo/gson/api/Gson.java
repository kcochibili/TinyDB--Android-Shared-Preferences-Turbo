
package kcochibili.android.sharedpref.turbo.gson.api;

public class Gson {

	static private ComponentInstaller<GsonComponent> componentInstaller = new ComponentInstaller<GsonComponent>(
			"GsonComponent");

	public static final void installComponent(final GsonComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static void installComponent(final String className) {
		componentInstaller.installComponent(className);
	}

	public static final GsonComponent invoke() {
		return componentInstaller.invokeComponent();
	}

	public static final GsonComponent component() {
		return componentInstaller.getComponent();
	}

	public static String toJson(Object obj) {
		return invoke().toJson(obj);
	}

	public static Object fromJson(String json, Class<?> classOfT) {
		return invoke().toJson(json, classOfT);
	}

}
