package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class N90 implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Q90 f30185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f30186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f30187c;

    N90(com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90, boolean z6) {
        this.f30185a = q90;
        this.f30186b = e90;
        this.f30187c = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.E90 e90 = this.f30186b;
        if (e90.k()) {
            com.google.android.gms.internal.ads.Q90 q90 = this.f30185a;
            e90.c(th);
            e90.K0(false);
            q90.a(e90);
            if (this.f30187c) {
                this.f30185a.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.E90 e90 = this.f30186b;
        e90.K0(true);
        this.f30185a.a(e90);
        if (this.f30187c) {
            this.f30185a.h();
        }
    }
}
