package O7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 {
    private h0() {
    }

    public /* synthetic */ h0(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract boolean a(p138n8.f fVar);

    public abstract java.util.List b();

    public final O7.h0 c(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "transform");
        if (this instanceof O7.C1444z) {
            O7.C1444z c1444z = (O7.C1444z) this;
            return new O7.C1444z(c1444z.d(), (J8.j) lVar.l(c1444z.e()));
        }
        if (!(this instanceof O7.H)) {
            throw new p087i7.s();
        }
        java.util.List<p087i7.u> listB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listB, 10));
        for (p087i7.u uVar : listB) {
            arrayList.add(p087i7.B.a((p138n8.f) uVar.a(), lVar.l((J8.j) uVar.b())));
        }
        return new O7.H(arrayList);
    }
}
