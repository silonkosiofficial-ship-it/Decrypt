package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5161sm implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f38795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC5601wm f38796b;

    C5161sm(com.google.android.gms.internal.ads.BinderC5601wm binderC5601wm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f38795a = interfaceC3296bm;
        this.f38796b = binderC5601wm;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            p224w3.p.b(this.f38796b.f39669C.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6885b.a() + ". ErrorMessage = " + c6885b.c() + ". ErrorDomain = " + c6885b.b());
            this.f38795a.i5(c6885b.d());
            this.f38795a.m1(c6885b.a(), c6885b.c());
            this.f38795a.D(c6885b.a());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
