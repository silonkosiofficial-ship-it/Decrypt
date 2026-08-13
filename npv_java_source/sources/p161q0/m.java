package p161q0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p161q0.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q0.m.a f52929e = new q0.m.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f52930f = p141o0.g2.f52226a.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f52931g = p141o0.h2.f52230a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f52932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f52933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52935d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return p161q0.m.f52930f;
        }
    }

    private m(float f6, float f10, int i6, int i10, p141o0.R1 r6) {
        super(null);
        this.f52932a = f6;
        this.f52933b = f10;
        this.f52934c = i6;
        this.f52935d = i10;
    }

    public /* synthetic */ m(float f6, float f10, int i6, int i10, p141o0.R1 r6, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this((i11 & 1) != 0 ? 0.0f : f6, (i11 & 2) != 0 ? 4.0f : f10, (i11 & 4) != 0 ? f52930f : i6, (i11 & 8) != 0 ? f52931g : i10, (i11 & 16) != 0 ? null : r6, null);
    }

    public /* synthetic */ m(float f6, float f10, int i6, int i10, p141o0.R1 r6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, i6, i10, r6);
    }

    public final int b() {
        return this.f52934c;
    }

    public final int c() {
        return this.f52935d;
    }

    public final float d() {
        return this.f52933b;
    }

    public final p141o0.R1 e() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p161q0.m)) {
            return false;
        }
        p161q0.m mVar = (p161q0.m) obj;
        if (this.f52932a != mVar.f52932a || this.f52933b != mVar.f52933b || !p141o0.g2.e(this.f52934c, mVar.f52934c) || !p141o0.h2.e(this.f52935d, mVar.f52935d)) {
            return false;
        }
        mVar.getClass();
        return p247y7.AbstractC7350t.b(null, null);
    }

    public final float f() {
        return this.f52932a;
    }

    public int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.f52932a) * 31) + java.lang.Float.floatToIntBits(this.f52933b)) * 31) + p141o0.g2.f(this.f52934c)) * 31) + p141o0.h2.f(this.f52935d)) * 31;
    }

    public java.lang.String toString() {
        return "Stroke(width=" + this.f52932a + ", miter=" + this.f52933b + ", cap=" + ((java.lang.Object) p141o0.g2.g(this.f52934c)) + ", join=" + ((java.lang.Object) p141o0.h2.g(this.f52935d)) + ", pathEffect=" + ((java.lang.Object) null) + ')';
    }
}
