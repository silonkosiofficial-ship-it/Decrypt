package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6755f2 extends j$.util.stream.AbstractC6765h2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ java.util.function.Function f48447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6755f2(j$.util.stream.AbstractC6732b abstractC6732b, int i6, java.util.function.Function function, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48446m = i10;
        this.f48447n = function;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48446m) {
            case 0:
                return new j$.util.stream.C6792n(this, interfaceC6810q2, 3);
            default:
                return new j$.util.stream.C6787m(this, interfaceC6810q2);
        }
    }
}
