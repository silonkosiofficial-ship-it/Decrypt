package H;

/* JADX INFO: renamed from: H.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1233z {
    public static final int a(java.lang.CharSequence charSequence, int i6) {
        int length = charSequence.length();
        while (i6 < length) {
            if (charSequence.charAt(i6) == '\n') {
                return i6;
            }
            i6++;
        }
        return charSequence.length();
    }

    public static final int b(java.lang.CharSequence charSequence, int i6) {
        while (i6 > 0) {
            if (charSequence.charAt(i6 - 1) == '\n') {
                return i6;
            }
            i6--;
        }
        return 0;
    }

    public static final long c(java.lang.CharSequence charSequence, int i6) {
        return M0.O.b(b(charSequence, i6), a(charSequence, i6));
    }
}
