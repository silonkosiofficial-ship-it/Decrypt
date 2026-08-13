package p097j7;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.a f49289C;

    public M(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "iteratorFactory");
        this.f49289C = aVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new p097j7.N((java.util.Iterator) this.f49289C.b());
    }
}
