package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3736fn implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2765Qm f35423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f35424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC3846gn f35425c;

    C3736fn(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2765Qm interfaceC2765Qm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f35423a = interfaceC2765Qm;
        this.f35424b = interfaceC3296bm;
        this.f35425c = binderC3846gn;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f35423a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
