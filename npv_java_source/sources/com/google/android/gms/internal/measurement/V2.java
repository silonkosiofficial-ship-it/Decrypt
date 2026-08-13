package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class V2 implements com.google.android.gms.internal.measurement.InterfaceC5981c3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Map f40685h = new p170r.C7026a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String[] f40686i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.ContentResolver f40687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.net.Uri f40688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Runnable f40689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.database.ContentObserver f40690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f40691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile java.util.Map f40692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f40693g;

    private V2(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.X2 x6 = new com.google.android.gms.internal.measurement.X2(this, null);
        this.f40690d = x6;
        this.f40691e = new java.lang.Object();
        this.f40693g = new java.util.ArrayList();
        M4.h.i(contentResolver);
        M4.h.i(uri);
        this.f40687a = contentResolver;
        this.f40688b = uri;
        this.f40689c = runnable;
        contentResolver.registerContentObserver(uri, false, x6);
    }

    public static com.google.android.gms.internal.measurement.V2 a(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.V2 v6;
        synchronized (com.google.android.gms.internal.measurement.V2.class) {
            java.util.Map map = f40685h;
            v6 = (com.google.android.gms.internal.measurement.V2) map.get(uri);
            if (v6 == null) {
                try {
                    com.google.android.gms.internal.measurement.V2 v10 = new com.google.android.gms.internal.measurement.V2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, v10);
                    } catch (java.lang.SecurityException unused) {
                    }
                    v6 = v10;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return v6;
    }

    static synchronized void d() {
        try {
            for (com.google.android.gms.internal.measurement.V2 v6 : f40685h.values()) {
                v6.f40687a.unregisterContentObserver(v6.f40690d);
            }
            f40685h.clear();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final java.util.Map f() {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                return (java.util.Map) com.google.android.gms.internal.measurement.AbstractC5972b3.a(new com.google.android.gms.internal.measurement.InterfaceC5999e3() { // from class: com.google.android.gms.internal.measurement.Y2
                    @Override // com.google.android.gms.internal.measurement.InterfaceC5999e3
                    public final java.lang.Object a() {
                        return this.f40710a.c();
                    }
                });
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException e6) {
            java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return mapEmptyMap;
        }
    }

    public final java.util.Map b() {
        java.util.Map mapF = this.f40692f;
        if (mapF == null) {
            synchronized (this.f40691e) {
                try {
                    mapF = this.f40692f;
                    if (mapF == null) {
                        mapF = f();
                        this.f40692f = mapF;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return mapF != null ? mapF : java.util.Collections.emptyMap();
    }

    final /* synthetic */ java.util.Map c() {
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f40687a.acquireUnstableContentProviderClient(this.f40688b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return java.util.Collections.emptyMap();
            }
            try {
                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f40688b, f40686i, null, null, null);
                try {
                    if (cursorQuery == null) {
                        java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap2;
                    }
                    java.util.Map c7026a = count <= 256 ? new p170r.C7026a(count) : new java.util.HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c7026a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c7026a;
                    }
                    java.util.Map mapEmptyMap3 = java.util.Collections.emptyMap();
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapEmptyMap3;
                } catch (java.lang.Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (android.os.RemoteException e6) {
                java.util.Map mapEmptyMap4 = java.util.Collections.emptyMap();
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return mapEmptyMap4;
            }
        } catch (java.lang.Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public final void e() {
        synchronized (this.f40691e) {
            this.f40692f = null;
            this.f40689c.run();
        }
        synchronized (this) {
            try {
                java.util.Iterator it = this.f40693g.iterator();
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
    public final /* synthetic */ java.lang.Object o(java.lang.String str) {
        return (java.lang.String) b().get(str);
    }
}
