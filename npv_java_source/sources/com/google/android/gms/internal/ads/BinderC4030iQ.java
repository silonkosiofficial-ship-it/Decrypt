package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4030iQ extends p184s3.P0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Map f36279C = new java.util.HashMap();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f36280D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.ref.WeakReference f36281E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.WP f36282F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f36283G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.KP f36284H;

    BinderC4030iQ(android.content.Context context, java.lang.ref.WeakReference weakReference, com.google.android.gms.internal.ads.WP wp, com.google.android.gms.internal.ads.C4138jQ c4138jQ, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f36280D = context;
        this.f36281E = weakReference;
        this.f36282F = wp;
        this.f36283G = yk0;
    }

    private final android.content.Context v6() {
        android.content.Context context = (android.content.Context) this.f36281E.get();
        return context == null ? this.f36280D : context;
    }

    private static p104k3.g w6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return ((k3.g.a) new k3.g.a().b(com.google.ads.mediation.admob.AdMobAdapter.class, bundle)).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String x6(java.lang.Object obj) {
        p104k3.u uVarC;
        p184s3.U0 u0F;
        if (obj instanceof p104k3.m) {
            uVarC = ((p104k3.m) obj).f();
        } else if (obj instanceof p124m3.a) {
            uVarC = ((p124m3.a) obj).a();
        } else if (obj instanceof p234x3.a) {
            uVarC = ((p234x3.a) obj).a();
        } else if (obj instanceof E3.c) {
            uVarC = ((E3.c) obj).a();
        } else if (obj instanceof F3.a) {
            uVarC = ((F3.a) obj).a();
        } else if (obj instanceof p104k3.i) {
            uVarC = ((p104k3.i) obj).getResponseInfo();
        } else {
            if (!(obj instanceof com.google.android.gms.ads.nativead.NativeAd)) {
                return "";
            }
            uVarC = ((com.google.android.gms.ads.nativead.NativeAd) obj).c();
        }
        if (uVarC == null || (u0F = uVarC.f()) == null) {
            return "";
        }
        try {
            return u0F.g();
        } catch (android.os.RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void y6(java.lang.String str, java.lang.String str2) {
        try {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f36284H.c(str), new com.google.android.gms.internal.ads.C3810gQ(this, str2), this.f36283G);
        } catch (java.lang.NullPointerException e6) {
            p174r3.v.s().x(e6, "OutOfContextTester.setAdAsOutOfContext");
            this.f36282F.f(str2);
        }
    }

    private final synchronized void z6(java.lang.String str, java.lang.String str2) {
        try {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f36284H.c(str), new com.google.android.gms.internal.ads.C3920hQ(this, str2), this.f36283G);
        } catch (java.lang.NullPointerException e6) {
            p174r3.v.s().x(e6, "OutOfContextTester.setAdAsShown");
            this.f36282F.f(str2);
        }
    }

    public final void r6(com.google.android.gms.internal.ads.KP kp) {
        this.f36284H = kp;
    }

    @Override // p184s3.Q0
    public final void s5(java.lang.String str, X3.a aVar, X3.a aVar2) {
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) X3.b.L0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        java.lang.Object obj = this.f36279C.get(str);
        if (obj != null) {
            this.f36279C.remove(str);
        }
        if (obj instanceof p104k3.i) {
            com.google.android.gms.internal.ads.C4138jQ.a(context, viewGroup, (p104k3.i) obj);
        } else if (obj instanceof com.google.android.gms.ads.nativead.NativeAd) {
            com.google.android.gms.internal.ads.C4138jQ.b(context, viewGroup, (com.google.android.gms.ads.nativead.NativeAd) obj);
        }
    }

    protected final synchronized void s6(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        this.f36279C.put(str, obj);
        y6(x6(obj), str2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void t6(final java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        byte b6;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (!str2.equals("NATIVE")) {
                        b6 = -1;
                    } else {
                        b6 = 3;
                    }
                    break;
                case -1372958932:
                    if (!str2.equals("INTERSTITIAL")) {
                        b6 = -1;
                    } else {
                        b6 = 2;
                    }
                    break;
                case -428325382:
                    if (!str2.equals("APP_OPEN_AD")) {
                        b6 = -1;
                    } else {
                        b6 = 0;
                    }
                    break;
                case 543046670:
                    if (!str2.equals("REWARDED")) {
                        b6 = -1;
                    } else {
                        b6 = 4;
                    }
                    break;
                case 1854800829:
                    if (!str2.equals("REWARDED_INTERSTITIAL")) {
                        b6 = -1;
                    } else {
                        b6 = 5;
                    }
                    break;
                case 1951953708:
                    if (!str2.equals("BANNER")) {
                        b6 = -1;
                    } else {
                        b6 = 1;
                    }
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                p124m3.a.b(v6(), str, w6(), 1, new com.google.android.gms.internal.ads.C3152aQ(this, str, str3));
                return;
            }
            if (b6 == 1) {
                p104k3.i iVar = new p104k3.i(v6());
                iVar.setAdSize(p104k3.h.f49467i);
                iVar.setAdUnitId(str);
                iVar.setAdListener(new com.google.android.gms.internal.ads.C3262bQ(this, str, iVar, str3));
                iVar.b(w6());
                return;
            }
            if (b6 == 2) {
                p234x3.a.b(v6(), str, w6(), new com.google.android.gms.internal.ads.C3371cQ(this, str, str3));
                return;
            }
            if (b6 == 3) {
                p104k3.C6889f.a aVar = new p104k3.C6889f.a(v6(), str);
                aVar.b(new com.google.android.gms.ads.nativead.NativeAd.c() { // from class: com.google.android.gms.internal.ads.XP
                    @Override // com.google.android.gms.ads.nativead.NativeAd.c
                    public final void a(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
                        this.f33129a.s6(str, nativeAd, str3);
                    }
                });
                aVar.c(new com.google.android.gms.internal.ads.C3700fQ(this, str3));
                aVar.a().a(w6());
                return;
            }
            if (b6 == 4) {
                E3.c.b(v6(), str, w6(), new com.google.android.gms.internal.ads.C3481dQ(this, str, str3));
            } else {
                if (b6 != 5) {
                    return;
                }
                F3.a.b(v6(), str, w6(), new com.google.android.gms.internal.ads.C3590eQ(this, str, str3));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void u6(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        try {
            android.app.Activity activityB = this.f36282F.b();
            if (activityB != null && (obj = this.f36279C.get(str)) != null) {
                com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25640n9;
                if (!((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() || (obj instanceof p124m3.a) || (obj instanceof p234x3.a) || (obj instanceof E3.c) || (obj instanceof F3.a)) {
                    this.f36279C.remove(str);
                }
                z6(x6(obj), str2);
                if (obj instanceof p124m3.a) {
                    ((p124m3.a) obj).e(activityB);
                    return;
                }
                if (obj instanceof p234x3.a) {
                    ((p234x3.a) obj).e(activityB);
                    return;
                }
                if (obj instanceof E3.c) {
                    ((E3.c) obj).c(activityB, new p104k3.p() { // from class: com.google.android.gms.internal.ads.YP
                        @Override // p104k3.p
                        public final void a(E3.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof F3.a) {
                    ((F3.a) obj).c(activityB, new p104k3.p() { // from class: com.google.android.gms.internal.ads.ZP
                        @Override // p104k3.p
                        public final void a(E3.b bVar) {
                        }
                    });
                    return;
                }
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && ((obj instanceof p104k3.i) || (obj instanceof com.google.android.gms.ads.nativead.NativeAd))) {
                    android.content.Intent intent = new android.content.Intent();
                    android.content.Context contextV6 = v6();
                    intent.setClassName(contextV6, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    p174r3.v.t();
                    p214v3.E0.t(contextV6, intent);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
