package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class M60 implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.O60 f29664a;

    M60(com.google.android.gms.internal.ads.O60 o60) {
        this.f29664a = o60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f29664a) {
            this.f29664a.f30450F = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3696fM c3696fM = (com.google.android.gms.internal.ads.C3696fM) obj;
        synchronized (this.f29664a) {
            try {
                this.f29664a.f30450F = c3696fM;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25265F3)).booleanValue()) {
                    c3696fM.k().f35551a = this.f29664a.f30449E;
                }
                this.f29664a.f30450F.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
