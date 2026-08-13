package X0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0.p.a f15649c = new X0.p.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X0.p f15650d = new X0.p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15652b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X0.p a() {
            return X0.p.f15650d;
        }
    }

    public p(float f6, float f10) {
        this.f15651a = f6;
        this.f15652b = f10;
    }

    public final float b() {
        return this.f15651a;
    }

    public final float c() {
        return this.f15652b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0.p)) {
            return false;
        }
        X0.p pVar = (X0.p) obj;
        return this.f15651a == pVar.f15651a && this.f15652b == pVar.f15652b;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f15651a) * 31) + java.lang.Float.floatToIntBits(this.f15652b);
    }

    public java.lang.String toString() {
        return "TextGeometricTransform(scaleX=" + this.f15651a + ", skewX=" + this.f15652b + ')';
    }
}
