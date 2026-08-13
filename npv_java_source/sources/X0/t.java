package X0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0.t.a f15657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X0.t f15658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X0.t f15659e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15661b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X0.t a() {
            return X0.t.f15658d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.t.b.a f15662a = new X0.t.b.a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15663b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15664c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f15665d = d(3);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return X0.t.b.f15664c;
            }

            public final int b() {
                return X0.t.b.f15663b;
            }

            public final int c() {
                return X0.t.b.f15665d;
            }
        }

        private static int d(int i6) {
            return i6;
        }

        public static final boolean e(int i6, int i10) {
            return i6 == i10;
        }

        public static int f(int i6) {
            return i6;
        }
    }

    static {
        p247y7.AbstractC7342k abstractC7342k = null;
        f15657c = new X0.t.a(abstractC7342k);
        X0.t.b.a aVar = X0.t.b.f15662a;
        f15658d = new X0.t(aVar.a(), false, abstractC7342k);
        f15659e = new X0.t(aVar.b(), true, abstractC7342k);
    }

    private t(int i6, boolean z6) {
        this.f15660a = i6;
        this.f15661b = z6;
    }

    public /* synthetic */ t(int i6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, z6);
    }

    public final int b() {
        return this.f15660a;
    }

    public final boolean c() {
        return this.f15661b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0.t)) {
            return false;
        }
        X0.t tVar = (X0.t) obj;
        return X0.t.b.e(this.f15660a, tVar.f15660a) && this.f15661b == tVar.f15661b;
    }

    public int hashCode() {
        return (X0.t.b.f(this.f15660a) * 31) + p190t.h.a(this.f15661b);
    }

    public java.lang.String toString() {
        if (p247y7.AbstractC7350t.b(this, f15658d)) {
            return "TextMotion.Static";
        }
        return p247y7.AbstractC7350t.b(this, f15659e) ? "TextMotion.Animated" : "Invalid";
    }
}
