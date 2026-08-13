package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3270bY implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC3379cY f34345a;

    C3270bY(com.google.android.gms.internal.ads.BinderC3379cY binderC3379cY) {
        this.f34345a = binderC3379cY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f34345a) {
            this.f34345a.f34520L = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C4345lH c4345lH = (com.google.android.gms.internal.ads.C4345lH) obj;
        synchronized (this.f34345a) {
            this.f34345a.f34520L = c4345lH;
            this.f34345a.f34520L.b();
        }
    }
}
