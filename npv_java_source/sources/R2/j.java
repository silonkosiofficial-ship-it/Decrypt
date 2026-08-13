package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f9428a = I2.j.f("ProcessUtils");

    public static java.lang.String a(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, R2.j.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof java.lang.String) {
                return (java.lang.String) objInvoke;
            }
        } catch (java.lang.Throwable th) {
            I2.j.c().a(f9428a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = android.os.Process.myPid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(android.content.Context context, androidx.work.a aVar) {
        return android.text.TextUtils.equals(a(context), !android.text.TextUtils.isEmpty(aVar.c()) ? aVar.c() : context.getApplicationInfo().processName);
    }
}
