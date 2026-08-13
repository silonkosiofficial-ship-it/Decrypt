package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5187sz implements com.google.android.gms.internal.ads.ZC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f38829C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f38830D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f38831E;

    C5187sz(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.R60 r60) {
        this.f38829C = interfaceC2698Ot;
        this.f38830D = c3588eO;
        this.f38831E = r60;
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Lc)).booleanValue() || (interfaceC2698Ot = this.f38829C) == null) {
            return;
        }
        java.lang.String str = true != p214v3.AbstractC7238d.a(interfaceC2698Ot.N()) ? "0" : "1";
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f38830D.a();
        c3479dOA.b("action", "hcp");
        c3479dOA.b("hcp", str);
        c3479dOA.c(this.f38831E);
        c3479dOA.g();
    }
}
