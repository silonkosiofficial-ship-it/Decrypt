package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3517dn implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2285Dm f34791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f34792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC3846gn f34793c;

    C3517dn(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2285Dm interfaceC2285Dm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f34791a = interfaceC2285Dm;
        this.f34792b = interfaceC3296bm;
        this.f34793c = binderC3846gn;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f34791a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
