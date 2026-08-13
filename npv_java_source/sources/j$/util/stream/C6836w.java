package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6836w extends j$.util.stream.AbstractC6733b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f48572m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6836w(j$.util.stream.AbstractC6732b abstractC6732b, int i6, int i10) {
        super(abstractC6732b, i6, 1);
        this.f48572m = i10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        switch (this.f48572m) {
            case 0:
                return new j$.util.stream.C6821t(this, interfaceC6810q2, 2);
            case 1:
                return new j$.util.stream.W(this, interfaceC6810q2, 2);
            case 2:
                return interfaceC6810q2;
            case 3:
                return new j$.util.stream.W(this, interfaceC6810q2, 5);
            default:
                return new j$.util.stream.C6748e0(this, interfaceC6810q2, 2);
        }
    }
}
