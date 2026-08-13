package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Y extends j$.util.stream.AbstractC6780k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48391b = i6;
    }

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        switch (this.f48391b) {
            case 0:
                this.f48500a.accept(i6);
                break;
            default:
                this.f48500a.accept(i6);
                break;
        }
    }
}
