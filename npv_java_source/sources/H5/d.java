package H5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static H5.d f4393a = a().a();

    public static abstract class a {
        public abstract H5.d a();

        public abstract H5.d.a b(java.lang.String str);

        public abstract H5.d.a c(long j6);

        public abstract H5.d.a d(java.lang.String str);

        public abstract H5.d.a e(java.lang.String str);

        public abstract H5.d.a f(java.lang.String str);

        public abstract H5.d.a g(H5.c.a aVar);

        public abstract H5.d.a h(long j6);
    }

    public static H5.d.a a() {
        return new H5.a.b().h(0L).g(H5.c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract java.lang.String b();

    public abstract long c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    public abstract H5.c.a g();

    public abstract long h();

    public boolean i() {
        return g() == H5.c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == H5.c.a.NOT_GENERATED || g() == H5.c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == H5.c.a.REGISTERED;
    }

    public boolean l() {
        return g() == H5.c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == H5.c.a.ATTEMPT_MIGRATION;
    }

    public abstract H5.d.a n();

    public H5.d o(java.lang.String str, long j6, long j10) {
        return n().b(str).c(j6).h(j10).a();
    }

    public H5.d p() {
        return n().b(null).a();
    }

    public H5.d q(java.lang.String str) {
        return n().e(str).g(H5.c.a.REGISTER_ERROR).a();
    }

    public H5.d r() {
        return n().g(H5.c.a.NOT_GENERATED).a();
    }

    public H5.d s(java.lang.String str, java.lang.String str2, long j6, java.lang.String str3, long j10) {
        return n().d(str).g(H5.c.a.REGISTERED).b(str3).f(str2).c(j10).h(j6).a();
    }

    public H5.d t(java.lang.String str) {
        return n().d(str).g(H5.c.a.UNREGISTERED).a();
    }
}
