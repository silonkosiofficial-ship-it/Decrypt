package p207u7;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p207u7.a.C0726a f55545d = new p207u7.a.C0726a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f55546e = {13, 10};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p207u7.a f55547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p207u7.a f55548g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f55549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f55550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.a.b f55551c;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    public static final class C0726a extends p207u7.a {
        /* JADX WARN: Illegal instructions before constructor call */
        private C0726a() {
            boolean z6 = false;
            super(z6, z6, u7.a.b.PRESENT, null);
        }

        public /* synthetic */ C0726a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;


        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f55557H = p157p7.b.a(e());
    }

    static {
        u7.a.b bVar = u7.a.b.PRESENT;
        f55547f = new p207u7.a(true, false, bVar);
        f55548g = new p207u7.a(false, true, bVar);
    }

    private a(boolean z6, boolean z10, u7.a.b bVar) {
        this.f55549a = z6;
        this.f55550b = z10;
        this.f55551c = bVar;
        if (z6 && z10) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ a(boolean z6, boolean z10, u7.a.b bVar, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, z10, bVar);
    }

    private final void b(int i6, int i10, int i11) {
        if (i10 < 0 || i10 > i6) {
            throw new java.lang.IndexOutOfBoundsException("destination offset: " + i10 + ", destination size: " + i6);
        }
        int i12 = i10 + i11;
        if (i12 < 0 || i12 > i6) {
            throw new java.lang.IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i10 + ", destination size: " + i6 + ", capacity needed: " + i11);
        }
    }

    private final void c(int i6) {
        if (this.f55551c != u7.a.b.ABSENT) {
            return;
        }
        throw new java.lang.IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i6);
    }

    public static /* synthetic */ byte[] g(p207u7.a aVar, java.lang.CharSequence charSequence, int i6, int i10, int i11, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = charSequence.length();
        }
        return aVar.e(charSequence, i6, i10);
    }

    public static /* synthetic */ byte[] h(p207u7.a aVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return aVar.f(bArr, i6, i10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0082 A[SYNTHETIC] */
    private final int i(byte[] bArr, byte[] bArr2, int i6, int i10, int i11) {
        boolean z6;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f55549a ? p207u7.b.f55561d : p207u7.b.f55559b;
        int i15 = -8;
        int i16 = i6;
        int iP = i10;
        int i17 = -8;
        int i18 = 0;
        while (true) {
            if (iP >= i11) {
                z6 = false;
                break;
            }
            if (i17 != i15 || iP + 3 >= i11) {
                i12 = bArr[iP] & 255;
                i13 = iArr[i12];
                if (i13 < 0) {
                    iP++;
                    i18 = (i18 << 6) | i13;
                    i14 = i17 + 6;
                    if (i14 >= 0) {
                        bArr2[i16] = (byte) (i18 >>> i14);
                        i18 &= (1 << i14) - 1;
                        i17 -= 2;
                        i16++;
                    } else {
                        i17 = i14;
                    }
                } else {
                    if (i13 == -2) {
                        iP = p(bArr, iP, i11, i17);
                        z6 = true;
                        break;
                    }
                    if (this.f55550b) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Invalid symbol '");
                        sb.append((char) i12);
                        sb.append("'(");
                        java.lang.String string = java.lang.Integer.toString(i12, S8.AbstractC1628a.a(8));
                        p247y7.AbstractC7350t.e(string, "toString(...)");
                        sb.append(string);
                        sb.append(") at index ");
                        sb.append(iP);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    iP++;
                }
            } else {
                int i19 = iP + 4;
                int i20 = (iArr[bArr[iP + 1] & 255] << 12) | (iArr[bArr[iP] & 255] << 18) | (iArr[bArr[iP + 2] & 255] << 6) | iArr[bArr[iP + 3] & 255];
                if (i20 >= 0) {
                    bArr2[i16] = (byte) (i20 >> 16);
                    int i21 = i16 + 2;
                    bArr2[i16 + 1] = (byte) (i20 >> 8);
                    i16 += 3;
                    bArr2[i21] = (byte) i20;
                    iP = i19;
                } else {
                    i12 = bArr[iP] & 255;
                    i13 = iArr[i12];
                    if (i13 < 0) {
                        iP++;
                        i18 = (i18 << 6) | i13;
                        i14 = i17 + 6;
                        if (i14 >= 0) {
                            bArr2[i16] = (byte) (i18 >>> i14);
                            i18 &= (1 << i14) - 1;
                            i17 -= 2;
                            i16++;
                        } else {
                            i17 = i14;
                        }
                    } else {
                        if (i13 == -2) {
                            iP = p(bArr, iP, i11, i17);
                            z6 = true;
                            break;
                        }
                        if (this.f55550b) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append("Invalid symbol '");
                            sb2.append((char) i12);
                            sb2.append("'(");
                            java.lang.String string2 = java.lang.Integer.toString(i12, S8.AbstractC1628a.a(8));
                            p247y7.AbstractC7350t.e(string2, "toString(...)");
                            sb2.append(string2);
                            sb2.append(") at index ");
                            sb2.append(iP);
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                        }
                        iP++;
                    }
                }
            }
            i15 = -8;
        }
        if (i17 == -2) {
            throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i17 != -8 && !z6 && this.f55551c == u7.a.b.PRESENT) {
            throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i18 != 0) {
            throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
        }
        int iR = r(bArr, iP, i11);
        if (iR >= i11) {
            return i16 - i6;
        }
        int i22 = bArr[iR] & 255;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i22);
        sb3.append("'(");
        java.lang.String string3 = java.lang.Integer.toString(i22, S8.AbstractC1628a.a(8));
        p247y7.AbstractC7350t.e(string3, "toString(...)");
        sb3.append(string3);
        sb3.append(") at index ");
        sb3.append(iR - 1);
        sb3.append(" is prohibited after the pad character");
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ java.lang.String l(p207u7.a aVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return aVar.k(bArr, i6, i10);
    }

    private final int p(byte[] bArr, int i6, int i10, int i11) {
        if (i11 == -8) {
            throw new java.lang.IllegalArgumentException("Redundant pad character at index " + i6);
        }
        if (i11 == -6) {
            c(i6);
        } else if (i11 == -4) {
            c(i6);
            i6 = r(bArr, i6 + 1, i10);
            if (i6 == i10 || bArr[i6] != 61) {
                throw new java.lang.IllegalArgumentException("Missing one pad character at index " + i6);
            }
        } else if (i11 != -2) {
            throw new java.lang.IllegalStateException("Unreachable".toString());
        }
        return i6 + 1;
    }

    private final boolean q() {
        u7.a.b bVar = this.f55551c;
        return bVar == u7.a.b.PRESENT || bVar == u7.a.b.PRESENT_OPTIONAL;
    }

    private final int r(byte[] bArr, int i6, int i10) {
        if (!this.f55550b) {
            return i6;
        }
        while (i6 < i10) {
            if (p207u7.b.f55559b[bArr[i6] & 255] != -1) {
                return i6;
            }
            i6++;
        }
        return i6;
    }

    public final byte[] a(java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charSequence, "source");
        d(charSequence.length(), i6, i10);
        byte[] bArr = new byte[i10 - i6];
        int i11 = 0;
        while (i6 < i10) {
            char cCharAt = charSequence.charAt(i6);
            if (cCharAt <= 255) {
                bArr[i11] = (byte) cCharAt;
                i11++;
            } else {
                bArr[i11] = 63;
                i11++;
            }
            i6++;
        }
        return bArr;
    }

    public final void d(int i6, int i10, int i11) {
        p097j7.AbstractC6862d.f49298C.a(i10, i11, i6);
    }

    public final byte[] e(java.lang.CharSequence charSequence, int i6, int i10) {
        byte[] bArrA;
        p247y7.AbstractC7350t.f(charSequence, "source");
        if (charSequence instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) charSequence;
            d(str.length(), i6, i10);
            java.lang.String strSubstring = str.substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            java.nio.charset.Charset charset = S8.C1631d.f12629g;
            p247y7.AbstractC7350t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrA = strSubstring.getBytes(charset);
            p247y7.AbstractC7350t.e(bArrA, "getBytes(...)");
        } else {
            bArrA = a(charSequence, i6, i10);
        }
        return h(this, bArrA, 0, 0, 6, null);
    }

    public final byte[] f(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        d(bArr.length, i6, i10);
        int iJ = j(bArr, i6, i10);
        byte[] bArr2 = new byte[iJ];
        if (i(bArr, bArr2, 0, i6, i10) == iJ) {
            return bArr2;
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final int j(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        int i11 = i10 - i6;
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            throw new java.lang.IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i6 + ", endIndex: " + i10);
        }
        if (this.f55550b) {
            while (i6 < i10) {
                int i12 = p207u7.b.f55559b[bArr[i6] & 255];
                if (i12 < 0) {
                    if (i12 == -2) {
                        i11 -= i10 - i6;
                        break;
                    }
                    i11--;
                }
                i6++;
            }
        } else if (bArr[i10 - 1] == 61) {
            i11 = bArr[i10 + (-2)] == 61 ? i11 - 2 : i11 - 1;
        }
        return (int) ((((long) i11) * ((long) 6)) / ((long) 8));
    }

    public final java.lang.String k(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        return new java.lang.String(o(bArr, i6, i10), S8.C1631d.f12629g);
    }

    public final int m(byte[] bArr, byte[] bArr2, int i6, int i10, int i11) {
        int i12 = i10;
        p247y7.AbstractC7350t.f(bArr, "source");
        p247y7.AbstractC7350t.f(bArr2, "destination");
        d(bArr.length, i12, i11);
        b(bArr2.length, i6, n(i11 - i12));
        byte[] bArr3 = this.f55549a ? p207u7.b.f55560c : p207u7.b.f55558a;
        int i13 = this.f55550b ? 19 : Integer.MAX_VALUE;
        int i14 = i6;
        while (i12 + 2 < i11) {
            int iMin = java.lang.Math.min((i11 - i12) / 3, i13);
            for (int i15 = 0; i15 < iMin; i15++) {
                int i16 = bArr[i12] & 255;
                int i17 = i12 + 2;
                int i18 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i19 = (i18 << 8) | (i16 << 16) | (bArr[i17] & 255);
                bArr2[i14] = bArr3[i19 >>> 18];
                bArr2[i14 + 1] = bArr3[(i19 >>> 12) & 63];
                int i20 = i14 + 3;
                bArr2[i14 + 2] = bArr3[(i19 >>> 6) & 63];
                i14 += 4;
                bArr2[i20] = bArr3[i19 & 63];
            }
            if (iMin == i13 && i12 != i11) {
                int i21 = i14 + 1;
                byte[] bArr4 = f55546e;
                bArr2[i14] = bArr4[0];
                i14 += 2;
                bArr2[i21] = bArr4[1];
            }
        }
        int i22 = i11 - i12;
        if (i22 == 1) {
            int i23 = i12 + 1;
            int i24 = (bArr[i12] & 255) << 4;
            bArr2[i14] = bArr3[i24 >>> 6];
            int i25 = i14 + 2;
            bArr2[i14 + 1] = bArr3[i24 & 63];
            if (q()) {
                int i26 = i14 + 3;
                bArr2[i25] = 61;
                i14 += 4;
                bArr2[i26] = 61;
                i12 = i23;
            } else {
                i12 = i23;
                i14 = i25;
            }
        } else if (i22 == 2) {
            int i27 = i12 + 1;
            int i28 = bArr[i12] & 255;
            i12 += 2;
            int i29 = ((bArr[i27] & 255) << 2) | (i28 << 10);
            bArr2[i14] = bArr3[i29 >>> 12];
            bArr2[i14 + 1] = bArr3[(i29 >>> 6) & 63];
            int i30 = i14 + 3;
            bArr2[i14 + 2] = bArr3[i29 & 63];
            if (q()) {
                i14 += 4;
                bArr2[i30] = 61;
            } else {
                i14 = i30;
            }
        }
        if (i12 == i11) {
            return i14 - i6;
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final int n(int i6) {
        int i10 = i6 / 3;
        int i11 = i6 % 3;
        int i12 = i10 * 4;
        if (i11 != 0) {
            i12 += q() ? 4 : i11 + 1;
        }
        if (this.f55550b) {
            i12 += ((i12 - 1) / 76) * 2;
        }
        if (i12 >= 0) {
            return i12;
        }
        throw new java.lang.IllegalArgumentException("Input is too big");
    }

    public final byte[] o(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        d(bArr.length, i6, i10);
        byte[] bArr2 = new byte[n(i10 - i6)];
        m(bArr, bArr2, 0, i6, i10);
        return bArr2;
    }
}
