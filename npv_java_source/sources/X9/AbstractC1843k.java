package X9;

/* JADX INFO: renamed from: X9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1843k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X9.AbstractC1843k.a f16175a = new X9.AbstractC1843k.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X9.AbstractC1843k f16176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X9.Q f16177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X9.AbstractC1843k f16178d;

    /* JADX INFO: renamed from: X9.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        X9.AbstractC1843k c1850s;
        try {
            java.lang.Class.forName("java.nio.file.Files");
            c1850s = new X9.J();
        } catch (java.lang.ClassNotFoundException unused) {
            c1850s = new X9.C1850s();
        }
        f16176b = c1850s;
        X9.Q.a aVar = X9.Q.f16083D;
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        p247y7.AbstractC7350t.e(property, "getProperty(...)");
        f16177c = X9.Q.a.e(aVar, property, false, 1, null);
        java.lang.ClassLoader classLoader = Y9.h.class.getClassLoader();
        p247y7.AbstractC7350t.e(classLoader, "getClassLoader(...)");
        f16178d = new Y9.h(classLoader, false, null, 4, null);
    }

    public abstract void a(X9.Q q6, X9.Q q10);

    public final void b(X9.Q q6, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(q6, "dir");
        Y9.c.a(this, q6, z6);
    }

    public final void c(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "dir");
        d(q6, false);
    }

    public abstract void d(X9.Q q6, boolean z6);

    public final void e(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "path");
        f(q6, false);
    }

    public abstract void f(X9.Q q6, boolean z6);

    public final boolean g(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "path");
        return Y9.c.b(this, q6);
    }

    public abstract X9.C1842j h(X9.Q q6);

    public abstract X9.AbstractC1841i i(X9.Q q6);

    public final X9.AbstractC1841i j(X9.Q q6) {
        p247y7.AbstractC7350t.f(q6, "file");
        return k(q6, false, false);
    }

    public abstract X9.AbstractC1841i k(X9.Q q6, boolean z6, boolean z10);

    public abstract X9.Z l(X9.Q q6);
}
