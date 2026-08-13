package J8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5822a;

        static {
            int[] iArr = new int[F8.u0.values().length];
            try {
                iArr[F8.u0.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F8.u0.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F8.u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5822a = iArr;
        }
    }

    public static final J8.s a(F8.u0 u0Var) {
        p247y7.AbstractC7350t.f(u0Var, "<this>");
        int i6 = J8.p.a.f5822a[u0Var.ordinal()];
        if (i6 == 1) {
            return J8.s.INV;
        }
        if (i6 == 2) {
            return J8.s.IN;
        }
        if (i6 == 3) {
            return J8.s.OUT;
        }
        throw new p087i7.s();
    }
}
