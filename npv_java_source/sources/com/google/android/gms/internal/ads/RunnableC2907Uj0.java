package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2907Uj0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.gms.internal.ads.AbstractC3183ak0 f32261C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final P4.d f32262D;

    RunnableC2907Uj0(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, P4.d dVar) {
        this.f32261C = abstractC3183ak0;
        this.f32262D = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f32261C.f34136C != this) {
            return;
        }
        P4.d dVar = this.f32262D;
        if (com.google.android.gms.internal.ads.AbstractC3183ak0.f34134H.f(this.f32261C, this, com.google.android.gms.internal.ads.AbstractC3183ak0.i(dVar))) {
            com.google.android.gms.internal.ads.AbstractC3183ak0.A(this.f32261C, false);
        }
    }
}
