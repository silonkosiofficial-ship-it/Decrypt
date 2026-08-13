package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f10543a = V.AbstractC1756y.f(S.T0.a.f10544D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.T0.a f10544D = new S.T0.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S.S0 b() {
            return new S.S0(null, null, null, null, null, 31, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10545a;

        static {
            int[] iArr = new int[U.z.values().length];
            try {
                iArr[U.z.CornerExtraLarge.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[U.z.CornerExtraLargeTop.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[U.z.CornerExtraSmall.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[U.z.CornerExtraSmallTop.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[U.z.CornerFull.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[U.z.CornerLarge.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[U.z.CornerLargeEnd.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[U.z.CornerLargeTop.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[U.z.CornerMedium.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[U.z.CornerNone.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[U.z.CornerSmall.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            f10545a = iArr;
        }
    }

    public static final G.a a(G.a aVar) {
        float f6 = (float) 0.0d;
        return G.a.c(aVar, G.c.b(Y0.i.q(f6)), G.c.b(Y0.i.q(f6)), null, null, 12, null);
    }

    public static final G.a b(G.a aVar) {
        float f6 = (float) 0.0d;
        return G.a.c(aVar, G.c.b(Y0.i.q(f6)), null, null, G.c.b(Y0.i.q(f6)), 6, null);
    }

    public static final p141o0.e2 c(S.S0 s6, U.z zVar) {
        G.a aVarA;
        switch (S.T0.b.f10545a[zVar.ordinal()]) {
            case 1:
                return s6.a();
            case 2:
                aVarA = s6.a();
                break;
            case 3:
                return s6.b();
            case 4:
                aVarA = s6.b();
                break;
            case 5:
                return G.g.e();
            case 6:
                return s6.c();
            case 7:
                return b(s6.c());
            case 8:
                aVarA = s6.c();
                break;
            case 9:
                return s6.d();
            case 10:
                return p141o0.Y1.a();
            case 11:
                return s6.e();
            default:
                throw new p087i7.s();
        }
        return g(aVarA);
    }

    public static final V.O0 d() {
        return f10543a;
    }

    public static final p141o0.e2 e(U.z zVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1629172543, i6, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        p141o0.e2 e2VarC = c(S.C1562o0.f11478a.b(interfaceC1734n, 6), zVar);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return e2VarC;
    }

    public static final G.a f(G.a aVar) {
        float f6 = (float) 0.0d;
        return G.a.c(aVar, null, G.c.b(Y0.i.q(f6)), G.c.b(Y0.i.q(f6)), null, 9, null);
    }

    public static final G.a g(G.a aVar) {
        float f6 = (float) 0.0d;
        return G.a.c(aVar, null, null, G.c.b(Y0.i.q(f6)), G.c.b(Y0.i.q(f6)), 3, null);
    }
}
