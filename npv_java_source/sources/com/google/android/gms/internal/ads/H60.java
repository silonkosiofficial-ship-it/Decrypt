package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class H60 implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.I60 f27979a;

    H60(com.google.android.gms.internal.ads.I60 i60) {
        this.f27979a = i60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f27979a) {
            this.f27979a.f28407K = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3696fM c3696fM = (com.google.android.gms.internal.ads.C3696fM) obj;
        synchronized (this.f27979a) {
            try {
                this.f27979a.f28407K = c3696fM;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25265F3)).booleanValue()) {
                    c3696fM.k().f35551a = this.f27979a.f28402F;
                }
                this.f27979a.f28407K.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
