package p230x;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7282b implements p230x.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p230x.C7282b f56444a = new p230x.C7282b();

    private C7282b() {
    }

    @Override // p230x.v
    public long a(Y0.e eVar, p251z0.C7380p c7380p, long j6) {
        java.util.List listC = c7380p.c();
        p131n0.g gVarD = p131n0.g.d(p131n0.g.f51312b.c());
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            gVarD = p131n0.g.d(p131n0.g.r(gVarD.v(), ((p251z0.B) listC.get(i6)).m()));
        }
        return p131n0.g.s(gVarD.v(), -eVar.B0(Y0.i.q(64)));
    }
}
