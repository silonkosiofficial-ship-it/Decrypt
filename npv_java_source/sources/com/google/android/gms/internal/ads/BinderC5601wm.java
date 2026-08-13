package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5601wm extends com.google.android.gms.internal.ads.AbstractBinderC3017Xl {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f39669C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5711xm f39670D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4618np f39671E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private X3.a f39672F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.view.View f39673G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p244y3.r f39674H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f39675I = "";

    public BinderC5601wm(p244y3.a aVar) {
        this.f39669C = aVar;
    }

    public BinderC5601wm(p244y3.f fVar) {
        this.f39669C = fVar;
    }

    private final android.os.Bundle o6(p184s3.X1 x6) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = x6.f54164O;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f39669C.getClass().getName())) == null) ? new android.os.Bundle() : bundle;
    }

    private final android.os.Bundle p6(java.lang.String str, p184s3.X1 x6, java.lang.String str2) throws android.os.RemoteException {
        p224w3.p.b("Server parameters: ".concat(java.lang.String.valueOf(str)));
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f39669C instanceof com.google.ads.mediation.admob.AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (x6 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", x6.f54158I);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (java.lang.Throwable th) {
            p224w3.p.e("", th);
            throw new android.os.RemoteException();
        }
    }

    private static final boolean q6(p184s3.X1 x6) {
        if (x6.f54157H) {
            return true;
        }
        p184s3.C7147y.b();
        return p224w3.g.t();
    }

    private static final java.lang.String r6(java.lang.String str, p184s3.X1 x6) {
        java.lang.String str2 = x6.f54172W;
        try {
            return new org.json.JSONObject(str).getString("max_ad_content_rating");
        } catch (org.json.JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void A0(boolean z6) {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.q) {
            try {
                ((p244y3.q) obj).onImmersiveModeUpdated(z6);
                return;
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                return;
            }
        }
        p224w3.p.b(p244y3.q.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void B2(X3.a aVar, p184s3.c2 c2Var, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        L3(aVar, c2Var, x6, str, null, interfaceC3296bm);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void G3(X3.a aVar) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if ((obj instanceof p244y3.a) || (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter)) {
            if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
                H();
                return;
            } else {
                p224w3.p.b("Show interstitial ad from adapter.");
                p224w3.p.d("Can not show null mediation interstitial ad.");
                throw new android.os.RemoteException();
            }
        }
        p224w3.p.g(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " or " + p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void G4(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3620ek interfaceC3620ek, java.util.List list) throws android.os.RemoteException {
        byte b6;
        if (!(this.f39669C instanceof p244y3.a)) {
            throw new android.os.RemoteException();
        }
        com.google.android.gms.internal.ads.C4722om c4722om = new com.google.android.gms.internal.ads.C4722om(this, interfaceC3620ek);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C4278kk c4278kk = (com.google.android.gms.internal.ads.C4278kk) it.next();
            switch (c4278kk.f37000C) {
                case "banner":
                    b6 = 0;
                    break;
                case "native":
                    b6 = 4;
                    break;
                case "rewarded":
                    b6 = 2;
                    break;
                case "interstitial":
                    b6 = 1;
                    break;
                case "app_open":
                    b6 = 5;
                    break;
                case "app_open_ad":
                    b6 = 6;
                    break;
                case "rewarded_interstitial":
                    b6 = 3;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            p104k3.EnumC6886c enumC6886c = null;
            switch (b6) {
                case 0:
                    enumC6886c = p104k3.EnumC6886c.BANNER;
                    break;
                case 1:
                    enumC6886c = p104k3.EnumC6886c.INTERSTITIAL;
                    break;
                case 2:
                    enumC6886c = p104k3.EnumC6886c.REWARDED;
                    break;
                case 3:
                    enumC6886c = p104k3.EnumC6886c.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    enumC6886c = p104k3.EnumC6886c.NATIVE;
                    break;
                case 6:
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Jb)).booleanValue()) {
                    }
                case 5:
                    enumC6886c = p104k3.EnumC6886c.APP_OPEN_AD;
                    break;
            }
            if (enumC6886c != null) {
                arrayList.add(new p244y3.j(enumC6886c, c4278kk.f37001D));
            }
        }
        ((p244y3.a) this.f39669C).initialize((android.content.Context) X3.b.L0(aVar), c4722om, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void H() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
            p224w3.p.b("Showing interstitial from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) this.f39669C).showInterstitial();
                return;
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                throw new android.os.RemoteException();
            }
        }
        p224w3.p.g(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3844gm I() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void L1(X3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void L3(X3.a aVar, p184s3.c2 c2Var, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter) && !(obj instanceof p244y3.a)) {
            p224w3.p.g(com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName() + " or " + p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting banner ad from adapter.");
        p104k3.h hVarD = c2Var.f54211P ? p104k3.z.d(c2Var.f54202G, c2Var.f54199D) : p104k3.z.c(c2Var.f54202G, c2Var.f54199D, c2Var.f54198C);
        java.lang.Object obj2 = this.f39669C;
        if (!(obj2 instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter)) {
            if (obj2 instanceof p244y3.a) {
                try {
                    ((p244y3.a) obj2).loadBannerAd(new p244y3.h((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, str2), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), hVarD, this.f39675I), new com.google.android.gms.internal.ads.C4832pm(this, interfaceC3296bm));
                    return;
                } catch (java.lang.Throwable th) {
                    p224w3.p.e("", th);
                    com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadBannerAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter = (com.google.android.gms.ads.mediation.MediationBannerAdapter) obj2;
            java.util.List list = x6.f54156G;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j6 = x6.f54153D;
            com.google.android.gms.internal.ads.C4502mm c4502mm = new com.google.android.gms.internal.ads.C4502mm(j6 == -1 ? null : new java.util.Date(j6), x6.f54155F, hashSet, x6.f54162M, q6(x6), x6.f54158I, x6.f54169T, x6.f54171V, r6(str, x6));
            android.os.Bundle bundle = x6.f54164O;
            mediationBannerAdapter.requestBannerAd((android.content.Context) X3.b.L0(aVar), new com.google.android.gms.internal.ads.C5711xm(interfaceC3296bm), p6(str, x6, str2), hVarD, c4502mm, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (java.lang.Throwable th2) {
            p224w3.p.e("", th2);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th2, "adapter.requestBannerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final boolean M() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if ((obj instanceof p244y3.a) || j$.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f39671E != null;
        }
        java.lang.Object obj2 = this.f39669C;
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void N() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.f) {
            try {
                ((p244y3.f) obj).onResume();
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void P() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.a) {
            p224w3.p.d("Can not show null mediated rewarded ad.");
            throw new android.os.RemoteException();
        }
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void Q4(p184s3.X1 x6, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.a) {
            z4(this.f39672F, x6, str, new com.google.android.gms.internal.ads.BinderC5821ym((p244y3.a) obj, this.f39671E));
            return;
        }
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final boolean R() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void S0(p184s3.X1 x6, java.lang.String str) throws android.os.RemoteException {
        Q4(x6, str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void T4(X3.a aVar) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.a) {
            p224w3.p.b("Show app open ad from adapter.");
            p224w3.p.d("Can not show null mediation app open ad.");
            throw new android.os.RemoteException();
        }
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void V2(X3.a aVar) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.a) {
            p224w3.p.b("Show rewarded ad from adapter.");
            p224w3.p.d("Can not show null mediation rewarded ad.");
            throw new android.os.RemoteException();
        }
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void a2(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np, java.util.List list) throws android.os.RemoteException {
        p224w3.p.g("Could not initialize rewarded video adapter.");
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void b1(X3.a aVar, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) && !(obj instanceof p244y3.a)) {
            p224w3.p.g(com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName() + " or " + p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting interstitial ad from adapter.");
        java.lang.Object obj2 = this.f39669C;
        if (!(obj2 instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter)) {
            if (obj2 instanceof p244y3.a) {
                try {
                    ((p244y3.a) obj2).loadInterstitialAd(new p244y3.k((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, str2), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), this.f39675I), new com.google.android.gms.internal.ads.C5051rm(this, interfaceC3296bm));
                    return;
                } catch (java.lang.Throwable th) {
                    p224w3.p.e("", th);
                    com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.loadInterstitialAd");
                    throw new android.os.RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter = (com.google.android.gms.ads.mediation.MediationInterstitialAdapter) obj2;
            java.util.List list = x6.f54156G;
            java.util.HashSet hashSet = list != null ? new java.util.HashSet(list) : null;
            long j6 = x6.f54153D;
            com.google.android.gms.internal.ads.C4502mm c4502mm = new com.google.android.gms.internal.ads.C4502mm(j6 == -1 ? null : new java.util.Date(j6), x6.f54155F, hashSet, x6.f54162M, q6(x6), x6.f54158I, x6.f54169T, x6.f54171V, r6(str, x6));
            android.os.Bundle bundle = x6.f54164O;
            mediationInterstitialAdapter.requestInterstitialAd((android.content.Context) X3.b.L0(aVar), new com.google.android.gms.internal.ads.C5711xm(interfaceC3296bm), p6(str, x6, str2), c4502mm, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (java.lang.Throwable th2) {
            p224w3.p.e("", th2);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th2, "adapter.requestInterstitialAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void c3(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.a) {
            p224w3.p.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((p244y3.a) this.f39669C).loadRewardedInterstitialAd(new p244y3.o((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, null), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), ""), new com.google.android.gms.internal.ads.C5381um(this, interfaceC3296bm));
                return;
            } catch (java.lang.Exception e6) {
                com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, e6, "adapter.loadRewardedInterstitialAd");
                throw new android.os.RemoteException();
            }
        }
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final android.os.Bundle d() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3954hm d0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final android.os.Bundle e() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final p184s3.Y0 g() {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.s) {
            try {
                return ((p244y3.s) obj).getVideoController();
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.InterfaceC2424Hh h() {
        com.google.android.gms.internal.ads.C5711xm c5711xm = this.f39670D;
        if (c5711xm == null) {
            return null;
        }
        com.google.android.gms.internal.ads.C2461Ih c2461IhU = c5711xm.u();
        if (c2461IhU instanceof com.google.android.gms.internal.ads.C2461Ih) {
            return c2461IhU.a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void h2(X3.a aVar, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, com.google.android.gms.internal.ads.C3505dh c3505dh, java.util.List list) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) && !(obj instanceof p244y3.a)) {
            p224w3.p.g(com.google.android.gms.ads.mediation.MediationNativeAdapter.class.getCanonicalName() + " or " + p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting native ad from adapter.");
        java.lang.Object obj2 = this.f39669C;
        if (obj2 instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter) {
            try {
                com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter = (com.google.android.gms.ads.mediation.MediationNativeAdapter) obj2;
                java.util.List list2 = x6.f54156G;
                java.util.HashSet hashSet = list2 != null ? new java.util.HashSet(list2) : null;
                long j6 = x6.f54153D;
                com.google.android.gms.internal.ads.C5931zm c5931zm = new com.google.android.gms.internal.ads.C5931zm(j6 == -1 ? null : new java.util.Date(j6), x6.f54155F, hashSet, x6.f54162M, q6(x6), x6.f54158I, c3505dh, list, x6.f54169T, x6.f54171V, r6(str, x6));
                android.os.Bundle bundle = x6.f54164O;
                android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f39670D = new com.google.android.gms.internal.ads.C5711xm(interfaceC3296bm);
                mediationNativeAdapter.requestNativeAd((android.content.Context) X3.b.L0(aVar), this.f39670D, p6(str, x6, str2), c5931zm, bundle2);
                return;
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th, "adapter.requestNativeAd");
                throw new android.os.RemoteException();
            }
        }
        if (obj2 instanceof p244y3.a) {
            try {
                ((p244y3.a) obj2).loadNativeAdMapper(new p244y3.m((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, str2), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), this.f39675I, c3505dh), new com.google.android.gms.internal.ads.C5271tm(this, interfaceC3296bm));
            } catch (java.lang.Throwable th2) {
                p224w3.p.e("", th2);
                com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th2, "adapter.loadNativeAdMapper");
                java.lang.String message = th2.getMessage();
                if (android.text.TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new android.os.RemoteException();
                }
                try {
                    ((p244y3.a) this.f39669C).loadNativeAd(new p244y3.m((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, str2), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), this.f39675I, c3505dh), new com.google.android.gms.internal.ads.C5161sm(this, interfaceC3296bm));
                } catch (java.lang.Throwable th3) {
                    p224w3.p.e("", th3);
                    com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, th3, "adapter.loadNativeAd");
                    throw new android.os.RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final android.os.Bundle i() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.InterfaceC3624em j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.InterfaceC4282km k() {
        p244y3.r rVar;
        p244y3.r rVarT;
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof com.google.android.gms.ads.mediation.MediationNativeAdapter)) {
            if (!(obj instanceof p244y3.a) || (rVar = this.f39674H) == null) {
                return null;
            }
            return new com.google.android.gms.internal.ads.BinderC2174Am(rVar);
        }
        com.google.android.gms.internal.ads.C5711xm c5711xm = this.f39670D;
        if (c5711xm == null || (rVarT = c5711xm.t()) == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.BinderC2174Am(rVarT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3956hn l() {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof p244y3.a)) {
            return null;
        }
        ((p244y3.a) obj).getVersionInfo();
        return com.google.android.gms.internal.ads.C3956hn.e(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void l4(X3.a aVar, p184s3.c2 c2Var, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof p244y3.a)) {
            p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting interscroller ad from adapter.");
        try {
            p244y3.a aVar2 = (p244y3.a) this.f39669C;
            aVar2.loadInterscrollerAd(new p244y3.h((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, str2), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), p104k3.z.e(c2Var.f54202G, c2Var.f54199D), ""), new com.google.android.gms.internal.ads.C4612nm(this, interfaceC3296bm, aVar2));
        } catch (java.lang.Exception e6) {
            p224w3.p.e("", e6);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, e6, "adapter.loadInterscrollerAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3956hn m() {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof p244y3.a)) {
            return null;
        }
        ((p244y3.a) obj).getSDKVersionInfo();
        return com.google.android.gms.internal.ads.C3956hn.e(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final X3.a n() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter) {
            try {
                return X3.b.c2(((com.google.android.gms.ads.mediation.MediationBannerAdapter) obj).getBannerView());
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                throw new android.os.RemoteException();
            }
        }
        if (obj instanceof p244y3.a) {
            return X3.b.c2(this.f39673G);
        }
        p224w3.p.g(com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName() + " or " + p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void p() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.f) {
            try {
                ((p244y3.f) obj).onDestroy();
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void r0() throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (obj instanceof p244y3.f) {
            try {
                ((p244y3.f) obj).onPause();
            } catch (java.lang.Throwable th) {
                p224w3.p.e("", th);
                throw new android.os.RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void r3(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np, java.lang.String str2) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if ((obj instanceof p244y3.a) || j$.util.Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f39672F = aVar;
            this.f39671E = interfaceC4618np;
            interfaceC4618np.O3(X3.b.c2(this.f39669C));
            return;
        }
        java.lang.Object obj2 = this.f39669C;
        p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void t2(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        b1(aVar, x6, str, null, interfaceC3296bm);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void w4(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof p244y3.a)) {
            p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting app open ad from adapter.");
        try {
            ((p244y3.a) this.f39669C).loadAppOpenAd(new p244y3.g((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, null), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), ""), new com.google.android.gms.internal.ads.C5491vm(this, interfaceC3296bm));
        } catch (java.lang.Exception e6) {
            p224w3.p.e("", e6);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, e6, "adapter.loadAppOpenAd");
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void z4(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) throws android.os.RemoteException {
        java.lang.Object obj = this.f39669C;
        if (!(obj instanceof p244y3.a)) {
            p224w3.p.g(p244y3.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new android.os.RemoteException();
        }
        p224w3.p.b("Requesting rewarded ad from adapter.");
        try {
            ((p244y3.a) this.f39669C).loadRewardedAd(new p244y3.o((android.content.Context) X3.b.L0(aVar), "", p6(str, x6, null), o6(x6), q6(x6), x6.f54162M, x6.f54158I, x6.f54171V, r6(str, x6), ""), new com.google.android.gms.internal.ads.C5381um(this, interfaceC3296bm));
        } catch (java.lang.Exception e6) {
            p224w3.p.e("", e6);
            com.google.android.gms.internal.ads.AbstractC2837Sl.a(aVar, e6, "adapter.loadRewardedAd");
            throw new android.os.RemoteException();
        }
    }
}
