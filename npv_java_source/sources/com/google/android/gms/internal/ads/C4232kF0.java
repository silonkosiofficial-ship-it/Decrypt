package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4232kF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2954Vu[] f36912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MF0 f36913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5841yw f36914c;

    public C4232kF0(com.google.android.gms.internal.ads.InterfaceC2954Vu... interfaceC2954VuArr) {
        com.google.android.gms.internal.ads.MF0 mf0 = new com.google.android.gms.internal.ads.MF0();
        com.google.android.gms.internal.ads.C5841yw c5841yw = new com.google.android.gms.internal.ads.C5841yw();
        com.google.android.gms.internal.ads.InterfaceC2954Vu[] interfaceC2954VuArr2 = {mf0, c5841yw};
        this.f36912a = interfaceC2954VuArr2;
        java.lang.System.arraycopy(interfaceC2954VuArr, 0, interfaceC2954VuArr2, 0, 0);
        this.f36913b = mf0;
        this.f36914c = c5841yw;
    }

    public final long a(long j6) {
        return this.f36914c.i() ? this.f36914c.h(j6) : j6;
    }

    public final long b() {
        return this.f36913b.o();
    }

    public final com.google.android.gms.internal.ads.C4930qg c(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        this.f36914c.k(c4930qg.f38296a);
        this.f36914c.j(c4930qg.f38297b);
        return c4930qg;
    }

    public final boolean d(boolean z6) {
        this.f36913b.p(z6);
        return z6;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2954Vu[] e() {
        return this.f36912a;
    }
}
