package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y0.A.a f16198b = new Y0.A.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16199c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16200a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return Y0.A.f16199c;
        }
    }

    private /* synthetic */ A(long j6) {
        this.f16200a = j6;
    }

    public static final /* synthetic */ Y0.A b(long j6) {
        return new Y0.A(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static final long d(long j6, float f6, float f10) {
        return c((((long) java.lang.Float.floatToRawIntBits(f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    public static /* synthetic */ long e(long j6, float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = java.lang.Float.intBitsToFloat((int) (j6 >> 32));
        }
        if ((i6 & 2) != 0) {
            f10 = java.lang.Float.intBitsToFloat((int) (4294967295L & j6));
        }
        return d(j6, f6, f10);
    }

    public static boolean f(long j6, java.lang.Object obj) {
        return (obj instanceof Y0.A) && j6 == ((Y0.A) obj).o();
    }

    public static final boolean g(long j6, long j10) {
        return j6 == j10;
    }

    public static final float h(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float i(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int j(long j6) {
        return p170r.r.a(j6);
    }

    public static final long k(long j6, long j10) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) - java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        return c((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long l(long j6, long j10) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) + java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        return c((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long m(long j6, float f6) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) * f6;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) * f6;
        return c((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static java.lang.String n(long j6) {
        return '(' + h(j6) + ", " + i(j6) + ") px/sec";
    }

    public boolean equals(java.lang.Object obj) {
        return f(this.f16200a, obj);
    }

    public int hashCode() {
        return j(this.f16200a);
    }

    public final /* synthetic */ long o() {
        return this.f16200a;
    }

    public java.lang.String toString() {
        return n(this.f16200a);
    }
}
