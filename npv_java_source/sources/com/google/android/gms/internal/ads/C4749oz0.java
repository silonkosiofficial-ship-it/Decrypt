package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4749oz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f37894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f37895b;

    /* synthetic */ C4749oz0(int i6, int i10, com.google.android.gms.internal.ads.AbstractC4639nz0 abstractC4639nz0) {
        this.f37894a = com.google.android.gms.internal.ads.Xy0.c(i6);
        this.f37895b = com.google.android.gms.internal.ads.Xy0.c(i10);
    }

    public final com.google.android.gms.internal.ads.C4749oz0 a(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        this.f37895b.add(interfaceC4309kz0);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4749oz0 b(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        this.f37894a.add(interfaceC4309kz0);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4859pz0 c() {
        return new com.google.android.gms.internal.ads.C4859pz0(this.f37894a, this.f37895b, null);
    }
}
