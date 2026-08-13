package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47935a;

    static {
        int[] iArr = new int[j$.time.temporal.i.values().length];
        f47935a = iArr;
        try {
            iArr[j$.time.temporal.i.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47935a[j$.time.temporal.i.QUARTER_YEARS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
