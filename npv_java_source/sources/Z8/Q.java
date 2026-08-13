package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class Q extends p009a9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f16793a = new java.util.concurrent.atomic.AtomicReference(null);

    @Override // p009a9.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Z8.O o6) {
        if (p019b9.AbstractC2116c.a(this.f16793a) != null) {
            return false;
        }
        p019b9.AbstractC2116c.b(this.f16793a, Z8.P.f16791a);
        return true;
    }

    public final java.lang.Object e(p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        if (!p200u.AbstractC7162c0.a(this.f16793a, Z8.P.f16791a, c1798n)) {
            i7.w.a aVar = p087i7.w.f46751D;
            c1798n.t(p087i7.w.b(p087i7.M.f46721a));
        }
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    @Override // p009a9.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p127m7.e[] b(Z8.O o6) {
        p019b9.AbstractC2116c.b(this.f16793a, null);
        return p009a9.AbstractC1886c.f17160a;
    }

    public final void g() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f16793a;
        while (true) {
            java.lang.Object objA = p019b9.AbstractC2116c.a(atomicReference);
            if (objA == null || objA == Z8.P.f16792b) {
                return;
            }
            if (objA == Z8.P.f16791a) {
                if (p200u.AbstractC7162c0.a(this.f16793a, objA, Z8.P.f16792b)) {
                    return;
                }
            } else if (p200u.AbstractC7162c0.a(this.f16793a, objA, Z8.P.f16791a)) {
                i7.w.a aVar = p087i7.w.f46751D;
                ((W8.C1798n) objA).t(p087i7.w.b(p087i7.M.f46721a));
                return;
            }
        }
    }

    public final boolean h() {
        java.lang.Object andSet = this.f16793a.getAndSet(Z8.P.f16791a);
        p247y7.AbstractC7350t.c(andSet);
        return andSet == Z8.P.f16792b;
    }
}
