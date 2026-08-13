package U3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f14476b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile U3.b f14477c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.util.concurrent.ConcurrentHashMap f14478a = new j$.util.concurrent.ConcurrentHashMap();

    private b() {
    }

    public static U3.b b() {
        if (f14477c == null) {
            synchronized (f14476b) {
                try {
                    if (f14477c == null) {
                        f14477c = new U3.b();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        U3.b bVar = f14477c;
        Q3.AbstractC1477p.l(bVar);
        return bVar;
    }

    private static void e(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    private final boolean f(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i6, boolean z6, java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((W3.e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i6, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.f14478a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i6, executor);
            if (zH) {
                return zH;
            }
            this.f14478a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (java.lang.Throwable th) {
            this.f14478a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    private static boolean g(android.content.ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof Q3.r0);
    }

    private static final boolean h(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i6, java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!V3.n.j() || executor == null) ? context.bindService(intent, serviceConnection, i6) : context.bindService(intent, i6, executor, serviceConnection);
    }

    public boolean a(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i6) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i6, true, null);
    }

    public void c(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f14478a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (android.content.ServiceConnection) this.f14478a.get(serviceConnection));
        } finally {
            this.f14478a.remove(serviceConnection);
        }
    }

    public final boolean d(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i6, java.util.concurrent.Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
