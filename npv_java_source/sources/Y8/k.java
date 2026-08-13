package Y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends W8.AbstractC1772a implements Y8.j {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Y8.j f16555F;

    public k(p127m7.i iVar, Y8.j jVar, boolean z6, boolean z10) {
        super(iVar, z6, z10);
        this.f16555F = jVar;
    }

    @Override // W8.F0
    public void A(java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionT0 = W8.F0.T0(this, th, null, 1, null);
        this.f16555F.o(cancellationExceptionT0);
        x(cancellationExceptionT0);
    }

    @Override // Y8.B
    public java.lang.Object a() {
        return this.f16555F.a();
    }

    @Override // Y8.B
    public java.lang.Object b(p127m7.e eVar) {
        return this.f16555F.b(eVar);
    }

    @Override // Y8.C
    public boolean c(java.lang.Throwable th) {
        return this.f16555F.c(th);
    }

    @Override // Y8.C
    public void d(p237x7.l lVar) {
        this.f16555F.d(lVar);
    }

    @Override // Y8.C
    public java.lang.Object h(java.lang.Object obj, p127m7.e eVar) {
        return this.f16555F.h(obj, eVar);
    }

    @Override // Y8.B
    public Y8.l iterator() {
        return this.f16555F.iterator();
    }

    @Override // Y8.C
    public java.lang.Object j(java.lang.Object obj) {
        return this.f16555F.j(obj);
    }

    protected final Y8.j k1() {
        return this.f16555F;
    }

    @Override // Y8.B
    public java.lang.Object l(p127m7.e eVar) {
        java.lang.Object objL = this.f16555F.l(eVar);
        p137n7.b.g();
        return objL;
    }

    @Override // Y8.C
    public boolean m() {
        return this.f16555F.m();
    }

    @Override // W8.F0, W8.InterfaceC1822z0
    public final void o(java.util.concurrent.CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new W8.A0(I(), null, this);
        }
        A(cancellationException);
    }

    public final Y8.j s0() {
        return this;
    }
}
