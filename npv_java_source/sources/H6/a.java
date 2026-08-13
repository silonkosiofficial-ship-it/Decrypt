package H6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends java.net.ConnectException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Throwable f4394C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.Throwable th) {
        super(str);
        p247y7.AbstractC7350t.f(str, "message");
        this.f4394C = th;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.f4394C;
    }
}
