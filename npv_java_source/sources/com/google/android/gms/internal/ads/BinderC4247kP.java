package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class BinderC4247kP extends com.google.android.gms.internal.ads.AbstractBinderC3511dk {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f36955C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f36956D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f36957E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.E90 f36958F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f36959G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4797pP f36960H;

    BinderC4247kP(com.google.android.gms.internal.ads.C4797pP c4797pP, java.lang.Object obj, java.lang.String str, long j6, com.google.android.gms.internal.ads.E90 e90, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f36955C = obj;
        this.f36956D = str;
        this.f36957E = j6;
        this.f36958F = e90;
        this.f36959G = c4512mr;
        this.f36960H = c4797pP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3620ek
    public final void e() {
        synchronized (this.f36955C) {
            this.f36960H.v(this.f36956D, true, "", (int) (p174r3.v.c().c() - this.f36957E));
            this.f36960H.f37997l.d(this.f36956D);
            this.f36960H.f38000o.Z(this.f36956D);
            com.google.android.gms.internal.ads.T90 t90 = this.f36960H.f38001p;
            com.google.android.gms.internal.ads.E90 e90 = this.f36958F;
            e90.K0(true);
            t90.b(e90.m());
            this.f36959G.c(java.lang.Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3620ek
    public final void o(java.lang.String str) {
        synchronized (this.f36955C) {
            this.f36960H.v(this.f36956D, false, str, (int) (p174r3.v.c().c() - this.f36957E));
            this.f36960H.f37997l.b(this.f36956D, "error");
            this.f36960H.f38000o.q(this.f36956D, "error");
            com.google.android.gms.internal.ads.T90 t90 = this.f36960H.f38001p;
            com.google.android.gms.internal.ads.E90 e90 = this.f36958F;
            e90.E(str);
            e90.K0(false);
            t90.b(e90.m());
            this.f36959G.c(java.lang.Boolean.FALSE);
        }
    }
}
