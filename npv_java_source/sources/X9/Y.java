package X9;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends X9.C1835c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.net.Socket f16109o;

    public Y(java.net.Socket socket) {
        p247y7.AbstractC7350t.f(socket, "socket");
        this.f16109o = socket;
    }

    @Override // X9.C1835c
    protected void B() {
        java.util.logging.Level level;
        java.lang.StringBuilder sb;
        java.util.logging.Logger logger;
        java.lang.Throwable th;
        try {
            this.f16109o.close();
        } catch (java.lang.AssertionError e6) {
            if (!X9.K.c(e6)) {
                throw e6;
            }
            java.util.logging.Logger logger2 = X9.L.f16077a;
            level = java.util.logging.Level.WARNING;
            sb = new java.lang.StringBuilder();
            th = e6;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f16109o);
            logger.log(level, sb.toString(), th);
        } catch (java.lang.Exception e10) {
            java.util.logging.Logger logger3 = X9.L.f16077a;
            level = java.util.logging.Level.WARNING;
            sb = new java.lang.StringBuilder();
            th = e10;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f16109o);
            logger.log(level, sb.toString(), th);
        }
    }

    @Override // X9.C1835c
    protected java.io.IOException x(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
