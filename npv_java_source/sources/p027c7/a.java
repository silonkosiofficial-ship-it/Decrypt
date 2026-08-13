package p027c7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final int a(java.nio.charset.CharsetDecoder charsetDecoder, p149o9.q qVar, java.lang.Appendable appendable, int i6) {
        p247y7.AbstractC7350t.f(charsetDecoder, "<this>");
        p247y7.AbstractC7350t.f(qVar, "input");
        p247y7.AbstractC7350t.f(appendable, "dst");
        if (p247y7.AbstractC7350t.b(f(charsetDecoder), S8.C1631d.f12624b)) {
            java.lang.String strB = p149o9.s.b(qVar);
            appendable.append(strB);
            return strB.length();
        }
        long jD = p037d7.d.d(qVar);
        appendable.append(p159p9.b.a(p149o9.b.a(qVar), f(charsetDecoder)));
        return (int) jD;
    }

    public static final int b(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i6, int i10, p149o9.p pVar) {
        p247y7.AbstractC7350t.f(charsetEncoder, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "input");
        p247y7.AbstractC7350t.f(pVar, "dst");
        byte[] bArrC = c(charsetEncoder, charSequence, i6, i10);
        p149o9.o.a(pVar, bArrC, 0, 0, 6, null);
        return bArrC.length;
    }

    public static final byte[] c(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charsetEncoder, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (!(charSequence instanceof java.lang.String)) {
            return d(charsetEncoder, charSequence, i6, i10);
        }
        if (i6 == 0) {
            java.lang.String str = (java.lang.String) charSequence;
            if (i10 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
                return bytes;
            }
        }
        java.lang.String strSubstring = ((java.lang.String) charSequence).substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        p247y7.AbstractC7350t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        p247y7.AbstractC7350t.e(bytes2, "getBytes(...)");
        return bytes2;
    }

    private static final byte[] d(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i6, int i10) throws java.nio.charset.CharacterCodingException {
        java.nio.ByteBuffer byteBufferEncode = charsetEncoder.encode(java.nio.CharBuffer.wrap(charSequence, i6, i10));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final java.nio.charset.Charset e(S8.C1631d c1631d, java.lang.String str) {
        p247y7.AbstractC7350t.f(c1631d, "<this>");
        p247y7.AbstractC7350t.f(str, "name");
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str);
        p247y7.AbstractC7350t.e(charsetForName, "forName(...)");
        return charsetForName;
    }

    public static final java.nio.charset.Charset f(java.nio.charset.CharsetDecoder charsetDecoder) {
        p247y7.AbstractC7350t.f(charsetDecoder, "<this>");
        java.nio.charset.Charset charset = charsetDecoder.charset();
        p247y7.AbstractC7350t.c(charset);
        return charset;
    }

    public static final java.lang.String g(java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(charset, "<this>");
        java.lang.String strName = charset.name();
        p247y7.AbstractC7350t.e(strName, "name(...)");
        return strName;
    }
}
