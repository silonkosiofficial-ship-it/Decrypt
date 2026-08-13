package S;

/* JADX INFO: renamed from: S.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1537c implements S.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S.t1 f10808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p200u.C7157a f10811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p210v.N f10812e = new p210v.N();

    /* JADX INFO: renamed from: S.c$a */
    static final class a extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10813G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f10815I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, p127m7.e eVar) {
            super(1, eVar);
            this.f10815I = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10813G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = S.C1537c.this.f10811d;
                java.lang.Float fB = p147o7.b.b(this.f10815I);
                p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(1.0f, 700.0f, null, 4, null);
                this.f10813G = 1;
                obj = p200u.C7157a.f(c7157a, fB, c7180l0J, null, null, this, 12, null);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((S.C1537c.a) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return S.C1537c.this.new a(this.f10815I, eVar);
        }
    }

    /* JADX INFO: renamed from: S.c$b */
    static final class b extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10816G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f10818I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f6, p127m7.e eVar) {
            super(1, eVar);
            this.f10818I = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10816G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = S.C1537c.this.f10811d;
                java.lang.Float fB = p147o7.b.b(this.f10818I);
                p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
                this.f10816G = 1;
                obj = p200u.C7157a.f(c7157a, fB, c7180l0J, null, null, this, 12, null);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((S.C1537c.b) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return S.C1537c.this.new b(this.f10818I, eVar);
        }
    }

    /* JADX INFO: renamed from: S.c$c, reason: collision with other inner class name */
    static final class C0243c extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10819G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f10821I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f10822J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0243c(float f6, boolean z6, p127m7.e eVar) {
            super(1, eVar);
            this.f10821I = f6;
            this.f10822J = z6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10819G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                if (S.s1.f(S.C1537c.this.g(), S.s1.f11748b.a())) {
                    S.C1537c c1537c = S.C1537c.this;
                    c1537c.f10809b = (c1537c.D(this.f10821I) % 12) * 0.5235988f;
                    S.t1 t1VarW = S.C1537c.this.w();
                    S.C1537c c1537c2 = S.C1537c.this;
                    t1VarW.d((c1537c2.D(c1537c2.f10809b) % 12) + (S.C1537c.this.i() ? 12 : 0));
                } else {
                    S.C1537c c1537c3 = S.C1537c.this;
                    c1537c3.f10810c = c1537c3.E(this.f10821I) * 0.10471976f;
                    S.t1 t1VarW2 = S.C1537c.this.w();
                    S.C1537c c1537c4 = S.C1537c.this;
                    t1VarW2.e(c1537c4.E(c1537c4.f10810c));
                }
                if (this.f10822J) {
                    S.C1537c c1537c5 = S.C1537c.this;
                    float fT = c1537c5.t(c1537c5.z(this.f10821I));
                    p200u.C7157a c7157a = S.C1537c.this.f10811d;
                    java.lang.Float fB = p147o7.b.b(fT);
                    p200u.C7180l0 c7180l0J = p200u.AbstractC7177k.j(1.0f, 700.0f, null, 4, null);
                    this.f10819G = 2;
                    java.lang.Object objF = p200u.C7157a.f(c7157a, fB, c7180l0J, null, null, this, 12, null);
                    return objF == objG ? objG : objF;
                }
                p200u.C7157a c7157a2 = S.C1537c.this.f10811d;
                java.lang.Float fB2 = p147o7.b.b(S.C1537c.this.z(this.f10821I));
                this.f10819G = 1;
                if (c7157a2.s(fB2, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                    return obj;
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((S.C1537c.C0243c) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return S.C1537c.this.new C0243c(this.f10821I, this.f10822J, eVar);
        }
    }

    public C1537c(S.t1 t1Var) {
        this.f10808a = t1Var;
        this.f10809b = ((t1Var.b() % 12) * 0.5235988f) - 1.5707964f;
        this.f10810c = (t1Var.a() * 0.10471976f) - 1.5707964f;
        this.f10811d = p200u.AbstractC7159b.b(this.f10809b, 0.0f, 2, null);
    }

    public static /* synthetic */ java.lang.Object C(S.C1537c c1537c, float f6, boolean z6, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return c1537c.B(f6, z6, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D(float f6) {
        return ((int) ((((double) f6) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(float f6) {
        return ((int) ((((double) f6) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    private final void F() {
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarD = aVar.d();
        p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
        p051f0.k kVarF = aVar.f(kVarD);
        try {
            this.f10808a.e(a());
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            aVar.m(kVarD, kVarF, lVarH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float t(float f6) {
        float fFloatValue = ((java.lang.Number) this.f10811d.m()).floatValue() - f6;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((java.lang.Number) this.f10811d.m()).floatValue() - fFloatValue;
    }

    private final boolean x() {
        int iG = g();
        S.s1.a aVar = S.s1.f11748b;
        if (S.s1.f(iG, aVar.a()) && y(((java.lang.Number) this.f10811d.k()).floatValue()) == y(this.f10809b)) {
            return false;
        }
        return (S.s1.f(g(), aVar.b()) && y(((java.lang.Number) this.f10811d.k()).floatValue()) == y(this.f10810c)) ? false : true;
    }

    private final float y(float f6) {
        double d6 = ((double) f6) % 6.283185307179586d;
        if (d6 < 0.0d) {
            d6 += 6.283185307179586d;
        }
        return (float) d6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(float f6) {
        float f10 = f6 + 1.5707964f;
        return f10 < 0.0f ? f10 + 6.2831855f : f10;
    }

    public final java.lang.Object A(p127m7.e eVar) {
        java.lang.Object objD = this.f10812e.d(p210v.L.PreventUserInput, new S.C1537c.b(t(S.s1.f(g(), S.s1.f11748b.a()) ? this.f10809b : this.f10810c), null), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    public final java.lang.Object B(float f6, boolean z6, p127m7.e eVar) {
        java.lang.Object objD = this.f10812e.d(p210v.L.UserInput, new S.C1537c.C0243c(f6, z6, null), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    @Override // S.t1
    public int a() {
        return this.f10808a.a();
    }

    @Override // S.t1
    public int b() {
        return this.f10808a.b();
    }

    @Override // S.t1
    public void c(boolean z6) {
        this.f10808a.c(z6);
    }

    @Override // S.t1
    public void d(int i6) {
        this.f10809b = ((i6 % 12) * 0.5235988f) - 1.5707964f;
        this.f10808a.d(i6);
        if (S.s1.f(g(), S.s1.f11748b.a())) {
            this.f10811d = p200u.AbstractC7159b.b(this.f10809b, 0.0f, 2, null);
        }
    }

    @Override // S.t1
    public void e(int i6) {
        this.f10810c = (i6 * 0.10471976f) - 1.5707964f;
        this.f10808a.e(i6);
        if (S.s1.f(g(), S.s1.f11748b.b())) {
            this.f10811d = p200u.AbstractC7159b.b(this.f10810c, 0.0f, 2, null);
        }
        F();
    }

    @Override // S.t1
    public void f(int i6) {
        this.f10808a.f(i6);
    }

    @Override // S.t1
    public int g() {
        return this.f10808a.g();
    }

    @Override // S.t1
    public boolean h() {
        return this.f10808a.h();
    }

    @Override // S.t1
    public boolean i() {
        return this.f10808a.i();
    }

    public final java.lang.Object s(p127m7.e eVar) {
        if (!x()) {
            return p087i7.M.f46721a;
        }
        java.lang.Object objD = this.f10812e.d(p210v.L.PreventUserInput, new S.C1537c.a(t(S.s1.f(g(), S.s1.f11748b.a()) ? this.f10809b : this.f10810c), null), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    public final p170r.AbstractC7037l u() {
        return S.s1.f(g(), S.s1.f11748b.b()) ? S.q1.f11523j : S.q1.f11524k;
    }

    public final float v() {
        return ((java.lang.Number) this.f10811d.m()).floatValue();
    }

    public final S.t1 w() {
        return this.f10808a;
    }
}
