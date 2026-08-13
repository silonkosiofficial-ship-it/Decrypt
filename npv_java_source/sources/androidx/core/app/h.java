package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static java.lang.String a(android.app.Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public static java.lang.String b(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        int i6;
        java.lang.String string;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            i6 = 269222528;
        } else {
            i6 = i10 >= 24 ? 787072 : 640;
        }
        android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i6);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
