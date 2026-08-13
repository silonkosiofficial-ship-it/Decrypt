package J0;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0.o f5599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y0.r f5601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.InterfaceC0900t f5602d;

    public m(K0.o oVar, int i6, Y0.r rVar, D0.InterfaceC0900t interfaceC0900t) {
        this.f5599a = oVar;
        this.f5600b = i6;
        this.f5601c = rVar;
        this.f5602d = interfaceC0900t;
    }

    public final D0.InterfaceC0900t a() {
        return this.f5602d;
    }

    public final int b() {
        return this.f5600b;
    }

    public final K0.o c() {
        return this.f5599a;
    }

    public final Y0.r d() {
        return this.f5601c;
    }

    public java.lang.String toString() {
        return "ScrollCaptureCandidate(node=" + this.f5599a + ", depth=" + this.f5600b + ", viewportBoundsInWindow=" + this.f5601c + ", coordinates=" + this.f5602d + ')';
    }
}
