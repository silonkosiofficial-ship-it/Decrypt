package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3054Ym implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2396Gm f33402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f33403b;

    C3054Ym(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2396Gm interfaceC2396Gm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f33402a = interfaceC2396Gm;
        this.f33403b = interfaceC3296bm;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f33402a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
