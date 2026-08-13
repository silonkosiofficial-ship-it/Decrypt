package V;

/* JADX INFO: loaded from: classes.dex */
final class L implements V.Z0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.l f14690C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private V.M f14691D;

    public L(p237x7.l lVar) {
        this.f14690C = lVar;
    }

    @Override // V.Z0
    public void b() {
    }

    @Override // V.Z0
    public void c() {
        V.M m6 = this.f14691D;
        if (m6 != null) {
            m6.e();
        }
        this.f14691D = null;
    }

    @Override // V.Z0
    public void d() {
        this.f14691D = (V.M) this.f14690C.l(V.Q.f14707a);
    }
}
