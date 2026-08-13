package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3846gn extends com.google.android.gms.internal.ads.AbstractBinderC2838Sm {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.ads.mediation.rtb.RtbAdapter f35684C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.String f35685D = "";

    public BinderC3846gn(com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter) {
        this.f35684C = rtbAdapter;
    }

    private final android.os.Bundle p6(p184s3.X1 x6) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = x6.f54164O;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f35684C.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private static final android.os.Bundle q6(java.lang.String str) throws android.os.RemoteException {
        p224w3.p.g("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str == null) {
                return bundle;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (org.json.JSONException e6) {
            p224w3.p.e("", e6);
            throw new android.os.RemoteException();
        }
    }

    private static final boolean r6(p184s3.X1 x6) {
        if (x6.f54157H) {
            return true;
        }
        p184s3.C7147y.b();
        return p224w3.g.t();
    }

    private static final java.lang.String s6(java.lang.String str, p184s3.X1 x6) {
        java.lang.String str2 = x6.f54172W;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final boolean C0(X3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void G2(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2617Mm interfaceC2617Mm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, com.google.android.gms.internal.ads.C3505dh c3505dh) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbNativeAdMapper(new p244y3.m((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D, c3505dh), new com.google.android.gms.internal.ads.C3298bn(this, interfaceC2617Mm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render native ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbNativeAdMapper");
            java.lang.String message = th.getMessage();
            if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new android.os.RemoteException();
            }
            try {
                this.f35684C.loadRtbNativeAd(new p244y3.m((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D, c3505dh), new com.google.android.gms.internal.ads.C3407cn(this, interfaceC2617Mm, interfaceC3296bm));
            } catch (java.lang.Throwable th2) {
                p224w3.p.e("Adapter failed to render native ad.", th2);
                com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th2, "adapter.loadRtbNativeAd");
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void J0(java.lang.String str) {
        this.f35685D = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void K1(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2765Qm interfaceC2765Qm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbRewardedInterstitialAd(new p244y3.o((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D), new com.google.android.gms.internal.ads.C3736fn(this, interfaceC2765Qm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render rewarded interstitial ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void K5(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2396Gm interfaceC2396Gm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, p184s3.c2 c2Var) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbBannerAd(new p244y3.h((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), p104k3.z.c(c2Var.f54202G, c2Var.f54199D, c2Var.f54198C), this.f35685D), new com.google.android.gms.internal.ads.C3054Ym(this, interfaceC2396Gm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render banner ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbBannerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void L5(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2617Mm interfaceC2617Mm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        G2(str, str2, x6, aVar, interfaceC2617Mm, interfaceC3296bm, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void O4(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2285Dm interfaceC2285Dm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbAppOpenAd(new p244y3.g((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D), new com.google.android.gms.internal.ads.C3517dn(this, interfaceC2285Dm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render app open ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void T5(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2507Jm interfaceC2507Jm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbInterstitialAd(new p244y3.k((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D), new com.google.android.gms.internal.ads.C3188an(this, interfaceC2507Jm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render interstitial ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void Z4(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2396Gm interfaceC2396Gm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, p184s3.c2 c2Var) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbInterscrollerAd(new p244y3.h((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), p104k3.z.c(c2Var.f54202G, c2Var.f54199D, c2Var.f54198C), this.f35685D), new com.google.android.gms.internal.ads.C3090Zm(this, interfaceC2396Gm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render interscroller ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final p184s3.Y0 d() {
        java.lang.Object obj = this.f35684C;
        if (obj instanceof p244y3.s) {
            try {
                return ((p244y3.s) obj).getVideoController();
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final com.google.android.gms.internal.ads.C3956hn e() {
        this.f35684C.getVersionInfo();
        return com.google.android.gms.internal.ads.C3956hn.e(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final boolean g0(X3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final boolean g4(X3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final com.google.android.gms.internal.ads.C3956hn i() {
        this.f35684C.getSDKVersionInfo();
        return com.google.android.gms.internal.ads.C3956hn.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Jb)).booleanValue() != false) goto L31;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(X3.a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, p184s3.c2 r9, com.google.android.gms.internal.ads.InterfaceC2982Wm r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC3846gn.q1(X3.a, java.lang.String, android.os.Bundle, android.os.Bundle, s3.c2, com.google.android.gms.internal.ads.Wm):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2874Tm
    public final void u2(java.lang.String str, java.lang.String str2, p184s3.X1 x6, X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2765Qm interfaceC2765Qm, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        try {
            this.f35684C.loadRtbRewardedAd(new p244y3.o((android.content.Context) X3.b.L0(aVar), str, q6(str2), p6(x6), r6(x6), x6.f54162M, x6.f54158I, x6.f54171V, s6(str2, x6), this.f35685D), new com.google.android.gms.internal.ads.C3736fn(this, interfaceC2765Qm, interfaceC3296bm));
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Adapter failed to render rewarded ad.", th);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadRtbRewardedAd");
            throw new android.os.RemoteException();
        }
    }
}
