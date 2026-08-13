package X9;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.logging.Logger f16077a = java.util.logging.Logger.getLogger("okio.Okio");

    public static final boolean b(java.lang.AssertionError assertionError) {
        p247y7.AbstractC7350t.f(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        java.lang.String message = assertionError.getMessage();
        return message != null ? S8.r.c0(message, "getsockname failed", false, 2, null) : false;
    }

    public static final X9.X c(java.net.Socket socket) throws java.io.IOException {
        p247y7.AbstractC7350t.f(socket, "<this>");
        X9.Y y6 = new X9.Y(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        p247y7.AbstractC7350t.e(outputStream, "getOutputStream(...)");
        return y6.z(new X9.O(outputStream, y6));
    }

    public static final X9.Z d(java.io.File file) {
        p247y7.AbstractC7350t.f(file, "<this>");
        return new X9.C1849q(new java.io.FileInputStream(file), X9.a0.f16113e);
    }

    public static final X9.Z e(java.io.InputStream inputStream) {
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        return new X9.C1849q(inputStream, new X9.a0());
    }

    public static final X9.Z f(java.net.Socket socket) throws java.io.IOException {
        p247y7.AbstractC7350t.f(socket, "<this>");
        X9.Y y6 = new X9.Y(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        p247y7.AbstractC7350t.e(inputStream, "getInputStream(...)");
        return y6.A(new X9.C1849q(inputStream, y6));
    }
}
