package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3407cn implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2617Mm f34562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f34563b;

    C3407cn(com.google.android.gms.internal.ads.BinderC3846gn binderC3846gn, com.google.android.gms.internal.ads.InterfaceC2617Mm interfaceC2617Mm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f34562a = interfaceC2617Mm;
        this.f34563b = interfaceC3296bm;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            this.f34562a.x(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
