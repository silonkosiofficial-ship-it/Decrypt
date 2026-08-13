package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC6851z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f48606a;

    static {
        int[] iArr = new int[j$.util.stream.EnumC6761g3.values().length];
        f48606a = iArr;
        try {
            iArr[j$.util.stream.EnumC6761g3.REFERENCE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f48606a[j$.util.stream.EnumC6761g3.INT_VALUE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f48606a[j$.util.stream.EnumC6761g3.LONG_VALUE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f48606a[j$.util.stream.EnumC6761g3.DOUBLE_VALUE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
