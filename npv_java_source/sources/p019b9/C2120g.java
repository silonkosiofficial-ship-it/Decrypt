package p019b9;

/* JADX INFO: renamed from: b9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2120g extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final transient p127m7.i f24354C;

    public C2120g(p127m7.i iVar) {
        this.f24354C = iVar;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public java.lang.String getLocalizedMessage() {
        return this.f24354C.toString();
    }
}
