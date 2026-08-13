package M6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends java.lang.IllegalStateException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Q6.c f7036C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Throwable f7037D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f7038E;

    public b(Q6.c cVar, java.lang.Throwable th, java.lang.String str) {
        this.f7036C = cVar;
        this.f7037D = th;
        this.f7038E = str;
    }

    public /* synthetic */ b(Q6.c cVar, java.lang.Throwable th, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : cVar, (i6 & 2) != 0 ? null : th, (i6 & 4) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.f7037D;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f7038E;
    }
}
