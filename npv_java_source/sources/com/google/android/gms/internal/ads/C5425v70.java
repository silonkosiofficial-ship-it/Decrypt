package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5425v70 implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.MG f39340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.C2591Lx f39341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.C2559La0 f39342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.C4033iT f39343d;

    public /* synthetic */ C5425v70(com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.C2591Lx c2591Lx, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4033iT c4033iT) {
        this.f39340a = mg;
        this.f39341b = c2591Lx;
        this.f39342c = c2559La0;
        this.f39343d = c4033iT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        com.google.android.gms.internal.ads.AbstractC3728fj.c(map, this.f39340a);
        java.lang.String str = (java.lang.String) map.get("u");
        if (str == null) {
            p224w3.p.g("URL missing from click GMSG.");
            return;
        }
        com.google.android.gms.internal.ads.C4033iT c4033iT = this.f39343d;
        com.google.android.gms.internal.ads.C2559La0 c2559La0 = this.f39342c;
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC3728fj.a(interfaceC2698Ot, str), new com.google.android.gms.internal.ads.C5645x70(interfaceC2698Ot, this.f39341b, c2559La0, c4033iT), com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
    }
}
