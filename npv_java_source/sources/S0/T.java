package S0;

/* JADX INFO: loaded from: classes.dex */
public final class T implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f12283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12284b;

    public T(M0.C1332d c1332d, int i6) {
        this.f12283a = c1332d;
        this.f12284b = i6;
    }

    public T(java.lang.String str, int i6) {
        this(new M0.C1332d(str, null, null, 6, null), i6);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023 A[PHI: r0
  0x0023: PHI (r0v8 int) = (r0v1 int), (r0v9 int) binds: [B:8:0x004b, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        int iK;
        if (c1604l.l()) {
            iK = c1604l.f();
            c1604l.m(c1604l.f(), c1604l.e(), c());
            if (c().length() > 0) {
                c1604l.n(iK, c().length() + iK);
            }
        } else {
            iK = c1604l.k();
            c1604l.m(c1604l.k(), c1604l.j(), c());
            if (c().length() > 0) {
                c1604l.n(iK, c().length() + iK);
            }
        }
        int iG = c1604l.g();
        int i6 = this.f12284b;
        int i10 = iG + i6;
        c1604l.o(E7.j.k(i6 > 0 ? i10 - 1 : i10 - c().length(), 0, c1604l.h()));
    }

    public final int b() {
        return this.f12284b;
    }

    public final java.lang.String c() {
        return this.f12283a.i();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.T)) {
            return false;
        }
        S0.T t6 = (S0.T) obj;
        return p247y7.AbstractC7350t.b(c(), t6.c()) && this.f12284b == t6.f12284b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f12284b;
    }

    public java.lang.String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f12284b + ')';
    }
}
