package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f47990a;

    static {
        int[] iArr = new int[j$.time.zone.d.values().length];
        f47990a = iArr;
        try {
            iArr[j$.time.zone.d.UTC.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f47990a[j$.time.zone.d.STANDARD.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
