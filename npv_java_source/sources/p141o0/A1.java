package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class A1 implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final o0.A1.a f52102C = new o0.A1.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final short f52103D = g(5120);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final short f52104E = g(-1025);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final short f52105F = g(31743);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final short f52106G = g(1024);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final short f52107H = g(1);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final short f52108I = g(32256);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final short f52109J = g(-1024);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final short f52110K = g(Short.MIN_VALUE);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final short f52111L = g(31744);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final short f52112M = g(0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static short e(float f6) {
        int i6;
        int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f6);
        int i10 = iFloatToRawIntBits >>> 31;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        int i12 = 8388607 & iFloatToRawIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != 255) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else {
                if (i15 > 0) {
                    i14 = i12 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i6 = (((i15 << 10) | i14) + 1) | (i10 << 15);
                    } else {
                        i13 = i15;
                    }
                    return g((short) i6);
                }
                if (i15 >= -10) {
                    int i16 = (8388608 | i12) >> (1 - i15);
                    if ((i16 & 4096) != 0) {
                        i16 += 8192;
                    }
                    i13 = 0;
                    i14 = i16 >> 13;
                } else {
                    i13 = 0;
                }
            }
        } else if (i12 != 0) {
            i14 = 512;
        }
        i6 = (i10 << 15) | (i13 << 10) | i14;
        return g((short) i6);
    }

    public static short g(short s6) {
        return s6;
    }
}
