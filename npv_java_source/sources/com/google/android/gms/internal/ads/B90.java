package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class B90 implements com.google.android.gms.internal.ads.InterfaceC4893qG, com.google.android.gms.internal.ads.VC, com.google.android.gms.internal.ads.InterfaceC5442vG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f25907C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E90 f25908D;

    B90(android.content.Context context, com.google.android.gms.internal.ads.Q90 q90) {
        this.f25907C = q90;
        this.f25908D = com.google.android.gms.internal.ads.D90.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5442vG
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5442vG
    public final void b() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
            com.google.android.gms.internal.ads.Q90 q90 = this.f25907C;
            com.google.android.gms.internal.ads.E90 e90 = this.f25908D;
            e90.K0(true);
            q90.a(e90);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void l() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
            this.f25908D.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.VC
    public final void p(p184s3.W0 w6) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
            com.google.android.gms.internal.ads.Q90 q90 = this.f25907C;
            com.google.android.gms.internal.ads.E90 e90 = this.f25908D;
            e90.E(w6.e().toString());
            e90.K0(false);
            q90.a(e90);
        }
    }
}
