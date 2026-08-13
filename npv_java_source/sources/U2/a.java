package U2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14475i;

    private a(java.lang.String str, java.lang.String str2, int i6) {
        this.f14467a = str;
        this.f14468b = str2;
        this.f14469c = i6;
        this.f14471e = (i6 & 1) != 0;
        this.f14473g = (i6 & 2) != 0;
        this.f14474h = (i6 & 4) != 0;
        this.f14475i = (i6 & 8) != 0;
        this.f14472f = (i6 & 16) != 0;
        this.f14470d = (i6 & 32) != 0;
    }

    public static U2.a a() {
        return new U2.a("RTC_STATUS_EMPTY_SESSION_ID", "RTC_STATUS_EMPTY_ANDROID_ID", 0);
    }
}
