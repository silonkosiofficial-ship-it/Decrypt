package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final p149o9.h a(java.io.InputStream inputStream) {
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        return new p149o9.d(inputStream);
    }

    public static final boolean b(java.lang.AssertionError assertionError) {
        p247y7.AbstractC7350t.f(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        java.lang.String message = assertionError.getMessage();
        return message != null ? S8.r.c0(message, "getsockname failed", false, 2, null) : false;
    }
}
