package j$.time;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47901a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f47901a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47901a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
