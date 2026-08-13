package D6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends java.lang.IllegalStateException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f1916C;

    public a(D6.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "call");
        this.f1916C = "Response already received: " + bVar;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f1916C;
    }
}
