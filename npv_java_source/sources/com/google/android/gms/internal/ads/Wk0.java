package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Wk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3081Zg0 f32788a = new com.google.android.gms.internal.ads.C3081Zg0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f32789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile java.util.logging.Logger f32790c;

    Wk0(java.lang.Class cls) {
        this.f32789b = cls.getName();
    }

    final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.f32790c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f32788a) {
            try {
                java.util.logging.Logger logger2 = this.f32790c;
                if (logger2 != null) {
                    return logger2;
                }
                java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.f32789b);
                this.f32790c = logger3;
                return logger3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
