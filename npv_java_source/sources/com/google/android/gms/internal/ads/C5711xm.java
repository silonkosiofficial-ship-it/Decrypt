package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5711xm implements p244y3.i, p244y3.l, p244y3.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3296bm f39919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p244y3.r f39920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2461Ih f39921c;

    public C5711xm(com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        this.f39919a = interfaceC3296bm;
    }

    @Override // p244y3.i
    public final void a(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdClosed.");
        try {
            this.f39919a.e();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void b(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdOpened.");
        try {
            this.f39919a.q();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.l
    public final void c(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter, int i6) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdFailedToLoad with error " + i6 + ".");
        try {
            this.f39919a.D(i6);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void d(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.C2461Ih c2461Ih) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdLoaded with template id ".concat(java.lang.String.valueOf(c2461Ih.b())));
        this.f39921c = c2461Ih;
        try {
            this.f39919a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.i
    public final void e(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdClicked.");
        try {
            this.f39919a.d();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.l
    public final void f(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter, p104k3.C6885b c6885b) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6885b.a() + ". ErrorMessage: " + c6885b.c() + ". ErrorDomain: " + c6885b.b());
        try {
            this.f39919a.i5(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.i
    public final void g(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAppEvent.");
        try {
            this.f39919a.M4(str, str2);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void h(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdClosed.");
        try {
            this.f39919a.e();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.i
    public final void i(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdLoaded.");
        try {
            this.f39919a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void j(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, p244y3.r rVar) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdLoaded.");
        this.f39920b = rVar;
        if (!(mediationNativeAdapter instanceof com.google.ads.mediation.admob.AdMobAdapter)) {
            p104k3.w wVar = new p104k3.w();
            wVar.c(new com.google.android.gms.internal.ads.BinderC4392lm());
            if (rVar != null && rVar.r()) {
                rVar.K(wVar);
            }
        }
        try {
            this.f39919a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void k(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.C2461Ih c2461Ih, java.lang.String str) {
        try {
            this.f39919a.b5(c2461Ih.a(), str);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void l(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p244y3.r rVar = this.f39920b;
        if (this.f39921c == null) {
            if (rVar == null) {
                p224w3.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.l()) {
                p224w3.p.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        p224w3.p.b("Adapter called onAdClicked.");
        try {
            this.f39919a.d();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void m(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, p104k3.C6885b c6885b) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6885b.a() + ". ErrorMessage: " + c6885b.c() + ". ErrorDomain: " + c6885b.b());
        try {
            this.f39919a.i5(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.l
    public final void n(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdLoaded.");
        try {
            this.f39919a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.i
    public final void o(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdOpened.");
        try {
            this.f39919a.q();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.l
    public final void p(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdClosed.");
        try {
            this.f39919a.e();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.i
    public final void q(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, p104k3.C6885b c6885b) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + c6885b.a() + ". ErrorMessage: " + c6885b.c() + ". ErrorDomain: " + c6885b.b());
        try {
            this.f39919a.i5(c6885b.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.n
    public final void r(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p244y3.r rVar = this.f39920b;
        if (this.f39921c == null) {
            if (rVar == null) {
                p224w3.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.m()) {
                p224w3.p.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        p224w3.p.b("Adapter called onAdImpression.");
        try {
            this.f39919a.m();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p244y3.l
    public final void s(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        p224w3.p.b("Adapter called onAdOpened.");
        try {
            this.f39919a.q();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final p244y3.r t() {
        return this.f39920b;
    }

    public final com.google.android.gms.internal.ads.C2461Ih u() {
        return this.f39921c;
    }
}
