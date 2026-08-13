package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6831v extends j$.util.stream.B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48564n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6831v(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.lang.Object obj, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48563m = i10;
        this.f48564n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6831v(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.DoubleConsumer doubleConsumer) {
        super(abstractC6732b, 0, 1);
        this.f48563m = 2;
        this.f48564n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48563m) {
            case 0:
                return new j$.util.stream.C6821t(this, interfaceC6810q2, 1);
            case 1:
                return new j$.util.stream.C6844y(this, interfaceC6810q2);
            case 2:
                return new j$.util.stream.C6821t(this, interfaceC6810q2, 5);
            case 3:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 6);
            default:
                return new j$.util.stream.C6745d2(this, interfaceC6810q2);
        }
    }
}
