package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6758g0 extends j$.util.stream.AbstractC6785l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f48471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.stream.C6743d0 f48472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6763h0 f48473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6758g0(j$.util.stream.C6763h0 c6763h0, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48473d = c6763h0;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48504a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48472c = new j$.util.stream.C6743d0(interfaceC6810q3);
    }

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) throws java.lang.Exception {
        j$.util.stream.InterfaceC6793n0 interfaceC6793n0 = (j$.util.stream.InterfaceC6793n0) ((java.util.function.LongFunction) this.f48473d.f48478n).apply(j6);
        if (interfaceC6793n0 != null) {
            try {
                boolean z6 = this.f48471b;
                j$.util.stream.C6743d0 c6743d0 = this.f48472c;
                if (z6) {
                    j$.util.a0 a0VarSpliterator = interfaceC6793n0.sequential().spliterator();
                    while (!this.f48504a.m() && a0VarSpliterator.tryAdvance((java.util.function.LongConsumer) c6743d0)) {
                    }
                } else {
                    interfaceC6793n0.sequential().forEach(c6743d0);
                }
            } catch (java.lang.Throwable th) {
                try {
                    interfaceC6793n0.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC6793n0 != null) {
            interfaceC6793n0.close();
        }
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48504a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        this.f48471b = true;
        return this.f48504a.m();
    }
}
