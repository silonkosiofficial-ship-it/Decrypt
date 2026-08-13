package Z8;

/* JADX INFO: renamed from: Z8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1867d extends p009a9.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p237x7.p f16819F;

    public C1867d(p237x7.p pVar, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(iVar, i6, enumC1863d);
        this.f16819F = pVar;
    }

    public /* synthetic */ C1867d(p237x7.p pVar, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(pVar, (i10 & 2) != 0 ? p127m7.j.f51198C : iVar, (i10 & 4) != 0 ? -2 : i6, (i10 & 8) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    static /* synthetic */ java.lang.Object q(Z8.C1867d c1867d, Y8.z zVar, p127m7.e eVar) {
        java.lang.Object objU = c1867d.f16819F.u(zVar, eVar);
        return objU == p137n7.b.g() ? objU : p087i7.M.f46721a;
    }

    @Override // p009a9.e
    protected java.lang.Object h(Y8.z zVar, p127m7.e eVar) {
        return q(this, zVar, eVar);
    }

    @Override // p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new Z8.C1867d(this.f16819F, iVar, i6, enumC1863d);
    }

    @Override // p009a9.e
    public java.lang.String toString() {
        return "block[" + this.f16819F + "] -> " + super.toString();
    }
}
