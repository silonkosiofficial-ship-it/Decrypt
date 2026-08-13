package E4;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f2211g = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f2212h = new java.util.ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2213i;

    class a extends E4.m.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.List f2214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.graphics.Matrix f2215d;

        a(java.util.List list, android.graphics.Matrix matrix) {
            this.f2214c = list;
            this.f2215d = matrix;
        }

        @Override // E4.m.g
        public void b(android.graphics.Matrix matrix, D4.a aVar, int i6, android.graphics.Canvas canvas) {
            java.util.Iterator it = this.f2214c.iterator();
            while (it.hasNext()) {
                ((E4.m.g) it.next()).b(this.f2215d, aVar, i6, canvas);
            }
        }
    }

    static class b extends E4.m.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E4.m.d f2217c;

        public b(E4.m.d dVar) {
            this.f2217c = dVar;
        }

        @Override // E4.m.g
        public void b(android.graphics.Matrix matrix, D4.a aVar, int i6, android.graphics.Canvas canvas) {
            aVar.a(canvas, matrix, new android.graphics.RectF(this.f2217c.k(), this.f2217c.o(), this.f2217c.l(), this.f2217c.j()), i6, this.f2217c.m(), this.f2217c.n());
        }
    }

    static class c extends E4.m.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E4.m.e f2218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f2219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f2220e;

        public c(E4.m.e eVar, float f6, float f10) {
            this.f2218c = eVar;
            this.f2219d = f6;
            this.f2220e = f10;
        }

        @Override // E4.m.g
        public void b(android.graphics.Matrix matrix, D4.a aVar, int i6, android.graphics.Canvas canvas) {
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) java.lang.Math.hypot(this.f2218c.f2229c - this.f2220e, this.f2218c.f2228b - this.f2219d), 0.0f);
            this.f2232a.set(matrix);
            this.f2232a.preTranslate(this.f2219d, this.f2220e);
            this.f2232a.preRotate(c());
            aVar.b(canvas, this.f2232a, rectF, i6);
        }

        float c() {
            return (float) java.lang.Math.toDegrees(java.lang.Math.atan((this.f2218c.f2229c - this.f2220e) / (this.f2218c.f2228b - this.f2219d)));
        }
    }

    public static class d extends E4.m.f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final android.graphics.RectF f2221h = new android.graphics.RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2227g;

        public d(float f6, float f10, float f11, float f12) {
            q(f6);
            u(f10);
            r(f11);
            p(f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f2225e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f2222b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f2224d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f2226f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f2227g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f2223c;
        }

        private void p(float f6) {
            this.f2225e = f6;
        }

        private void q(float f6) {
            this.f2222b = f6;
        }

        private void r(float f6) {
            this.f2224d = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f6) {
            this.f2226f = f6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f6) {
            this.f2227g = f6;
        }

        private void u(float f6) {
            this.f2223c = f6;
        }

        @Override // E4.m.f
        public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.f2230a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            android.graphics.RectF rectF = f2221h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends E4.m.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f2228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2229c;

        @Override // E4.m.f
        public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.f2230a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2228b, this.f2229c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final android.graphics.Matrix f2230a = new android.graphics.Matrix();

        public abstract void a(android.graphics.Matrix matrix, android.graphics.Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final android.graphics.Matrix f2231b = new android.graphics.Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.graphics.Matrix f2232a = new android.graphics.Matrix();

        g() {
        }

        public final void a(D4.a aVar, int i6, android.graphics.Canvas canvas) {
            b(f2231b, aVar, i6, canvas);
        }

        public abstract void b(android.graphics.Matrix matrix, D4.a aVar, int i6, android.graphics.Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f6) {
        if (g() == f6) {
            return;
        }
        float fG = ((f6 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        E4.m.d dVar = new E4.m.d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f2212h.add(new E4.m.b(dVar));
        p(f6);
    }

    private void c(E4.m.g gVar, float f6, float f10) {
        b(f6);
        this.f2212h.add(gVar);
        p(f10);
    }

    private float g() {
        return this.f2209e;
    }

    private float h() {
        return this.f2210f;
    }

    private void p(float f6) {
        this.f2209e = f6;
    }

    private void q(float f6) {
        this.f2210f = f6;
    }

    private void r(float f6) {
        this.f2207c = f6;
    }

    private void s(float f6) {
        this.f2208d = f6;
    }

    private void t(float f6) {
        this.f2205a = f6;
    }

    private void u(float f6) {
        this.f2206b = f6;
    }

    public void a(float f6, float f10, float f11, float f12, float f13, float f14) {
        E4.m.d dVar = new E4.m.d(f6, f10, f11, f12);
        dVar.s(f13);
        dVar.t(f14);
        this.f2211g.add(dVar);
        E4.m.b bVar = new E4.m.b(dVar);
        float f15 = f13 + f14;
        boolean z6 = f14 < 0.0f;
        if (z6) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        c(bVar, f13, z6 ? (180.0f + f15) % 360.0f : f15);
        double d6 = f15;
        r(((f6 + f11) * 0.5f) + (((f11 - f6) / 2.0f) * ((float) java.lang.Math.cos(java.lang.Math.toRadians(d6)))));
        s(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) java.lang.Math.sin(java.lang.Math.toRadians(d6)))));
    }

    public void d(android.graphics.Matrix matrix, android.graphics.Path path) {
        int size = this.f2211g.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((E4.m.f) this.f2211g.get(i6)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f2213i;
    }

    E4.m.g f(android.graphics.Matrix matrix) {
        b(h());
        return new E4.m.a(new java.util.ArrayList(this.f2212h), new android.graphics.Matrix(matrix));
    }

    float i() {
        return this.f2207c;
    }

    float j() {
        return this.f2208d;
    }

    float k() {
        return this.f2205a;
    }

    float l() {
        return this.f2206b;
    }

    public void m(float f6, float f10) {
        E4.m.e eVar = new E4.m.e();
        eVar.f2228b = f6;
        eVar.f2229c = f10;
        this.f2211g.add(eVar);
        E4.m.c cVar = new E4.m.c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f6);
        s(f10);
    }

    public void n(float f6, float f10) {
        o(f6, f10, 270.0f, 0.0f);
    }

    public void o(float f6, float f10, float f11, float f12) {
        t(f6);
        u(f10);
        r(f6);
        s(f10);
        p(f11);
        q((f11 + f12) % 360.0f);
        this.f2211g.clear();
        this.f2212h.clear();
        this.f2213i = false;
    }
}
