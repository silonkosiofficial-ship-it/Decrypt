package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6844y extends j$.util.stream.AbstractC6775j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f48589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.stream.C6802p f48590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6831v f48591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6844y(j$.util.stream.C6831v c6831v, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48591d = c6831v;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48493a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48590c = new j$.util.stream.C6802p(interfaceC6810q3);
    }

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) throws java.lang.Exception {
        j$.util.stream.F f6 = (j$.util.stream.F) ((java.util.function.DoubleFunction) this.f48591d.f48564n).apply(d6);
        if (f6 != null) {
            try {
                boolean z6 = this.f48589b;
                j$.util.stream.C6802p c6802p = this.f48590c;
                if (z6) {
                    j$.util.U uSpliterator = f6.sequential().spliterator();
                    while (!this.f48493a.m() && uSpliterator.tryAdvance((java.util.function.DoubleConsumer) c6802p)) {
                    }
                } else {
                    f6.sequential().forEach(c6802p);
                }
            } catch (java.lang.Throwable th) {
                try {
                    f6.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f6 != null) {
            f6.close();
        }
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48493a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        this.f48589b = true;
        return this.f48493a.m();
    }
}
