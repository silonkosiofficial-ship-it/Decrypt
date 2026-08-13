package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.graphics.f.a f19784b = new androidx.compose.ui.graphics.f.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f19785c = p141o0.m2.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19786a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final long a() {
            return androidx.compose.ui.graphics.f.f19785c;
        }
    }

    private /* synthetic */ f(long j6) {
        this.f19786a = j6;
    }

    public static final /* synthetic */ androidx.compose.ui.graphics.f b(long j6) {
        return new androidx.compose.ui.graphics.f(j6);
    }

    public static long c(long j6) {
        return j6;
    }

    public static boolean d(long j6, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.f) && j6 == ((androidx.compose.ui.graphics.f) obj).j();
    }

    public static final boolean e(long j6, long j10) {
        return j6 == j10;
    }

    public static final float f(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float g(long j6) {
        return java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int h(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String i(long j6) {
        return "TransformOrigin(packedValue=" + j6 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f19786a, obj);
    }

    public int hashCode() {
        return h(this.f19786a);
    }

    public final /* synthetic */ long j() {
        return this.f19786a;
    }

    public java.lang.String toString() {
        return i(this.f19786a);
    }
}
