package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6745d2 extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48430b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f48431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.Object f48432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.AbstractC6732b f48433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6745d2(j$.util.stream.X x6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48433e = x6;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48510a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48432d = new j$.util.stream.V(interfaceC6810q3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6745d2(j$.util.stream.C6763h0 c6763h0, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48433e = c6763h0;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48510a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48432d = new j$.util.stream.C6743d0(interfaceC6810q3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6745d2(j$.util.stream.C6831v c6831v, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48433e = c6831v;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48510a;
        j$.util.Objects.requireNonNull(interfaceC6810q3);
        this.f48432d = new j$.util.stream.C6802p(interfaceC6810q3);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(java.lang.Object obj) throws java.lang.Exception {
        switch (this.f48430b) {
            case 0:
                j$.util.stream.InterfaceC6793n0 interfaceC6793n0 = (j$.util.stream.InterfaceC6793n0) ((java.util.function.Function) ((j$.util.stream.C6763h0) this.f48433e).f48478n).apply(obj);
                if (interfaceC6793n0 != null) {
                    try {
                        boolean z6 = this.f48431c;
                        j$.util.stream.C6743d0 c6743d0 = (j$.util.stream.C6743d0) this.f48432d;
                        if (z6) {
                            j$.util.a0 a0VarSpliterator = interfaceC6793n0.sequential().spliterator();
                            while (!this.f48510a.m() && a0VarSpliterator.tryAdvance((java.util.function.LongConsumer) c6743d0)) {
                            }
                        } else {
                            interfaceC6793n0.sequential().forEach(c6743d0);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            interfaceC6793n0.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC6793n0 != null) {
                    interfaceC6793n0.close();
                    return;
                }
                return;
            case 1:
                j$.util.stream.IntStream intStream = (j$.util.stream.IntStream) ((java.util.function.Function) ((j$.util.stream.X) this.f48433e).f48388n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z10 = this.f48431c;
                        j$.util.stream.V v6 = (j$.util.stream.V) this.f48432d;
                        if (z10) {
                            j$.util.X xSpliterator = intStream.sequential().spliterator();
                            while (!this.f48510a.m() && xSpliterator.tryAdvance((java.util.function.IntConsumer) v6)) {
                            }
                        } else {
                            intStream.sequential().forEach(v6);
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.stream.F f6 = (j$.util.stream.F) ((java.util.function.Function) ((j$.util.stream.C6831v) this.f48433e).f48564n).apply(obj);
                if (f6 != null) {
                    try {
                        boolean z11 = this.f48431c;
                        j$.util.stream.C6802p c6802p = (j$.util.stream.C6802p) this.f48432d;
                        if (z11) {
                            j$.util.U uSpliterator = f6.sequential().spliterator();
                            while (!this.f48510a.m() && uSpliterator.tryAdvance((java.util.function.DoubleConsumer) c6802p)) {
                            }
                        } else {
                            f6.sequential().forEach(c6802p);
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            f6.close();
                            break;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (f6 != null) {
                    f6.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        switch (this.f48430b) {
            case 0:
                this.f48510a.k(-1L);
                break;
            case 1:
                this.f48510a.k(-1L);
                break;
            default:
                this.f48510a.k(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        switch (this.f48430b) {
            case 0:
                this.f48431c = true;
                break;
            case 1:
                this.f48431c = true;
                break;
            default:
                this.f48431c = true;
                break;
        }
        return this.f48510a.m();
    }
}
