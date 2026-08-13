package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class MU implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f29763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QH f29764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f29765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q60 f29766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f29767e;

    public MU(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.QH qh, com.google.android.gms.internal.ads.Q60 q60, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f29763a = context;
        this.f29764b = qh;
        this.f29765c = executor;
        this.f29766d = q60;
        this.f29767e = c3588eO;
    }

    private static java.lang.String e(com.google.android.gms.internal.ads.R60 r60) {
        try {
            return r60.f31202v.getString("tab_url");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        android.content.Context context = this.f29763a;
        return (context instanceof android.app.Activity) && com.google.android.gms.internal.ads.C3393cg.g(context) && !android.text.TextUtils.isEmpty(e(r60));
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Uc)).booleanValue()) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f29767e.a();
            c3479dOA.b("action", "cstm_tbs_rndr");
            c3479dOA.g();
        }
        java.lang.String strE = e(r60);
        final android.net.Uri uri = strE != null ? android.net.Uri.parse(strE) : null;
        final com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.KU
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f28933a.c(uri, c3558e70, r60, u60, obj);
            }
        }, this.f29765c);
    }

    final /* synthetic */ P4.d c(android.net.Uri uri, com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.U60 u60, java.lang.Object obj) {
        try {
            androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0346d().a();
            dVarA.f18641a.setData(uri);
            p204u3.l lVar = new p204u3.l(dVarA.f18641a, null);
            final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
            com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mHC = this.f29764b.c(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C4785pH(new com.google.android.gms.internal.ads.ZH() { // from class: com.google.android.gms.internal.ads.LU
                @Override // com.google.android.gms.internal.ads.ZH
                public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) {
                    this.f29499a.d(c4512mr, z6, context, sc);
                }
            }, null));
            c4512mr.c(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(lVar, null, abstractC4455mHC.h(), null, new p224w3.a(0, 0, false), null, null, u60.f32114b));
            this.f29766d.a();
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(abstractC4455mHC.i());
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ void d(com.google.android.gms.internal.ads.C4512mr c4512mr, boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) {
        try {
            p174r3.v.m();
            p204u3.y.a(context, (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) c4512mr.get(), true, this.f29767e);
        } catch (java.lang.Exception unused) {
        }
    }
}
