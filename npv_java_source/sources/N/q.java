package N;

/* JADX INFO: loaded from: classes.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N.q.a f7440a = N.q.a.f7441a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ N.q.a f7441a = new N.q.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final N.q f7442b = new N.q() { // from class: N.l
            @Override // N.q
            public final N.C1361k a(N.w wVar) {
                return N.q.a.h(wVar);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final N.q f7443c = new N.q() { // from class: N.m
            @Override // N.q
            public final N.C1361k a(N.w wVar) {
                return N.q.a.f(wVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final N.q f7444d = new N.q() { // from class: N.n
            @Override // N.q
            public final N.C1361k a(N.w wVar) {
                return N.q.a.j(wVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final N.q f7445e = new N.q() { // from class: N.o
            @Override // N.q
            public final N.C1361k a(N.w wVar) {
                return N.q.a.i(wVar);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final N.q f7446f = new N.q() { // from class: N.p
            @Override // N.q
            public final N.C1361k a(N.w wVar) {
                return N.q.a.g(wVar);
            }
        };

        /* JADX INFO: renamed from: N.q$a$a, reason: collision with other inner class name */
        static final class C0183a implements N.InterfaceC1353c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.q.a.C0183a f7447a = new N.q.a.C0183a();

            C0183a() {
            }

            @Override // N.InterfaceC1353c
            public final long a(N.C1360j c1360j, int i6) {
                return H.AbstractC1233z.c(c1360j.c(), i6);
            }
        }

        static final class b implements N.InterfaceC1353c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.q.a.b f7448a = new N.q.a.b();

            b() {
            }

            @Override // N.InterfaceC1353c
            public final long a(N.C1360j c1360j, int i6) {
                return c1360j.k().C(i6);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final N.C1361k f(N.w wVar) {
            return N.r.h(f7442b.a(wVar), wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final N.C1361k g(N.w wVar) {
            N.C1361k.a aVarC;
            N.C1361k.a aVarL;
            N.C1361k.a aVarE;
            N.C1361k.a aVarC2;
            N.C1361k c1361kD = wVar.d();
            if (c1361kD == null) {
                return f7444d.a(wVar);
            }
            if (wVar.b()) {
                aVarC = c1361kD.e();
                aVarL = N.r.l(wVar, wVar.k(), aVarC);
                aVarC2 = c1361kD.c();
                aVarE = aVarL;
            } else {
                aVarC = c1361kD.c();
                aVarL = N.r.l(wVar, wVar.h(), aVarC);
                aVarE = c1361kD.e();
                aVarC2 = aVarL;
            }
            if (p247y7.AbstractC7350t.b(aVarL, aVarC)) {
                return c1361kD;
            }
            return N.r.h(new N.C1361k(aVarE, aVarC2, wVar.i() == N.EnumC1355e.CROSSED || (wVar.i() == N.EnumC1355e.COLLAPSED && aVarE.c() > aVarC2.c())), wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final N.C1361k h(N.w wVar) {
            return new N.C1361k(wVar.k().a(wVar.k().g()), wVar.h().a(wVar.h().e()), wVar.i() == N.EnumC1355e.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final N.C1361k i(N.w wVar) {
            return N.r.e(wVar, N.q.a.C0183a.f7447a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final N.C1361k j(N.w wVar) {
            return N.r.e(wVar, N.q.a.b.f7448a);
        }

        public final N.q k() {
            return f7446f;
        }

        public final N.q l() {
            return f7442b;
        }

        public final N.q m() {
            return f7445e;
        }

        public final N.q n() {
            return f7444d;
        }
    }

    N.C1361k a(N.w wVar);
}
