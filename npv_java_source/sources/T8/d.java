package T8;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    NANOSECONDS(java.util.concurrent.TimeUnit.NANOSECONDS),
    MICROSECONDS(java.util.concurrent.TimeUnit.MICROSECONDS),
    MILLISECONDS(java.util.concurrent.TimeUnit.MILLISECONDS),
    SECONDS(java.util.concurrent.TimeUnit.SECONDS),
    MINUTES(java.util.concurrent.TimeUnit.MINUTES),
    HOURS(java.util.concurrent.TimeUnit.HOURS),
    DAYS(java.util.concurrent.TimeUnit.DAYS);


    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f13327L = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.TimeUnit f13328C;

    d(java.util.concurrent.TimeUnit timeUnit) {
        this.f13328C = timeUnit;
    }

    public final java.util.concurrent.TimeUnit g() {
        return this.f13328C;
    }
}
