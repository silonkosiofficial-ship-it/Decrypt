package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: S8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1630c extends S8.AbstractC1629b {
    public static final boolean d(char c6, char c10, boolean z6) {
        if (c6 == c10) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c6);
        char upperCase2 = java.lang.Character.toUpperCase(c10);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }

    public static boolean e(char c6) {
        return 55296 <= c6 && c6 < 57344;
    }
}
