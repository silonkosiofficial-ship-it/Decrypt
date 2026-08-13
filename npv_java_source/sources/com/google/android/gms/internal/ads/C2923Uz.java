package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2923Uz implements com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f32315C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XC f32316D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DD f32317E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32318F = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f32319G = new java.util.concurrent.atomic.AtomicBoolean();

    public C2923Uz(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.XC xc, com.google.android.gms.internal.ads.DD dd) {
        this.f32315C = r60;
        this.f32316D = xc;
        this.f32317E = dd;
    }

    private final void a() {
        if (this.f32318F.compareAndSet(false, true)) {
            this.f32316D.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        if (this.f32315C.f31168e == 1 && c2596Mb.f29800j) {
            a();
        }
        if (c2596Mb.f29800j && this.f32319G.compareAndSet(false, true)) {
            this.f32317E.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final synchronized void u() {
        if (this.f32315C.f31168e != 1) {
            a();
        }
    }
}
