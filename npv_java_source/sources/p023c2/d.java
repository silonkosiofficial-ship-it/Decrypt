package p023c2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p023c2.a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(p023c2.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(p023c2.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p023c2.a.C0466a.f24405b : aVar);
    }

    @Override // p023c2.a
    public java.lang.Object a(c2.a.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "key");
        return b().get(bVar);
    }

    public final void c(c2.a.b bVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(bVar, "key");
        b().put(bVar, obj);
    }
}
