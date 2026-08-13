package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47772a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f47772a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47772a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47772a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
