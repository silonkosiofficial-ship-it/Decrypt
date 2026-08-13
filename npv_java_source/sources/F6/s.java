package F6;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements p237x7.l {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ W8.InterfaceC1822z0 f2785C;

    public s(W8.InterfaceC1822z0 interfaceC1822z0) {
        this.f2785C = interfaceC1822z0;
    }

    public final void a(java.lang.Throwable th) {
        if (th == null) {
            return;
        }
        this.f2785C.o(new java.util.concurrent.CancellationException(th.getMessage()));
    }

    @Override // p237x7.l
    public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
        a((java.lang.Throwable) obj);
        return p087i7.M.f46721a;
    }
}
