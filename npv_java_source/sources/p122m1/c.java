package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m1.c.a f50232w = new m1.c.a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f50233x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p122m1.e f50234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p122m1.e f50235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p122m1.e f50236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p122m1.e f50237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p122m1.e f50238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p122m1.e f50239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p122m1.e f50240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.ArrayList f50241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f50244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f50250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f50252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f50254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50255v;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(p122m1.e eVar, int i6) {
            return eVar.A0() != 8 && eVar.N()[i6] == m1.e.b.MATCH_CONSTRAINT && (eVar.a0()[i6] == 0 || eVar.a0()[i6] == 3);
        }
    }

    public c(p122m1.e eVar, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(eVar, "first");
        this.f50234a = eVar;
        this.f50249p = i6;
        this.f50250q = z6;
    }

    private final void b() {
        int i6 = this.f50249p * 2;
        p122m1.e eVar = this.f50234a;
        p247y7.AbstractC7350t.c(eVar);
        this.f50248o = true;
        p122m1.e eVar2 = this.f50234a;
        p247y7.AbstractC7350t.c(eVar2);
        boolean z6 = false;
        p122m1.e eVar3 = eVar;
        p122m1.e eVar4 = eVar2;
        while (!z6) {
            this.f50242i++;
            p122m1.e eVar5 = null;
            eVar4.Z()[this.f50249p] = null;
            eVar4.O()[this.f50249p] = null;
            if (eVar4.A0() != 8) {
                this.f50245l++;
                m1.e.b bVarR = eVar4.r(this.f50249p);
                m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar) {
                    this.f50246m += eVar4.D(this.f50249p);
                }
                int iK = this.f50246m + eVar4.M()[i6].k();
                this.f50246m = iK;
                int i10 = i6 + 1;
                this.f50246m = iK + eVar4.M()[i10].k();
                int iK2 = this.f50247n + eVar4.M()[i6].k();
                this.f50247n = iK2;
                this.f50247n = iK2 + eVar4.M()[i10].k();
                if (this.f50235b == null) {
                    this.f50235b = eVar4;
                }
                this.f50237d = eVar4;
                if (eVar4.N()[this.f50249p] == bVar) {
                    if (eVar4.a0()[this.f50249p] == 0 || eVar4.a0()[this.f50249p] == 3 || eVar4.a0()[this.f50249p] == 2) {
                        this.f50243j++;
                        float f6 = eVar4.f0()[this.f50249p];
                        if (f6 > 0.0f) {
                            this.f50244k += eVar4.f0()[this.f50249p];
                        }
                        if (f50232w.b(eVar4, this.f50249p)) {
                            if (f6 < 0.0f) {
                                this.f50251r = true;
                            } else {
                                this.f50252s = true;
                            }
                            if (this.f50241h == null) {
                                this.f50241h = new java.util.ArrayList();
                            }
                            java.util.ArrayList arrayList = this.f50241h;
                            p247y7.AbstractC7350t.c(arrayList);
                            arrayList.add(eVar4);
                        }
                        if (this.f50239f == null) {
                            this.f50239f = eVar4;
                        }
                        p122m1.e eVar6 = this.f50240g;
                        if (eVar6 != null) {
                            p247y7.AbstractC7350t.c(eVar6);
                            eVar6.O()[this.f50249p] = eVar4;
                        }
                        this.f50240g = eVar4;
                    }
                    if (this.f50249p != 0 ? !(eVar4.P() == 0 && eVar4.T() == 0 && eVar4.R() == 0) : !(eVar4.Q() == 0 && eVar4.U() == 0 && eVar4.S() == 0)) {
                        this.f50248o = false;
                    }
                    if (eVar4.I() != 0.0f) {
                        this.f50248o = false;
                        this.f50254u = true;
                    }
                }
            }
            if (!p247y7.AbstractC7350t.b(eVar3, eVar4)) {
                eVar3.Z()[this.f50249p] = eVar4;
            }
            p122m1.d dVarI = eVar4.M()[i6 + 1].i();
            if (dVarI != null) {
                p122m1.e eVarG = dVarI.g();
                if (eVarG.M()[i6].i() != null) {
                    p122m1.d dVarI2 = eVarG.M()[i6].i();
                    p247y7.AbstractC7350t.c(dVarI2);
                    if (p247y7.AbstractC7350t.b(dVarI2.g(), eVar4)) {
                        eVar5 = eVarG;
                    }
                }
            }
            eVar3 = eVar4;
            if (eVar5 != null) {
                eVar4 = eVar5;
            } else {
                z6 = true;
            }
        }
        p122m1.e eVar7 = this.f50235b;
        if (eVar7 != null) {
            int i11 = this.f50246m;
            p247y7.AbstractC7350t.c(eVar7);
            this.f50246m = i11 - eVar7.M()[i6].k();
        }
        p122m1.e eVar8 = this.f50237d;
        if (eVar8 != null) {
            int i12 = this.f50246m;
            p247y7.AbstractC7350t.c(eVar8);
            this.f50246m = i12 - eVar8.M()[i6 + 1].k();
        }
        this.f50236c = eVar4;
        if (this.f50249p != 0 || !this.f50250q) {
            eVar4 = this.f50234a;
        }
        this.f50238e = eVar4;
        this.f50253t = this.f50252s && this.f50251r;
    }

    public final void a() {
        if (!this.f50255v) {
            b();
        }
        this.f50255v = true;
    }

    public final p122m1.e c() {
        return this.f50234a;
    }

    public final p122m1.e d() {
        return this.f50239f;
    }

    public final p122m1.e e() {
        return this.f50235b;
    }

    public final boolean f() {
        return this.f50253t;
    }

    public final boolean g() {
        return this.f50251r;
    }

    public final p122m1.e h() {
        return this.f50238e;
    }

    public final p122m1.e i() {
        return this.f50236c;
    }

    public final p122m1.e j() {
        return this.f50240g;
    }

    public final p122m1.e k() {
        return this.f50237d;
    }

    public final float l() {
        return this.f50244k;
    }

    public final java.util.ArrayList m() {
        return this.f50241h;
    }

    public final int n() {
        return this.f50242i;
    }

    public final int o() {
        return this.f50243j;
    }
}
