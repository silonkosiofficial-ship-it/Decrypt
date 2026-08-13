package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6763h0 extends j$.util.stream.AbstractC6773j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48478n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6763h0(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.lang.Object obj, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48477m = i10;
        this.f48478n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6763h0(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.LongConsumer longConsumer) {
        super(abstractC6732b, 0, 1);
        this.f48477m = 1;
        this.f48478n = longConsumer;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48477m) {
            case 0:
                return new j$.util.stream.C6758g0(this, interfaceC6810q2);
            case 1:
                return new j$.util.stream.C6748e0(this, interfaceC6810q2, 5);
            case 2:
                return new j$.util.stream.C6745d2(this, interfaceC6810q2);
            default:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 5);
        }
    }
}
