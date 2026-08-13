package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final boolean a(char c6) {
        return java.lang.Character.toLowerCase(c6) == c6;
    }

    public static final char[] b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i6 = 0; i6 < length; i6++) {
            cArr[i6] = str.charAt(i6);
        }
        return cArr;
    }
}
