package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p092j1.e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f49373A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f49374B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f49375C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f49376D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f49377E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f49378F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f49379G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f49380H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f49381I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f49382J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f49383K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f49384L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f49385M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private float f49386N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private float f49387O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private float f49388P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private float f49389Q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private p122m1.g f49390s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private java.util.HashMap f49391t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private java.util.HashMap f49392u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private java.util.HashMap f49393v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f49394w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f49395x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f49396y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f49397z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p092j1.g gVar, j1.g.e eVar) {
        super(gVar, eVar);
        p247y7.AbstractC7350t.f(gVar, "state");
        p247y7.AbstractC7350t.f(eVar, "type");
        this.f49395x0 = -1;
        this.f49396y0 = -1;
        this.f49397z0 = -1;
        this.f49373A0 = -1;
        this.f49374B0 = -1;
        this.f49375C0 = -1;
        this.f49376D0 = 2;
        this.f49377E0 = 2;
        this.f49384L0 = -1;
        this.f49386N0 = 0.5f;
        this.f49387O0 = 0.5f;
        this.f49388P0 = 0.5f;
        this.f49389Q0 = 0.5f;
        if (eVar == j1.g.e.VERTICAL_FLOW) {
            this.f49385M0 = 1;
        }
    }

    @Override // p092j1.e
    public p122m1.j V0() {
        if (this.f49390s0 == null) {
            this.f49390s0 = new p122m1.g();
        }
        p122m1.g gVar = this.f49390s0;
        p247y7.AbstractC7350t.c(gVar);
        return gVar;
    }

    public final void Z0(java.lang.String str, float f6, float f10, float f11) {
        p247y7.AbstractC7350t.c(str);
        super.T0(str);
        if (!java.lang.Float.isNaN(f6)) {
            if (this.f49391t0 == null) {
                this.f49391t0 = new java.util.HashMap();
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(f6);
            java.util.HashMap map = this.f49391t0;
            p247y7.AbstractC7350t.c(map);
            map.put(str, fValueOf);
        }
        if (!java.lang.Float.isNaN(f10)) {
            if (this.f49392u0 == null) {
                this.f49392u0 = new java.util.HashMap();
            }
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f10);
            java.util.HashMap map2 = this.f49392u0;
            p247y7.AbstractC7350t.c(map2);
            map2.put(str, fValueOf2);
        }
        if (java.lang.Float.isNaN(f11)) {
            return;
        }
        if (this.f49393v0 == null) {
            this.f49393v0 = new java.util.HashMap();
        }
        java.lang.Float fValueOf3 = java.lang.Float.valueOf(f11);
        java.util.HashMap map3 = this.f49393v0;
        p247y7.AbstractC7350t.c(map3);
        map3.put(str, fValueOf3);
    }

    public final void a1(float f6) {
        this.f49388P0 = f6;
    }

    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        V0();
        b(this.f49390s0);
        p122m1.g gVar = this.f49390s0;
        p247y7.AbstractC7350t.c(gVar);
        gVar.k3(this.f49385M0);
        p122m1.g gVar2 = this.f49390s0;
        p247y7.AbstractC7350t.c(gVar2);
        gVar2.p3(this.f49394w0);
        if (this.f49384L0 != -1) {
            p122m1.g gVar3 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar3);
            gVar3.j3(this.f49384L0);
        }
        if (this.f49380H0 != 0) {
            p122m1.g gVar4 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar4);
            gVar4.t2(this.f49380H0);
        }
        if (this.f49382J0 != 0) {
            p122m1.g gVar5 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar5);
            gVar5.v2(this.f49382J0);
        }
        if (this.f49381I0 != 0) {
            p122m1.g gVar6 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar6);
            gVar6.u2(this.f49381I0);
        }
        if (this.f49383K0 != 0) {
            p122m1.g gVar7 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar7);
            gVar7.s2(this.f49383K0);
        }
        if (this.f49379G0 != 0) {
            p122m1.g gVar8 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar8);
            gVar8.d3(this.f49379G0);
        }
        if (this.f49378F0 != 0) {
            p122m1.g gVar9 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar9);
            gVar9.n3(this.f49378F0);
        }
        if (G() != 0.5f) {
            p122m1.g gVar10 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar10);
            gVar10.c3(G());
        }
        if (this.f49388P0 != 0.5f) {
            p122m1.g gVar11 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar11);
            gVar11.X2(this.f49388P0);
        }
        if (this.f49389Q0 != 0.5f) {
            p122m1.g gVar12 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar12);
            gVar12.f3(this.f49389Q0);
        }
        if (b0() != 0.5f) {
            p122m1.g gVar13 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar13);
            gVar13.m3(b0());
        }
        if (this.f49386N0 != 0.5f) {
            p122m1.g gVar14 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar14);
            gVar14.Z2(this.f49386N0);
        }
        if (this.f49387O0 != 0.5f) {
            p122m1.g gVar15 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar15);
            gVar15.h3(this.f49387O0);
        }
        if (this.f49377E0 != 2) {
            p122m1.g gVar16 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar16);
            gVar16.b3(this.f49377E0);
        }
        if (this.f49376D0 != 2) {
            p122m1.g gVar17 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar17);
            gVar17.l3(this.f49376D0);
        }
        if (this.f49395x0 != -1) {
            p122m1.g gVar18 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar18);
            gVar18.o3(this.f49395x0);
        }
        if (this.f49396y0 != -1) {
            p122m1.g gVar19 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar19);
            gVar19.a3(this.f49396y0);
        }
        if (this.f49397z0 != -1) {
            p122m1.g gVar20 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar20);
            gVar20.i3(this.f49397z0);
        }
        if (this.f49373A0 != -1) {
            p122m1.g gVar21 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar21);
            gVar21.e3(this.f49373A0);
        }
        if (this.f49374B0 != -1) {
            p122m1.g gVar22 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar22);
            gVar22.Y2(this.f49374B0);
        }
        if (this.f49375C0 != -1) {
            p122m1.g gVar23 = this.f49390s0;
            p247y7.AbstractC7350t.c(gVar23);
            gVar23.g3(this.f49375C0);
        }
        U0();
    }

    public final void b1(int i6) {
        this.f49374B0 = i6;
    }

    public final void c1(float f6) {
        this.f49386N0 = f6;
    }

    public final void d1(int i6) {
        this.f49396y0 = i6;
    }

    public final void e1(int i6) {
        this.f49377E0 = i6;
    }

    public final void f1(int i6) {
        this.f49379G0 = i6;
    }

    public final void g1(int i6) {
        this.f49373A0 = i6;
    }

    public final void h1(float f6) {
        this.f49389Q0 = f6;
    }

    public final void i1(int i6) {
        this.f49375C0 = i6;
    }

    public final void j1(float f6) {
        this.f49387O0 = f6;
    }

    public final void k1(int i6) {
        this.f49397z0 = i6;
    }

    public final void l1(int i6) {
        this.f49384L0 = i6;
    }

    public final void m1(int i6) {
        this.f49385M0 = i6;
    }

    public final void n1(int i6) {
        this.f49383K0 = i6;
    }

    public final void o1(int i6) {
        this.f49380H0 = i6;
    }

    public final void p1(int i6) {
        this.f49381I0 = i6;
    }

    public final void q1(int i6) {
        this.f49382J0 = i6;
    }

    public final void r1(int i6) {
        this.f49376D0 = i6;
    }

    public final void s1(int i6) {
        this.f49378F0 = i6;
    }

    public final void t1(int i6) {
        this.f49395x0 = i6;
    }

    public final void u1(int i6) {
        this.f49394w0 = i6;
    }
}
