package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public class z extends W8.AbstractC1772a implements p147o7.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p127m7.e f24391F;

    public z(p127m7.i iVar, p127m7.e eVar) {
        super(iVar, true, true);
        this.f24391F = eVar;
    }

    @Override // p147o7.e
    public final p147o7.e e() {
        p127m7.e eVar = this.f24391F;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // W8.AbstractC1772a
    protected void g1(java.lang.Object obj) {
        p127m7.e eVar = this.f24391F;
        eVar.t(W8.C.a(obj, eVar));
    }

    @Override // W8.F0
    protected final boolean k0() {
        return true;
    }

    @Override // W8.F0
    protected void u(java.lang.Object obj) {
        p019b9.AbstractC2122i.b(p137n7.b.d(this.f24391F), W8.C.a(obj, this.f24391F));
    }
}
