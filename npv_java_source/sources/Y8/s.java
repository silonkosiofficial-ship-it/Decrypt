package Y8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class s {
    public static final void a(Y8.B b6, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = W8.AbstractC1801o0.a("Channel was consumed, consumer had failed", th);
            }
        }
        b6.o(cancellationExceptionA);
    }
}
