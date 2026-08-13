package M0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6674a;

        static {
            int[] iArr = new int[Y0.v.values().length];
            try {
                iArr[Y0.v.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.v.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6674a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M0.A b(M0.z zVar, M0.y yVar) {
        if (zVar == null && yVar == null) {
            return null;
        }
        return M0.AbstractC1331c.a(zVar, yVar);
    }

    public static final M0.P c(M0.P p6, M0.P p10, float f6) {
        return new M0.P(M0.D.c(p6.M(), p10.M(), f6), M0.w.b(p6.L(), p10.L(), f6));
    }

    public static final M0.P d(M0.P p6, Y0.v vVar) {
        return new M0.P(M0.D.h(p6.y()), M0.w.e(p6.v(), vVar), p6.w());
    }

    public static final int e(Y0.v vVar, int i6) {
        X0.l.a aVar = X0.l.f15636b;
        if (X0.l.j(i6, aVar.a())) {
            int i10 = M0.Q.a.f6674a[vVar.ordinal()];
            if (i10 == 1) {
                return aVar.b();
            }
            if (i10 == 2) {
                return aVar.c();
            }
            throw new p087i7.s();
        }
        if (!X0.l.j(i6, aVar.f())) {
            return i6;
        }
        int i11 = M0.Q.a.f6674a[vVar.ordinal()];
        if (i11 == 1) {
            return aVar.d();
        }
        if (i11 == 2) {
            return aVar.e();
        }
        throw new p087i7.s();
    }
}
