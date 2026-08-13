package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2842Sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f31783a = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f31785c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f31784b = 0;

    /* synthetic */ C2842Sq(com.google.android.gms.internal.ads.AbstractC2878Tq abstractC2878Tq) {
    }

    public final void a() {
        long jA = p174r3.v.c().a();
        synchronized (this.f31783a) {
            try {
                if (this.f31785c == 3) {
                    if (this.f31784b + ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25377P5)).longValue() <= jA) {
                        this.f31785c = 1;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        long jA2 = p174r3.v.c().a();
        synchronized (this.f31783a) {
            try {
                if (this.f31785c != 2) {
                    return;
                }
                this.f31785c = 3;
                if (this.f31785c == 3) {
                    this.f31784b = jA2;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
