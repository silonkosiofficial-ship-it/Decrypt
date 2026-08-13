package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC6705c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47830a;

    static {
        int[] iArr = new int[j$.time.format.D.values().length];
        f47830a = iArr;
        try {
            iArr[j$.time.format.D.EXCEEDS_PAD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47830a[j$.time.format.D.ALWAYS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f47830a[j$.time.format.D.NORMAL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f47830a[j$.time.format.D.NOT_NEGATIVE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
