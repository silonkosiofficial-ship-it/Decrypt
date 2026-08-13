package p251z0;

/* JADX INFO: renamed from: z0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7378n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57580b = X.b.f15549F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f57581a = new X.b(new p251z0.C7377m[16], 0);

    public boolean a(p170r.C7046v c7046v, D0.InterfaceC0900t interfaceC0900t, p251z0.C7372h c7372h, boolean z6) {
        X.b bVar = this.f57581a;
        int iT = bVar.t();
        if (iT <= 0) {
            return false;
        }
        java.lang.Object[] objArrS = bVar.s();
        int i6 = 0;
        boolean z10 = false;
        do {
            z10 = ((p251z0.C7377m) objArrS[i6]).a(c7046v, interfaceC0900t, c7372h, z6) || z10;
            i6++;
        } while (i6 < iT);
        return z10;
    }

    public void b(p251z0.C7372h c7372h) {
        int iT = this.f57581a.t();
        while (true) {
            iT--;
            if (-1 >= iT) {
                return;
            }
            if (((p251z0.C7377m) this.f57581a.s()[iT]).l().g()) {
                this.f57581a.D(iT);
            }
        }
    }

    public final void c() {
        this.f57581a.j();
    }

    public void d() {
        X.b bVar = this.f57581a;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            do {
                ((p251z0.C7377m) objArrS[i6]).d();
                i6++;
            } while (i6 < iT);
        }
    }

    public boolean e(p251z0.C7372h c7372h) {
        X.b bVar = this.f57581a;
        int iT = bVar.t();
        boolean z6 = false;
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i6 = 0;
            boolean z10 = false;
            do {
                z10 = ((p251z0.C7377m) objArrS[i6]).e(c7372h) || z10;
                i6++;
            } while (i6 < iT);
            z6 = z10;
        }
        b(c7372h);
        return z6;
    }

    public boolean f(p170r.C7046v c7046v, D0.InterfaceC0900t interfaceC0900t, p251z0.C7372h c7372h, boolean z6) {
        X.b bVar = this.f57581a;
        int iT = bVar.t();
        if (iT <= 0) {
            return false;
        }
        java.lang.Object[] objArrS = bVar.s();
        int i6 = 0;
        boolean z10 = false;
        do {
            z10 = ((p251z0.C7377m) objArrS[i6]).f(c7046v, interfaceC0900t, c7372h, z6) || z10;
            i6++;
        } while (i6 < iT);
        return z10;
    }

    public final X.b g() {
        return this.f57581a;
    }

    public final void h() {
        int i6 = 0;
        while (i6 < this.f57581a.t()) {
            p251z0.C7377m c7377m = (p251z0.C7377m) this.f57581a.s()[i6];
            if (c7377m.k().A1()) {
                i6++;
                c7377m.h();
            } else {
                c7377m.d();
                this.f57581a.D(i6);
            }
        }
    }

    public void i(long j6, p170r.I i6) {
        X.b bVar = this.f57581a;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i10 = 0;
            do {
                ((p251z0.C7377m) objArrS[i10]).i(j6, i6);
                i10++;
            } while (i10 < iT);
        }
    }
}
