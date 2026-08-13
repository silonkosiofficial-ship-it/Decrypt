package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.io.IOException f7269C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.io.IOException f7270D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.io.IOException iOException) {
        super(iOException);
        p247y7.AbstractC7350t.f(iOException, "firstConnectException");
        this.f7269C = iOException;
        this.f7270D = iOException;
    }

    public final void a(java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(iOException, "e");
        p087i7.AbstractC6661g.a(this.f7269C, iOException);
        this.f7270D = iOException;
    }

    public final java.io.IOException b() {
        return this.f7269C;
    }

    public final java.io.IOException c() {
        return this.f7270D;
    }
}
