package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4137jP implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4797pP f36672a;

    C4137jP(com.google.android.gms.internal.ads.C4797pP c4797pP) {
        this.f36672a = c4797pP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        synchronized (this) {
            this.f36672a.f37988c = true;
            this.f36672a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (p174r3.v.c().c() - this.f36672a.f37989d));
            this.f36672a.f37990e.d(new java.lang.Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        final java.lang.String str = (java.lang.String) obj;
        synchronized (this) {
            this.f36672a.f37988c = true;
            this.f36672a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (p174r3.v.c().c() - this.f36672a.f37989d));
            this.f36672a.f37994i.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.iP
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.C4797pP.j(this.f36277C.f36672a, str);
                }
            });
        }
    }
}
