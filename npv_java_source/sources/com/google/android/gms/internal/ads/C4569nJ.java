package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4569nJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC2682Oh f37559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC2572Lh f37560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC3397ci f37561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC3082Zh f37562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC5597wk f37563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p170r.Y f37564f = new p170r.Y();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p170r.Y f37565g = new p170r.Y();

    public final com.google.android.gms.internal.ads.C4569nJ a(com.google.android.gms.internal.ads.InterfaceC2572Lh interfaceC2572Lh) {
        this.f37560b = interfaceC2572Lh;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4569nJ b(com.google.android.gms.internal.ads.InterfaceC2682Oh interfaceC2682Oh) {
        this.f37559a = interfaceC2682Oh;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4569nJ c(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2938Vh interfaceC2938Vh, com.google.android.gms.internal.ads.InterfaceC2830Sh interfaceC2830Sh) {
        this.f37564f.put(str, interfaceC2938Vh);
        if (interfaceC2830Sh != null) {
            this.f37565g.put(str, interfaceC2830Sh);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C4569nJ d(com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wk) {
        this.f37563e = interfaceC5597wk;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4569nJ e(com.google.android.gms.internal.ads.InterfaceC3082Zh interfaceC3082Zh) {
        this.f37562d = interfaceC3082Zh;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4569nJ f(com.google.android.gms.internal.ads.InterfaceC3397ci interfaceC3397ci) {
        this.f37561c = interfaceC3397ci;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4789pJ g() {
        return new com.google.android.gms.internal.ads.C4789pJ(this);
    }
}
