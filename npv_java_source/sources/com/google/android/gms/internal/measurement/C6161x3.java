package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6161x3 implements com.google.android.gms.internal.measurement.InterfaceC5981c3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Map f41288g = new p170r.C7026a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f41289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Runnable f41290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener f41291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f41292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile java.util.Map f41293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f41294f;

    private C6161x3(android.content.SharedPreferences sharedPreferences, java.lang.Runnable runnable) {
        android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.w3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences2, java.lang.String str) {
                this.f41265a.d(sharedPreferences2, str);
            }
        };
        this.f41291c = onSharedPreferenceChangeListener;
        this.f41292d = new java.lang.Object();
        this.f41294f = new java.util.ArrayList();
        this.f41289a = sharedPreferences;
        this.f41290b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static android.content.SharedPreferences a(android.content.Context context, java.lang.String str) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return com.google.android.gms.internal.measurement.AbstractC6174z0.a(context, str, 0, com.google.android.gms.internal.measurement.AbstractC6142v0.f41247a);
            }
            if (com.google.android.gms.internal.measurement.T2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return com.google.android.gms.internal.measurement.AbstractC6174z0.a(context, str.substring(12), 0, com.google.android.gms.internal.measurement.AbstractC6142v0.f41247a);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static com.google.android.gms.internal.measurement.C6161x3 b(android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.C6161x3 c6161x3;
        if (!((!com.google.android.gms.internal.measurement.T2.a() || str.startsWith("direct_boot:")) ? true : com.google.android.gms.internal.measurement.T2.c(context))) {
            return null;
        }
        synchronized (com.google.android.gms.internal.measurement.C6161x3.class) {
            try {
                java.util.Map map = f41288g;
                c6161x3 = (com.google.android.gms.internal.measurement.C6161x3) map.get(str);
                if (c6161x3 == null) {
                    c6161x3 = new com.google.android.gms.internal.measurement.C6161x3(a(context, str), runnable);
                    map.put(str, c6161x3);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c6161x3;
    }

    static synchronized void c() {
        try {
            for (com.google.android.gms.internal.measurement.C6161x3 c6161x3 : f41288g.values()) {
                c6161x3.f41289a.unregisterOnSharedPreferenceChangeListener(c6161x3.f41291c);
            }
            f41288g.clear();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void d(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.f41292d) {
            this.f41293e = null;
            this.f41290b.run();
        }
        synchronized (this) {
            try {
                java.util.Iterator it = this.f41294f.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.D.a(it.next());
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5981c3
    public final java.lang.Object o(java.lang.String str) {
        java.util.Map<java.lang.String, ?> map = this.f41293e;
        if (map == null) {
            synchronized (this.f41292d) {
                try {
                    map = this.f41293e;
                    if (map == null) {
                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            java.util.Map<java.lang.String, ?> all = this.f41289a.getAll();
                            this.f41293e = all;
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (java.lang.Throwable th) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
