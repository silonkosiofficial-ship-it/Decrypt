package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6314w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.C6306v f41667a = new com.google.android.gms.internal.play_billing.C6306v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f41668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile java.util.logging.Logger f41669c;

    C6314w1(java.lang.Class cls) {
        this.f41668b = cls.getName();
    }

    final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.f41669c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f41667a) {
            try {
                java.util.logging.Logger logger2 = this.f41669c;
                if (logger2 != null) {
                    return logger2;
                }
                java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.f41668b);
                this.f41669c = logger3;
                return logger3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
