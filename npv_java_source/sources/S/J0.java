package S;

/* JADX INFO: loaded from: classes.dex */
final class J0 implements p210v.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p141o0.B0 f10028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10029d;

    static final class a implements p141o0.B0 {
        a() {
        }

        @Override // p141o0.B0
        public final long a() {
            return S.J0.this.f10029d;
        }
    }

    private J0(boolean z6, float f6, long j6) {
        this(z6, f6, (p141o0.B0) null, j6);
    }

    public /* synthetic */ J0(boolean z6, float f6, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, f6, j6);
    }

    private J0(boolean z6, float f6, p141o0.B0 b6, long j6) {
        this.f10026a = z6;
        this.f10027b = f6;
        this.f10028c = b6;
        this.f10029d = j6;
    }

    @Override // p210v.I
    public F0.InterfaceC0924j a(p250z.j jVar) {
        p141o0.B0 aVar = this.f10028c;
        if (aVar == null) {
            aVar = new S.J0.a();
        }
        return new S.X(jVar, this.f10026a, this.f10027b, aVar, null);
    }

    @Override // p210v.G
    public /* synthetic */ p210v.H b(p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        return p210v.F.a(this, jVar, interfaceC1734n, i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S.J0)) {
            return false;
        }
        S.J0 j6 = (S.J0) obj;
        if (this.f10026a == j6.f10026a && Y0.i.s(this.f10027b, j6.f10027b) && p247y7.AbstractC7350t.b(this.f10028c, j6.f10028c)) {
            return p141o0.C7016y0.o(this.f10029d, j6.f10029d);
        }
        return false;
    }

    public int hashCode() {
        int iA = ((p190t.h.a(this.f10026a) * 31) + Y0.i.t(this.f10027b)) * 31;
        p141o0.B0 b6 = this.f10028c;
        return ((iA + (b6 != null ? b6.hashCode() : 0)) * 31) + p141o0.C7016y0.u(this.f10029d);
    }
}
