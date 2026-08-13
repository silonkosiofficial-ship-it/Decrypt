package S8;

/* JADX INFO: renamed from: S8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1635h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(java.lang.String str) {
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (p247y7.AbstractC7350t.g(cCharAt, 128) >= 0 || java.lang.Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
