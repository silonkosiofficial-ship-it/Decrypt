package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class W extends j$.util.stream.AbstractC6780k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.AbstractC6732b f48385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.InterfaceC6810q2 interfaceC6810q2, int i6) {
        super(interfaceC6810q2);
        this.f48384b = i6;
        this.f48385c = abstractC6732b;
    }

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        switch (this.f48384b) {
            case 0:
                this.f48500a.accept(((java.util.function.IntFunction) ((j$.util.stream.C6826u) this.f48385c).f48557n).apply(i6));
                return;
            case 1:
                ((java.util.function.IntConsumer) ((j$.util.stream.X) this.f48385c).f48388n).accept(i6);
                this.f48500a.accept(i6);
                return;
            case 2:
                ((j$.util.stream.C6836w) this.f48385c).getClass();
                java.util.function.IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i6);
                throw null;
            case 3:
                ((j$.util.stream.C6840x) this.f48385c).getClass();
                java.util.function.IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i6);
                throw null;
            case 4:
                ((j$.util.stream.C6848z) this.f48385c).getClass();
                java.util.function.IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i6);
                throw null;
            default:
                ((j$.util.stream.C6836w) this.f48385c).getClass();
                java.util.function.IntPredicate intPredicate = null;
                intPredicate.test(i6);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        switch (this.f48384b) {
            case 5:
                this.f48500a.k(-1L);
                break;
            default:
                super.k(j6);
                break;
        }
    }
}
