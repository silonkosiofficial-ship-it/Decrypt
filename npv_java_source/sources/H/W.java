package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j6, p131n0.i iVar) {
        float fJ;
        float fE;
        if (p131n0.g.m(j6) < iVar.i()) {
            fJ = iVar.i();
        } else {
            fJ = p131n0.g.m(j6) > iVar.j() ? iVar.j() : p131n0.g.m(j6);
        }
        if (p131n0.g.n(j6) < iVar.l()) {
            fE = iVar.l();
        } else {
            fE = p131n0.g.n(j6) > iVar.e() ? iVar.e() : p131n0.g.n(j6);
        }
        return p131n0.h.a(fJ, fE);
    }
}
