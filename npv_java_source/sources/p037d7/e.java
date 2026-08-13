package p037d7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final java.lang.String a(p149o9.q qVar, java.nio.charset.Charset charset, int i6) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        if (p247y7.AbstractC7350t.b(charset, S8.C1631d.f12624b)) {
            return i6 == Integer.MAX_VALUE ? p149o9.s.b(qVar) : p149o9.s.c(qVar, java.lang.Math.min(qVar.d().r(), i6));
        }
        return p027c7.b.a(charset.newDecoder(), qVar, i6);
    }

    public static /* synthetic */ java.lang.String b(p149o9.q qVar, java.nio.charset.Charset charset, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charset = S8.C1631d.f12624b;
        }
        if ((i10 & 2) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return a(qVar, charset, i6);
    }

    public static final byte[] c(java.lang.String str, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        return p247y7.AbstractC7350t.b(charset, S8.C1631d.f12624b) ? S8.r.H(str, 0, 0, true, 3, null) : p027c7.a.c(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ byte[] d(java.lang.String str, java.nio.charset.Charset charset, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            charset = S8.C1631d.f12624b;
        }
        return c(str, charset);
    }

    public static final void e(p149o9.p pVar, java.lang.CharSequence charSequence, int i6, int i10, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "text");
        p247y7.AbstractC7350t.f(charset, "charset");
        if (charset == S8.C1631d.f12624b) {
            p149o9.s.d(pVar, charSequence.toString(), i6, i10);
        } else {
            p027c7.b.e(charset.newEncoder(), pVar, charSequence, i6, i10);
        }
    }

    public static /* synthetic */ void f(p149o9.p pVar, java.lang.CharSequence charSequence, int i6, int i10, java.nio.charset.Charset charset, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = charSequence.length();
        }
        if ((i11 & 8) != 0) {
            charset = S8.C1631d.f12624b;
        }
        e(pVar, charSequence, i6, i10, charset);
    }
}
