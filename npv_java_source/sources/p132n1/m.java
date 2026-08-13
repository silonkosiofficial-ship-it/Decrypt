package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1.m.a f51401g = new n1.m.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51402h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f51403i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p132n1.p f51405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p132n1.p f51406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.ArrayList f51407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51409f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a(int i6) {
            p132n1.m.f51403i = i6;
        }
    }

    public m(p132n1.p pVar, int i6) {
        p247y7.AbstractC7350t.f(pVar, "run");
        this.f51406c = pVar;
        this.f51407d = new java.util.ArrayList();
        this.f51409f = i6;
        int i10 = f51403i;
        this.f51408e = i10;
        f51403i = i10 + 1;
    }

    private final long e(p132n1.f fVar, long j6) {
        p132n1.p pVarF = fVar.f();
        if (pVarF instanceof p132n1.k) {
            return j6;
        }
        int size = fVar.d().size();
        long jMin = j6;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = fVar.d().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p132n1.d dVar = (p132n1.d) obj;
            if (dVar instanceof p132n1.f) {
                p132n1.f fVar2 = (p132n1.f) dVar;
                if (!p247y7.AbstractC7350t.b(fVar2.f(), pVarF)) {
                    jMin = java.lang.Math.min(jMin, e(fVar2, ((long) fVar2.e()) + j6));
                }
            }
        }
        if (!p247y7.AbstractC7350t.b(fVar, pVarF.g())) {
            return jMin;
        }
        long jT = j6 - pVarF.t();
        return java.lang.Math.min(java.lang.Math.min(jMin, e(pVarF.q(), jT)), jT - ((long) pVarF.q().e()));
    }

    private final long f(p132n1.f fVar, long j6) {
        p132n1.p pVarF = fVar.f();
        if (pVarF instanceof p132n1.k) {
            return j6;
        }
        int size = fVar.d().size();
        long jMax = j6;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = fVar.d().get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p132n1.d dVar = (p132n1.d) obj;
            if (dVar instanceof p132n1.f) {
                p132n1.f fVar2 = (p132n1.f) dVar;
                if (!p247y7.AbstractC7350t.b(fVar2.f(), pVarF)) {
                    jMax = java.lang.Math.max(jMax, f(fVar2, ((long) fVar2.e()) + j6));
                }
            }
        }
        if (!p247y7.AbstractC7350t.b(fVar, pVarF.q())) {
            return jMax;
        }
        long jT = j6 + pVarF.t();
        return java.lang.Math.max(java.lang.Math.max(jMax, f(pVarF.g(), jT)), jT - ((long) pVarF.g().e()));
    }

    public final void b(p132n1.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "run");
        this.f51407d.add(pVar);
        this.f51406c = pVar;
    }

    public final long c(p122m1.f fVar, int i6) {
        long jE;
        long jF;
        p247y7.AbstractC7350t.f(fVar, "container");
        p132n1.p pVar = this.f51405b;
        if (pVar instanceof p132n1.c) {
            p247y7.AbstractC7350t.d(pVar, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.analyzer.ChainRun");
            if (((p132n1.c) pVar).p() != i6) {
                return 0L;
            }
        } else if (i6 == 0) {
            if (!(pVar instanceof p132n1.l)) {
                return 0L;
            }
        } else if (!(pVar instanceof p132n1.n)) {
            return 0L;
        }
        p132n1.p pVarK = i6 == 0 ? fVar.K() : fVar.e0();
        p247y7.AbstractC7350t.c(pVarK);
        p132n1.f fVarQ = pVarK.q();
        p132n1.p pVarK2 = i6 == 0 ? fVar.K() : fVar.e0();
        p247y7.AbstractC7350t.c(pVarK2);
        p132n1.f fVarG = pVarK2.g();
        p132n1.p pVar2 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar2);
        boolean zContains = pVar2.q().g().contains(fVarQ);
        p132n1.p pVar3 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar3);
        boolean zContains2 = pVar3.g().g().contains(fVarG);
        p132n1.p pVar4 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar4);
        long jT = pVar4.t();
        if (!zContains || !zContains2) {
            if (zContains) {
                p132n1.p pVar5 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar5);
                p132n1.f fVarQ2 = pVar5.q();
                p132n1.p pVar6 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar6);
                jF = f(fVarQ2, pVar6.q().e());
                p132n1.p pVar7 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar7);
                jE = ((long) pVar7.q().e()) + jT;
            } else {
                if (!zContains2) {
                    p132n1.p pVar8 = this.f51405b;
                    p247y7.AbstractC7350t.c(pVar8);
                    long jE2 = pVar8.q().e();
                    p132n1.p pVar9 = this.f51405b;
                    p247y7.AbstractC7350t.c(pVar9);
                    pVar9.t();
                    p132n1.p pVar10 = this.f51405b;
                    p247y7.AbstractC7350t.c(pVar10);
                    pVar10.g().e();
                    return jE2;
                }
                p132n1.p pVar11 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar11);
                p132n1.f fVarG2 = pVar11.g();
                p132n1.p pVar12 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar12);
                long jE3 = e(fVarG2, pVar12.g().e());
                p132n1.p pVar13 = this.f51405b;
                p247y7.AbstractC7350t.c(pVar13);
                jE = ((long) (-pVar13.g().e())) + jT;
                jF = -jE3;
            }
            return java.lang.Math.max(jF, jE);
        }
        p132n1.p pVar14 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar14);
        long jF2 = f(pVar14.q(), 0L);
        p132n1.p pVar15 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar15);
        long jE4 = e(pVar15.g(), 0L);
        long jE5 = jF2 - jT;
        p132n1.p pVar16 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar16);
        if (jE5 >= (-pVar16.g().e())) {
            p132n1.p pVar17 = this.f51405b;
            p247y7.AbstractC7350t.c(pVar17);
            jE5 += (long) pVar17.g().e();
        }
        p132n1.p pVar18 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar18);
        long jE6 = ((-jE4) - jT) - ((long) pVar18.q().e());
        p132n1.p pVar19 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar19);
        if (jE6 >= pVar19.q().e()) {
            p132n1.p pVar20 = this.f51405b;
            p247y7.AbstractC7350t.c(pVar20);
            jE6 -= (long) pVar20.q().e();
        }
        p132n1.p pVar21 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar21);
        p122m1.e eVarN = pVar21.n();
        p247y7.AbstractC7350t.c(eVarN);
        float fN = eVarN.n(i6);
        float f6 = fN > 0.0f ? (long) ((jE6 / fN) + (jE5 / (1.0f - fN))) : 0L;
        long j6 = ((long) ((f6 * fN) + 0.5f)) + jT + ((long) ((f6 * (1.0f - fN)) + 0.5f));
        p132n1.p pVar22 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar22);
        long jE7 = ((long) pVar22.q().e()) + j6;
        p132n1.p pVar23 = this.f51405b;
        p247y7.AbstractC7350t.c(pVar23);
        return jE7 - ((long) pVar23.g().e());
    }

    public final void d(boolean z6) {
        this.f51404a = z6;
    }
}
