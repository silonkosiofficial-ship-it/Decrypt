package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0.b f16660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f16661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p170r.Z f16662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object[] f16663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16664e;

    static {
        Z0.b bVar = new Z0.b();
        f16660a = bVar;
        f16661b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f16662c = new p170r.Z(0, 1, null);
        java.lang.Object[] objArr = new java.lang.Object[0];
        f16663d = objArr;
        synchronized (objArr) {
            bVar.h(f16662c, 1.15f, new Z0.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(f16662c, 1.3f, new Z0.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(f16662c, 1.5f, new Z0.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(f16662c, 1.8f, new Z0.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(f16662c, 2.0f, new Z0.c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            p087i7.M m6 = p087i7.M.f46721a;
        }
        if (!(bVar.e(f16662c.l(0)) - 0.01f > 1.03f)) {
            Y0.o.b("You should only apply non-linear scaling to font scales > 1");
        }
        f16664e = 8;
    }

    private b() {
    }

    private final Z0.a a(Z0.a aVar, Z0.a aVar2, float f6) {
        float[] fArr = f16661b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            float f10 = f16661b[i6];
            fArr2[i6] = Z0.d.f16669a.b(aVar.b(f10), aVar2.b(f10), f6);
        }
        return new Z0.c(f16661b, fArr2);
    }

    private final Z0.a c(float f6) {
        return (Z0.a) f16662c.e(d(f6));
    }

    private final int d(float f6) {
        return (int) (f6 * 100.0f);
    }

    private final float e(int i6) {
        return i6 / 100.0f;
    }

    private final void g(float f6, Z0.a aVar) {
        synchronized (f16663d) {
            p170r.Z zClone = f16662c.clone();
            f16660a.h(zClone, f6, aVar);
            f16662c = zClone;
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    private final void h(p170r.Z z6, float f6, Z0.a aVar) {
        z6.m(d(f6), aVar);
    }

    public final Z0.a b(float f6) {
        Z0.a cVar;
        Z0.a aVarA;
        if (!f(f6)) {
            return null;
        }
        Z0.a aVarC = f16660a.c(f6);
        if (aVarC != null) {
            return aVarC;
        }
        int iJ = f16662c.j(d(f6));
        if (iJ >= 0) {
            return (Z0.a) f16662c.p(iJ);
        }
        int i6 = -(iJ + 1);
        int i10 = i6 - 1;
        float fE = 1.0f;
        if (i6 >= f16662c.n()) {
            aVarA = new Z0.c(new float[]{1.0f}, new float[]{f6});
        } else {
            if (i10 < 0) {
                float[] fArr = f16661b;
                cVar = new Z0.c(fArr, fArr);
            } else {
                fE = e(f16662c.l(i10));
                cVar = (Z0.a) f16662c.p(i10);
            }
            aVarA = a(cVar, (Z0.a) f16662c.p(i6), Z0.d.f16669a.a(0.0f, 1.0f, fE, e(f16662c.l(i6)), f6));
        }
        g(f6, aVarA);
        return aVarA;
    }

    public final boolean f(float f6) {
        return f6 >= 1.03f;
    }
}
