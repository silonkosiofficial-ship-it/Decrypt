package p000a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f16990a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.StackTraceElement b(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new java.lang.StackTraceElement(f16990a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
