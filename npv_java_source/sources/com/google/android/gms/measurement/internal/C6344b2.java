package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6344b2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.Object f42271g = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f42272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.Z1 f42273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f42274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f42275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile java.lang.Object f42276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile java.lang.Object f42277f;

    private C6344b2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.google.android.gms.measurement.internal.Z1 z6) {
        this.f42275d = new java.lang.Object();
        this.f42276e = null;
        this.f42277f = null;
        this.f42272a = str;
        this.f42274c = obj;
        this.f42273b = z6;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        synchronized (this.f42275d) {
        }
        if (obj != null) {
            return obj;
        }
        if (com.google.android.gms.measurement.internal.AbstractC6358d2.f42339a == null) {
            return this.f42274c;
        }
        synchronized (f42271g) {
            try {
                if (com.google.android.gms.measurement.internal.C6348c.a()) {
                    return this.f42277f == null ? this.f42274c : this.f42277f;
                }
                try {
                    for (com.google.android.gms.measurement.internal.C6344b2 c6344b2 : com.google.android.gms.measurement.internal.G.f41862a) {
                        if (com.google.android.gms.measurement.internal.C6348c.a()) {
                            throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        java.lang.Object objA = null;
                        try {
                            com.google.android.gms.measurement.internal.Z1 z6 = c6344b2.f42273b;
                            if (z6 != null) {
                                objA = z6.a();
                            }
                        } catch (java.lang.IllegalStateException unused) {
                        }
                        synchronized (f42271g) {
                            c6344b2.f42277f = objA;
                        }
                    }
                } catch (java.lang.SecurityException unused2) {
                }
                com.google.android.gms.measurement.internal.Z1 z10 = this.f42273b;
                if (z10 == null) {
                    return this.f42274c;
                }
                try {
                    return z10.a();
                } catch (java.lang.IllegalStateException unused3) {
                    return this.f42274c;
                } catch (java.lang.SecurityException unused4) {
                    return this.f42274c;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.lang.String b() {
        return this.f42272a;
    }
}
