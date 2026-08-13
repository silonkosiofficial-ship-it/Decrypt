package p122m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1.k.a f50458a = new m1.k.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean[] f50459b = new boolean[3];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a(p122m1.f fVar, p042e1.d dVar, p122m1.e eVar) {
            p247y7.AbstractC7350t.f(fVar, "container");
            p247y7.AbstractC7350t.f(dVar, "system");
            p247y7.AbstractC7350t.f(eVar, "widget");
            eVar.w1(-1);
            eVar.z1(-1);
            m1.e.b bVar = fVar.N()[0];
            m1.e.b bVar2 = m1.e.b.WRAP_CONTENT;
            if (bVar != bVar2 && eVar.N()[0] == m1.e.b.MATCH_PARENT) {
                int iF = eVar.L().f();
                int iB0 = fVar.B0() - eVar.b0().f();
                eVar.L().B(dVar.u(eVar.L()));
                eVar.b0().B(dVar.u(eVar.b0()));
                p042e1.i iVarH = eVar.L().h();
                p247y7.AbstractC7350t.c(iVarH);
                dVar.j(iVarH, iF);
                p042e1.i iVarH2 = eVar.b0().h();
                p247y7.AbstractC7350t.c(iVarH2);
                dVar.j(iVarH2, iB0);
                eVar.w1(2);
                eVar.q1(iF, iB0);
            }
            if (fVar.N()[1] == bVar2 || eVar.N()[1] != m1.e.b.MATCH_PARENT) {
                return;
            }
            int iF2 = eVar.c0().f();
            int iW = fVar.w() - eVar.G().f();
            eVar.c0().B(dVar.u(eVar.c0()));
            eVar.G().B(dVar.u(eVar.G()));
            p042e1.i iVarH3 = eVar.c0().h();
            p247y7.AbstractC7350t.c(iVarH3);
            dVar.j(iVarH3, iF2);
            p042e1.i iVarH4 = eVar.G().h();
            p247y7.AbstractC7350t.c(iVarH4);
            dVar.j(iVarH4, iW);
            if (eVar.m() > 0 || eVar.A0() == 8) {
                eVar.F().B(dVar.u(eVar.F()));
                p042e1.i iVarH5 = eVar.F().h();
                p247y7.AbstractC7350t.c(iVarH5);
                dVar.j(iVarH5, eVar.m() + iF2);
            }
            eVar.z1(2);
            eVar.O1(iF2, iW);
        }

        public final boolean b(int i6, int i10) {
            return (i6 & i10) == i10;
        }

        public final boolean[] c() {
            return p122m1.k.f50459b;
        }
    }
}
