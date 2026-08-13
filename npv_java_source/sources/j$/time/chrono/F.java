package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47718a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f47718a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47718a[j$.time.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47718a[j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f47718a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f47718a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f47718a[j$.time.temporal.a.YEAR.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f47718a[j$.time.temporal.a.ERA.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
