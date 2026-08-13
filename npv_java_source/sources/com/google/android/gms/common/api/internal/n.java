package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class n implements O3.f.a, O3.f.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final O3.a.f f24927D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final P3.C1446b f24928E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.g f24929F;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f24932I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final P3.y f24933J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f24934K;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.C2148c f24938O;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Queue f24926C = new java.util.LinkedList();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.Set f24930G = new java.util.HashSet();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.Map f24931H = new java.util.HashMap();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.List f24935L = new java.util.ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private N3.C1389b f24936M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f24937N = 0;

    public n(com.google.android.gms.common.api.internal.C2148c c2148c, O3.e eVar) {
        this.f24938O = c2148c;
        O3.a.f fVarN = eVar.n(c2148c.f24903P.getLooper(), this);
        this.f24927D = fVarN;
        this.f24928E = eVar.i();
        this.f24929F = new com.google.android.gms.common.api.internal.g();
        this.f24932I = eVar.m();
        if (fVarN.o()) {
            this.f24933J = eVar.o(c2148c.f24894G, c2148c.f24903P);
        } else {
            this.f24933J = null;
        }
    }

    private final N3.C1391d c(N3.C1391d[] c1391dArr) {
        if (c1391dArr != null && c1391dArr.length != 0) {
            N3.C1391d[] c1391dArrM = this.f24927D.m();
            if (c1391dArrM == null) {
                c1391dArrM = new N3.C1391d[0];
            }
            p170r.C7026a c7026a = new p170r.C7026a(c1391dArrM.length);
            for (N3.C1391d c1391d : c1391dArrM) {
                c7026a.put(c1391d.e(), java.lang.Long.valueOf(c1391d.f()));
            }
            for (N3.C1391d c1391d2 : c1391dArr) {
                java.lang.Long l6 = (java.lang.Long) c7026a.get(c1391d2.e());
                if (l6 == null || l6.longValue() < c1391d2.f()) {
                    return c1391d2;
                }
            }
        }
        return null;
    }

    private final void d(N3.C1389b c1389b) {
        java.util.Iterator it = this.f24930G.iterator();
        if (!it.hasNext()) {
            this.f24930G.clear();
            return;
        }
        androidx.appcompat.app.D.a(it.next());
        if (Q3.AbstractC1475n.a(c1389b, N3.C1389b.f7645G)) {
            this.f24927D.f();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(com.google.android.gms.common.api.Status status) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        f(status, null, false);
    }

    private final void f(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z6) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.f24926C.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.y yVar = (com.google.android.gms.common.api.internal.y) it.next();
            if (!z6 || yVar.f24964a == 2) {
                if (status != null) {
                    yVar.a(status);
                } else {
                    yVar.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f24926C);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            com.google.android.gms.common.api.internal.y yVar = (com.google.android.gms.common.api.internal.y) arrayList.get(i6);
            if (!this.f24927D.j()) {
                return;
            }
            if (m(yVar)) {
                this.f24926C.remove(yVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        A();
        d(N3.C1389b.f7645G);
        l();
        java.util.Iterator it = this.f24931H.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i6) {
        A();
        this.f24934K = true;
        this.f24929F.e(i6, this.f24927D.n());
        P3.C1446b c1446b = this.f24928E;
        com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
        c2148c.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c.f24903P, 9, c1446b), 5000L);
        P3.C1446b c1446b2 = this.f24928E;
        com.google.android.gms.common.api.internal.C2148c c2148c2 = this.f24938O;
        c2148c2.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c2.f24903P, 11, c1446b2), 120000L);
        this.f24938O.f24896I.c();
        java.util.Iterator it = this.f24931H.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
    }

    private final void j() {
        this.f24938O.f24903P.removeMessages(12, this.f24928E);
        P3.C1446b c1446b = this.f24928E;
        com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
        c2148c.f24903P.sendMessageDelayed(c2148c.f24903P.obtainMessage(12, c1446b), this.f24938O.f24890C);
    }

    private final void k(com.google.android.gms.common.api.internal.y yVar) {
        yVar.d(this.f24929F, a());
        try {
            yVar.c(this);
        } catch (android.os.DeadObjectException unused) {
            y0(1);
            this.f24927D.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f24934K) {
            com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
            c2148c.f24903P.removeMessages(11, this.f24928E);
            com.google.android.gms.common.api.internal.C2148c c2148c2 = this.f24938O;
            c2148c2.f24903P.removeMessages(9, this.f24928E);
            this.f24934K = false;
        }
    }

    private final boolean m(com.google.android.gms.common.api.internal.y yVar) {
        if (!(yVar instanceof P3.t)) {
            k(yVar);
            return true;
        }
        P3.t tVar = (P3.t) yVar;
        N3.C1391d c1391dC = c(tVar.g(this));
        if (c1391dC == null) {
            k(yVar);
            return true;
        }
        java.lang.String str = this.f24927D.getClass().getName() + " could not execute call because it requires feature (" + c1391dC.e() + ", " + c1391dC.f() + ").";
        if (!this.f24938O.f24904Q || !tVar.f(this)) {
            tVar.b(new O3.l(c1391dC));
            return true;
        }
        com.google.android.gms.common.api.internal.o oVar = new com.google.android.gms.common.api.internal.o(this.f24928E, c1391dC, null);
        int iIndexOf = this.f24935L.indexOf(oVar);
        if (iIndexOf >= 0) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) this.f24935L.get(iIndexOf);
            this.f24938O.f24903P.removeMessages(15, oVar2);
            com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
            c2148c.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c.f24903P, 15, oVar2), 5000L);
            return false;
        }
        this.f24935L.add(oVar);
        com.google.android.gms.common.api.internal.C2148c c2148c2 = this.f24938O;
        c2148c2.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c2.f24903P, 15, oVar), 5000L);
        com.google.android.gms.common.api.internal.C2148c c2148c3 = this.f24938O;
        c2148c3.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c3.f24903P, 16, oVar), 120000L);
        N3.C1389b c1389b = new N3.C1389b(2, null);
        if (n(c1389b)) {
            return false;
        }
        this.f24938O.f(c1389b, this.f24932I);
        return false;
    }

    private final boolean n(N3.C1389b c1389b) {
        synchronized (com.google.android.gms.common.api.internal.C2148c.f24888T) {
            try {
                com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
                if (c2148c.f24900M == null || !c2148c.f24901N.contains(this.f24928E)) {
                    return false;
                }
                this.f24938O.f24900M.s(c1389b, this.f24932I);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final boolean o(boolean z6) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if (!this.f24927D.j() || !this.f24931H.isEmpty()) {
            return false;
        }
        if (!this.f24929F.g()) {
            this.f24927D.d("Timing out service connection.");
            return true;
        }
        if (!z6) {
            return false;
        }
        j();
        return false;
    }

    static /* bridge */ /* synthetic */ void y(com.google.android.gms.common.api.internal.n nVar, com.google.android.gms.common.api.internal.o oVar) {
        if (nVar.f24935L.contains(oVar) && !nVar.f24934K) {
            if (nVar.f24927D.j()) {
                nVar.g();
            } else {
                nVar.B();
            }
        }
    }

    static /* bridge */ /* synthetic */ void z(com.google.android.gms.common.api.internal.n nVar, com.google.android.gms.common.api.internal.o oVar) {
        N3.C1391d[] c1391dArrG;
        if (nVar.f24935L.remove(oVar)) {
            nVar.f24938O.f24903P.removeMessages(15, oVar);
            nVar.f24938O.f24903P.removeMessages(16, oVar);
            N3.C1391d c1391d = oVar.f24940b;
            java.util.ArrayList arrayList = new java.util.ArrayList(nVar.f24926C.size());
            for (com.google.android.gms.common.api.internal.y yVar : nVar.f24926C) {
                if ((yVar instanceof P3.t) && (c1391dArrG = ((P3.t) yVar).g(nVar)) != null && V3.b.b(c1391dArrG, c1391d)) {
                    arrayList.add(yVar);
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                com.google.android.gms.common.api.internal.y yVar2 = (com.google.android.gms.common.api.internal.y) arrayList.get(i6);
                nVar.f24926C.remove(yVar2);
                yVar2.b(new O3.l(c1391d));
            }
        }
    }

    public final void A() {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        this.f24936M = null;
    }

    public final void B() {
        N3.C1389b c1389b;
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if (this.f24927D.j() || this.f24927D.e()) {
            return;
        }
        try {
            com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
            int iB = c2148c.f24896I.b(c2148c.f24894G, this.f24927D);
            if (iB != 0) {
                N3.C1389b c1389b2 = new N3.C1389b(iB, null);
                java.lang.String str = "The service for " + this.f24927D.getClass().getName() + " is not available: " + c1389b2.toString();
                E(c1389b2, null);
                return;
            }
            com.google.android.gms.common.api.internal.C2148c c2148c2 = this.f24938O;
            O3.a.f fVar = this.f24927D;
            com.google.android.gms.common.api.internal.q qVar = new com.google.android.gms.common.api.internal.q(c2148c2, fVar, this.f24928E);
            if (fVar.o()) {
                ((P3.y) Q3.AbstractC1477p.l(this.f24933J)).f3(qVar);
            }
            try {
                this.f24927D.c(qVar);
                return;
            } catch (java.lang.SecurityException e6) {
                e = e6;
                c1389b = new N3.C1389b(10);
            }
        } catch (java.lang.IllegalStateException e10) {
            e = e10;
            c1389b = new N3.C1389b(10);
        }
        E(c1389b, e);
    }

    public final void C(com.google.android.gms.common.api.internal.y yVar) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if (this.f24927D.j()) {
            if (m(yVar)) {
                j();
                return;
            } else {
                this.f24926C.add(yVar);
                return;
            }
        }
        this.f24926C.add(yVar);
        N3.C1389b c1389b = this.f24936M;
        if (c1389b == null || !c1389b.w()) {
            B();
        } else {
            E(this.f24936M, null);
        }
    }

    final void D() {
        this.f24937N++;
    }

    public final void E(N3.C1389b c1389b, java.lang.Exception exc) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        P3.y yVar = this.f24933J;
        if (yVar != null) {
            yVar.p4();
        }
        A();
        this.f24938O.f24896I.c();
        d(c1389b);
        if ((this.f24927D instanceof S3.e) && c1389b.e() != 24) {
            this.f24938O.f24891D = true;
            com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
            c2148c.f24903P.sendMessageDelayed(c2148c.f24903P.obtainMessage(19), 300000L);
        }
        if (c1389b.e() == 4) {
            e(com.google.android.gms.common.api.internal.C2148c.f24887S);
            return;
        }
        if (this.f24926C.isEmpty()) {
            this.f24936M = c1389b;
            return;
        }
        if (exc != null) {
            Q3.AbstractC1477p.d(this.f24938O.f24903P);
            f(null, exc, false);
            return;
        }
        if (!this.f24938O.f24904Q) {
            e(com.google.android.gms.common.api.internal.C2148c.g(this.f24928E, c1389b));
            return;
        }
        f(com.google.android.gms.common.api.internal.C2148c.g(this.f24928E, c1389b), null, true);
        if (this.f24926C.isEmpty() || n(c1389b) || this.f24938O.f(c1389b, this.f24932I)) {
            return;
        }
        if (c1389b.e() == 18) {
            this.f24934K = true;
        }
        if (!this.f24934K) {
            e(com.google.android.gms.common.api.internal.C2148c.g(this.f24928E, c1389b));
            return;
        }
        com.google.android.gms.common.api.internal.C2148c c2148c2 = this.f24938O;
        c2148c2.f24903P.sendMessageDelayed(android.os.Message.obtain(c2148c2.f24903P, 9, this.f24928E), 5000L);
    }

    public final void F(N3.C1389b c1389b) {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        O3.a.f fVar = this.f24927D;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + java.lang.String.valueOf(c1389b));
        E(c1389b, null);
    }

    public final void G() {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if (this.f24934K) {
            B();
        }
    }

    public final void H() {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        e(com.google.android.gms.common.api.internal.C2148c.f24886R);
        this.f24929F.f();
        for (P3.f fVar : (P3.f[]) this.f24931H.keySet().toArray(new P3.f[0])) {
            C(new com.google.android.gms.common.api.internal.x(null, new p115l4.C6932m()));
        }
        d(new N3.C1389b(4));
        if (this.f24927D.j()) {
            this.f24927D.g(new com.google.android.gms.common.api.internal.m(this));
        }
    }

    public final void I() {
        Q3.AbstractC1477p.d(this.f24938O.f24903P);
        if (this.f24934K) {
            l();
            com.google.android.gms.common.api.internal.C2148c c2148c = this.f24938O;
            e(c2148c.f24895H.g(c2148c.f24894G) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.") : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f24927D.d("Timing out connection while resuming.");
        }
    }

    @Override // P3.InterfaceC1447c
    public final void L0(android.os.Bundle bundle) {
        if (android.os.Looper.myLooper() == this.f24938O.f24903P.getLooper()) {
            h();
        } else {
            this.f24938O.f24903P.post(new com.google.android.gms.common.api.internal.j(this));
        }
    }

    public final boolean a() {
        return this.f24927D.o();
    }

    public final boolean b() {
        return o(true);
    }

    public final int p() {
        return this.f24932I;
    }

    final int q() {
        return this.f24937N;
    }

    @Override // P3.h
    public final void q0(N3.C1389b c1389b) {
        E(c1389b, null);
    }

    public final O3.a.f s() {
        return this.f24927D;
    }

    public final java.util.Map u() {
        return this.f24931H;
    }

    @Override // P3.InterfaceC1447c
    public final void y0(int i6) {
        if (android.os.Looper.myLooper() == this.f24938O.f24903P.getLooper()) {
            i(i6);
        } else {
            this.f24938O.f24903P.post(new com.google.android.gms.common.api.internal.k(this, i6));
        }
    }
}
