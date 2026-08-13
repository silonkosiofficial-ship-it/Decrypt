package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class O implements p258z9.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f57683a = p258z9.C7398k.f57769c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57684b;

    private final void e(int i6, int i10, java.lang.String str) {
        byte b6;
        int length = str.length();
        while (i6 < length) {
            int iG = g(i10, 2);
            char cCharAt = str.charAt(i6);
            if (cCharAt >= p258z9.e0.a().length || (b6 = p258z9.e0.a()[cCharAt]) == 0) {
                int i11 = iG + 1;
                this.f57683a[iG] = cCharAt;
                i10 = i11;
            } else {
                if (b6 == 1) {
                    java.lang.String str2 = p258z9.e0.b()[cCharAt];
                    p247y7.AbstractC7350t.c(str2);
                    int iG2 = g(iG, str2.length());
                    str2.getChars(0, str2.length(), this.f57683a, iG2);
                    i10 = iG2 + str2.length();
                } else {
                    char[] cArr = this.f57683a;
                    cArr[iG] = '\\';
                    cArr[iG + 1] = (char) b6;
                    i10 = iG + 2;
                }
                this.f57684b = i10;
            }
            i6++;
        }
        int iG3 = g(i10, 1);
        this.f57683a[iG3] = '\"';
        this.f57684b = iG3 + 1;
    }

    private final void f(int i6) {
        g(this.f57684b, i6);
    }

    private final int g(int i6, int i10) {
        int i11 = i10 + i6;
        char[] cArr = this.f57683a;
        if (cArr.length <= i11) {
            char[] cArrCopyOf = java.util.Arrays.copyOf(cArr, E7.j.d(i11, i6 * 2));
            p247y7.AbstractC7350t.e(cArrCopyOf, "copyOf(...)");
            this.f57683a = cArrCopyOf;
        }
        return i6;
    }

    @Override // p258z9.A
    public void a(char c6) {
        f(1);
        char[] cArr = this.f57683a;
        int i6 = this.f57684b;
        this.f57684b = i6 + 1;
        cArr[i6] = c6;
    }

    @Override // p258z9.A
    public void b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "text");
        f(str.length() + 2);
        char[] cArr = this.f57683a;
        int i6 = this.f57684b;
        int i10 = i6 + 1;
        cArr[i6] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        for (int i12 = i10; i12 < i11; i12++) {
            char c6 = cArr[i12];
            if (c6 < p258z9.e0.a().length && p258z9.e0.a()[c6] != 0) {
                e(i12 - i10, i12, str);
                return;
            }
        }
        cArr[i11] = '\"';
        this.f57684b = i11 + 1;
    }

    @Override // p258z9.A
    public void c(long j6) {
        d(java.lang.String.valueOf(j6));
    }

    @Override // p258z9.A
    public void d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(length);
        str.getChars(0, str.length(), this.f57683a, this.f57684b);
        this.f57684b += length;
    }

    public void h() {
        p258z9.C7398k.f57769c.c(this.f57683a);
    }

    public java.lang.String toString() {
        return new java.lang.String(this.f57683a, 0, this.f57684b);
    }
}
