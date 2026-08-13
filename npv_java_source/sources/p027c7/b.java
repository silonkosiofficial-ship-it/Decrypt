package p027c7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final java.lang.String a(java.nio.charset.CharsetDecoder charsetDecoder, p149o9.q qVar, int i6) {
        p247y7.AbstractC7350t.f(charsetDecoder, "<this>");
        p247y7.AbstractC7350t.f(qVar, "input");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(i6, qVar.d().r()));
        p027c7.a.a(charsetDecoder, qVar, sb, i6);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String b(java.nio.charset.CharsetDecoder charsetDecoder, p149o9.q qVar, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, qVar, i6);
    }

    public static final p149o9.q c(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charsetEncoder, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "input");
        p149o9.a aVar = new p149o9.a();
        e(charsetEncoder, aVar, charSequence, i6, i10);
        return aVar;
    }

    public static /* synthetic */ p149o9.q d(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i6, i10);
    }

    public static final void e(java.nio.charset.CharsetEncoder charsetEncoder, p149o9.p pVar, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charsetEncoder, "<this>");
        p247y7.AbstractC7350t.f(pVar, "destination");
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (i6 >= i10) {
            return;
        }
        do {
            int iB = p027c7.a.b(charsetEncoder, charSequence, i6, i10, pVar);
            if (iB < 0) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            i6 += iB;
        } while (i6 < i10);
    }
}
