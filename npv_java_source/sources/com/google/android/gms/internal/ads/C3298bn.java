package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3298bn implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2617Mm f34370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f34371b;

    C3298bn(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2617Mm interfaceC2617Mm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f34370a = interfaceC2617Mm;
        this.f34371b = interfaceC3296bm;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f34370a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
