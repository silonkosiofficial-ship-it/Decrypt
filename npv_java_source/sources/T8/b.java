package T8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f13317a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.ThreadLocal[] f13318b;

    static {
        java.lang.ThreadLocal[] threadLocalArr = new java.lang.ThreadLocal[4];
        for (int i6 = 0; i6 < 4; i6++) {
            threadLocalArr[i6] = new java.lang.ThreadLocal();
        }
        f13318b = threadLocalArr;
    }

    public static final boolean a() {
        return f13317a;
    }
}
