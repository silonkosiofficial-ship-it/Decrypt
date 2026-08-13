package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p009a9.g {
    public h(Z8.InterfaceC1869f interfaceC1869f, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(interfaceC1869f, iVar, i6, enumC1863d);
    }

    public /* synthetic */ h(Z8.InterfaceC1869f interfaceC1869f, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1869f, (i10 & 2) != 0 ? p127m7.j.f51198C : iVar, (i10 & 4) != 0 ? -3 : i6, (i10 & 8) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    @Override // p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new p009a9.h(this.f17171F, iVar, i6, enumC1863d);
    }

    @Override // p009a9.e
    public Z8.InterfaceC1869f j() {
        return this.f17171F;
    }

    @Override // p009a9.g
    protected java.lang.Object t(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        java.lang.Object objB = this.f17171F.b(interfaceC1870g, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }
}
