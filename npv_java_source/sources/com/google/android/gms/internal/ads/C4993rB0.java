package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4993rB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3244bE0 f38446a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4774pB0 f38450e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KB0 f38453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5666xI f38454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Pv0 f38456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.II0 f38457l = new com.google.android.gms.internal.ads.II0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.IdentityHashMap f38448c = new java.util.IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f38449d = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38447b = new java.util.ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.HashMap f38451f = new java.util.HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Set f38452g = new java.util.HashSet();

    public C4993rB0(com.google.android.gms.internal.ads.InterfaceC4774pB0 interfaceC4774pB0, com.google.android.gms.internal.ads.KB0 kb0, com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xI, com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        this.f38446a = c3244bE0;
        this.f38450e = interfaceC4774pB0;
        this.f38453h = kb0;
        this.f38454i = interfaceC5666xI;
    }

    private final void q(int i6, int i10) {
        while (i6 < this.f38447b.size()) {
            ((com.google.android.gms.internal.ads.C4664oB0) this.f38447b.get(i6)).f37743d += i10;
            i6++;
        }
    }

    private final void r(com.google.android.gms.internal.ads.C4664oB0 c4664oB0) {
        com.google.android.gms.internal.ads.C4554nB0 c4554nB0 = (com.google.android.gms.internal.ads.C4554nB0) this.f38451f.get(c4664oB0);
        if (c4554nB0 != null) {
            c4554nB0.f37535a.f(c4554nB0.f37536b);
        }
    }

    private final void s() {
        java.util.Iterator it = this.f38452g.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) it.next();
            if (c4664oB0.f37742c.isEmpty()) {
                r(c4664oB0);
                it.remove();
            }
        }
    }

    private final void t(com.google.android.gms.internal.ads.C4664oB0 c4664oB0) {
        if (c4664oB0.f37744e && c4664oB0.f37742c.isEmpty()) {
            com.google.android.gms.internal.ads.C4554nB0 c4554nB0 = (com.google.android.gms.internal.ads.C4554nB0) this.f38451f.remove(c4664oB0);
            c4554nB0.getClass();
            c4554nB0.f37535a.a(c4554nB0.f37536b);
            c4554nB0.f37535a.h(c4554nB0.f37537c);
            c4554nB0.f37535a.k(c4554nB0.f37537c);
            this.f38452g.remove(c4664oB0);
        }
    }

    private final void u(com.google.android.gms.internal.ads.C4664oB0 c4664oB0) {
        com.google.android.gms.internal.ads.GH0 gh0 = c4664oB0.f37740a;
        com.google.android.gms.internal.ads.MH0 mh0 = new com.google.android.gms.internal.ads.MH0() { // from class: com.google.android.gms.internal.ads.gB0
            @Override // com.google.android.gms.internal.ads.MH0
            public final void a(com.google.android.gms.internal.ads.NH0 nh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
                this.f35560a.f(nh0, abstractC4942qm);
            }
        };
        com.google.android.gms.internal.ads.C4444mB0 c4444mB0 = new com.google.android.gms.internal.ads.C4444mB0(this, c4664oB0);
        this.f38451f.put(c4664oB0, new com.google.android.gms.internal.ads.C4554nB0(gh0, mh0, c4444mB0));
        gh0.l(new android.os.Handler(com.google.android.gms.internal.ads.EW.R(), null), c4444mB0);
        gh0.j(new android.os.Handler(com.google.android.gms.internal.ads.EW.R(), null), c4444mB0);
        gh0.g(mh0, this.f38456k, this.f38446a);
    }

    private final void v(int i6, int i10) {
        while (true) {
            i10--;
            if (i10 < i6) {
                return;
            }
            com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) this.f38447b.remove(i10);
            this.f38449d.remove(c4664oB0.f37741b);
            q(i10, -c4664oB0.f37740a.G().c());
            c4664oB0.f37744e = true;
            if (this.f38455j) {
                t(c4664oB0);
            }
        }
    }

    public final int a() {
        return this.f38447b.size();
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm b() {
        if (this.f38447b.isEmpty()) {
            return com.google.android.gms.internal.ads.AbstractC4942qm.f38311a;
        }
        int iC = 0;
        for (int i6 = 0; i6 < this.f38447b.size(); i6++) {
            com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) this.f38447b.get(i6);
            c4664oB0.f37743d = iC;
            iC += c4664oB0.f37740a.G().c();
        }
        return new com.google.android.gms.internal.ads.C5763yB0(this.f38447b, this.f38457l);
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm c(int i6, int i10, java.util.List list) {
        com.google.android.gms.internal.ads.LC.d(i6 >= 0 && i6 <= i10 && i10 <= a());
        com.google.android.gms.internal.ads.LC.d(list.size() == i10 - i6);
        for (int i11 = i6; i11 < i10; i11++) {
            ((com.google.android.gms.internal.ads.C4664oB0) this.f38447b.get(i11)).f37740a.c((com.google.android.gms.internal.ads.Q7) list.get(i11 - i6));
        }
        return b();
    }

    final /* synthetic */ void f(com.google.android.gms.internal.ads.NH0 nh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        this.f38450e.g();
    }

    public final void g(com.google.android.gms.internal.ads.Pv0 pv0) {
        com.google.android.gms.internal.ads.LC.f(!this.f38455j);
        this.f38456k = pv0;
        for (int i6 = 0; i6 < this.f38447b.size(); i6++) {
            com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) this.f38447b.get(i6);
            u(c4664oB0);
            this.f38452g.add(c4664oB0);
        }
        this.f38455j = true;
    }

    public final void h() {
        for (com.google.android.gms.internal.ads.C4554nB0 c4554nB0 : this.f38451f.values()) {
            try {
                c4554nB0.f37535a.a(c4554nB0.f37536b);
            } catch (java.lang.RuntimeException e6) {
                com.google.android.gms.internal.ads.AbstractC3586eM.d("MediaSourceList", "Failed to release child source.", e6);
            }
            c4554nB0.f37535a.h(c4554nB0.f37537c);
            c4554nB0.f37535a.k(c4554nB0.f37537c);
        }
        this.f38451f.clear();
        this.f38452g.clear();
        this.f38455j = false;
    }

    public final void i(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) this.f38448c.remove(jh0);
        c4664oB0.getClass();
        c4664oB0.f37740a.b(jh0);
        c4664oB0.f37742c.remove(((com.google.android.gms.internal.ads.CH0) jh0).f26183C);
        if (!this.f38448c.isEmpty()) {
            s();
        }
        t(c4664oB0);
    }

    public final boolean j() {
        return this.f38455j;
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm k(int i6, java.util.List list, com.google.android.gms.internal.ads.II0 ii0) {
        int iC;
        if (!list.isEmpty()) {
            this.f38457l = ii0;
            for (int i10 = i6; i10 < list.size() + i6; i10++) {
                com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) list.get(i10 - i6);
                if (i10 > 0) {
                    com.google.android.gms.internal.ads.C4664oB0 c4664oB1 = (com.google.android.gms.internal.ads.C4664oB0) this.f38447b.get(i10 - 1);
                    iC = c4664oB1.f37743d + c4664oB1.f37740a.G().c();
                } else {
                    iC = 0;
                }
                c4664oB0.c(iC);
                q(i10, c4664oB0.f37740a.G().c());
                this.f38447b.add(i10, c4664oB0);
                this.f38449d.put(c4664oB0.f37741b, c4664oB0);
                if (this.f38455j) {
                    u(c4664oB0);
                    if (this.f38448c.isEmpty()) {
                        this.f38452g.add(c4664oB0);
                    } else {
                        r(c4664oB0);
                    }
                }
            }
        }
        return b();
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm l(int i6, int i10, com.google.android.gms.internal.ads.II0 ii0) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= i10 && i10 <= a()) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f38457l = ii0;
        v(i6, i10);
        return b();
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm m(java.util.List list, com.google.android.gms.internal.ads.II0 ii0) {
        v(0, this.f38447b.size());
        return k(this.f38447b.size(), list, ii0);
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm n(com.google.android.gms.internal.ads.II0 ii0) {
        int iA = a();
        if (ii0.c() != iA) {
            ii0 = ii0.f().g(0, iA);
        }
        this.f38457l = ii0;
        return b();
    }

    public final com.google.android.gms.internal.ads.JH0 o(com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.YJ0 yj0, long j6) {
        int i6 = com.google.android.gms.internal.ads.C5763yB0.f40007k;
        java.lang.Object obj = lh0.f29454a;
        java.lang.Object obj2 = ((android.util.Pair) obj).first;
        com.google.android.gms.internal.ads.LH0 lh0A = lh0.a(((android.util.Pair) obj).second);
        com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = (com.google.android.gms.internal.ads.C4664oB0) this.f38449d.get(obj2);
        c4664oB0.getClass();
        this.f38452g.add(c4664oB0);
        com.google.android.gms.internal.ads.C4554nB0 c4554nB0 = (com.google.android.gms.internal.ads.C4554nB0) this.f38451f.get(c4664oB0);
        if (c4554nB0 != null) {
            c4554nB0.f37535a.i(c4554nB0.f37536b);
        }
        c4664oB0.f37742c.add(lh0A);
        com.google.android.gms.internal.ads.CH0 ch0E = c4664oB0.f37740a.e(lh0A, yj0, j6);
        this.f38448c.put(ch0E, c4664oB0);
        s();
        return ch0E;
    }

    public final com.google.android.gms.internal.ads.II0 p() {
        return this.f38457l;
    }
}
