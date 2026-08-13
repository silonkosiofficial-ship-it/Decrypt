package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5058rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f38560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f38561b;

    /* synthetic */ AbstractC5058rp0(com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Class cls, com.google.android.gms.internal.ads.AbstractC4949qp0 abstractC4949qp0) {
        this.f38560a = lu0;
        this.f38561b = cls;
    }

    public static com.google.android.gms.internal.ads.AbstractC5058rp0 b(com.google.android.gms.internal.ads.InterfaceC4839pp0 interfaceC4839pp0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.C4729op0(lu0, cls, interfaceC4839pp0);
    }

    public abstract com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0);

    public final com.google.android.gms.internal.ads.Lu0 c() {
        return this.f38560a;
    }

    public final java.lang.Class d() {
        return this.f38561b;
    }
}
