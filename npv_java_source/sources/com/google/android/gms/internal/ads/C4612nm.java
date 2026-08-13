package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4612nm implements p244y3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3296bm f37647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p244y3.a f37648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC5601wm f37649c;

    C4612nm(com.google.android.gms.internal.ads.BinderC5601wm binderC5601wm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, p244y3.a aVar) {
        this.f37647a = interfaceC3296bm;
        this.f37648b = aVar;
        this.f37649c = binderC5601wm;
    }

    @Override // p244y3.d
    public final void a(p104k3.C6885b c6885b) {
        try {
            p224w3.p.b(this.f37648b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6885b.a() + ". ErrorMessage = " + c6885b.c() + ". ErrorDomain = " + c6885b.b());
            this.f37647a.i5(c6885b.d());
            this.f37647a.m1(c6885b.a(), c6885b.c());
            this.f37647a.D(c6885b.a());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
