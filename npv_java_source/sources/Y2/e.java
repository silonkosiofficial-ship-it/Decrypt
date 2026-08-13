package Y2;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    private static final class b implements Y2.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.content.Context f16309a;

        private b() {
        }

        @Override // Y2.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Y2.e.b a(android.content.Context context) {
            this.f16309a = (android.content.Context) p004a3.d.b(context);
            return this;
        }

        @Override // Y2.v.a
        public Y2.v i() {
            p004a3.d.a(this.f16309a, android.content.Context.class);
            return new Y2.e.c(this.f16309a);
        }
    }

    private static final class c extends Y2.v {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final Y2.e.c f16310C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private p077h7.a f16311D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private p077h7.a f16312E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private p077h7.a f16313F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private p077h7.a f16314G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private p077h7.a f16315H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p077h7.a f16316I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private p077h7.a f16317J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private p077h7.a f16318K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private p077h7.a f16319L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private p077h7.a f16320M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private p077h7.a f16321N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private p077h7.a f16322O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private p077h7.a f16323P;

        private c(android.content.Context context) {
            this.f16310C = this;
            g(context);
        }

        private void g(android.content.Context context) {
            this.f16311D = p004a3.a.a(Y2.k.a());
            p004a3.b bVarA = p004a3.c.a(context);
            this.f16312E = bVarA;
            Z2.j jVarA = Z2.j.a(bVarA, p084i3.c.a(), p084i3.d.a());
            this.f16313F = jVarA;
            this.f16314G = p004a3.a.a(Z2.l.a(this.f16312E, jVarA));
            this.f16315H = p064g3.X.a(this.f16312E, p064g3.C6602g.a(), p064g3.C6604i.a());
            this.f16316I = p004a3.a.a(p064g3.C6603h.a(this.f16312E));
            this.f16317J = p004a3.a.a(p064g3.N.a(p084i3.c.a(), p084i3.d.a(), p064g3.C6605j.a(), this.f16315H, this.f16316I));
            p044e3.g gVarB = p044e3.g.b(p084i3.c.a());
            this.f16318K = gVarB;
            p044e3.i iVarA = p044e3.i.a(this.f16312E, this.f16317J, gVarB, p084i3.d.a());
            this.f16319L = iVarA;
            p077h7.a aVar = this.f16311D;
            p077h7.a aVar2 = this.f16314G;
            p077h7.a aVar3 = this.f16317J;
            this.f16320M = p044e3.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
            p077h7.a aVar4 = this.f16312E;
            p077h7.a aVar5 = this.f16314G;
            p077h7.a aVar6 = this.f16317J;
            this.f16321N = p054f3.s.a(aVar4, aVar5, aVar6, this.f16319L, this.f16311D, aVar6, p084i3.c.a(), p084i3.d.a(), this.f16317J);
            p077h7.a aVar7 = this.f16311D;
            p077h7.a aVar8 = this.f16317J;
            this.f16322O = p054f3.w.a(aVar7, aVar8, this.f16319L, aVar8);
            this.f16323P = p004a3.a.a(Y2.w.a(p084i3.c.a(), p084i3.d.a(), this.f16320M, this.f16321N, this.f16322O));
        }

        @Override // Y2.v
        p064g3.InterfaceC6599d a() {
            return (p064g3.InterfaceC6599d) this.f16317J.get();
        }

        @Override // Y2.v
        Y2.u f() {
            return (Y2.u) this.f16323P.get();
        }
    }

    public static Y2.v.a a() {
        return new Y2.e.b();
    }
}
