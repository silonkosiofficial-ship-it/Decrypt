package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Throwable f47668a;

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    /* JADX WARN: Multi-variable type inference failed */
    public n(java.lang.Throwable th) {
        java.lang.Throwable iOException;
        if (th == 0) {
            iOException = null;
        } else if (th instanceof java.util.concurrent.CancellationException) {
            if (th instanceof W8.D) {
                iOException = ((W8.D) th).a();
            } else {
                java.lang.String message = ((java.util.concurrent.CancellationException) th).getMessage();
                iOException = W8.AbstractC1801o0.a(message == null ? "Channel was cancelled" : message, th);
            }
        } else if ((th instanceof java.io.IOException) && (th instanceof W8.D)) {
            iOException = ((W8.D) th).a();
        } else {
            java.lang.String message2 = th.getMessage();
            iOException = new java.io.IOException(message2 == null ? "Channel was closed" : message2, th);
        }
        this.f47668a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final java.lang.Throwable a() {
        ?? r6;
        java.lang.Object obj = this.f47668a;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.io.IOException) {
            return obj instanceof W8.D ? ((W8.D) obj).a() : new java.io.IOException(((java.io.IOException) this.f47668a).getMessage(), this.f47668a);
        }
        if (obj instanceof W8.D) {
            java.lang.Throwable thA = ((W8.D) obj).a();
            if (thA != null) {
                r6 = obj;
                return thA;
            }
            r6 = obj;
            r6 = this.f47668a;
        }
        r6 = obj;
        return W8.AbstractC1801o0.a(r6.getMessage(), this.f47668a);
    }
}
