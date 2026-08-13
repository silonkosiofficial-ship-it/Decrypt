package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6826u extends j$.util.stream.AbstractC6765h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48557n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6826u(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.lang.Object obj, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48556m = i10;
        this.f48557n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6826u(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Consumer consumer) {
        super(abstractC6732b, 0, 1);
        this.f48556m = 3;
        this.f48557n = consumer;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48556m) {
            case 0:
                return new j$.util.stream.C6821t(this, interfaceC6810q2, 0);
            case 1:
                return new j$.util.stream.W(this, interfaceC6810q2, 0);
            case 2:
                return new j$.util.stream.C6748e0(this, interfaceC6810q2, 0);
            case 3:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 1);
            default:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 2);
        }
    }
}
