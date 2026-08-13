package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f52165c;

        static {
            int[] iArr = new int[android.graphics.Paint.Style.values().length];
            try {
                iArr[android.graphics.Paint.Style.STROKE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f52163a = iArr;
            int[] iArr2 = new int[android.graphics.Paint.Cap.values().length];
            try {
                iArr2[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f52164b = iArr2;
            int[] iArr3 = new int[android.graphics.Paint.Join.values().length];
            try {
                iArr3[android.graphics.Paint.Join.MITER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[android.graphics.Paint.Join.ROUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            f52165c = iArr3;
        }
    }

    public static final p141o0.N1 a() {
        return new p141o0.T();
    }

    public static final p141o0.N1 b(android.graphics.Paint paint) {
        return new p141o0.T(paint);
    }

    public static final float c(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(android.graphics.Paint paint) {
        return p141o0.A0.b(paint.getColor());
    }

    public static final int e(android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? p141o0.AbstractC7020z1.f52282a.b() : p141o0.AbstractC7020z1.f52282a.a();
    }

    public static final int f(android.graphics.Paint paint) {
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i6 = strokeCap == null ? -1 : o0.U.a.f52164b[strokeCap.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return p141o0.g2.f52226a.b();
            }
            if (i6 == 3) {
                return p141o0.g2.f52226a.c();
            }
        }
        return p141o0.g2.f52226a.a();
    }

    public static final int g(android.graphics.Paint paint) {
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i6 = strokeJoin == null ? -1 : o0.U.a.f52165c[strokeJoin.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return p141o0.h2.f52230a.a();
            }
            if (i6 == 3) {
                return p141o0.h2.f52230a.c();
            }
        }
        return p141o0.h2.f52230a.b();
    }

    public static final float h(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final android.graphics.Paint j() {
        return new android.graphics.Paint(7);
    }

    public static final void k(android.graphics.Paint paint, float f6) {
        paint.setAlpha((int) java.lang.Math.rint(f6 * 255.0f));
    }

    public static final void l(android.graphics.Paint paint, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            p141o0.o2.f52250a.a(paint, i6);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(p141o0.F.c(i6)));
        }
    }

    public static final void m(android.graphics.Paint paint, long j6) {
        paint.setColor(p141o0.A0.k(j6));
    }

    public static final void n(android.graphics.Paint paint, p141o0.AbstractC7019z0 abstractC7019z0) {
        paint.setColorFilter(abstractC7019z0 != null ? p141o0.I.b(abstractC7019z0) : null);
    }

    public static final void o(android.graphics.Paint paint, int i6) {
        paint.setFilterBitmap(!p141o0.AbstractC7020z1.d(i6, p141o0.AbstractC7020z1.f52282a.b()));
    }

    public static final void p(android.graphics.Paint paint, p141o0.R1 r6) {
        androidx.appcompat.app.D.a(r6);
        paint.setPathEffect(null);
    }

    public static final void q(android.graphics.Paint paint, android.graphics.Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(android.graphics.Paint paint, int i6) {
        android.graphics.Paint.Cap cap;
        o0.g2.a aVar = p141o0.g2.f52226a;
        if (p141o0.g2.e(i6, aVar.c())) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (p141o0.g2.e(i6, aVar.b())) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            p141o0.g2.e(i6, aVar.a());
            cap = android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static final void s(android.graphics.Paint paint, int i6) {
        android.graphics.Paint.Join join;
        o0.h2.a aVar = p141o0.h2.f52230a;
        if (p141o0.h2.e(i6, aVar.b())) {
            join = android.graphics.Paint.Join.MITER;
        } else if (p141o0.h2.e(i6, aVar.a())) {
            join = android.graphics.Paint.Join.BEVEL;
        } else if (p141o0.h2.e(i6, aVar.c())) {
            join = android.graphics.Paint.Join.ROUND;
        } else {
            join = android.graphics.Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(android.graphics.Paint paint, float f6) {
        paint.setStrokeMiter(f6);
    }

    public static final void u(android.graphics.Paint paint, float f6) {
        paint.setStrokeWidth(f6);
    }

    public static final void v(android.graphics.Paint paint, int i6) {
        paint.setStyle(p141o0.O1.d(i6, p141o0.O1.f52148a.b()) ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }
}
