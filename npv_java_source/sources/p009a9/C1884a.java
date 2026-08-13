package p009a9;

/* JADX INFO: renamed from: a9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1884a extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final transient java.lang.Object f17155C;

    public C1884a(java.lang.Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f17155C = obj;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
