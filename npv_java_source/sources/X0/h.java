package X0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0.h.b f15605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final X0.h f15606d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15608b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.h.a.C0297a f15609a = new X0.h.a.C0297a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f15610b = c(0.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f15611c = c(0.5f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f15612d = c(-1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f15613e = c(1.0f);

        /* JADX INFO: renamed from: X0.h$a$a, reason: collision with other inner class name */
        public static final class C0297a {
            private C0297a() {
            }

            public /* synthetic */ C0297a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final float a() {
                return X0.h.a.f15611c;
            }

            public final float b() {
                return X0.h.a.f15612d;
            }
        }

        public static float c(float f6) {
            if ((0.0f > f6 || f6 > 1.0f) && f6 != -1.0f) {
                throw new java.lang.IllegalStateException("topRatio should be in [0..1] range or -1".toString());
            }
            return f6;
        }

        public static final boolean d(float f6, float f10) {
            return java.lang.Float.compare(f6, f10) == 0;
        }

        public static int e(float f6) {
            return java.lang.Float.floatToIntBits(f6);
        }

        public static java.lang.String f(float f6) {
            if (f6 == f15610b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f6 == f15611c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f6 == f15612d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f6 == f15613e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X0.h a() {
            return X0.h.f15606d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.h.c.a f15614a = new X0.h.c.a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15615b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15616c = c(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f15617d = c(17);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f15618e = c(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return X0.h.c.f15617d;
            }

            public final int b() {
                return X0.h.c.f15618e;
            }
        }

        private static int c(int i6) {
            return i6;
        }

        public static final boolean d(int i6, int i10) {
            return i6 == i10;
        }

        public static int e(int i6) {
            return i6;
        }

        public static final boolean f(int i6) {
            return (i6 & 1) > 0;
        }

        public static final boolean g(int i6) {
            return (i6 & 16) > 0;
        }

        public static java.lang.String h(int i6) {
            if (i6 == f15615b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i6 == f15616c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i6 == f15617d) {
                return "LineHeightStyle.Trim.Both";
            }
            return i6 == f15618e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    static {
        p247y7.AbstractC7342k abstractC7342k = null;
        f15605c = new X0.h.b(abstractC7342k);
        f15606d = new X0.h(X0.h.a.f15609a.b(), X0.h.c.f15614a.a(), abstractC7342k);
    }

    private h(float f6, int i6) {
        this.f15607a = f6;
        this.f15608b = i6;
    }

    public /* synthetic */ h(float f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, i6);
    }

    public final float b() {
        return this.f15607a;
    }

    public final int c() {
        return this.f15608b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0.h)) {
            return false;
        }
        X0.h hVar = (X0.h) obj;
        return X0.h.a.d(this.f15607a, hVar.f15607a) && X0.h.c.d(this.f15608b, hVar.f15608b);
    }

    public int hashCode() {
        return (X0.h.a.e(this.f15607a) * 31) + X0.h.c.e(this.f15608b);
    }

    public java.lang.String toString() {
        return "LineHeightStyle(alignment=" + ((java.lang.Object) X0.h.a.f(this.f15607a)) + ", trim=" + ((java.lang.Object) X0.h.c.h(this.f15608b)) + ')';
    }
}
