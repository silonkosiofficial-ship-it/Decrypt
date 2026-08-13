package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class JL implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.R60 f28668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.U60 f28669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2591Lx f28670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.PL f28671d;

    JL(com.google.android.gms.internal.ads.PL pl, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f28668a = r60;
        this.f28669b = u60;
        this.f28670c = c2591Lx;
        this.f28671d = pl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        interfaceC2698Ot.P0(this.f28668a, this.f28669b);
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25480Y9)).booleanValue() && interfaceC2552KuM != null) {
            com.google.android.gms.internal.ads.C2591Lx c2591Lx = this.f28670c;
            com.google.android.gms.internal.ads.PL pl = this.f28671d;
            interfaceC2552KuM.J(c2591Lx, pl.f30703i, pl.f30704j);
            com.google.android.gms.internal.ads.C2591Lx c2591Lx2 = this.f28670c;
            com.google.android.gms.internal.ads.PL pl2 = this.f28671d;
            interfaceC2552KuM.B0(c2591Lx2, pl2.f30703i, pl2.f30698d);
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Rc)).booleanValue() || interfaceC2552KuM == null) {
            return;
        }
        interfaceC2552KuM.C0(this.f28668a);
    }
}
