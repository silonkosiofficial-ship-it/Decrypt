package p009a9;

/* JADX INFO: loaded from: classes2.dex */
final class A implements p127m7.e, p147o7.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.e f17147C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p127m7.i f17148D;

    public A(p127m7.e eVar, p127m7.i iVar) {
        this.f17147C = eVar;
        this.f17148D = iVar;
    }

    @Override // p147o7.e
    public p147o7.e e() {
        p127m7.e eVar = this.f17147C;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return this.f17148D;
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        this.f17147C.t(obj);
    }
}
