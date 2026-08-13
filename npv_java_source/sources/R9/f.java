package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends java.util.logging.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9.f f9793a = new R9.f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(java.util.logging.LogRecord logRecord) {
        p247y7.AbstractC7350t.f(logRecord, "record");
        R9.e eVar = R9.e.f9790a;
        java.lang.String loggerName = logRecord.getLoggerName();
        p247y7.AbstractC7350t.e(loggerName, "record.loggerName");
        int iB = R9.g.b(logRecord);
        java.lang.String message = logRecord.getMessage();
        p247y7.AbstractC7350t.e(message, "record.message");
        eVar.a(loggerName, iB, message, logRecord.getThrown());
    }
}
