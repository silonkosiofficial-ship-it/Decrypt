package S0;

/* JADX INFO: renamed from: S0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1593a implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f12323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12324b;

    public C1593a(M0.C1332d c1332d, int i6) {
        this.f12323a = c1332d;
        this.f12324b = i6;
    }

    public C1593a(java.lang.String str, int i6) {
        this(new M0.C1332d(str, null, null, 6, null), i6);
    }

    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        int iK;
        int iJ;
        if (c1604l.l()) {
            iK = c1604l.f();
            iJ = c1604l.e();
        } else {
            iK = c1604l.k();
            iJ = c1604l.j();
        }
        c1604l.m(iK, iJ, c());
        int iG = c1604l.g();
        int i6 = this.f12324b;
        int i10 = iG + i6;
        c1604l.o(E7.j.k(i6 > 0 ? i10 - 1 : i10 - c().length(), 0, c1604l.h()));
    }

    public final int b() {
        return this.f12324b;
    }

    public final java.lang.String c() {
        return this.f12323a.i();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.C1593a)) {
            return false;
        }
        S0.C1593a c1593a = (S0.C1593a) obj;
        return p247y7.AbstractC7350t.b(c(), c1593a.c()) && this.f12324b == c1593a.f12324b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f12324b;
    }

    public java.lang.String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f12324b + ')';
    }
}
