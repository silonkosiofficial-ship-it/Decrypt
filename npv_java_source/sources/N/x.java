package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.K f7498D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p247y7.K k6) {
            super(1);
            this.f7498D = k6;
        }

        public final void a(N.C1360j c1360j) {
            if (c1360j.c().length() > 0) {
                this.f7498D.f57250C = false;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((N.C1360j) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X0.i b(M0.K k6, int i6) {
        return e(k6, i6) ? k6.y(i6) : k6.c(i6);
    }

    public static final N.w c(M0.K k6, int i6, int i10, int i11, long j6, boolean z6, boolean z10) {
        return new N.D(z10, 1, 1, z6 ? null : new N.C1361k(new N.C1361k.a(b(k6, M0.N.n(j6)), M0.N.n(j6), 1L), new N.C1361k.a(b(k6, M0.N.i(j6)), M0.N.i(j6), 1L), M0.N.m(j6)), new N.C1360j(1L, 1, i6, i10, i11, k6));
    }

    public static final boolean d(N.C1361k c1361k, N.w wVar) {
        if (c1361k == null || wVar == null) {
            return true;
        }
        if (c1361k.e().d() == c1361k.c().d()) {
            return c1361k.e().c() == c1361k.c().c();
        }
        if ((c1361k.d() ? c1361k.e() : c1361k.c()).c() != 0) {
            return false;
        }
        if (wVar.e().l() != (c1361k.d() ? c1361k.c() : c1361k.e()).c()) {
            return false;
        }
        p247y7.K k6 = new p247y7.K();
        k6.f57250C = true;
        wVar.j(new N.x.a(k6));
        return k6.f57250C;
    }

    private static final boolean e(M0.K k6, int i6) {
        if (k6.l().j().length() == 0) {
            return true;
        }
        int iQ = k6.q(i6);
        return (i6 == 0 || iQ != k6.q(i6 + (-1))) && (i6 == k6.l().j().length() || iQ != k6.q(i6 + 1));
    }
}
