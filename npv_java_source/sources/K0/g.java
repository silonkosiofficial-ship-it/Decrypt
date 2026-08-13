package K0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K0.g.a f5951d = new K0.g.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K0.g f5952e = new K0.g(0.0f, E7.j.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E7.e f5954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5955c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final K0.g a() {
            return K0.g.f5952e;
        }
    }

    public g(float f6, E7.e eVar, int i6) {
        this.f5953a = f6;
        this.f5954b = eVar;
        this.f5955c = i6;
        if (!(!java.lang.Float.isNaN(f6))) {
            throw new java.lang.IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ g(float f6, E7.e eVar, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, eVar, (i10 & 4) != 0 ? 0 : i6);
    }

    public final float b() {
        return this.f5953a;
    }

    public final E7.e c() {
        return this.f5954b;
    }

    public final int d() {
        return this.f5955c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.g)) {
            return false;
        }
        K0.g gVar = (K0.g) obj;
        return this.f5953a == gVar.f5953a && p247y7.AbstractC7350t.b(this.f5954b, gVar.f5954b) && this.f5955c == gVar.f5955c;
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.f5953a) * 31) + this.f5954b.hashCode()) * 31) + this.f5955c;
    }

    public java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.f5953a + ", range=" + this.f5954b + ", steps=" + this.f5955c + ')';
    }
}
