package O7;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.m0 f8167a = new O7.m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f8168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final O7.m0.h f8169c;

    public static final class a extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.a f8170c = new O7.m0.a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.b f8171c = new O7.m0.b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.c f8172c = new O7.m0.c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.d f8173c = new O7.m0.d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.e f8174c = new O7.m0.e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.f f8175c = new O7.m0.f();

        private f() {
            super("private_to_this", false);
        }

        @Override // O7.n0
        public java.lang.String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.g f8176c = new O7.m0.g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.h f8177c = new O7.m0.h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends O7.n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O7.m0.i f8178c = new O7.m0.i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        java.util.Map mapC = p097j7.S.c();
        mapC.put(O7.m0.f.f8175c, 0);
        mapC.put(O7.m0.e.f8174c, 0);
        mapC.put(O7.m0.b.f8171c, 1);
        mapC.put(O7.m0.g.f8176c, 1);
        O7.m0.h hVar = O7.m0.h.f8177c;
        mapC.put(hVar, 2);
        f8168b = p097j7.S.b(mapC);
        f8169c = hVar;
    }

    private m0() {
    }

    public final java.lang.Integer a(O7.n0 n0Var, O7.n0 n0Var2) {
        p247y7.AbstractC7350t.f(n0Var, "first");
        p247y7.AbstractC7350t.f(n0Var2, "second");
        if (n0Var == n0Var2) {
            return 0;
        }
        java.util.Map map = f8168b;
        java.lang.Integer num = (java.lang.Integer) map.get(n0Var);
        java.lang.Integer num2 = (java.lang.Integer) map.get(n0Var2);
        if (num == null || num2 == null || p247y7.AbstractC7350t.b(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(O7.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "visibility");
        return n0Var == O7.m0.e.f8174c || n0Var == O7.m0.f.f8175c;
    }
}
