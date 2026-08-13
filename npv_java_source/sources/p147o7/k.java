package p147o7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends p147o7.j implements p247y7.InterfaceC7346o {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f52561D;

    public k(int i6, p127m7.e eVar) {
        super(eVar);
        this.f52561D = i6;
    }

    @Override // p247y7.InterfaceC7346o
    public int c() {
        return this.f52561D;
    }

    @Override // p147o7.a
    public java.lang.String toString() {
        if (z() != null) {
            return super.toString();
        }
        java.lang.String strL = p247y7.P.l(this);
        p247y7.AbstractC7350t.e(strL, "renderLambdaToString(...)");
        return strL;
    }
}
