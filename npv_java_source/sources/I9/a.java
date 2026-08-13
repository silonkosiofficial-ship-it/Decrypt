package I9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final boolean a(java.lang.String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (p247y7.AbstractC7350t.g(cCharAt, 31) <= 0 || p247y7.AbstractC7350t.g(cCharAt, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) >= 0 || S8.r.o0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(java.lang.String str, int i6, int i10, byte[] bArr, int i11) {
        int i12 = i11;
        while (i6 < i10) {
            if (i12 == bArr.length) {
                return false;
            }
            if (i12 != i11) {
                if (str.charAt(i6) != '.') {
                    return false;
                }
                i6++;
            }
            int i13 = i6;
            int i14 = 0;
            while (i13 < i10) {
                char cCharAt = str.charAt(i13);
                if (p247y7.AbstractC7350t.g(cCharAt, 48) < 0 || p247y7.AbstractC7350t.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i14 == 0 && i6 != i13) || (i14 = ((i14 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i13++;
            }
            if (i13 - i6 == 0) {
                return false;
            }
            bArr[i12] = (byte) i14;
            i12++;
            i6 = i13;
        }
        return i12 == i11 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[EDGE_INSN: B:54:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    private static final java.net.InetAddress c(java.lang.String str, int i6, int i10) {
        int i11;
        int i12;
        int iH;
        byte[] bArr = new byte[16];
        int i13 = i6;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (i13 < i10) {
            if (i16 == 16) {
                return null;
            }
            int i17 = i13 + 2;
            if (i17 <= i10 && S8.r.U(str, "::", i13, false, 4, null)) {
                if (i14 != -1) {
                    return null;
                }
                i16 += 2;
                if (i17 == i10) {
                    i14 = i16;
                    break;
                }
                i15 = i17;
                i14 = i16;
                i13 = i15;
                i11 = 0;
                while (i13 < i10) {
                    iH = I9.d.H(str.charAt(i13));
                    if (iH != -1) {
                        break;
                        break;
                    }
                    i11 = (i11 << 4) + iH;
                    i13++;
                }
                i12 = i13 - i15;
                if (i12 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!S8.r.U(str, ":", i13, false, 4, null)) {
                    if (!S8.r.U(str, ".", i13, false, 4, null) || !b(str, i15, i10, bArr, i16 - 2)) {
                        return null;
                    }
                    i16 += 2;
                    break;
                }
                i13++;
            }
            i15 = i13;
            i13 = i15;
            i11 = 0;
            while (i13 < i10) {
                iH = I9.d.H(str.charAt(i13));
                if (iH != -1) {
                    break;
                }
                i11 = (i11 << 4) + iH;
                i13++;
            }
            i12 = i13 - i15;
            if (i12 != 0 || i12 > 4) {
                return null;
            }
            int i18 = i16 + 1;
            bArr[i16] = (byte) ((i11 >>> 8) & 255);
            i16 += 2;
            bArr[i18] = (byte) (i11 & 255);
        }
        if (i16 != 16) {
            if (i14 == -1) {
                return null;
            }
            int i19 = i16 - i14;
            java.lang.System.arraycopy(bArr, i14, bArr, 16 - i19, i19);
            java.util.Arrays.fill(bArr, i14, (16 - i16) + i14, (byte) 0);
        }
        return java.net.InetAddress.getByAddress(bArr);
    }

    private static final java.lang.String d(byte[] bArr) {
        int i6 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i11;
            while (i13 < 16 && bArr[i13] == 0 && bArr[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i6 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        X9.C1836d c1836d = new X9.C1836d();
        while (i10 < bArr.length) {
            if (i10 == i6) {
                c1836d.U(58);
                i10 += i12;
                if (i10 == 16) {
                    c1836d.U(58);
                }
            } else {
                if (i10 > 0) {
                    c1836d.U(58);
                }
                c1836d.D0((I9.d.d(bArr[i10], 255) << 8) | I9.d.d(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return c1836d.Y0();
    }

    public static final java.lang.String e(java.lang.String str) {
        int length;
        p247y7.AbstractC7350t.f(str, "<this>");
        int i6 = 0;
        if (!S8.r.c0(str, ":", false, 2, null)) {
            try {
                java.lang.String ascii = java.net.IDN.toASCII(str);
                p247y7.AbstractC7350t.e(ascii, "toASCII(host)");
                java.util.Locale locale = java.util.Locale.US;
                p247y7.AbstractC7350t.e(locale, "US");
                java.lang.String lowerCase = ascii.toLowerCase(locale);
                p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        if (S8.r.V(str, "[", false, 2, null) && S8.r.J(str, "]", false, 2, null)) {
            i6 = 1;
            length = str.length() - 1;
        } else {
            length = str.length();
        }
        java.net.InetAddress inetAddressC = c(str, i6, length);
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            p247y7.AbstractC7350t.e(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new java.lang.AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
