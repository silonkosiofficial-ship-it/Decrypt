package p044e3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f44663a;

    public g(p077h7.a aVar) {
        this.f44663a = aVar;
    }

    public static p054f3.f a(p084i3.a aVar) {
        return (p054f3.f) p004a3.d.d(p044e3.f.a(aVar));
    }

    public static p044e3.g b(p077h7.a aVar) {
        return new p044e3.g(aVar);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p054f3.f get() {
        return a((p084i3.a) this.f44663a.get());
    }
}
