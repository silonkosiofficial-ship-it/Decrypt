package S;

/* JADX INFO: renamed from: S.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1563p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.WeakHashMap f11494a = new java.util.WeakHashMap();

    private static final java.text.NumberFormat a(int i6, int i10, boolean z6) {
        java.lang.String str = i6 + '.' + i10 + '.' + z6 + '.' + java.util.Locale.getDefault().toLanguageTag();
        java.util.WeakHashMap weakHashMap = f11494a;
        java.lang.Object obj = weakHashMap.get(str);
        java.lang.Object obj2 = obj;
        if (obj == null) {
            java.text.NumberFormat integerInstance = java.text.NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z6);
            integerInstance.setMinimumIntegerDigits(i6);
            integerInstance.setMaximumIntegerDigits(i10);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return (java.text.NumberFormat) obj2;
    }

    public static final java.lang.String b(int i6, int i10, int i11, boolean z6) {
        return a(i10, i11, z6).format(java.lang.Integer.valueOf(i6));
    }

    public static /* synthetic */ java.lang.String c(int i6, int i10, int i11, boolean z6, int i12, java.lang.Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 1;
        }
        if ((i12 & 2) != 0) {
            i11 = 40;
        }
        if ((i12 & 4) != 0) {
            z6 = false;
        }
        return b(i6, i10, i11, z6);
    }
}
