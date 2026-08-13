package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3188an implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2507Jm f34142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f34143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC3846gn f34144c;

    C3188an(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2507Jm interfaceC2507Jm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f34142a = interfaceC2507Jm;
        this.f34143b = interfaceC3296bm;
        this.f34144c = binderC3846gn;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f34142a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
