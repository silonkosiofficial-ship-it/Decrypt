package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class X extends j$.util.stream.AbstractC6733b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48388n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.lang.Object obj, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48387m = i10;
        this.f48388n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.IntConsumer intConsumer) {
        super(abstractC6732b, 0, 1);
        this.f48387m = 0;
        this.f48388n = intConsumer;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48387m) {
            case 0:
                return new j$.util.stream.W(this, interfaceC6810q2, 1);
            case 1:
                return new j$.util.stream.Z(this, interfaceC6810q2);
            case 2:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 4);
            default:
                return new j$.util.stream.C6745d2(this, interfaceC6810q2);
        }
    }
}
