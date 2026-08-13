package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T6.C f8091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y6.b f8092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.InterfaceC1668p f8093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T6.B f8094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f8095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p127m7.i f8096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Y6.b f8097g;

    public h(T6.C c6, Y6.b bVar, T6.InterfaceC1668p interfaceC1668p, T6.B b6, java.lang.Object obj, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(c6, "statusCode");
        p247y7.AbstractC7350t.f(bVar, "requestTime");
        p247y7.AbstractC7350t.f(interfaceC1668p, "headers");
        p247y7.AbstractC7350t.f(b6, "version");
        p247y7.AbstractC7350t.f(obj, "body");
        p247y7.AbstractC7350t.f(iVar, "callContext");
        this.f8091a = c6;
        this.f8092b = bVar;
        this.f8093c = interfaceC1668p;
        this.f8094d = b6;
        this.f8095e = obj;
        this.f8096f = iVar;
        this.f8097g = Y6.a.b(null, 1, null);
    }

    public final java.lang.Object a() {
        return this.f8095e;
    }

    public final p127m7.i b() {
        return this.f8096f;
    }

    public final T6.InterfaceC1668p c() {
        return this.f8093c;
    }

    public final Y6.b d() {
        return this.f8092b;
    }

    public final Y6.b e() {
        return this.f8097g;
    }

    public final T6.C f() {
        return this.f8091a;
    }

    public final T6.B g() {
        return this.f8094d;
    }

    public java.lang.String toString() {
        return "HttpResponseData=(statusCode=" + this.f8091a + ')';
    }
}
