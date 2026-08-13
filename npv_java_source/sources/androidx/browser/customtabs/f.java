package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f18655a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p030d.b f18656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p030d.a f18657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.ComponentName f18658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.app.PendingIntent f18659e;

    f(p030d.b bVar, p030d.a aVar, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent) {
        this.f18656b = bVar;
        this.f18657c = aVar;
        this.f18658d = componentName;
        this.f18659e = pendingIntent;
    }

    private void a(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent = this.f18659e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private android.os.Bundle b(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private android.os.Bundle c(android.net.Uri uri) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f18659e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    android.os.IBinder d() {
        return this.f18657c.asBinder();
    }

    android.content.ComponentName e() {
        return this.f18658d;
    }

    android.app.PendingIntent f() {
        return this.f18659e;
    }

    public int g(java.lang.String str, android.os.Bundle bundle) {
        int iA3;
        android.os.Bundle bundleB = b(bundle);
        synchronized (this.f18655a) {
            try {
                try {
                    iA3 = this.f18656b.a3(this.f18657c, str, bundleB);
                } catch (android.os.RemoteException unused) {
                    return -2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iA3;
    }

    public boolean h(android.net.Uri uri) {
        return i(uri, null, new android.os.Bundle());
    }

    public boolean i(android.net.Uri uri, android.net.Uri uri2, android.os.Bundle bundle) {
        try {
            android.os.Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.f18656b.o5(this.f18657c, uri);
            }
            bundle.putAll(bundleC);
            return this.f18656b.t3(this.f18657c, uri, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
