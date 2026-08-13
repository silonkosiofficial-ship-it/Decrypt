package J0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.os.CancellationSignal f5587D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.os.CancellationSignal cancellationSignal) {
            super(1);
            this.f5587D = cancellationSignal;
        }

        public final void a(java.lang.Throwable th) {
            if (th != null) {
                this.f5587D.cancel();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W8.InterfaceC1822z0 c(W8.N n6, android.os.CancellationSignal cancellationSignal, p237x7.p pVar) {
        final W8.InterfaceC1822z0 interfaceC1822z0D = W8.AbstractC1788i.d(n6, null, null, pVar, 3, null);
        interfaceC1822z0D.e1(new J0.f.a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: J0.e
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                J0.f.d(interfaceC1822z0D);
            }
        });
        return interfaceC1822z0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(W8.InterfaceC1822z0 interfaceC1822z0) {
        W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
    }
}
