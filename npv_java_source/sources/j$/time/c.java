package j$.time;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f47711b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f47711b = iArr;
        try {
            iArr[j$.time.temporal.b.NANOS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47711b[j$.time.temporal.b.MICROS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47711b[j$.time.temporal.b.MILLIS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f47711b[j$.time.temporal.b.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f47711b[j$.time.temporal.b.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f47711b[j$.time.temporal.b.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f47711b[j$.time.temporal.b.HALF_DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f47711b[j$.time.temporal.b.DAYS.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f47710a = iArr2;
        try {
            iArr2[j$.time.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f47710a[j$.time.temporal.a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f47710a[j$.time.temporal.a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            f47710a[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
