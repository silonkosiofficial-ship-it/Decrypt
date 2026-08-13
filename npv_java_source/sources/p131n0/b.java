package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(float f6, float f10) {
        return p131n0.a.b((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static /* synthetic */ long b(float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            f10 = f6;
        }
        return a(f6, f10);
    }
}
