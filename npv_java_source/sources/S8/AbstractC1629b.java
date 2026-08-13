package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: S8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1629b {
    public static int a(int i6) {
        if (2 <= i6 && i6 < 37) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException("radix " + i6 + " was not in valid range " + new E7.i(2, 36));
    }

    public static final int b(char c6, int i6) {
        return java.lang.Character.digit((int) c6, i6);
    }

    public static boolean c(char c6) {
        return java.lang.Character.isWhitespace(c6) || java.lang.Character.isSpaceChar(c6);
    }
}
