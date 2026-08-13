package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N9.f f7917a = new N9.f();

    private f() {
    }

    public static final boolean a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "method");
        return (p247y7.AbstractC7350t.b(str, "GET") || p247y7.AbstractC7350t.b(str, "HEAD")) ? false : true;
    }

    public static final boolean d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "method");
        return p247y7.AbstractC7350t.b(str, "POST") || p247y7.AbstractC7350t.b(str, "PUT") || p247y7.AbstractC7350t.b(str, "PATCH") || p247y7.AbstractC7350t.b(str, "PROPPATCH") || p247y7.AbstractC7350t.b(str, "REPORT");
    }

    public final boolean b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "method");
        return !p247y7.AbstractC7350t.b(str, "PROPFIND");
    }

    public final boolean c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "method");
        return p247y7.AbstractC7350t.b(str, "PROPFIND");
    }
}
