package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class P9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q9 f30659C;

    P9(com.google.android.gms.internal.ads.Q9 q10) {
        this.f30659C = q10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30659C.f30917P) {
            if (this.f30659C.f30918Q) {
                return;
            }
            this.f30659C.f30918Q = true;
            try {
                com.google.android.gms.internal.ads.Q9.n(this.f30659C);
            } catch (java.lang.Exception e6) {
                this.f30659C.f30909H.c(2023, -1L, e6);
            }
            synchronized (this.f30659C.f30917P) {
                this.f30659C.f30918Q = false;
            }
        }
    }
}
