package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements D2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f23805a = I2.j.f("WrkMgrInitializer");

    @Override // D2.a
    public java.util.List a() {
        return java.util.Collections.emptyList();
    }

    @Override // D2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public I2.t b(android.content.Context context) {
        I2.j.c().a(f23805a, "Initializing WorkManager with default configuration.", new java.lang.Throwable[0]);
        I2.t.e(context, new androidx.work.a.b().a());
        return I2.t.d(context);
    }
}
