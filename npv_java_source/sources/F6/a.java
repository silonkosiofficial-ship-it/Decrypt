package F6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends java.lang.IllegalStateException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Throwable f2750C;

    public a(java.lang.Throwable th) {
        super("Client already closed");
        this.f2750C = th;
    }

    public /* synthetic */ a(java.lang.Throwable th, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.f2750C;
    }
}
