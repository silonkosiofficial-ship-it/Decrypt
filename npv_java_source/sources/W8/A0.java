package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 extends java.util.concurrent.CancellationException implements W8.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final transient W8.InterfaceC1822z0 f15424C;

    public A0(java.lang.String str, java.lang.Throwable th, W8.InterfaceC1822z0 interfaceC1822z0) {
        super(str);
        this.f15424C = interfaceC1822z0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // W8.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W8.A0 a() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof W8.A0) {
                W8.A0 a6 = (W8.A0) obj;
                if (!p247y7.AbstractC7350t.b(a6.getMessage(), getMessage()) || !p247y7.AbstractC7350t.b(a6.f15424C, this.f15424C) || !p247y7.AbstractC7350t.b(a6.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        java.lang.String message = getMessage();
        p247y7.AbstractC7350t.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f15424C.hashCode()) * 31;
        java.lang.Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return super.toString() + "; job=" + this.f15424C;
    }
}
