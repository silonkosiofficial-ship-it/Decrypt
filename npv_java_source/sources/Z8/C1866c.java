package Z8;

/* JADX INFO: renamed from: Z8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1866c extends p009a9.e {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f16816H = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z8.C1866c.class, "consumed$volatile");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Y8.B f16817F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f16818G;
    private volatile /* synthetic */ int consumed$volatile;

    public C1866c(Y8.B b6, boolean z6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(iVar, i6, enumC1863d);
        this.f16817F = b6;
        this.f16818G = z6;
        this.consumed$volatile = 0;
    }

    public /* synthetic */ C1866c(Y8.B b6, boolean z6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(b6, z6, (i10 & 4) != 0 ? p127m7.j.f51198C : iVar, (i10 & 8) != 0 ? -3 : i6, (i10 & 16) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    private final void r() {
        if (this.f16818G && f16816H.getAndSet(this, 1) != 0) {
            throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // p009a9.e, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        if (this.f17162D != -3) {
            java.lang.Object objB = super.b(interfaceC1870g, eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
        r();
        java.lang.Object objD = Z8.AbstractC1873j.d(interfaceC1870g, this.f16817F, this.f16818G, eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    @Override // p009a9.e
    protected java.lang.String e() {
        return "channel=" + this.f16817F;
    }

    @Override // p009a9.e
    protected java.lang.Object h(Y8.z zVar, p127m7.e eVar) {
        java.lang.Object objD = Z8.AbstractC1873j.d(new p009a9.z(zVar), this.f16817F, this.f16818G, eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    @Override // p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new Z8.C1866c(this.f16817F, this.f16818G, iVar, i6, enumC1863d);
    }

    @Override // p009a9.e
    public Z8.InterfaceC1869f j() {
        return new Z8.C1866c(this.f16817F, this.f16818G, null, 0, null, 28, null);
    }

    @Override // p009a9.e
    public Y8.B o(W8.N n6) {
        r();
        return this.f17162D == -3 ? this.f16817F : super.o(n6);
    }
}
