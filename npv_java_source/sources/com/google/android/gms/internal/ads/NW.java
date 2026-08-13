package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NW implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XT f30320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3375cU f30321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f30322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30323d;

    public NW(com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.XT xt, com.google.android.gms.internal.ads.InterfaceC3375cU interfaceC3375cU) {
        this.f30322c = c5429v90;
        this.f30323d = yk0;
        this.f30321b = interfaceC3375cU;
        this.f30320a = xt;
    }

    static final java.lang.String e(java.lang.String str, int i6) {
        return "Error from: " + str + ", code: " + i6;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        return !r60.f31198t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        final com.google.android.gms.internal.ads.YT ytA;
        java.util.Iterator it = r60.f31198t.iterator();
        while (true) {
            if (!it.hasNext()) {
                ytA = null;
                break;
            }
            try {
                ytA = this.f30320a.a((java.lang.String) it.next(), r60.f31202v);
                break;
            } catch (com.google.android.gms.internal.ads.C5315u70 unused) {
            }
        }
        if (ytA == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AV("Unable to instantiate mediation adapter class."));
        }
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        ytA.f33356c.L0(new com.google.android.gms.internal.ads.MW(this, ytA, c4512mr));
        if (r60.f31146M) {
            android.os.Bundle bundle = c3558e70.f34898a.f34012a.f37511d.f54164O;
            android.os.Bundle bundle2 = bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
                bundle.putBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        com.google.android.gms.internal.ads.C5429v90 c5429v90 = this.f30322c;
        return com.google.android.gms.internal.ads.AbstractC3562e90.d(new com.google.android.gms.internal.ads.Z80() { // from class: com.google.android.gms.internal.ads.KW
            @Override // com.google.android.gms.internal.ads.Z80
            public final void a() {
                this.f28943a.d(c3558e70, r60, ytA);
            }
        }, this.f30323d, com.google.android.gms.internal.ads.EnumC4770p90.ADAPTER_LOAD_AD_SYN, c5429v90).b(com.google.android.gms.internal.ads.EnumC4770p90.ADAPTER_LOAD_AD_ACK).d(c4512mr).b(com.google.android.gms.internal.ads.EnumC4770p90.ADAPTER_WRAP_ADAPTER).e(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.LW
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                return this.f29511a.c(c3558e70, r60, ytA, (java.lang.Void) obj);
            }
        }).a();
    }

    final /* synthetic */ java.lang.Object c(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt, java.lang.Void r6) {
        return this.f30321b.b(c3558e70, r60, yt);
    }

    final /* synthetic */ void d(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        this.f30321b.a(c3558e70, r60, yt);
    }
}
