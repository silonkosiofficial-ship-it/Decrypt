package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class R40 implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.S40 f31117a;

    R40(com.google.android.gms.internal.ads.S40 s40) {
        this.f31117a = s40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f31117a) {
            this.f31117a.f31544M = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C2556Ky c2556Ky = (com.google.android.gms.internal.ads.C2556Ky) obj;
        synchronized (this.f31117a) {
            try {
                com.google.android.gms.internal.ads.C2556Ky c2556Ky2 = this.f31117a.f31544M;
                if (c2556Ky2 != null) {
                    c2556Ky2.a();
                }
                com.google.android.gms.internal.ads.S40 s40 = this.f31117a;
                s40.f31544M = c2556Ky;
                c2556Ky.j(s40);
                com.google.android.gms.internal.ads.S40 s41 = this.f31117a;
                s41.f31539H.c(new com.google.android.gms.internal.ads.BinderC2592Ly(c2556Ky, s41, s41.f31539H, s41.f31541J));
                c2556Ky.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
