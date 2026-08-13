package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f9876a = V.AbstractC1756y.f(S.B1.a.f9877D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.B1.a f9877D = new S.B1.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S.A1 b() {
            return new S.A1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9878a;

        static {
            int[] iArr = new int[U.L.values().length];
            try {
                iArr[U.L.DisplayLarge.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[U.L.DisplayMedium.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[U.L.DisplaySmall.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[U.L.HeadlineLarge.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[U.L.HeadlineMedium.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[U.L.HeadlineSmall.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[U.L.TitleLarge.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[U.L.TitleMedium.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[U.L.TitleSmall.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[U.L.BodyLarge.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[U.L.BodyMedium.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[U.L.BodySmall.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[U.L.LabelLarge.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[U.L.LabelMedium.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[U.L.LabelSmall.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            f9878a = iArr;
        }
    }

    private static final M0.P a(S.A1 a6, U.L l6) {
        switch (S.B1.b.f9878a[l6.ordinal()]) {
            case 1:
                return a6.d();
            case 2:
                return a6.e();
            case 3:
                return a6.f();
            case 4:
                return a6.g();
            case 5:
                return a6.h();
            case 6:
                return a6.i();
            case 7:
                return a6.m();
            case 8:
                return a6.n();
            case 9:
                return a6.o();
            case 10:
                return a6.a();
            case 11:
                return a6.b();
            case 12:
                return a6.c();
            case 13:
                return a6.j();
            case 14:
                return a6.k();
            case 15:
                return a6.l();
            default:
                throw new p087i7.s();
        }
    }

    public static final V.O0 b() {
        return f9876a;
    }

    public static final M0.P c(U.L l6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1049072145, i6, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        M0.P pA = a(S.C1562o0.f11478a.c(interfaceC1734n, 6), l6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return pA;
    }
}
