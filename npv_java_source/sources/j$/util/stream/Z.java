package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Z extends j$.util.stream.AbstractC6780k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f48398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.stream.V f48399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.X f48400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(j$.util.stream.X x6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48400d = x6;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48500a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48399c = new j$.util.stream.V(interfaceC6810q3);
    }

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) throws java.lang.Exception {
        j$.util.stream.IntStream intStream = (j$.util.stream.IntStream) ((java.util.function.IntFunction) this.f48400d.f48388n).apply(i6);
        if (intStream != null) {
            try {
                boolean z6 = this.f48398b;
                j$.util.stream.V v6 = this.f48399c;
                if (z6) {
                    j$.util.X xSpliterator = intStream.sequential().spliterator();
                    while (!this.f48500a.m() && xSpliterator.tryAdvance((java.util.function.IntConsumer) v6)) {
                    }
                } else {
                    intStream.sequential().forEach(v6);
                }
            } catch (java.lang.Throwable th) {
                try {
                    intStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        this.f48500a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        this.f48398b = true;
        return this.f48500a.m();
    }
}
