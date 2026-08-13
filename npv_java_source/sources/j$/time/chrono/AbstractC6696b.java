package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC6696b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47725a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f47725a = iArr;
        try {
            iArr[j$.time.temporal.b.DAYS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47725a[j$.time.temporal.b.WEEKS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47725a[j$.time.temporal.b.MONTHS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f47725a[j$.time.temporal.b.YEARS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f47725a[j$.time.temporal.b.DECADES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f47725a[j$.time.temporal.b.CENTURIES.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f47725a[j$.time.temporal.b.MILLENNIA.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f47725a[j$.time.temporal.b.ERAS.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
    }
}
