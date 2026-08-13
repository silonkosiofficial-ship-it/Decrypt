package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2996Xa implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2262Da f33148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5316u8 f33149b;

    public CallableC2996Xa(com.google.android.gms.internal.ads.C2262Da c2262Da, com.google.android.gms.internal.ads.C5316u8 c5316u8) {
        this.f33148a = c2262Da;
        this.f33149b = c5316u8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (this.f33148a.l() != null) {
            this.f33148a.l().get();
        }
        com.google.android.gms.internal.ads.Q8 q8C = this.f33148a.c();
        if (q8C == null) {
            return null;
        }
        try {
            synchronized (this.f33149b) {
                try {
                    this.f33149b.e(q8C.l(), com.google.android.gms.internal.ads.C5730xv0.a());
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (com.google.android.gms.internal.ads.Vv0 | java.lang.NullPointerException unused) {
            return null;
        }
    }
}
