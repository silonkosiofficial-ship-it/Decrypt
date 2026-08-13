package Y5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y5.a f16415a = new Y5.a();

    private a() {
    }

    private final char a(int i6) {
        return (char) ((i6 >>> 10) + 55232);
    }

    private final boolean b(int i6) {
        return (i6 >>> 16) == 0;
    }

    private final boolean c(int i6) {
        return (i6 >>> 16) < 17;
    }

    private final char d(int i6) {
        return (char) ((i6 & 1023) + 56320);
    }

    private final void f(int i6, char[] cArr, int i10) {
        cArr[i10 + 1] = d(i6);
        cArr[i10] = a(i6);
    }

    public final char[] e(int i6) {
        if (b(i6)) {
            return new char[]{(char) i6};
        }
        if (!c(i6)) {
            throw new java.lang.IllegalArgumentException();
        }
        char[] cArr = new char[2];
        f(i6, cArr, 0);
        return cArr;
    }
}
