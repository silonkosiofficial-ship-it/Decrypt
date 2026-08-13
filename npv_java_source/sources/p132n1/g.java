package p132n1;

/* JADX INFO: loaded from: classes.dex */
public class g extends p132n1.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p132n1.p pVar) {
        super(pVar);
        p247y7.AbstractC7350t.f(pVar, "run");
        p(pVar instanceof p132n1.l ? n1.f.a.HORIZONTAL_DIMENSION : n1.f.a.VERTICAL_DIMENSION);
    }

    @Override // p132n1.f
    public void k(int i6) {
        if (i()) {
            return;
        }
        r(true);
        t(i6);
        for (p132n1.d dVar : d()) {
            p247y7.AbstractC7350t.c(dVar);
            dVar.a(dVar);
        }
    }

    public final int u() {
        return this.f51392m;
    }

    public final void v(int i6) {
        this.f51392m = i6;
    }
}
