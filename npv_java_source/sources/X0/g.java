package X0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i6, int i10, int i11) {
        return i6 | (i10 << 8) | (i11 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i6) {
        return i6 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i6) {
        return (i6 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i6) {
        return (i6 >> 16) & 255;
    }
}
