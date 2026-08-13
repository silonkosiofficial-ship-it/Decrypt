package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3581eJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p184s3.Y0 f34947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3944hh f34948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.view.View f34949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.List f34950e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p184s3.BinderC7126q1 f34952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.os.Bundle f34953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f34954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f34955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2698Ot f34956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.QT f34957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private P4.d f34958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4512mr f34959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private android.view.View f34960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private android.view.View f34961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private X3.a f34962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f34963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4712oh f34964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4712oh f34965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private java.lang.String f34966u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f34969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private java.lang.String f34970y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p170r.Y f34967v = new p170r.Y();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p170r.Y f34968w = new p170r.Y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.List f34951f = java.util.Collections.emptyList();

    public static com.google.android.gms.internal.ads.C3581eJ H(com.google.android.gms.internal.ads.C3844gm c3844gm) {
        try {
            com.google.android.gms.internal.ads.BinderC3472dJ binderC3472dJL = L(c3844gm.d2(), null);
            com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hhT2 = c3844gm.T2();
            android.view.View view = (android.view.View) N(c3844gm.p4());
            java.lang.String strP = c3844gm.p();
            java.util.List listO6 = c3844gm.o6();
            java.lang.String strM = c3844gm.m();
            android.os.Bundle bundleE = c3844gm.e();
            java.lang.String strN = c3844gm.n();
            android.view.View view2 = (android.view.View) N(c3844gm.n6());
            X3.a aVarL = c3844gm.l();
            java.lang.String strS = c3844gm.s();
            java.lang.String strQ = c3844gm.q();
            double d6 = c3844gm.d();
            com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohF3 = c3844gm.f3();
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = new com.google.android.gms.internal.ads.C3581eJ();
            c3581eJ.f34946a = 2;
            c3581eJ.f34947b = binderC3472dJL;
            c3581eJ.f34948c = interfaceC3944hhT2;
            c3581eJ.f34949d = view;
            c3581eJ.z("headline", strP);
            c3581eJ.f34950e = listO6;
            c3581eJ.z("body", strM);
            c3581eJ.f34953h = bundleE;
            c3581eJ.z("call_to_action", strN);
            c3581eJ.f34960o = view2;
            c3581eJ.f34962q = aVarL;
            c3581eJ.z("store", strS);
            c3581eJ.z("price", strQ);
            c3581eJ.f34963r = d6;
            c3581eJ.f34964s = interfaceC4712ohF3;
            return c3581eJ;
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to get native ad from app install ad mapper", e6);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.C3581eJ I(com.google.android.gms.internal.ads.C3954hm c3954hm) {
        try {
            com.google.android.gms.internal.ads.BinderC3472dJ binderC3472dJL = L(c3954hm.d2(), null);
            com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hhT2 = c3954hm.T2();
            android.view.View view = (android.view.View) N(c3954hm.h());
            java.lang.String strP = c3954hm.p();
            java.util.List listO6 = c3954hm.o6();
            java.lang.String strM = c3954hm.m();
            android.os.Bundle bundleD = c3954hm.d();
            java.lang.String strN = c3954hm.n();
            android.view.View view2 = (android.view.View) N(c3954hm.p4());
            X3.a aVarN6 = c3954hm.n6();
            java.lang.String strL = c3954hm.l();
            com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohF3 = c3954hm.f3();
            com.google.android.gms.internal.ads.C3581eJ c3581eJ = new com.google.android.gms.internal.ads.C3581eJ();
            c3581eJ.f34946a = 1;
            c3581eJ.f34947b = binderC3472dJL;
            c3581eJ.f34948c = interfaceC3944hhT2;
            c3581eJ.f34949d = view;
            c3581eJ.z("headline", strP);
            c3581eJ.f34950e = listO6;
            c3581eJ.z("body", strM);
            c3581eJ.f34953h = bundleD;
            c3581eJ.z("call_to_action", strN);
            c3581eJ.f34960o = view2;
            c3581eJ.f34962q = aVarN6;
            c3581eJ.z("advertiser", strL);
            c3581eJ.f34965t = interfaceC4712ohF3;
            return c3581eJ;
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to get native ad from content ad mapper", e6);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.C3581eJ J(com.google.android.gms.internal.ads.C3844gm c3844gm) {
        try {
            return M(L(c3844gm.d2(), null), c3844gm.T2(), (android.view.View) N(c3844gm.p4()), c3844gm.p(), c3844gm.o6(), c3844gm.m(), c3844gm.e(), c3844gm.n(), (android.view.View) N(c3844gm.n6()), c3844gm.l(), c3844gm.s(), c3844gm.q(), c3844gm.d(), c3844gm.f3(), null, 0.0f);
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to get native ad assets from app install ad mapper", e6);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.C3581eJ K(com.google.android.gms.internal.ads.C3954hm c3954hm) {
        try {
            return M(L(c3954hm.d2(), null), c3954hm.T2(), (android.view.View) N(c3954hm.h()), c3954hm.p(), c3954hm.o6(), c3954hm.m(), c3954hm.d(), c3954hm.n(), (android.view.View) N(c3954hm.p4()), c3954hm.n6(), null, null, -1.0d, c3954hm.f3(), c3954hm.l(), 0.0f);
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to get native ad assets from content ad mapper", e6);
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.BinderC3472dJ L(p184s3.Y0 y6, com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km) {
        if (y6 == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.BinderC3472dJ(y6, interfaceC4282km);
    }

    private static com.google.android.gms.internal.ads.C3581eJ M(p184s3.Y0 y6, com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hh, android.view.View view, java.lang.String str, java.util.List list, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.view.View view2, X3.a aVar, java.lang.String str4, java.lang.String str5, double d6, com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712oh, java.lang.String str6, float f6) {
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = new com.google.android.gms.internal.ads.C3581eJ();
        c3581eJ.f34946a = 6;
        c3581eJ.f34947b = y6;
        c3581eJ.f34948c = interfaceC3944hh;
        c3581eJ.f34949d = view;
        c3581eJ.z("headline", str);
        c3581eJ.f34950e = list;
        c3581eJ.z("body", str2);
        c3581eJ.f34953h = bundle;
        c3581eJ.z("call_to_action", str3);
        c3581eJ.f34960o = view2;
        c3581eJ.f34962q = aVar;
        c3581eJ.z("store", str4);
        c3581eJ.z("price", str5);
        c3581eJ.f34963r = d6;
        c3581eJ.f34964s = interfaceC4712oh;
        c3581eJ.z("advertiser", str6);
        c3581eJ.r(f6);
        return c3581eJ;
    }

    private static java.lang.Object N(X3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return X3.b.L0(aVar);
    }

    public static com.google.android.gms.internal.ads.C3581eJ g0(com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km) {
        try {
            return M(L(interfaceC4282km.j(), interfaceC4282km), interfaceC4282km.k(), (android.view.View) N(interfaceC4282km.m()), interfaceC4282km.u(), interfaceC4282km.v(), interfaceC4282km.s(), interfaceC4282km.h(), interfaceC4282km.t(), (android.view.View) N(interfaceC4282km.n()), interfaceC4282km.p(), interfaceC4282km.A(), interfaceC4282km.w(), interfaceC4282km.d(), interfaceC4282km.l(), interfaceC4282km.q(), interfaceC4282km.e());
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to get native ad assets from unified ad mapper", e6);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f34963r;
    }

    public final synchronized void B(int i6) {
        this.f34946a = i6;
    }

    public final synchronized void C(p184s3.Y0 y6) {
        this.f34947b = y6;
    }

    public final synchronized void D(android.view.View view) {
        this.f34960o = view;
    }

    public final synchronized void E(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f34954i = interfaceC2698Ot;
    }

    public final synchronized void F(android.view.View view) {
        this.f34961p = view;
    }

    public final synchronized boolean G() {
        return this.f34955j != null;
    }

    public final synchronized float O() {
        return this.f34969x;
    }

    public final synchronized int P() {
        return this.f34946a;
    }

    public final synchronized android.os.Bundle Q() {
        try {
            if (this.f34953h == null) {
                this.f34953h = new android.os.Bundle();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f34953h;
    }

    public final synchronized android.view.View R() {
        return this.f34949d;
    }

    public final synchronized android.view.View S() {
        return this.f34960o;
    }

    public final synchronized android.view.View T() {
        return this.f34961p;
    }

    public final synchronized p170r.Y U() {
        return this.f34967v;
    }

    public final synchronized p170r.Y V() {
        return this.f34968w;
    }

    public final synchronized p184s3.Y0 W() {
        return this.f34947b;
    }

    public final synchronized p184s3.BinderC7126q1 X() {
        return this.f34952g;
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC3944hh Y() {
        return this.f34948c;
    }

    public final com.google.android.gms.internal.ads.InterfaceC4712oh Z() {
        java.util.List list = this.f34950e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.Object obj = this.f34950e.get(0);
        if (obj instanceof android.os.IBinder) {
            return com.google.android.gms.internal.ads.AbstractBinderC4602nh.o6((android.os.IBinder) obj);
        }
        return null;
    }

    public final synchronized java.lang.String a() {
        return this.f34966u;
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC4712oh a0() {
        return this.f34964s;
    }

    public final synchronized java.lang.String b() {
        return f("headline");
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC4712oh b0() {
        return this.f34965t;
    }

    public final synchronized java.lang.String c() {
        return this.f34970y;
    }

    public final synchronized com.google.android.gms.internal.ads.C4512mr c0() {
        return this.f34959n;
    }

    public final synchronized java.lang.String d() {
        return f("price");
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC2698Ot d0() {
        return this.f34955j;
    }

    public final synchronized java.lang.String e() {
        return f("store");
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC2698Ot e0() {
        return this.f34956k;
    }

    public final synchronized java.lang.String f(java.lang.String str) {
        return (java.lang.String) this.f34968w.get(str);
    }

    public final synchronized com.google.android.gms.internal.ads.InterfaceC2698Ot f0() {
        return this.f34954i;
    }

    public final synchronized java.util.List g() {
        return this.f34950e;
    }

    public final synchronized java.util.List h() {
        return this.f34951f;
    }

    public final synchronized com.google.android.gms.internal.ads.QT h0() {
        return this.f34957l;
    }

    public final synchronized void i() {
        try {
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f34954i;
            if (interfaceC2698Ot != null) {
                interfaceC2698Ot.destroy();
                this.f34954i = null;
            }
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f34955j;
            if (interfaceC2698Ot2 != null) {
                interfaceC2698Ot2.destroy();
                this.f34955j = null;
            }
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot3 = this.f34956k;
            if (interfaceC2698Ot3 != null) {
                interfaceC2698Ot3.destroy();
                this.f34956k = null;
            }
            P4.d dVar = this.f34958m;
            if (dVar != null) {
                dVar.cancel(false);
                this.f34958m = null;
            }
            com.google.android.gms.internal.ads.C4512mr c4512mr = this.f34959n;
            if (c4512mr != null) {
                c4512mr.cancel(false);
                this.f34959n = null;
            }
            this.f34957l = null;
            this.f34967v.clear();
            this.f34968w.clear();
            this.f34947b = null;
            this.f34948c = null;
            this.f34949d = null;
            this.f34950e = null;
            this.f34953h = null;
            this.f34960o = null;
            this.f34961p = null;
            this.f34962q = null;
            this.f34964s = null;
            this.f34965t = null;
            this.f34966u = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized X3.a i0() {
        return this.f34962q;
    }

    public final synchronized void j(com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hh) {
        this.f34948c = interfaceC3944hh;
    }

    public final synchronized P4.d j0() {
        return this.f34958m;
    }

    public final synchronized void k(java.lang.String str) {
        this.f34966u = str;
    }

    public final synchronized java.lang.String k0() {
        return f("advertiser");
    }

    public final synchronized void l(p184s3.BinderC7126q1 binderC7126q1) {
        this.f34952g = binderC7126q1;
    }

    public final synchronized java.lang.String l0() {
        return f("body");
    }

    public final synchronized void m(com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712oh) {
        this.f34964s = interfaceC4712oh;
    }

    public final synchronized java.lang.String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(java.lang.String str, com.google.android.gms.internal.ads.BinderC3286bh binderC3286bh) {
        try {
            if (binderC3286bh == null) {
                this.f34967v.remove(str);
            } else {
                this.f34967v.put(str, binderC3286bh);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f34955j = interfaceC2698Ot;
    }

    public final synchronized void p(java.util.List list) {
        this.f34950e = list;
    }

    public final synchronized void q(com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712oh) {
        this.f34965t = interfaceC4712oh;
    }

    public final synchronized void r(float f6) {
        this.f34969x = f6;
    }

    public final synchronized void s(java.util.List list) {
        this.f34951f = list;
    }

    public final synchronized void t(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f34956k = interfaceC2698Ot;
    }

    public final synchronized void u(P4.d dVar) {
        this.f34958m = dVar;
    }

    public final synchronized void v(java.lang.String str) {
        this.f34970y = str;
    }

    public final synchronized void w(com.google.android.gms.internal.ads.QT qt) {
        this.f34957l = qt;
    }

    public final synchronized void x(com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f34959n = c4512mr;
    }

    public final synchronized void y(double d6) {
        this.f34963r = d6;
    }

    public final synchronized void z(java.lang.String str, java.lang.String str2) {
        try {
            if (str2 == null) {
                this.f34968w.remove(str);
            } else {
                this.f34968w.put(str, str2);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
