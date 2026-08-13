package S0;

/* JADX INFO: renamed from: S0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1607o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char[] f12372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12374d;

    public C1607o(char[] cArr, int i6, int i10) {
        this.f12371a = cArr.length;
        this.f12372b = cArr;
        this.f12373c = i6;
        this.f12374d = i10;
    }

    private final void b(int i6, int i10) {
        int i11 = this.f12373c;
        if (i6 < i11 && i10 <= i11) {
            int i12 = i11 - i10;
            char[] cArr = this.f12372b;
            p097j7.AbstractC6872n.h(cArr, cArr, this.f12374d - i12, i10, i11);
            this.f12373c = i6;
            this.f12374d -= i12;
            return;
        }
        if (i6 < i11 && i10 >= i11) {
            this.f12374d = i10 + c();
            this.f12373c = i6;
            return;
        }
        int iC = i6 + c();
        int iC2 = i10 + c();
        int i13 = this.f12374d;
        char[] cArr2 = this.f12372b;
        p097j7.AbstractC6872n.h(cArr2, cArr2, this.f12373c, i13, iC);
        this.f12373c += iC - i13;
        this.f12374d = iC2;
    }

    private final int c() {
        return this.f12374d - this.f12373c;
    }

    private final void f(int i6) {
        if (i6 <= c()) {
            return;
        }
        int iC = i6 - c();
        int i10 = this.f12371a;
        do {
            i10 *= 2;
        } while (i10 - this.f12371a < iC);
        char[] cArr = new char[i10];
        p097j7.AbstractC6872n.h(this.f12372b, cArr, 0, 0, this.f12373c);
        int i11 = this.f12371a;
        int i12 = this.f12374d;
        int i13 = i11 - i12;
        int i14 = i10 - i13;
        p097j7.AbstractC6872n.h(this.f12372b, cArr, i14, i12, i13 + i12);
        this.f12372b = cArr;
        this.f12371a = i10;
        this.f12374d = i14;
    }

    public final void a(java.lang.StringBuilder sb) {
        sb.append(this.f12372b, 0, this.f12373c);
        p247y7.AbstractC7350t.e(sb, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f12372b;
        int i6 = this.f12374d;
        sb.append(cArr, i6, this.f12371a - i6);
        p247y7.AbstractC7350t.e(sb, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int i6) {
        int i10 = this.f12373c;
        return i6 < i10 ? this.f12372b[i6] : this.f12372b[(i6 - i10) + this.f12374d];
    }

    public final int e() {
        return this.f12371a - c();
    }

    public final void g(int i6, int i10, java.lang.String str) {
        f(str.length() - (i10 - i6));
        b(i6, i10);
        S0.AbstractC1608p.b(str, this.f12372b, this.f12373c);
        this.f12373c += str.length();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) sb);
        return sb.toString();
    }
}
