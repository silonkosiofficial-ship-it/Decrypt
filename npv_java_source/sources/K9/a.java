package K9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements H9.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K9.a.C0150a f6159a = new K9.a.C0150a(null);

    /* JADX INFO: renamed from: K9.a$a, reason: collision with other inner class name */
    public static final class C0150a {
        private C0150a() {
        }

        public /* synthetic */ C0150a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final H9.t c(H9.t tVar, H9.t tVar2) {
            H9.t.a aVar = new H9.t.a();
            int size = tVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.String strE = tVar.e(i6);
                java.lang.String strS = tVar.s(i6);
                if ((!S8.r.K("Warning", strE, true) || !S8.r.V(strS, "1", false, 2, null)) && (d(strE) || !e(strE) || tVar2.d(strE) == null)) {
                    aVar.c(strE, strS);
                }
            }
            int size2 = tVar2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                java.lang.String strE2 = tVar2.e(i10);
                if (!d(strE2) && e(strE2)) {
                    aVar.c(strE2, tVar2.s(i10));
                }
            }
            return aVar.d();
        }

        private final boolean d(java.lang.String str) {
            return S8.r.K("Content-Length", str, true) || S8.r.K("Content-Encoding", str, true) || S8.r.K("Content-Type", str, true);
        }

        private final boolean e(java.lang.String str) {
            return (S8.r.K("Connection", str, true) || S8.r.K("Keep-Alive", str, true) || S8.r.K("Proxy-Authenticate", str, true) || S8.r.K("Proxy-Authorization", str, true) || S8.r.K("TE", str, true) || S8.r.K("Trailers", str, true) || S8.r.K("Transfer-Encoding", str, true) || S8.r.K("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final H9.B f(H9.B b6) {
            return (b6 != null ? b6.a() : null) != null ? b6.g0().b(null).c() : b6;
        }
    }

    public a(H9.AbstractC1237c abstractC1237c) {
    }

    @Override // H9.v
    public H9.B a(H9.v.a aVar) {
        H9.r rVarP;
        p247y7.AbstractC7350t.f(aVar, "chain");
        H9.InterfaceC1239e interfaceC1239eCall = aVar.call();
        K9.b bVarB = new K9.b.C0151b(java.lang.System.currentTimeMillis(), aVar.b(), null).b();
        H9.z zVarB = bVarB.b();
        H9.B bA = bVarB.a();
        M9.e eVar = interfaceC1239eCall instanceof M9.e ? (M9.e) interfaceC1239eCall : null;
        if (eVar == null || (rVarP = eVar.p()) == null) {
            rVarP = H9.r.f4799b;
        }
        if (zVarB == null && bA == null) {
            H9.B bC = new H9.B.a().r(aVar.b()).p(H9.y.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(I9.d.f5549c).s(-1L).q(java.lang.System.currentTimeMillis()).c();
            rVarP.z(interfaceC1239eCall, bC);
            return bC;
        }
        if (zVarB == null) {
            p247y7.AbstractC7350t.c(bA);
            H9.B bC2 = bA.g0().d(f6159a.f(bA)).c();
            rVarP.b(interfaceC1239eCall, bC2);
            return bC2;
        }
        if (bA != null) {
            rVarP.a(interfaceC1239eCall, bA);
        }
        H9.B bA2 = aVar.a(zVarB);
        if (bA != null) {
            if (bA2 != null && bA2.o() == 304) {
                H9.B.a aVarG0 = bA.g0();
                K9.a.C0150a c0150a = f6159a;
                aVarG0.k(c0150a.c(bA.H(), bA2.H())).s(bA2.s0()).q(bA2.q0()).d(c0150a.f(bA)).n(c0150a.f(bA2)).c();
                H9.C cA = bA2.a();
                p247y7.AbstractC7350t.c(cA);
                cA.close();
                p247y7.AbstractC7350t.c(null);
                throw null;
            }
            H9.C cA2 = bA.a();
            if (cA2 != null) {
                I9.d.m(cA2);
            }
        }
        p247y7.AbstractC7350t.c(bA2);
        H9.B.a aVarG1 = bA2.g0();
        K9.a.C0150a c0150a2 = f6159a;
        return aVarG1.d(c0150a2.f(bA)).n(c0150a2.f(bA2)).c();
    }
}
