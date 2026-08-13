package V;

/* JADX INFO: renamed from: V.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1708e0 implements V.Z0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.p f14851C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final W8.N f14852D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private W8.InterfaceC1822z0 f14853E;

    public C1708e0(p127m7.i iVar, p237x7.p pVar) {
        this.f14851C = pVar;
        this.f14852D = W8.O.a(iVar);
    }

    @Override // V.Z0
    public void b() {
        W8.InterfaceC1822z0 interfaceC1822z0 = this.f14853E;
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.o(new V.C1714g0());
        }
        this.f14853E = null;
    }

    @Override // V.Z0
    public void c() {
        W8.InterfaceC1822z0 interfaceC1822z0 = this.f14853E;
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.o(new V.C1714g0());
        }
        this.f14853E = null;
    }

    @Override // V.Z0
    public void d() {
        W8.InterfaceC1822z0 interfaceC1822z0 = this.f14853E;
        if (interfaceC1822z0 != null) {
            W8.D0.e(interfaceC1822z0, "Old job was still running!", null, 2, null);
        }
        this.f14853E = W8.AbstractC1788i.d(this.f14852D, null, null, this.f14851C, 3, null);
    }
}
