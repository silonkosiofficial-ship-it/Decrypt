package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4072iq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f36362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f36363b;

    /* synthetic */ AbstractC4072iq0(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.AbstractC3963hq0 abstractC3963hq0) {
        this.f36362a = cls;
        this.f36363b = cls2;
    }

    public static com.google.android.gms.internal.ads.AbstractC4072iq0 b(com.google.android.gms.internal.ads.InterfaceC3853gq0 interfaceC3853gq0, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.C3743fq0(cls, cls2, interfaceC3853gq0);
    }

    public abstract com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.Sl0 sl0);

    public final java.lang.Class c() {
        return this.f36362a;
    }

    public final java.lang.Class d() {
        return this.f36363b;
    }
}
