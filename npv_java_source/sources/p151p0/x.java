package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p151p0.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p0.x.a f52688t = new p0.x.a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p151p0.j f52689u = new p151p0.j() { // from class: p0.q
        @Override // p151p0.j
        public final double a(double d6) {
            return p151p0.x.t(d6);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p151p0.z f52690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f52691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f52692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p151p0.y f52693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f52694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f52695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f52696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p151p0.j f52697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p237x7.l f52698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p151p0.j f52699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p151p0.j f52700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p237x7.l f52701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p151p0.j f52702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f52703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f52704s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final float e(float[] fArr) {
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            float f15 = ((((((f6 * f12) + (f10 * f13)) + (f11 * f14)) - (f12 * f13)) - (f10 * f11)) - (f6 * f14)) * 0.5f;
            return f15 < 0.0f ? -f15 : f15;
        }

        private final boolean f(double d6, p151p0.j jVar, p151p0.j jVar2) {
            return java.lang.Math.abs(jVar.a(d6) - jVar2.a(d6)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, p151p0.z zVar) {
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            float fA = zVar.a();
            float fB = zVar.b();
            float f15 = 1;
            float f16 = (f15 - f6) / f10;
            float f17 = (f15 - f11) / f12;
            float f18 = (f15 - f13) / f14;
            float f19 = (f15 - fA) / fB;
            float f20 = f6 / f10;
            float f21 = (f11 / f12) - f20;
            float f22 = (fA / fB) - f20;
            float f23 = f17 - f16;
            float f24 = (f13 / f14) - f20;
            float f25 = (((f19 - f16) * f21) - (f22 * f23)) / (((f18 - f16) * f21) - (f23 * f24));
            float f26 = (f22 - (f24 * f25)) / f21;
            float f27 = (1.0f - f26) - f25;
            float f28 = f27 / f10;
            float f29 = f26 / f12;
            float f30 = f25 / f14;
            return new float[]{f28 * f6, f27, f28 * ((1.0f - f6) - f10), f29 * f11, f26, f29 * ((1.0f - f11) - f12), f30 * f13, f25, f30 * ((1.0f - f13) - f14)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f6 = fArr[0];
            float f10 = fArr2[0];
            float f11 = fArr[1];
            float f12 = fArr2[1];
            float f13 = fArr[2] - fArr2[2];
            float f14 = fArr[3] - fArr2[3];
            float f15 = fArr[4];
            float f16 = fArr2[4];
            float f17 = fArr[5];
            float f18 = fArr2[5];
            float[] fArr3 = {f6 - f10, f11 - f12, f13, f14, f15 - f16, f17 - f18};
            return i(fArr3[0], fArr3[1], f10 - f16, f12 - f18) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f6, float f10, float f11, float f12) {
            return (f6 * f12) - (f10 * f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, p151p0.z zVar, p151p0.j jVar, p151p0.j jVar2, float f6, float f10, int i6) {
            if (i6 == 0) {
                return true;
            }
            p151p0.g gVar = p151p0.g.f52623a;
            if (!p151p0.d.g(fArr, gVar.x()) || !p151p0.d.f(zVar, p151p0.k.f52658a.e()) || f6 != 0.0f || f10 != 1.0f) {
                return false;
            }
            p151p0.x xVarW = gVar.w();
            for (double d6 = 0.0d; d6 <= 1.0d; d6 += 0.00392156862745098d) {
                if (!f(d6, jVar, xVarW.J()) || !f(d6, jVar2, xVarW.F())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f6, float f10) {
            float fE = e(fArr);
            p151p0.g gVar = p151p0.g.f52623a;
            return (fE / e(gVar.s()) > 0.9f && h(fArr, gVar.x())) || (f6 < 0.0f && f10 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f6 = fArr[0];
                float f10 = fArr[1];
                float f11 = f6 + f10 + fArr[2];
                fArr2[0] = f6 / f11;
                fArr2[1] = f10 / f11;
                float f12 = fArr[3];
                float f13 = fArr[4];
                float f14 = f12 + f13 + fArr[5];
                fArr2[2] = f12 / f14;
                fArr2[3] = f13 / f14;
                float f15 = fArr[6];
                float f16 = fArr[7];
                float f17 = f15 + f16 + fArr[8];
                fArr2[4] = f15 / f17;
                fArr2[5] = f16 / f17;
            } else {
                p097j7.AbstractC6872n.n(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final java.lang.Double a(double d6) {
            return java.lang.Double.valueOf(p151p0.x.this.F().a(E7.j.i(d6, p151p0.x.this.f52691f, p151p0.x.this.f52692g)));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).doubleValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final java.lang.Double a(double d6) {
            return java.lang.Double.valueOf(E7.j.i(p151p0.x.this.J().a(d6), p151p0.x.this.f52691f, p151p0.x.this.f52692g));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).doubleValue());
        }
    }

    public x(java.lang.String str, float[] fArr, p151p0.z zVar, final double d6, float f6, float f10, int i6) {
        this(str, fArr, zVar, null, d6 == 1.0d ? f52689u : new p151p0.j() { // from class: p0.r
            @Override // p151p0.j
            public final double a(double d10) {
                return p151p0.x.u(d6, d10);
            }
        }, d6 == 1.0d ? f52689u : new p151p0.j() { // from class: p0.s
            @Override // p151p0.j
            public final double a(double d10) {
                return p151p0.x.v(d6, d10);
            }
        }, f6, f10, new p151p0.y(d6, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i6);
    }

    public x(java.lang.String str, float[] fArr, p151p0.z zVar, final p151p0.y yVar, int i6) {
        this(str, fArr, zVar, null, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new p151p0.j() { // from class: p0.t
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.w(yVar, d6);
            }
        } : new p151p0.j() { // from class: p0.u
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.x(yVar, d6);
            }
        }, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new p151p0.j() { // from class: p0.v
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.y(yVar, d6);
            }
        } : new p151p0.j() { // from class: p0.w
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.z(yVar, d6);
            }
        }, 0.0f, 1.0f, yVar, i6);
    }

    public x(java.lang.String str, float[] fArr, p151p0.z zVar, float[] fArr2, p151p0.j jVar, p151p0.j jVar2, float f6, float f10, p151p0.y yVar, int i6) {
        super(str, p151p0.b.f52614a.b(), i6, null);
        this.f52690e = zVar;
        this.f52691f = f6;
        this.f52692g = f10;
        this.f52693h = yVar;
        this.f52697l = jVar;
        this.f52698m = new p0.x.c();
        this.f52699n = new p151p0.j() { // from class: p0.o
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.O(this.f52680a, d6);
            }
        };
        this.f52700o = jVar2;
        this.f52701p = new p0.x.b();
        this.f52702q = new p151p0.j() { // from class: p0.p
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.x.C(this.f52681a, d6);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new java.lang.IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f6 >= f10) {
            throw new java.lang.IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f10 + "; min must be strictly < max");
        }
        p0.x.a aVar = f52688t;
        float[] fArrL = aVar.l(fArr);
        this.f52694i = fArrL;
        if (fArr2 == null) {
            this.f52695j = aVar.g(fArrL, zVar);
        } else {
            if (fArr2.length != 9) {
                throw new java.lang.IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f52695j = fArr2;
        }
        this.f52696k = p151p0.d.k(this.f52695j);
        this.f52703r = aVar.k(fArrL, f6, f10);
        this.f52704s = aVar.j(fArrL, zVar, jVar, jVar2, f6, f10, i6);
    }

    public x(p151p0.x xVar, float[] fArr, p151p0.z zVar) {
        this(xVar.f(), xVar.f52694i, zVar, fArr, xVar.f52697l, xVar.f52700o, xVar.f52691f, xVar.f52692g, xVar.f52693h, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(p151p0.x xVar, double d6) {
        return xVar.f52700o.a(E7.j.i(d6, xVar.f52691f, xVar.f52692g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double O(p151p0.x xVar, double d6) {
        return E7.j.i(xVar.f52697l.a(d6), xVar.f52691f, xVar.f52692g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d6) {
        return d6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d6, double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        }
        return java.lang.Math.pow(d10, 1.0d / d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d6, double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        }
        return java.lang.Math.pow(d10, d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double w(p151p0.y yVar, double d6) {
        return p151p0.d.o(d6, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(p151p0.y yVar, double d6) {
        return p151p0.d.p(d6, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(p151p0.y yVar, double d6) {
        return p151p0.d.q(d6, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(p151p0.y yVar, double d6) {
        return p151p0.d.r(d6, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    public final p237x7.l D() {
        return this.f52701p;
    }

    public final p151p0.j E() {
        return this.f52702q;
    }

    public final p151p0.j F() {
        return this.f52700o;
    }

    public final float[] G() {
        return this.f52696k;
    }

    public final p237x7.l H() {
        return this.f52698m;
    }

    public final p151p0.j I() {
        return this.f52699n;
    }

    public final p151p0.j J() {
        return this.f52697l;
    }

    public final float[] K() {
        return this.f52694i;
    }

    public final p151p0.y L() {
        return this.f52693h;
    }

    public final float[] M() {
        return this.f52695j;
    }

    public final p151p0.z N() {
        return this.f52690e;
    }

    @Override // p151p0.c
    public float c(int i6) {
        return this.f52692g;
    }

    @Override // p151p0.c
    public float d(int i6) {
        return this.f52691f;
    }

    @Override // p151p0.c
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p151p0.x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        p151p0.x xVar = (p151p0.x) obj;
        if (java.lang.Float.compare(xVar.f52691f, this.f52691f) != 0 || java.lang.Float.compare(xVar.f52692g, this.f52692g) != 0 || !p247y7.AbstractC7350t.b(this.f52690e, xVar.f52690e) || !java.util.Arrays.equals(this.f52694i, xVar.f52694i)) {
            return false;
        }
        p151p0.y yVar = this.f52693h;
        if (yVar != null) {
            return p247y7.AbstractC7350t.b(yVar, xVar.f52693h);
        }
        if (xVar.f52693h == null) {
            return true;
        }
        if (p247y7.AbstractC7350t.b(this.f52697l, xVar.f52697l)) {
            return p247y7.AbstractC7350t.b(this.f52700o, xVar.f52700o);
        }
        return false;
    }

    @Override // p151p0.c
    public boolean g() {
        return this.f52704s;
    }

    @Override // p151p0.c
    public long h(float f6, float f10, float f11) {
        float fA = (float) this.f52702q.a(f6);
        float fA2 = (float) this.f52702q.a(f10);
        float fA3 = (float) this.f52702q.a(f11);
        float[] fArr = this.f52695j;
        return (((long) java.lang.Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) java.lang.Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // p151p0.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f52690e.hashCode()) * 31) + java.util.Arrays.hashCode(this.f52694i)) * 31;
        float f6 = this.f52691f;
        int iFloatToIntBits = (iHashCode + (f6 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f6))) * 31;
        float f10 = this.f52692g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f10))) * 31;
        p151p0.y yVar = this.f52693h;
        int iHashCode2 = iFloatToIntBits2 + (yVar != null ? yVar.hashCode() : 0);
        return this.f52693h == null ? (((iHashCode2 * 31) + this.f52697l.hashCode()) * 31) + this.f52700o.hashCode() : iHashCode2;
    }

    @Override // p151p0.c
    public float i(float f6, float f10, float f11) {
        float fA = (float) this.f52702q.a(f6);
        float fA2 = (float) this.f52702q.a(f10);
        float fA3 = (float) this.f52702q.a(f11);
        float[] fArr = this.f52695j;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // p151p0.c
    public long j(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        float[] fArr = this.f52696k;
        return p141o0.A0.a((float) this.f52699n.a((fArr[0] * f6) + (fArr[3] * f10) + (fArr[6] * f11)), (float) this.f52699n.a((fArr[1] * f6) + (fArr[4] * f10) + (fArr[7] * f11)), (float) this.f52699n.a((fArr[2] * f6) + (fArr[5] * f10) + (fArr[8] * f11)), f12, cVar);
    }
}
