package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6821t extends j$.util.stream.AbstractC6775j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.AbstractC6732b f48549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6821t(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.InterfaceC6810q2 interfaceC6810q2, int i6) {
        super(interfaceC6810q2);
        this.f48548b = i6;
        this.f48549c = abstractC6732b;
    }

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        switch (this.f48548b) {
            case 0:
                this.f48493a.accept(((java.util.function.DoubleFunction) ((j$.util.stream.C6826u) this.f48549c).f48557n).apply(d6));
                return;
            case 1:
                this.f48493a.accept(((java.util.function.DoubleUnaryOperator) ((j$.util.stream.C6831v) this.f48549c).f48564n).applyAsDouble(d6));
                return;
            case 2:
                ((j$.util.stream.C6836w) this.f48549c).getClass();
                java.util.function.DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d6);
                throw null;
            case 3:
                ((j$.util.stream.C6840x) this.f48549c).getClass();
                java.util.function.DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d6);
                throw null;
            case 4:
                ((j$.util.stream.C6848z) this.f48549c).getClass();
                java.util.function.DoublePredicate doublePredicate = null;
                doublePredicate.test(d6);
                throw null;
            default:
                ((java.util.function.DoubleConsumer) ((j$.util.stream.C6831v) this.f48549c).f48564n).accept(d6);
                this.f48493a.accept(d6);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        switch (this.f48548b) {
            case 4:
                this.f48493a.k(-1L);
                break;
            default:
                super.k(j6);
                break;
        }
    }
}
