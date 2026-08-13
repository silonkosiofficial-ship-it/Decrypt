package p019b9;

/* JADX INFO: renamed from: b9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2125l {
    public static final void a(int i6) {
        if (i6 >= 1) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Expected positive parallelism level, but got " + i6).toString());
    }

    public static final W8.J b(W8.J j6, java.lang.String str) {
        return str != null ? new p019b9.v(j6, str) : j6;
    }
}
