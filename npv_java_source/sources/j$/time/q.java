package j$.time;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f47915b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f47915b = iArr;
        try {
            iArr[j$.time.temporal.b.MONTHS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47915b[j$.time.temporal.b.YEARS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47915b[j$.time.temporal.b.DECADES.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f47915b[j$.time.temporal.b.CENTURIES.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f47915b[j$.time.temporal.b.MILLENNIA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f47915b[j$.time.temporal.b.ERAS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f47914a = iArr2;
        try {
            iArr2[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f47914a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f47914a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f47914a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f47914a[j$.time.temporal.a.ERA.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
    }
}
