package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedAppComponentFactory extends android.app.AppComponentFactory {
    private android.app.AppComponentFactory factory;

    private android.app.AppComponentFactory getAppComponentFactory() {
        android.app.AppComponentFactory appComponentFactory = this.factory;
        if (appComponentFactory != null) {
            return appComponentFactory;
        }
        java.lang.String processName = android.app.Application.getProcessName();
        if (processName == null || !(processName.contains(":p697f3fdd90adb74ee6fbaa87") || processName.contains(":p29010b34ea9186ab5ffa1d6e"))) {
            try {
                this.factory = (android.app.AppComponentFactory) java.lang.Class.forName("androidx.core.app.CoreComponentFactory").newInstance();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e6) {
                if (!android.os.Process.isIsolated()) {
                    android.util.Log.e("LoadedApk", "Unable to instantiate appComponentFactory", e6);
                }
                this.factory = new android.app.AppComponentFactory();
            }
            return this.factory;
        }
        android.util.Log.i("LoadedApk", "Fast path. Process name: " + processName);
        android.app.AppComponentFactory appComponentFactory2 = new android.app.AppComponentFactory();
        this.factory = appComponentFactory2;
        return appComponentFactory2;
    }

    public android.app.Activity instantiateActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return getAppComponentFactory().instantiateActivity(classLoader, str, intent);
    }

    public android.app.Application instantiateApplication(java.lang.ClassLoader classLoader, java.lang.String str) {
        return (android.app.Application) classLoader.loadClass(str).newInstance();
    }

    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader classLoader, java.lang.String str) {
        return getAppComponentFactory().instantiateProvider(classLoader, str);
    }

    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return getAppComponentFactory().instantiateReceiver(classLoader, str, intent);
    }

    public android.app.Service instantiateService(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return getAppComponentFactory().instantiateService(classLoader, str, intent);
    }
}
