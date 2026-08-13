package j$.time;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47898a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f47898a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47898a[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
