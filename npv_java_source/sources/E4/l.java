package E4;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E4.m[] f2187a = new E4.m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Matrix[] f2188b = new android.graphics.Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.Matrix[] f2189c = new android.graphics.Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.graphics.PointF f2190d = new android.graphics.PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.graphics.Path f2191e = new android.graphics.Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.graphics.Path f2192f = new android.graphics.Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E4.m f2193g = new E4.m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f2194h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f2195i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.graphics.Path f2196j = new android.graphics.Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.graphics.Path f2197k = new android.graphics.Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2198l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final E4.l f2199a = new E4.l();
    }

    public interface b {
        void a(E4.m mVar, android.graphics.Matrix matrix, int i6);

        void b(E4.m mVar, android.graphics.Matrix matrix, int i6);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E4.k f2200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.graphics.Path f2201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final android.graphics.RectF f2202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final E4.l.b f2203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f2204e;

        c(E4.k kVar, float f6, android.graphics.RectF rectF, E4.l.b bVar, android.graphics.Path path) {
            this.f2203d = bVar;
            this.f2200a = kVar;
            this.f2204e = f6;
            this.f2202c = rectF;
            this.f2201b = path;
        }
    }

    public l() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f2187a[i6] = new E4.m();
            this.f2188b[i6] = new android.graphics.Matrix();
            this.f2189c[i6] = new android.graphics.Matrix();
        }
    }

    private float a(int i6) {
        return ((i6 + 1) % 4) * 90;
    }

    private void b(E4.l.c cVar, int i6) {
        this.f2194h[0] = this.f2187a[i6].k();
        this.f2194h[1] = this.f2187a[i6].l();
        this.f2188b[i6].mapPoints(this.f2194h);
        android.graphics.Path path = cVar.f2201b;
        float[] fArr = this.f2194h;
        if (i6 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f2187a[i6].d(this.f2188b[i6], cVar.f2201b);
        E4.l.b bVar = cVar.f2203d;
        if (bVar != null) {
            bVar.b(this.f2187a[i6], this.f2188b[i6], i6);
        }
    }

    private void c(E4.l.c cVar, int i6) {
        E4.m mVar;
        android.graphics.Matrix matrix;
        android.graphics.Path path;
        int i10 = (i6 + 1) % 4;
        this.f2194h[0] = this.f2187a[i6].i();
        this.f2194h[1] = this.f2187a[i6].j();
        this.f2188b[i6].mapPoints(this.f2194h);
        this.f2195i[0] = this.f2187a[i10].k();
        this.f2195i[1] = this.f2187a[i10].l();
        this.f2188b[i10].mapPoints(this.f2195i);
        float[] fArr = this.f2194h;
        float f6 = fArr[0];
        float[] fArr2 = this.f2195i;
        float fMax = java.lang.Math.max(((float) java.lang.Math.hypot(f6 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f2202c, i6);
        this.f2193g.n(0.0f, 0.0f);
        E4.f fVarJ = j(i6, cVar.f2200a);
        fVarJ.b(fMax, fI, cVar.f2204e, this.f2193g);
        this.f2196j.reset();
        this.f2193g.d(this.f2189c[i6], this.f2196j);
        if (this.f2198l && (fVarJ.a() || l(this.f2196j, i6) || l(this.f2196j, i10))) {
            android.graphics.Path path2 = this.f2196j;
            path2.op(path2, this.f2192f, android.graphics.Path.Op.DIFFERENCE);
            this.f2194h[0] = this.f2193g.k();
            this.f2194h[1] = this.f2193g.l();
            this.f2189c[i6].mapPoints(this.f2194h);
            android.graphics.Path path3 = this.f2191e;
            float[] fArr3 = this.f2194h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f2193g;
            matrix = this.f2189c[i6];
            path = this.f2191e;
        } else {
            mVar = this.f2193g;
            matrix = this.f2189c[i6];
            path = cVar.f2201b;
        }
        mVar.d(matrix, path);
        E4.l.b bVar = cVar.f2203d;
        if (bVar != null) {
            bVar.a(this.f2193g, this.f2189c[i6], i6);
        }
    }

    private void f(int i6, android.graphics.RectF rectF, android.graphics.PointF pointF) {
        float f6;
        float f10;
        if (i6 != 1) {
            if (i6 != 2) {
                f6 = i6 != 3 ? rectF.right : rectF.left;
                f10 = rectF.top;
            } else {
                f6 = rectF.left;
            }
            pointF.set(f6, f10);
        }
        f6 = rectF.right;
        f10 = rectF.bottom;
        pointF.set(f6, f10);
    }

    private E4.c g(int i6, E4.k kVar) {
        if (i6 == 1) {
            return kVar.l();
        }
        if (i6 != 2) {
            return i6 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private E4.d h(int i6, E4.k kVar) {
        if (i6 == 1) {
            return kVar.k();
        }
        if (i6 != 2) {
            return i6 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(android.graphics.RectF rectF, int i6) {
        float fCenterX;
        float f6;
        float[] fArr = this.f2194h;
        E4.m mVar = this.f2187a[i6];
        fArr[0] = mVar.f2207c;
        fArr[1] = mVar.f2208d;
        this.f2188b[i6].mapPoints(fArr);
        if (i6 == 1 || i6 == 3) {
            fCenterX = rectF.centerX();
            f6 = this.f2194h[0];
        } else {
            fCenterX = rectF.centerY();
            f6 = this.f2194h[1];
        }
        return java.lang.Math.abs(fCenterX - f6);
    }

    private E4.f j(int i6, E4.k kVar) {
        if (i6 == 1) {
            return kVar.h();
        }
        if (i6 != 2) {
            return i6 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public static E4.l k() {
        return E4.l.a.f2199a;
    }

    private boolean l(android.graphics.Path path, int i6) {
        this.f2197k.reset();
        this.f2187a[i6].d(this.f2188b[i6], this.f2197k);
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        this.f2197k.computeBounds(rectF, true);
        path.op(this.f2197k, android.graphics.Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(E4.l.c cVar, int i6) {
        h(i6, cVar.f2200a).b(this.f2187a[i6], 90.0f, cVar.f2204e, cVar.f2202c, g(i6, cVar.f2200a));
        float fA = a(i6);
        this.f2188b[i6].reset();
        f(i6, cVar.f2202c, this.f2190d);
        android.graphics.Matrix matrix = this.f2188b[i6];
        android.graphics.PointF pointF = this.f2190d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2188b[i6].preRotate(fA);
    }

    private void n(int i6) {
        this.f2194h[0] = this.f2187a[i6].i();
        this.f2194h[1] = this.f2187a[i6].j();
        this.f2188b[i6].mapPoints(this.f2194h);
        float fA = a(i6);
        this.f2189c[i6].reset();
        android.graphics.Matrix matrix = this.f2189c[i6];
        float[] fArr = this.f2194h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2189c[i6].preRotate(fA);
    }

    public void d(E4.k kVar, float f6, android.graphics.RectF rectF, E4.l.b bVar, android.graphics.Path path) {
        path.rewind();
        this.f2191e.rewind();
        this.f2192f.rewind();
        this.f2192f.addRect(rectF, android.graphics.Path.Direction.CW);
        E4.l.c cVar = new E4.l.c(kVar, f6, rectF, bVar, path);
        for (int i6 = 0; i6 < 4; i6++) {
            m(cVar, i6);
            n(i6);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            b(cVar, i10);
            c(cVar, i10);
        }
        path.close();
        this.f2191e.close();
        if (this.f2191e.isEmpty()) {
            return;
        }
        path.op(this.f2191e, android.graphics.Path.Op.UNION);
    }

    public void e(E4.k kVar, float f6, android.graphics.RectF rectF, android.graphics.Path path) {
        d(kVar, f6, rectF, null, path);
    }
}
