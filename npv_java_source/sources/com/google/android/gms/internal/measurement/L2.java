package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.google.android.gms.internal.measurement.K2 f40565a;

    public static synchronized com.google.android.gms.internal.measurement.K2 a() {
        try {
            if (f40565a == null) {
                b(new com.google.android.gms.internal.measurement.N2());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f40565a;
    }

    private static synchronized void b(com.google.android.gms.internal.measurement.K2 k6) {
        if (f40565a != null) {
            throw new java.lang.IllegalStateException("init() already called");
        }
        f40565a = k6;
    }
}
