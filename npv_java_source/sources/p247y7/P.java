package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p247y7.Q f57255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F7.c[] f57256b;

    static {
        p247y7.Q q6 = null;
        try {
            q6 = (p247y7.Q) I7.G.class.newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (q6 == null) {
            q6 = new p247y7.Q();
        }
        f57255a = q6;
        f57256b = new F7.c[0];
    }

    public static F7.f a(p247y7.AbstractC7347p abstractC7347p) {
        return f57255a.a(abstractC7347p);
    }

    public static F7.c b(java.lang.Class cls) {
        return f57255a.b(cls);
    }

    public static F7.e c(java.lang.Class cls) {
        return f57255a.c(cls, "");
    }

    public static F7.e d(java.lang.Class cls, java.lang.String str) {
        return f57255a.c(cls, str);
    }

    public static F7.o e(F7.o oVar) {
        return f57255a.d(oVar);
    }

    public static F7.h f(p247y7.AbstractC7354x abstractC7354x) {
        return f57255a.e(abstractC7354x);
    }

    public static F7.i g(p247y7.AbstractC7356z abstractC7356z) {
        return f57255a.f(abstractC7356z);
    }

    public static F7.o h(java.lang.Class cls) {
        return f57255a.m(b(cls), java.util.Collections.emptyList(), true);
    }

    public static F7.l i(p247y7.D d6) {
        return f57255a.g(d6);
    }

    public static F7.m j(p247y7.F f6) {
        return f57255a.h(f6);
    }

    public static F7.n k(p247y7.H h6) {
        return f57255a.i(h6);
    }

    public static java.lang.String l(p247y7.InterfaceC7346o interfaceC7346o) {
        return f57255a.j(interfaceC7346o);
    }

    public static java.lang.String m(p247y7.AbstractC7352v abstractC7352v) {
        return f57255a.k(abstractC7352v);
    }

    public static void n(F7.p pVar, F7.o oVar) {
        f57255a.l(pVar, java.util.Collections.singletonList(oVar));
    }

    public static F7.o o(F7.d dVar) {
        return f57255a.m(dVar, java.util.Collections.emptyList(), false);
    }

    public static F7.o p(java.lang.Class cls) {
        return f57255a.m(b(cls), java.util.Collections.emptyList(), false);
    }

    public static F7.o q(java.lang.Class cls, F7.q qVar) {
        return f57255a.m(b(cls), java.util.Collections.singletonList(qVar), false);
    }

    public static F7.o r(java.lang.Class cls, F7.q qVar, F7.q qVar2) {
        return f57255a.m(b(cls), java.util.Arrays.asList(qVar, qVar2), false);
    }

    public static F7.p s(java.lang.Object obj, java.lang.String str, F7.r rVar, boolean z6) {
        return f57255a.n(obj, str, rVar, z6);
    }
}
