package Y2;

/* JADX INFO: loaded from: classes.dex */
final class q implements W2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y2.p f16331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y2.t f16332c;

    q(java.util.Set set, Y2.p pVar, Y2.t tVar) {
        this.f16330a = set;
        this.f16331b = pVar;
        this.f16332c = tVar;
    }

    @Override // W2.i
    public W2.h a(java.lang.String str, java.lang.Class cls, W2.b bVar, W2.g gVar) {
        if (this.f16330a.contains(bVar)) {
            return new Y2.s(this.f16331b, str, bVar, gVar, this.f16332c);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f16330a));
    }
}
