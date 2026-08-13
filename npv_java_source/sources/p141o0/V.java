package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class V implements p141o0.Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Path f52172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.RectF f52173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f52174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.graphics.Matrix f52175e;

    public V(android.graphics.Path path) {
        this.f52172b = path;
    }

    public /* synthetic */ V(android.graphics.Path path, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new android.graphics.Path() : path);
    }

    private final void t(p131n0.i iVar) {
        if (java.lang.Float.isNaN(iVar.i()) || java.lang.Float.isNaN(iVar.l()) || java.lang.Float.isNaN(iVar.j()) || java.lang.Float.isNaN(iVar.e())) {
            p141o0.Y.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // p141o0.Q1
    public void a() {
        this.f52172b.reset();
    }

    @Override // p141o0.Q1
    public void b(float f6, float f10, float f11, float f12) {
        this.f52172b.rQuadTo(f6, f10, f11, f12);
    }

    @Override // p141o0.Q1
    public boolean c() {
        return this.f52172b.isConvex();
    }

    @Override // p141o0.Q1
    public void close() {
        this.f52172b.close();
    }

    @Override // p141o0.Q1
    public void d(p131n0.i iVar, o0.Q1.b bVar) {
        t(iVar);
        if (this.f52173c == null) {
            this.f52173c = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.f52173c;
        p247y7.AbstractC7350t.c(rectF);
        rectF.set(iVar.i(), iVar.l(), iVar.j(), iVar.e());
        android.graphics.Path path = this.f52172b;
        android.graphics.RectF rectF2 = this.f52173c;
        p247y7.AbstractC7350t.c(rectF2);
        path.addRect(rectF2, p141o0.Y.e(bVar));
    }

    @Override // p141o0.Q1
    public void e(float f6, float f10) {
        this.f52172b.rMoveTo(f6, f10);
    }

    @Override // p141o0.Q1
    public void f(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f52172b.rCubicTo(f6, f10, f11, f12, f13, f14);
    }

    @Override // p141o0.Q1
    public void g(int i6) {
        this.f52172b.setFillType(p141o0.S1.d(i6, p141o0.S1.f52156a.a()) ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    @Override // p141o0.Q1
    public p131n0.i getBounds() {
        if (this.f52173c == null) {
            this.f52173c = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.f52173c;
        p247y7.AbstractC7350t.c(rectF);
        this.f52172b.computeBounds(rectF, true);
        return new p131n0.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p141o0.Q1
    public void h(float f6, float f10, float f11, float f12) {
        this.f52172b.quadTo(f6, f10, f11, f12);
    }

    @Override // p141o0.Q1
    public int i() {
        return this.f52172b.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? p141o0.S1.f52156a.a() : p141o0.S1.f52156a.b();
    }

    @Override // p141o0.Q1
    public boolean isEmpty() {
        return this.f52172b.isEmpty();
    }

    @Override // p141o0.Q1
    public boolean j(p141o0.Q1 q6, p141o0.Q1 q10, int i6) {
        android.graphics.Path.Op op;
        o0.U1.a aVar = p141o0.U1.f52166a;
        if (p141o0.U1.f(i6, aVar.a())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (p141o0.U1.f(i6, aVar.b())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (p141o0.U1.f(i6, aVar.c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = p141o0.U1.f(i6, aVar.d()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path = this.f52172b;
        if (!(q6 instanceof p141o0.V)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path pathS = ((p141o0.V) q6).s();
        if (q10 instanceof p141o0.V) {
            return path.op(pathS, ((p141o0.V) q10).s(), op);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p141o0.Q1
    public void k(p141o0.Q1 q6, long j6) {
        android.graphics.Path path = this.f52172b;
        if (!(q6 instanceof p141o0.V)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((p141o0.V) q6).s(), p131n0.g.m(j6), p131n0.g.n(j6));
    }

    @Override // p141o0.Q1
    public void l(float f6, float f10) {
        this.f52172b.moveTo(f6, f10);
    }

    @Override // p141o0.Q1
    public void m(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f52172b.cubicTo(f6, f10, f11, f12, f13, f14);
    }

    @Override // p141o0.Q1
    public void n() {
        this.f52172b.rewind();
    }

    @Override // p141o0.Q1
    public void o(long j6) {
        android.graphics.Matrix matrix = this.f52175e;
        if (matrix == null) {
            this.f52175e = new android.graphics.Matrix();
        } else {
            p247y7.AbstractC7350t.c(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.f52175e;
        p247y7.AbstractC7350t.c(matrix2);
        matrix2.setTranslate(p131n0.g.m(j6), p131n0.g.n(j6));
        android.graphics.Path path = this.f52172b;
        android.graphics.Matrix matrix3 = this.f52175e;
        p247y7.AbstractC7350t.c(matrix3);
        path.transform(matrix3);
    }

    @Override // p141o0.Q1
    public void p(p131n0.k kVar, o0.Q1.b bVar) {
        if (this.f52173c == null) {
            this.f52173c = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.f52173c;
        p247y7.AbstractC7350t.c(rectF);
        rectF.set(kVar.e(), kVar.g(), kVar.f(), kVar.a());
        if (this.f52174d == null) {
            this.f52174d = new float[8];
        }
        float[] fArr = this.f52174d;
        p247y7.AbstractC7350t.c(fArr);
        fArr[0] = p131n0.a.d(kVar.h());
        fArr[1] = p131n0.a.e(kVar.h());
        fArr[2] = p131n0.a.d(kVar.i());
        fArr[3] = p131n0.a.e(kVar.i());
        fArr[4] = p131n0.a.d(kVar.c());
        fArr[5] = p131n0.a.e(kVar.c());
        fArr[6] = p131n0.a.d(kVar.b());
        fArr[7] = p131n0.a.e(kVar.b());
        android.graphics.Path path = this.f52172b;
        android.graphics.RectF rectF2 = this.f52173c;
        p247y7.AbstractC7350t.c(rectF2);
        float[] fArr2 = this.f52174d;
        p247y7.AbstractC7350t.c(fArr2);
        path.addRoundRect(rectF2, fArr2, p141o0.Y.e(bVar));
    }

    @Override // p141o0.Q1
    public void q(float f6, float f10) {
        this.f52172b.rLineTo(f6, f10);
    }

    @Override // p141o0.Q1
    public void r(float f6, float f10) {
        this.f52172b.lineTo(f6, f10);
    }

    public final android.graphics.Path s() {
        return this.f52172b;
    }
}
