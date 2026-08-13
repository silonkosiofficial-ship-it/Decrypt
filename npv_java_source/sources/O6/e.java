package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T6.g0 f8076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T6.A f8077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.InterfaceC1668p f8078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U6.b f8079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W8.InterfaceC1822z0 f8080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W6.InterfaceC1768b f8081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Set f8082g;

    public e(T6.g0 g0Var, T6.A a6, T6.InterfaceC1668p interfaceC1668p, U6.b bVar, W8.InterfaceC1822z0 interfaceC1822z0, W6.InterfaceC1768b interfaceC1768b) {
        java.util.Set setKeySet;
        p247y7.AbstractC7350t.f(g0Var, "url");
        p247y7.AbstractC7350t.f(a6, "method");
        p247y7.AbstractC7350t.f(interfaceC1668p, "headers");
        p247y7.AbstractC7350t.f(bVar, "body");
        p247y7.AbstractC7350t.f(interfaceC1822z0, "executionContext");
        p247y7.AbstractC7350t.f(interfaceC1768b, "attributes");
        this.f8076a = g0Var;
        this.f8077b = a6;
        this.f8078c = interfaceC1668p;
        this.f8079d = bVar;
        this.f8080e = interfaceC1822z0;
        this.f8081f = interfaceC1768b;
        java.util.Map map = (java.util.Map) interfaceC1768b.c(F6.i.a());
        this.f8082g = (map == null || (setKeySet = map.keySet()) == null) ? p097j7.Z.d() : setKeySet;
    }

    public final W6.InterfaceC1768b a() {
        return this.f8081f;
    }

    public final U6.b b() {
        return this.f8079d;
    }

    public final java.lang.Object c(F6.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "key");
        java.util.Map map = (java.util.Map) this.f8081f.c(F6.i.a());
        if (map != null) {
            return map.get(hVar);
        }
        return null;
    }

    public final W8.InterfaceC1822z0 d() {
        return this.f8080e;
    }

    public final T6.InterfaceC1668p e() {
        return this.f8078c;
    }

    public final T6.A f() {
        return this.f8077b;
    }

    public final java.util.Set g() {
        return this.f8082g;
    }

    public final T6.g0 h() {
        return this.f8076a;
    }

    public java.lang.String toString() {
        return "HttpRequestData(url=" + this.f8076a + ", method=" + this.f8077b + ')';
    }
}
