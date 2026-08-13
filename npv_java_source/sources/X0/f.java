package X0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0.f.a f15584b = new X0.f.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f15588f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15589a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a() {
            return X0.f.f15585c;
        }

        public final int b() {
            return X0.f.f15588f;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.f.b.a f15590a = new X0.f.b.a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15591b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15592c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f15593d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f15594e = d(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return X0.f.b.f15593d;
            }

            public final int b() {
                return X0.f.b.f15592c;
            }

            public final int c() {
                return X0.f.b.f15591b;
            }
        }

        public static int d(int i6) {
            return i6;
        }

        public static final boolean e(int i6, int i10) {
            return i6 == i10;
        }

        public static java.lang.String f(int i6) {
            if (e(i6, f15591b)) {
                return "Strategy.Simple";
            }
            if (e(i6, f15592c)) {
                return "Strategy.HighQuality";
            }
            if (e(i6, f15593d)) {
                return "Strategy.Balanced";
            }
            return e(i6, f15594e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.f.c.a f15595a = new X0.f.c.a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15596b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15597c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f15598d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f15599e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f15600f = e(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return X0.f.c.f15596b;
            }

            public final int b() {
                return X0.f.c.f15597c;
            }

            public final int c() {
                return X0.f.c.f15598d;
            }

            public final int d() {
                return X0.f.c.f15599e;
            }
        }

        public static int e(int i6) {
            return i6;
        }

        public static final boolean f(int i6, int i10) {
            return i6 == i10;
        }

        public static java.lang.String g(int i6) {
            if (f(i6, f15596b)) {
                return "Strictness.None";
            }
            if (f(i6, f15597c)) {
                return "Strictness.Loose";
            }
            if (f(i6, f15598d)) {
                return "Strictness.Normal";
            }
            if (f(i6, f15599e)) {
                return "Strictness.Strict";
            }
            return f(i6, f15600f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final X0.f.d.a f15601a = new X0.f.d.a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f15602b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f15603c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f15604d = c(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final int a() {
                return X0.f.d.f15602b;
            }

            public final int b() {
                return X0.f.d.f15603c;
            }
        }

        public static int c(int i6) {
            return i6;
        }

        public static final boolean d(int i6, int i10) {
            return i6 == i10;
        }

        public static java.lang.String e(int i6) {
            if (d(i6, f15602b)) {
                return "WordBreak.None";
            }
            if (d(i6, f15603c)) {
                return "WordBreak.Phrase";
            }
            return d(i6, f15604d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        X0.f.b.a aVar = X0.f.b.f15590a;
        int iC = aVar.c();
        X0.f.c.a aVar2 = X0.f.c.f15595a;
        int iC2 = aVar2.c();
        X0.f.d.a aVar3 = X0.f.d.f15601a;
        f15585c = d(X0.g.e(iC, iC2, aVar3.a()));
        f15586d = d(X0.g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f15587e = d(X0.g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f15588f = d(0);
    }

    private /* synthetic */ f(int i6) {
        this.f15589a = i6;
    }

    public static final /* synthetic */ X0.f c(int i6) {
        return new X0.f(i6);
    }

    private static int d(int i6) {
        return i6;
    }

    public static boolean e(int i6, java.lang.Object obj) {
        return (obj instanceof X0.f) && i6 == ((X0.f) obj).l();
    }

    public static final boolean f(int i6, int i10) {
        return i6 == i10;
    }

    public static final int g(int i6) {
        return X0.f.b.d(X0.g.f(i6));
    }

    public static final int h(int i6) {
        return X0.f.c.e(X0.g.g(i6));
    }

    public static final int i(int i6) {
        return X0.f.d.c(X0.g.h(i6));
    }

    public static int j(int i6) {
        return i6;
    }

    public static java.lang.String k(int i6) {
        return "LineBreak(strategy=" + ((java.lang.Object) X0.f.b.f(g(i6))) + ", strictness=" + ((java.lang.Object) X0.f.c.g(h(i6))) + ", wordBreak=" + ((java.lang.Object) X0.f.d.e(i(i6))) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return e(this.f15589a, obj);
    }

    public int hashCode() {
        return j(this.f15589a);
    }

    public final /* synthetic */ int l() {
        return this.f15589a;
    }

    public java.lang.String toString() {
        return k(this.f15589a);
    }
}
