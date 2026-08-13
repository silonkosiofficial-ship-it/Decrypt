package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class z implements Z8.C, Z8.InterfaceC1869f, p009a9.q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Z8.C f16987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final W8.InterfaceC1822z0 f16988D;

    public z(Z8.C c6, W8.InterfaceC1822z0 interfaceC1822z0) {
        this.f16987C = c6;
        this.f16988D = interfaceC1822z0;
    }

    @Override // Z8.C, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        return this.f16987C.b(interfaceC1870g, eVar);
    }

    @Override // Z8.C
    public java.util.List c() {
        return this.f16987C.c();
    }

    @Override // p009a9.q
    public Z8.InterfaceC1869f d(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return Z8.E.e(this, iVar, i6, enumC1863d);
    }
}
