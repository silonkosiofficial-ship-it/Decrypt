package H;

/* JADX INFO: renamed from: H.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1227t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.InterfaceC1975s1 f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H.C1228u f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p121m0.f f4174c;

    public C1227t(androidx.compose.ui.platform.InterfaceC1975s1 interfaceC1975s1) {
        this.f4172a = interfaceC1975s1;
    }

    public void a(int i6) {
        p121m0.f fVarB;
        int iF;
        S0.r.a aVar = S0.r.f12375b;
        if (S0.r.m(i6, aVar.d())) {
            fVarB = b();
            iF = androidx.compose.ui.focus.d.f19669b.e();
        } else {
            if (!S0.r.m(i6, aVar.f())) {
                if (!S0.r.m(i6, aVar.b())) {
                    if (S0.r.m(i6, aVar.c()) ? true : S0.r.m(i6, aVar.g()) ? true : S0.r.m(i6, aVar.h()) ? true : S0.r.m(i6, aVar.a())) {
                        return;
                    }
                    S0.r.m(i6, aVar.e());
                    return;
                } else {
                    androidx.compose.ui.platform.InterfaceC1975s1 interfaceC1975s1 = this.f4172a;
                    if (interfaceC1975s1 != null) {
                        interfaceC1975s1.a();
                        return;
                    }
                    return;
                }
            }
            fVarB = b();
            iF = androidx.compose.ui.focus.d.f19669b.f();
        }
        fVarB.i(iF);
    }

    public final p121m0.f b() {
        p121m0.f fVar = this.f4174c;
        if (fVar != null) {
            return fVar;
        }
        p247y7.AbstractC7350t.p("focusManager");
        return null;
    }

    public final H.C1228u c() {
        H.C1228u c1228u = this.f4173b;
        if (c1228u != null) {
            return c1228u;
        }
        p247y7.AbstractC7350t.p("keyboardActions");
        return null;
    }

    public final void d(int i6) {
        p237x7.l lVarG;
        S0.r.a aVar = S0.r.f12375b;
        p087i7.M m6 = null;
        if (S0.r.m(i6, aVar.b())) {
            lVarG = c().b();
        } else if (S0.r.m(i6, aVar.c())) {
            lVarG = c().c();
        } else if (S0.r.m(i6, aVar.d())) {
            lVarG = c().d();
        } else if (S0.r.m(i6, aVar.f())) {
            lVarG = c().e();
        } else if (S0.r.m(i6, aVar.g())) {
            lVarG = c().f();
        } else if (S0.r.m(i6, aVar.h())) {
            lVarG = c().g();
        } else {
            if (!(S0.r.m(i6, aVar.a()) ? true : S0.r.m(i6, aVar.e()))) {
                throw new java.lang.IllegalStateException("invalid ImeAction".toString());
            }
            lVarG = null;
        }
        if (lVarG != null) {
            lVarG.l(this);
            m6 = p087i7.M.f46721a;
        }
        if (m6 == null) {
            a(i6);
        }
    }

    public final void e(p121m0.f fVar) {
        this.f4174c = fVar;
    }

    public final void f(H.C1228u c1228u) {
        this.f4173b = c1228u;
    }
}
