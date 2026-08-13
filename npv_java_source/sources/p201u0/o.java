package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.List f55338a = p097j7.AbstractC6879v.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f55339b = p141o0.g2.f52226a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f55340c = p141o0.h2.f52230a.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f55341d = p141o0.AbstractC6960f0.f52197a.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f55342e = p141o0.C7016y0.f52264b.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55343f = p141o0.S1.f52156a.b();

    public static final java.util.List a(java.lang.String str) {
        return str == null ? f55338a : new p201u0.j().a(str).c();
    }

    public static final int b() {
        return f55343f;
    }

    public static final int c() {
        return f55339b;
    }

    public static final int d() {
        return f55340c;
    }

    public static final java.util.List e() {
        return f55338a;
    }

    public static final boolean f(long j6, long j10) {
        return p141o0.C7016y0.t(j6) == p141o0.C7016y0.t(j10) && p141o0.C7016y0.s(j6) == p141o0.C7016y0.s(j10) && p141o0.C7016y0.q(j6) == p141o0.C7016y0.q(j10);
    }

    public static final boolean g(p141o0.AbstractC7019z0 abstractC7019z0) {
        if (abstractC7019z0 instanceof p141o0.C6963g0) {
            p141o0.C6963g0 c6963g0 = (p141o0.C6963g0) abstractC7019z0;
            int iB = c6963g0.b();
            p141o0.AbstractC6960f0.a aVar = p141o0.AbstractC6960f0.f52197a;
            if (p141o0.AbstractC6960f0.E(iB, aVar.z()) || p141o0.AbstractC6960f0.E(c6963g0.b(), aVar.B())) {
                return true;
            }
        } else if (abstractC7019z0 == null) {
            return true;
        }
        return false;
    }
}
