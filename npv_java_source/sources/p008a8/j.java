package p008a8;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p008a8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p228w8.c f17145a;

    @Override // p008a8.i
    public O7.InterfaceC1424e a(p048e8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "javaClass");
        return b().b(gVar);
    }

    public final p228w8.c b() {
        p228w8.c cVar = this.f17145a;
        if (cVar != null) {
            return cVar;
        }
        p247y7.AbstractC7350t.p("resolver");
        return null;
    }

    public final void c(p228w8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<set-?>");
        this.f17145a = cVar;
    }
}
