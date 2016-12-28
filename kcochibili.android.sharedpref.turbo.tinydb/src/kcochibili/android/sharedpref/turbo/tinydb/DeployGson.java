package kcochibili.android.sharedpref.turbo.tinydb;

import kcochibili.android.sharedpref.turbo.gson.api.Gson;

public class DeployGson {

	public static void deploy() {
		Gson.installComponent("kcochibili.android.adopted.gson.GoogleGson");
	}

}
