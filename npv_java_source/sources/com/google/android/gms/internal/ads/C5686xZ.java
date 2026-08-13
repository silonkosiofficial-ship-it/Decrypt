package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5686xZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Bundle f39881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f39882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f39883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f39884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f39885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4333lB f39886g;

    public C5686xZ(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, p214v3.InterfaceC7268s0 interfaceC7268s0, java.lang.String str3, com.google.android.gms.internal.ads.C4333lB c4333lB) {
        this.f39880a = context;
        this.f39881b = bundle;
        this.f39882c = str;
        this.f39883d = str2;
        this.f39884e = interfaceC7268s0;
        this.f39885f = str3;
        this.f39886g = c4333lB;
    }

    private final void a(android.os.Bundle bundle) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25214A5)).booleanValue()) {
            try {
                p174r3.v.t();
                bundle.putString("_app_id", p214v3.E0.V(this.f39880a));
            } catch (android.os.RemoteException | java.lang.RuntimeException e6) {
                p174r3.v.s().x(e6, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        c3677fC.f35302b.putBundle("quality_signals", this.f39881b);
        a(c3677fC.f35302b);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        bundle.putBundle("quality_signals", this.f39881b);
        bundle.putString("seq_num", this.f39882c);
        if (!this.f39884e.M()) {
            bundle.putString("session_id", this.f39883d);
        }
        bundle.putBoolean("client_purpose_one", !this.f39884e.M());
        a(bundle);
        if (this.f39885f != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putLong("dload", this.f39886g.b(this.f39885f));
            bundle2.putInt("pcc", this.f39886g.a(this.f39885f));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25260E9)).booleanValue() || p174r3.v.s().b() <= 0) {
            return;
        }
        bundle.putInt("nrwv", p174r3.v.s().b());
    }
}
