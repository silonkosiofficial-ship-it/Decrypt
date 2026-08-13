package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class E2 extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.util.Comparator f48228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f48229c;

    E2(j$.util.stream.InterfaceC6810q2 interfaceC6810q2, java.util.Comparator comparator) {
        super(interfaceC6810q2);
        this.f48228b = comparator;
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final boolean m() {
        this.f48229c = true;
        return false;
    }
}
