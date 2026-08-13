package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f9442a = I2.j.f("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.WeakHashMap f9443b = new java.util.WeakHashMap();

    public static void a() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.WeakHashMap weakHashMap = f9443b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (android.os.PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                I2.j.c().h(f9442a, java.lang.String.format("WakeLock held for %s", map.get(wakeLock)), new java.lang.Throwable[0]);
            }
        }
    }

    public static android.os.PowerManager.WakeLock b(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = "WorkManager: " + str;
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        java.util.WeakHashMap weakHashMap = f9443b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
