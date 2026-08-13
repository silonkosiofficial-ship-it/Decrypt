package T6;

/* JADX INFO: renamed from: T6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1658f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set f13096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f13097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f13098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.List f13099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Set f13100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Set f13101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.List f13102g;

    static {
        java.util.List listC0 = p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.A0(new E7.c('a', 'z'), new E7.c('A', 'Z')), new E7.c('0', '9'));
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC0, 10));
        java.util.Iterator it = listC0.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it.next()).charValue()));
        }
        f13096a = p097j7.AbstractC6879v.Y0(arrayList);
        f13097b = p097j7.AbstractC6879v.Y0(p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.A0(new E7.c('a', 'z'), new E7.c('A', 'Z')), new E7.c('0', '9')));
        f13098c = p097j7.AbstractC6879v.Y0(p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.A0(new E7.c('a', 'f'), new E7.c('A', 'F')), new E7.c('0', '9')));
        java.util.Set setG = p097j7.Z.g(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setG, 10));
        java.util.Iterator it2 = setG.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it2.next()).charValue()));
        }
        f13099d = arrayList2;
        f13100e = p097j7.Z.g(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        f13101f = p097j7.Z.j(f13097b, p097j7.Z.g('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        java.util.List listP = p097j7.AbstractC6879v.p('-', '.', '_', '~');
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listP, 10));
        java.util.Iterator it3 = listP.iterator();
        while (it3.hasNext()) {
            arrayList3.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it3.next()).charValue()));
        }
        f13102g = arrayList3;
    }

    private static final int e(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        if ('a' > c6 || c6 >= 'g') {
            return -1;
        }
        return c6 - 'W';
    }

    private static final java.lang.String f(java.lang.CharSequence charSequence, int i6, int i10, int i11, boolean z6, java.nio.charset.Charset charset) throws T6.P {
        int i12;
        int i13 = i10 - i6;
        if (i13 > 255) {
            i13 /= 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i13);
        if (i11 > i6) {
            sb.append(charSequence, i6, i11);
        }
        byte[] bArr = null;
        while (i11 < i10) {
            char cCharAt = charSequence.charAt(i11);
            if (z6 && cCharAt == '+') {
                cCharAt = ' ';
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i10 - i11) / 3];
                }
                int i14 = 0;
                while (true) {
                    i12 = i14;
                    if (i11 >= i10 || charSequence.charAt(i11) != '%') {
                        break;
                    }
                    int i15 = i11 + 2;
                    if (i15 >= i10) {
                        throw new T6.P("Incomplete trailing HEX escape: " + charSequence.subSequence(i11, charSequence.length()).toString() + ", in " + ((java.lang.Object) charSequence) + " at " + i11);
                    }
                    int i16 = i11 + 1;
                    int iE = e(charSequence.charAt(i16));
                    int iE2 = e(charSequence.charAt(i15));
                    if (iE == -1 || iE2 == -1) {
                        throw new T6.P("Wrong HEX escape: %" + charSequence.charAt(i16) + charSequence.charAt(i15) + ", in " + ((java.lang.Object) charSequence) + ", at " + i11);
                    }
                    i14 = i12 + 1;
                    bArr[i12] = (byte) ((iE * 16) + iE2);
                    i11 += 3;
                }
                sb.append(S8.r.E(bArr, 0, i12, false, 4, null));
            }
            sb.append(cCharAt);
            i11++;
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    private static final java.lang.String g(java.lang.String str, int i6, int i10, boolean z6, java.nio.charset.Charset charset) {
        for (int i11 = i6; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%' || (z6 && cCharAt == '+')) {
                return f(str, i6, i10, i11, z6, charset);
            }
        }
        if (i6 == 0 && i10 == str.length()) {
            return str;
        }
        java.lang.String strSubstring = str.substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.String h(java.lang.String str, int i6, int i10, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        return g(str, i6, i10, false, charset);
    }

    public static /* synthetic */ java.lang.String i(java.lang.String str, int i6, int i10, java.nio.charset.Charset charset, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            charset = S8.C1631d.f12624b;
        }
        return h(str, i6, i10, charset);
    }

    public static final java.lang.String j(java.lang.String str, int i6, int i10, boolean z6, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        return g(str, i6, i10, z6, charset);
    }

    public static /* synthetic */ java.lang.String k(java.lang.String str, int i6, int i10, boolean z6, java.nio.charset.Charset charset, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        if ((i11 & 8) != 0) {
            charset = S8.C1631d.f12624b;
        }
        return j(str, i6, i10, z6, charset);
    }

    public static final java.lang.String l(java.lang.String str, final boolean z6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = S8.C1631d.f12624b.newEncoder();
        p247y7.AbstractC7350t.e(charsetEncoderNewEncoder, "newEncoder(...)");
        w(p027c7.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new p237x7.l() { // from class: T6.b
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return T6.AbstractC1658f.n(sb, z6, ((java.lang.Byte) obj).byteValue());
            }
        });
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String m(java.lang.String str, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return l(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M n(java.lang.StringBuilder sb, boolean z6, byte b6) {
        char c6;
        if (!f13096a.contains(java.lang.Byte.valueOf(b6)) && !f13102g.contains(java.lang.Byte.valueOf(b6))) {
            if (z6 && b6 == 32) {
                c6 = '+';
            } else {
                sb.append(z(b6));
            }
            return p087i7.M.f46721a;
        }
        c6 = (char) b6;
        sb.append(c6);
        return p087i7.M.f46721a;
    }

    public static final java.lang.String o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return l(str, true);
    }

    public static final java.lang.String p(java.lang.String str, boolean z6, boolean z10) {
        int i6;
        p247y7.AbstractC7350t.f(str, "<this>");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.Charset charset = S8.C1631d.f12624b;
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if ((!z6 && cCharAt == '/') || f13097b.contains(java.lang.Character.valueOf(cCharAt)) || f13100e.contains(java.lang.Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i10++;
            } else {
                if (!z10 && cCharAt == '%' && (i6 = i10 + 2) < str.length()) {
                    java.util.Set set = f13098c;
                    int i11 = i10 + 1;
                    if (set.contains(java.lang.Character.valueOf(str.charAt(i11))) && set.contains(java.lang.Character.valueOf(str.charAt(i6)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i11));
                        sb.append(str.charAt(i6));
                        i10 += 3;
                    }
                }
                int i12 = S8.AbstractC1628a.e(cCharAt) ? 2 : 1;
                java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                p247y7.AbstractC7350t.e(charsetEncoderNewEncoder, "newEncoder(...)");
                int i13 = i12 + i10;
                w(p027c7.b.c(charsetEncoderNewEncoder, str, i10, i13), new p237x7.l() { // from class: T6.d
                    @Override // p237x7.l
                    public final java.lang.Object l(java.lang.Object obj) {
                        return T6.AbstractC1658f.r(sb, ((java.lang.Byte) obj).byteValue());
                    }
                });
                i10 = i13;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String q(java.lang.String str, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        if ((i6 & 2) != 0) {
            z10 = true;
        }
        return p(str, z6, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M r(java.lang.StringBuilder sb, byte b6) {
        sb.append(z(b6));
        return p087i7.M.f46721a;
    }

    public static final java.lang.String s(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return q(str, true, false, 2, null);
    }

    public static final java.lang.String t(java.lang.String str, final boolean z6, final boolean z10, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        p247y7.AbstractC7350t.e(charsetEncoderNewEncoder, "newEncoder(...)");
        w(p027c7.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new p237x7.l() { // from class: T6.c
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return T6.AbstractC1658f.v(z10, sb, z6, ((java.lang.Byte) obj).byteValue());
            }
        });
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String u(java.lang.String str, boolean z6, boolean z10, java.nio.charset.Charset charset, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        if ((i6 & 4) != 0) {
            charset = S8.C1631d.f12624b;
        }
        return t(str, z6, z10, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M v(boolean z6, java.lang.StringBuilder sb, boolean z10, byte b6) {
        char c6;
        java.lang.String strZ;
        if (b6 == 32) {
            if (z6) {
                c6 = '+';
                sb.append(c6);
            } else {
                strZ = "%20";
                sb.append(strZ);
            }
        } else if (f13096a.contains(java.lang.Byte.valueOf(b6)) || (!z10 && f13099d.contains(java.lang.Byte.valueOf(b6)))) {
            c6 = (char) b6;
            sb.append(c6);
        } else {
            strZ = z(b6);
            sb.append(strZ);
        }
        return p087i7.M.f46721a;
    }

    private static final void w(p149o9.q qVar, final p237x7.l lVar) {
        p037d7.d.e(qVar, new p237x7.l() { // from class: T6.e
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(T6.AbstractC1658f.x(lVar, (p149o9.a) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(p237x7.l lVar, p149o9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "buffer");
        while (p037d7.a.a(aVar)) {
            lVar.l(java.lang.Byte.valueOf(aVar.m()));
        }
        return true;
    }

    private static final char y(int i6) {
        return (char) ((i6 < 0 || i6 >= 10) ? ((char) (i6 + 65)) - '\n' : i6 + 48);
    }

    private static final java.lang.String z(byte b6) {
        return S8.r.z(new char[]{'%', y((b6 & 255) >> 4), y(b6 & 15)});
    }
}
