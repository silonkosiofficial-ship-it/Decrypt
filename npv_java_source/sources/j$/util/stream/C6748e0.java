package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6748e0 extends j$.util.stream.AbstractC6785l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.AbstractC6732b f48443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6748e0(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.InterfaceC6810q2 interfaceC6810q2, int i6) {
        super(interfaceC6810q2);
        this.f48442b = i6;
        this.f48443c = abstractC6732b;
    }

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        switch (this.f48442b) {
            case 0:
                this.f48504a.accept(((java.util.function.LongFunction) ((j$.util.stream.C6826u) this.f48443c).f48557n).apply(j6));
                return;
            case 1:
                ((j$.util.stream.C6840x) this.f48443c).getClass();
                java.util.function.LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j6);
                throw null;
            case 2:
                ((j$.util.stream.C6836w) this.f48443c).getClass();
                java.util.function.LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j6);
                throw null;
            case 3:
                ((j$.util.stream.C6848z) this.f48443c).getClass();
                java.util.function.LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j6);
                throw null;
            case 4:
                ((j$.util.stream.C6840x) this.f48443c).getClass();
                java.util.function.LongPredicate longPredicate = null;
                longPredicate.test(j6);
                throw null;
            default:
                ((java.util.function.LongConsumer) ((j$.util.stream.C6763h0) this.f48443c).f48478n).accept(j6);
                this.f48504a.accept(j6);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        switch (this.f48442b) {
            case 4:
                this.f48504a.k(-1L);
                break;
            default:
                super.k(j6);
                break;
        }
    }
}
