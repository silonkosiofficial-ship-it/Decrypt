package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5498vp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f39459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f39460b;

    /* synthetic */ AbstractC5498vp0(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.AbstractC5388up0 abstractC5388up0) {
        this.f39459a = cls;
        this.f39460b = cls2;
    }

    public static com.google.android.gms.internal.ads.AbstractC5498vp0 b(com.google.android.gms.internal.ads.InterfaceC5278tp0 interfaceC5278tp0, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.C5168sp0(cls, cls2, interfaceC5278tp0);
    }

    public abstract com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0);

    public final java.lang.Class c() {
        return this.f39459a;
    }

    public final java.lang.Class d() {
        return this.f39460b;
    }
}
