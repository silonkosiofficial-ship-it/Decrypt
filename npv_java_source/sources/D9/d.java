package D9;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements D9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f2084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E9.a f2085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.r f2086d;

    public d(java.lang.String str, java.util.List list, E9.a aVar, C9.O o6, p237x7.r rVar) {
        p247y7.AbstractC7350t.f(str, "route");
        p247y7.AbstractC7350t.f(list, "deepLinks");
        p247y7.AbstractC7350t.f(rVar, "content");
        this.f2083a = str;
        this.f2084b = list;
        this.f2085c = aVar;
        this.f2086d = rVar;
    }

    @Override // D9.a
    public p237x7.r a() {
        return this.f2086d;
    }

    @Override // D9.c
    public java.lang.String b() {
        return this.f2083a;
    }

    public final java.util.List c() {
        return this.f2084b;
    }

    public final E9.a d() {
        return this.f2085c;
    }

    public final C9.O e() {
        return null;
    }
}
