package Z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final android.util.SparseArray f16670C = new android.util.SparseArray();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static int f16671D = 1;

    public static boolean b(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        android.util.SparseArray sparseArray = f16670C;
        synchronized (sparseArray) {
            try {
                android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                java.lang.String str = "No active wake lock id #" + intExtra;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static android.content.ComponentName c(android.content.Context context, android.content.Intent intent) {
        android.util.SparseArray sparseArray = f16670C;
        synchronized (sparseArray) {
            try {
                int i6 = f16671D;
                int i10 = i6 + 1;
                f16671D = i10;
                if (i10 <= 0) {
                    f16671D = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i6);
                android.content.ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i6, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
