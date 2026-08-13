package V;

/* JADX INFO: loaded from: classes.dex */
final class N0 implements V.M0, V.InterfaceC1753w0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f14694C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ V.InterfaceC1753w0 f14695D;

    public N0(V.InterfaceC1753w0 interfaceC1753w0, p127m7.i iVar) {
        this.f14694C = iVar;
        this.f14695D = interfaceC1753w0;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f14694C;
    }

    @Override // V.InterfaceC1753w0, V.G1
    public java.lang.Object getValue() {
        return this.f14695D.getValue();
    }

    @Override // V.InterfaceC1753w0
    public void setValue(java.lang.Object obj) {
        this.f14695D.setValue(obj);
    }
}
