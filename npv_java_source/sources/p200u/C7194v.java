package p200u;

/* JADX INFO: renamed from: u.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7194v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p200u.C7194v.b f55097c = new p200u.C7194v.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55098d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.C7194v.a[][] f55099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f55100b = true;

    /* JADX INFO: renamed from: u.v$a */
    public static final class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final p200u.C7194v.a.C0722a f55101s = new p200u.C7194v.a.C0722a(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f55102t = 8;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static float[] f55103u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f55104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f55105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f55110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f55111h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f55112i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f55113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float f55114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float f55115l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final float f55116m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f55117n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final float f55118o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f55119p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f55120q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f55121r;

        /* JADX INFO: renamed from: u.v$a$a, reason: collision with other inner class name */
        public static final class C0722a {
            private C0722a() {
            }

            public /* synthetic */ C0722a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] b() {
                if (p200u.C7194v.a.f55103u != null) {
                    float[] fArr = p200u.C7194v.a.f55103u;
                    p247y7.AbstractC7350t.c(fArr);
                    return fArr;
                }
                p200u.C7194v.a.f55103u = new float[91];
                float[] fArr2 = p200u.C7194v.a.f55103u;
                p247y7.AbstractC7350t.c(fArr2);
                return fArr2;
            }
        }

        public a(int i6, float f6, float f10, float f11, float f12, float f13, float f14) {
            this.f55104a = f6;
            this.f55105b = f10;
            this.f55106c = f11;
            this.f55107d = f12;
            this.f55108e = f13;
            this.f55109f = f14;
            float f15 = f13 - f11;
            float f16 = f14 - f12;
            boolean z6 = true;
            boolean z10 = i6 == 1 || (i6 == 4 ? f16 > 0.0f : !(i6 != 5 || f16 >= 0.0f));
            this.f55120q = z10;
            float f17 = 1 / (f10 - f6);
            this.f55114k = f17;
            boolean z11 = 3 == i6;
            if (z11 || java.lang.Math.abs(f15) < 0.001f || java.lang.Math.abs(f16) < 0.001f) {
                float fHypot = (float) java.lang.Math.hypot(f16, f15);
                this.f55110g = fHypot;
                this.f55119p = fHypot * f17;
                this.f55117n = f15 / (f10 - f6);
                this.f55118o = f16 / (f10 - f6);
                this.f55113j = new float[101];
                this.f55115l = Float.NaN;
                this.f55116m = Float.NaN;
            } else {
                this.f55113j = new float[101];
                this.f55115l = f15 * (z10 ? -1 : 1);
                this.f55116m = f16 * (z10 ? 1 : -1);
                this.f55117n = z10 ? f13 : f11;
                this.f55118o = z10 ? f12 : f14;
                c(f11, f12, f13, f14);
                this.f55119p = this.f55110g * f17;
                z6 = z11;
            }
            this.f55121r = z6;
        }

        private final void c(float f6, float f10, float f11, float f12) {
            float f13 = f11 - f6;
            float f14 = f10 - f12;
            int length = f55101s.b().length;
            float fHypot = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i6 = 0;
            while (i6 < length) {
                p200u.C7194v.a.C0722a c0722a = f55101s;
                double radians = (float) java.lang.Math.toRadians((((double) i6) * 90.0d) / ((double) (c0722a.b().length - 1)));
                float fSin = ((float) java.lang.Math.sin(radians)) * f13;
                float fCos = ((float) java.lang.Math.cos(radians)) * f14;
                if (i6 > 0) {
                    fHypot += (float) java.lang.Math.hypot(fSin - f15, fCos - f16);
                    c0722a.b()[i6] = fHypot;
                }
                i6++;
                f16 = fCos;
                f15 = fSin;
            }
            this.f55110g = fHypot;
            int length2 = f55101s.b().length;
            for (int i10 = 0; i10 < length2; i10++) {
                float[] fArrB = f55101s.b();
                fArrB[i10] = fArrB[i10] / fHypot;
            }
            int length3 = this.f55113j.length;
            for (int i11 = 0; i11 < length3; i11++) {
                float length4 = i11 / (this.f55113j.length - 1);
                p200u.C7194v.a.C0722a c0722a2 = f55101s;
                int iF = p097j7.AbstractC6872n.f(c0722a2.b(), length4, 0, 0, 6, null);
                if (iF >= 0) {
                    this.f55113j[i11] = iF / (c0722a2.b().length - 1);
                } else if (iF == -1) {
                    this.f55113j[i11] = 0.0f;
                } else {
                    int i12 = -iF;
                    int i13 = i12 - 2;
                    this.f55113j[i11] = (i13 + ((length4 - c0722a2.b()[i13]) / (c0722a2.b()[i12 - 1] - c0722a2.b()[i13]))) / (c0722a2.b().length - 1);
                }
            }
        }

        private final float o(float f6) {
            if (f6 <= 0.0f) {
                return 0.0f;
            }
            if (f6 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f55113j;
            float length = f6 * (fArr.length - 1);
            int i6 = (int) length;
            float f10 = length - i6;
            float f11 = fArr[i6];
            return f11 + (f10 * (fArr[i6 + 1] - f11));
        }

        public final float d() {
            float f6 = this.f55115l * this.f55112i;
            float fHypot = this.f55119p / ((float) java.lang.Math.hypot(f6, (-this.f55116m) * this.f55111h));
            if (this.f55120q) {
                f6 = -f6;
            }
            return f6 * fHypot;
        }

        public final float e() {
            float f6 = this.f55115l * this.f55112i;
            float f10 = (-this.f55116m) * this.f55111h;
            float fHypot = this.f55119p / ((float) java.lang.Math.hypot(f6, f10));
            return this.f55120q ? (-f10) * fHypot : f10 * fHypot;
        }

        public final float f() {
            return this.f55117n + (this.f55115l * this.f55111h);
        }

        public final float g() {
            return this.f55118o + (this.f55116m * this.f55112i);
        }

        public final float h() {
            return this.f55117n;
        }

        public final float i() {
            return this.f55118o;
        }

        public final float j(float f6) {
            float f10 = (f6 - this.f55104a) * this.f55114k;
            float f11 = this.f55106c;
            return f11 + (f10 * (this.f55108e - f11));
        }

        public final float k(float f6) {
            float f10 = (f6 - this.f55104a) * this.f55114k;
            float f11 = this.f55107d;
            return f11 + (f10 * (this.f55109f - f11));
        }

        public final float l() {
            return this.f55104a;
        }

        public final float m() {
            return this.f55105b;
        }

        public final boolean n() {
            return this.f55121r;
        }

        public final void p(float f6) {
            double dO = o((this.f55120q ? this.f55105b - f6 : f6 - this.f55104a) * this.f55114k) * 1.5707964f;
            this.f55111h = (float) java.lang.Math.sin(dO);
            this.f55112i = (float) java.lang.Math.cos(dO);
        }
    }

    /* JADX INFO: renamed from: u.v$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[PHI: r10
  0x0027: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public C7194v(int[] iArr, float[] fArr, float[][] fArr2) {
        int length = fArr.length - 1;
        p200u.C7194v.a[][] aVarArr = new p200u.C7194v.a[length][];
        int i6 = 1;
        int i10 = 1;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            int i13 = 3;
            if (i12 == 0) {
                i10 = i13;
            } else if (i12 == 1) {
                i6 = 1;
                i10 = i6;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        i13 = 4;
                        if (i12 != 4) {
                            i13 = 5;
                            if (i12 == 5) {
                                i10 = i13;
                            }
                        } else {
                            i10 = i13;
                        }
                    } else {
                        if (i6 != 1) {
                            i6 = 1;
                        }
                        i10 = i6;
                    }
                }
                i6 = 2;
                i10 = i6;
            }
            float[] fArr3 = fArr2[i11];
            int length2 = (fArr3.length / 2) + (fArr3.length % 2);
            p200u.C7194v.a[] aVarArr2 = new p200u.C7194v.a[length2];
            for (int i14 = 0; i14 < length2; i14++) {
                int i15 = i14 * 2;
                float f6 = fArr[i11];
                int i16 = i11 + 1;
                float f10 = fArr[i16];
                float[] fArr4 = fArr2[i11];
                float f11 = fArr4[i15];
                int i17 = i15 + 1;
                float f12 = fArr4[i17];
                float[] fArr5 = fArr2[i16];
                aVarArr2[i14] = new p200u.C7194v.a(i10, f6, f10, f11, f12, fArr5[i15], fArr5[i17]);
            }
            aVarArr[i11] = aVarArr2;
        }
        this.f55099a = aVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].m()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p200u.C7194v.a(float, float[]):void");
    }

    public final void b(float f6, float[] fArr) {
        if (f6 < this.f55099a[0][0].l()) {
            f6 = this.f55099a[0][0].l();
        } else {
            p200u.C7194v.a[][] aVarArr = this.f55099a;
            if (f6 > aVarArr[aVarArr.length - 1][0].m()) {
                p200u.C7194v.a[][] aVarArr2 = this.f55099a;
                f6 = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.f55099a.length;
        boolean z6 = false;
        for (int i6 = 0; i6 < length; i6++) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < fArr.length) {
                if (f6 <= this.f55099a[i6][i11].m()) {
                    if (this.f55099a[i6][i11].n()) {
                        fArr[i10] = this.f55099a[i6][i11].h();
                        fArr[i10 + 1] = this.f55099a[i6][i11].i();
                    } else {
                        this.f55099a[i6][i11].p(f6);
                        fArr[i10] = this.f55099a[i6][i11].d();
                        fArr[i10 + 1] = this.f55099a[i6][i11].e();
                    }
                    z6 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z6) {
                return;
            }
        }
    }
}
