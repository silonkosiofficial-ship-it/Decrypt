package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class Y0 extends java.util.concurrent.CancellationException implements W8.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final transient W8.InterfaceC1822z0 f15478C;

    public Y0(java.lang.String str) {
        this(str, null);
    }

    public Y0(java.lang.String str, W8.InterfaceC1822z0 interfaceC1822z0) {
        super(str);
        this.f15478C = interfaceC1822z0;
    }

    @Override // W8.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W8.Y0 a() {
        java.lang.String message = getMessage();
        if (message == null) {
            message = "";
        }
        W8.Y0 y6 = new W8.Y0(message, this.f15478C);
        y6.initCause(this);
        return y6;
    }
}
