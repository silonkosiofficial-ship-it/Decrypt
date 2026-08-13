package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends S8.C {
    public static java.lang.String A(char[] cArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        p097j7.AbstractC6862d.f49298C.a(i6, i10, cArr.length);
        return new java.lang.String(cArr, i6, i10 - i6);
    }

    public static /* synthetic */ java.lang.String B(char[] cArr, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = cArr.length;
        }
        return S8.r.A(cArr, i6, i10);
    }

    public static java.lang.String C(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return new java.lang.String(bArr, S8.C1631d.f12624b);
    }

    public static final java.lang.String D(byte[] bArr, int i6, int i10, boolean z6) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p097j7.AbstractC6862d.f49298C.a(i6, i10, bArr.length);
        if (!z6) {
            return new java.lang.String(bArr, i6, i10 - i6, S8.C1631d.f12624b);
        }
        java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = S8.C1631d.f12624b.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPORT;
        java.lang.String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(java.nio.ByteBuffer.wrap(bArr, i6, i10 - i6)).toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String E(byte[] bArr, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        return D(bArr, i6, i10, z6);
    }

    public static byte[] F(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        byte[] bytes = str.getBytes(S8.C1631d.f12624b);
        p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static final byte[] G(java.lang.String str, int i6, int i10, boolean z6) throws java.nio.charset.CharacterCodingException {
        p247y7.AbstractC7350t.f(str, "<this>");
        p097j7.AbstractC6862d.f49298C.a(i6, i10, str.length());
        if (!z6) {
            java.lang.String strSubstring = str.substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            java.nio.charset.Charset charset = S8.C1631d.f12624b;
            p247y7.AbstractC7350t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
            return bytes;
        }
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = S8.C1631d.f12624b.newEncoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPORT;
        java.nio.ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(java.nio.CharBuffer.wrap(str, i6, i10));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            p247y7.AbstractC7350t.c(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                p247y7.AbstractC7350t.c(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] H(java.lang.String str, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        return G(str, i6, i10, z6);
    }

    public static boolean I(java.lang.String str, java.lang.String str2, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "suffix");
        return !z6 ? str.endsWith(str2) : S8.r.M(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean J(java.lang.String str, java.lang.String str2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return S8.r.I(str, str2, z6);
    }

    public static boolean K(java.lang.String str, java.lang.String str2, boolean z6) {
        if (str == null) {
            return str2 == null;
        }
        return !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static java.util.Comparator L(p247y7.V v6) {
        p247y7.AbstractC7350t.f(v6, "<this>");
        java.util.Comparator comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        p247y7.AbstractC7350t.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean M(java.lang.String str, int i6, java.lang.String str2, int i10, int i11, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "other");
        return !z6 ? str.regionMatches(i6, str2, i10, i11) : str.regionMatches(z6, i6, str2, i10, i11);
    }

    public static java.lang.String N(java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + i6 + '.').toString());
        }
        if (i6 == 0) {
            return "";
        }
        int i10 = 1;
        if (i6 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i6];
            for (int i11 = 0; i11 < i6; i11++) {
                cArr[i11] = cCharAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() * i6);
        if (1 <= i6) {
            while (true) {
                sb.append(charSequence);
                if (i10 == i6) {
                    break;
                }
                i10++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.c(string);
        return string;
    }

    public static final java.lang.String O(java.lang.String str, char c6, char c10, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (!z6) {
            java.lang.String strReplace = str.replace(c6, c10);
            p247y7.AbstractC7350t.e(strReplace, "replace(...)");
            return strReplace;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (S8.AbstractC1630c.d(cCharAt, c6, z6)) {
                cCharAt = c10;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final java.lang.String P(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "oldValue");
        p247y7.AbstractC7350t.f(str3, "newValue");
        int i6 = 0;
        int iL0 = S8.H.l0(str, str2, 0, z6);
        if (iL0 < 0) {
            return str;
        }
        int length = str2.length();
        int iD = E7.j.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        do {
            sb.append((java.lang.CharSequence) str, i6, iL0);
            sb.append(str3);
            i6 = iL0 + length;
            if (iL0 >= str.length()) {
                break;
            }
            iL0 = S8.H.l0(str, str2, iL0 + iD, z6);
        } while (iL0 > 0);
        sb.append((java.lang.CharSequence) str, i6, str.length());
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String Q(java.lang.String str, char c6, char c10, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return O(str, c6, c10, z6);
    }

    public static /* synthetic */ java.lang.String R(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return P(str, str2, str3, z6);
    }

    public static boolean S(java.lang.String str, java.lang.String str2, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "prefix");
        return !z6 ? str.startsWith(str2, i6) : S8.r.M(str, i6, str2, 0, str2.length(), z6);
    }

    public static boolean T(java.lang.String str, java.lang.String str2, boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "prefix");
        return !z6 ? str.startsWith(str2) : S8.r.M(str, 0, str2, 0, str2.length(), z6);
    }

    public static /* synthetic */ boolean U(java.lang.String str, java.lang.String str2, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return S8.r.S(str, str2, i6, z6);
    }

    public static /* synthetic */ boolean V(java.lang.String str, java.lang.String str2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return S8.r.T(str, str2, z6);
    }

    public static java.lang.String z(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        return new java.lang.String(cArr);
    }
}
