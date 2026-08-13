package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.q0.b f22107a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b6, byte b10, byte b11, byte b12, char[] cArr, int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (m(b10) || (((b6 << 28) + (b10 + 112)) >> 30) != 0 || m(b11) || m(b12)) {
                throw androidx.datastore.preferences.protobuf.C2065z.d();
            }
            int iR = ((b6 & 7) << 18) | (r(b10) << 12) | (r(b11) << 6) | r(b12);
            cArr[i6] = l(iR);
            cArr[i6 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b6, char[] cArr, int i6) {
            cArr[i6] = (char) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b6, byte b10, byte b11, char[] cArr, int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (m(b10) || ((b6 == -32 && b10 < -96) || ((b6 == -19 && b10 >= -96) || m(b11)))) {
                throw androidx.datastore.preferences.protobuf.C2065z.d();
            }
            cArr[i6] = (char) (((b6 & 15) << 12) | (r(b10) << 6) | r(b11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b6, byte b10, char[] cArr, int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (b6 < -62 || m(b10)) {
                throw androidx.datastore.preferences.protobuf.C2065z.d();
            }
            cArr[i6] = (char) (((b6 & 31) << 6) | r(b10));
        }

        private static char l(int i6) {
            return (char) ((i6 >>> 10) + 55232);
        }

        private static boolean m(byte b6) {
            return b6 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b6) {
            return b6 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b6) {
            return b6 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b6) {
            return b6 < -32;
        }

        private static char q(int i6) {
            return (char) ((i6 & 1023) + 56320);
        }

        private static int r(byte b6) {
            return b6 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract java.lang.String a(byte[] bArr, int i6, int i10);

        abstract int b(java.lang.CharSequence charSequence, byte[] bArr, int i6, int i10);

        final boolean c(byte[] bArr, int i6, int i10) {
            return d(0, bArr, i6, i10) == 0;
        }

        abstract int d(int i6, byte[] bArr, int i10, int i11);
    }

    static final class c extends androidx.datastore.preferences.protobuf.q0.b {
        c() {
        }

        private static int e(byte[] bArr, int i6, int i10) {
            while (i6 < i10 && bArr[i6] >= 0) {
                i6++;
            }
            if (i6 >= i10) {
                return 0;
            }
            return f(bArr, i6, i10);
        }

        private static int f(byte[] bArr, int i6, int i10) {
            while (i6 < i10) {
                int i11 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i11 >= i10) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i6 += 2;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 >= -16) {
                        if (i11 >= i10 - 2) {
                            return androidx.datastore.preferences.protobuf.q0.l(bArr, i11, i10);
                        }
                        int i12 = i6 + 2;
                        byte b10 = bArr[i11];
                        if (b10 <= -65 && (((b6 << 28) + (b10 + 112)) >> 30) == 0) {
                            int i13 = i6 + 3;
                            if (bArr[i12] <= -65) {
                                i6 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= i10 - 1) {
                        return androidx.datastore.preferences.protobuf.q0.l(bArr, i11, i10);
                    }
                    int i14 = i6 + 2;
                    byte b11 = bArr[i11];
                    if (b11 <= -65 && ((b6 != -32 || b11 >= -96) && (b6 != -19 || b11 < -96))) {
                        i6 += 3;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                i6 = i11;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        java.lang.String a(byte[] bArr, int i6, int i10) throws androidx.datastore.preferences.protobuf.C2065z {
            if ((i6 | i10 | ((bArr.length - i6) - i10)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
            }
            int i11 = i6 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i6 < i11) {
                byte b6 = bArr[i6];
                if (!androidx.datastore.preferences.protobuf.q0.a.n(b6)) {
                    break;
                }
                i6++;
                androidx.datastore.preferences.protobuf.q0.a.i(b6, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i6 < i11) {
                int i14 = i6 + 1;
                byte b10 = bArr[i6];
                if (androidx.datastore.preferences.protobuf.q0.a.n(b10)) {
                    int i15 = i13 + 1;
                    androidx.datastore.preferences.protobuf.q0.a.i(b10, cArr, i13);
                    while (i14 < i11) {
                        byte b11 = bArr[i14];
                        if (!androidx.datastore.preferences.protobuf.q0.a.n(b11)) {
                            break;
                        }
                        i14++;
                        androidx.datastore.preferences.protobuf.q0.a.i(b11, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i6 = i14;
                } else if (androidx.datastore.preferences.protobuf.q0.a.p(b10)) {
                    if (i14 >= i11) {
                        throw androidx.datastore.preferences.protobuf.C2065z.d();
                    }
                    i6 += 2;
                    androidx.datastore.preferences.protobuf.q0.a.k(b10, bArr[i14], cArr, i13);
                    i13++;
                } else if (androidx.datastore.preferences.protobuf.q0.a.o(b10)) {
                    if (i14 >= i11 - 1) {
                        throw androidx.datastore.preferences.protobuf.C2065z.d();
                    }
                    int i16 = i6 + 2;
                    i6 += 3;
                    androidx.datastore.preferences.protobuf.q0.a.j(b10, bArr[i14], bArr[i16], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw androidx.datastore.preferences.protobuf.C2065z.d();
                    }
                    byte b12 = bArr[i14];
                    int i17 = i6 + 3;
                    byte b13 = bArr[i6 + 2];
                    i6 += 4;
                    androidx.datastore.preferences.protobuf.q0.a.h(b10, b12, b13, bArr[i17], cArr, i13);
                    i13 += 2;
                }
            }
            return new java.lang.String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        int b(java.lang.CharSequence charSequence, byte[] bArr, int i6, int i10) {
            int i11;
            int i12;
            char cCharAt;
            int length = charSequence.length();
            int i13 = i10 + i6;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i6) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
                bArr[i12] = (byte) cCharAt;
                i14++;
            }
            if (i14 == length) {
                return i6 + length;
            }
            int i15 = i6 + i14;
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && i15 < i13) {
                    bArr[i15] = (byte) cCharAt2;
                    i15++;
                } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                    i15 += 2;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                        if (i15 > i13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                throw new androidx.datastore.preferences.protobuf.q0.d(i14, length);
                            }
                            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                        }
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i18 = i15 + 3;
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        throw new androidx.datastore.preferences.protobuf.q0.d(i14 - 1, length);
                    }
                    bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i19 = i15 + 2;
                    bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i15 += 3;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                }
                i14++;
            }
            return i15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.q0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.q0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.c.d(int, byte[], int, int):int");
        }
    }

    static class d extends java.lang.IllegalArgumentException {
        d(int i6, int i10) {
            super("Unpaired surrogate at index " + i6 + " of " + i10);
        }
    }

    static final class e extends androidx.datastore.preferences.protobuf.q0.b {
        e() {
        }

        static boolean e() {
            return androidx.datastore.preferences.protobuf.p0.E() && androidx.datastore.preferences.protobuf.p0.F();
        }

        private static int f(byte[] bArr, long j6, int i6) {
            int iG = g(bArr, j6, i6);
            int i10 = i6 - iG;
            long j10 = j6 + ((long) iG);
            while (true) {
                byte bU = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    bU = androidx.datastore.preferences.protobuf.p0.u(bArr, j10);
                    if (bU < 0) {
                        j10 = j11;
                        break;
                    }
                    i10--;
                    j10 = j11;
                }
                if (i10 == 0) {
                    return 0;
                }
                int i11 = i10 - 1;
                if (bU < -32) {
                    if (i11 == 0) {
                        return bU;
                    }
                    i10 -= 2;
                    if (bU >= -62) {
                        long j12 = 1 + j10;
                        if (androidx.datastore.preferences.protobuf.p0.u(bArr, j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (bU >= -16) {
                    if (i11 < 3) {
                        return h(bArr, bU, j10, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte bU2 = androidx.datastore.preferences.protobuf.p0.u(bArr, j10);
                    if (bU2 <= -65 && (((bU << 28) + (bU2 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (androidx.datastore.preferences.protobuf.p0.u(bArr, j13) <= -65) {
                            j10 += 3;
                            if (androidx.datastore.preferences.protobuf.p0.u(bArr, j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return h(bArr, bU, j10, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte bU3 = androidx.datastore.preferences.protobuf.p0.u(bArr, j10);
                if (bU3 <= -65 && ((bU != -32 || bU3 >= -96) && (bU != -19 || bU3 < -96))) {
                    j10 += 2;
                    if (androidx.datastore.preferences.protobuf.p0.u(bArr, j15) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int g(byte[] bArr, long j6, int i6) {
            int i10 = 0;
            if (i6 < 16) {
                return 0;
            }
            int i11 = 8 - (((int) j6) & 7);
            while (i10 < i11) {
                long j10 = 1 + j6;
                if (androidx.datastore.preferences.protobuf.p0.u(bArr, j6) < 0) {
                    return i10;
                }
                i10++;
                j6 = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > i6 || (androidx.datastore.preferences.protobuf.p0.A(bArr, androidx.datastore.preferences.protobuf.p0.f22090h + j6) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j6 += 8;
                i10 = i12;
            }
            while (i10 < i6) {
                long j11 = j6 + 1;
                if (androidx.datastore.preferences.protobuf.p0.u(bArr, j6) < 0) {
                    return i10;
                }
                i10++;
                j6 = j11;
            }
            return i6;
        }

        private static int h(byte[] bArr, int i6, long j6, int i10) {
            if (i10 == 0) {
                return androidx.datastore.preferences.protobuf.q0.i(i6);
            }
            if (i10 == 1) {
                return androidx.datastore.preferences.protobuf.q0.j(i6, androidx.datastore.preferences.protobuf.p0.u(bArr, j6));
            }
            if (i10 == 2) {
                return androidx.datastore.preferences.protobuf.q0.k(i6, androidx.datastore.preferences.protobuf.p0.u(bArr, j6), androidx.datastore.preferences.protobuf.p0.u(bArr, j6 + 1));
            }
            throw new java.lang.AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        java.lang.String a(byte[] bArr, int i6, int i10) throws androidx.datastore.preferences.protobuf.C2065z {
            java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b;
            java.lang.String str = new java.lang.String(bArr, i6, i10, charset);
            if (str.contains("�") && !java.util.Arrays.equals(str.getBytes(charset), java.util.Arrays.copyOfRange(bArr, i6, i10 + i6))) {
                throw androidx.datastore.preferences.protobuf.C2065z.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        int b(java.lang.CharSequence charSequence, byte[] bArr, int i6, int i10) {
            long j6;
            java.lang.String str;
            java.lang.String str2;
            int i11;
            long j10;
            char cCharAt;
            long j11 = i6;
            long j12 = ((long) i10) + j11;
            int length = charSequence.length();
            java.lang.String str3 = " at index ";
            java.lang.String str4 = "Failed writing ";
            if (length > i10 || bArr.length - i10 < i6) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i6 + i10));
            }
            int i12 = 0;
            while (true) {
                j6 = 1;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                androidx.datastore.preferences.protobuf.p0.K(bArr, j11, (byte) cCharAt);
                i12++;
                j11 = 1 + j11;
            }
            if (i12 == length) {
                return (int) j11;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 >= 128 || j11 >= j12) {
                    if (cCharAt2 >= 2048 || j11 > j12 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j11 > j12 - 3) {
                            if (j11 > j12 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                    throw new androidx.datastore.preferences.protobuf.q0.d(i12, length);
                                }
                                throw new java.lang.ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j11);
                            }
                            int i13 = i12 + 1;
                            if (i13 != length) {
                                char cCharAt3 = charSequence.charAt(i13);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    j10 = 1;
                                    androidx.datastore.preferences.protobuf.p0.K(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                                    androidx.datastore.preferences.protobuf.p0.K(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = j11 + 3;
                                    androidx.datastore.preferences.protobuf.p0.K(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j11 += 4;
                                    androidx.datastore.preferences.protobuf.p0.K(bArr, j13, (byte) ((codePoint & 63) | 128));
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            throw new androidx.datastore.preferences.protobuf.q0.d(i12 - 1, length);
                        }
                        androidx.datastore.preferences.protobuf.p0.K(bArr, j11, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = j11 + 2;
                        androidx.datastore.preferences.protobuf.p0.K(bArr, j11 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j11 += 3;
                        androidx.datastore.preferences.protobuf.p0.K(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j15 = j11 + j6;
                        androidx.datastore.preferences.protobuf.p0.K(bArr, j11, (byte) ((cCharAt2 >>> 6) | 960));
                        j11 += 2;
                        androidx.datastore.preferences.protobuf.p0.K(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j10 = 1;
                } else {
                    androidx.datastore.preferences.protobuf.p0.K(bArr, j11, (byte) cCharAt2);
                    str2 = str4;
                    j10 = j6;
                    j11 += j6;
                    str = str3;
                }
                i12++;
                str3 = str;
                str4 = str2;
                j6 = j10;
                j12 = j12;
            }
            return (int) j11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.u(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.u(r13, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f22107a = (!androidx.datastore.preferences.protobuf.q0.e.e() || androidx.datastore.preferences.protobuf.AbstractC2044d.c()) ? new androidx.datastore.preferences.protobuf.q0.c() : new androidx.datastore.preferences.protobuf.q0.e();
    }

    static java.lang.String e(byte[] bArr, int i6, int i10) {
        return f22107a.a(bArr, i6, i10);
    }

    static int f(java.lang.CharSequence charSequence, byte[] bArr, int i6, int i10) {
        return f22107a.b(charSequence, bArr, i6, i10);
    }

    static int g(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int iH = length;
        while (i6 < length) {
            char cCharAt = charSequence.charAt(i6);
            if (cCharAt >= 2048) {
                iH += h(charSequence, i6);
                break;
            }
            iH += (127 - cCharAt) >>> 31;
            i6++;
        }
        if (iH >= length) {
            return iH;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + 4294967296L));
    }

    private static int h(java.lang.CharSequence charSequence, int i6) {
        int length = charSequence.length();
        int i10 = 0;
        while (i6 < length) {
            char cCharAt = charSequence.charAt(i6);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (java.lang.Character.codePointAt(charSequence, i6) < 65536) {
                        throw new androidx.datastore.preferences.protobuf.q0.d(i6, length);
                    }
                    i6++;
                }
            }
            i6++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i6) {
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i6, int i10) {
        if (i6 > -12 || i10 > -65) {
            return -1;
        }
        return i6 ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i6, int i10, int i11) {
        if (i6 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i6 ^ (i10 << 8)) ^ (i11 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i6, int i10) {
        byte b6 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 == 0) {
            return i(b6);
        }
        if (i11 == 1) {
            return j(b6, bArr[i6]);
        }
        if (i11 == 2) {
            return k(b6, bArr[i6], bArr[i6 + 1]);
        }
        throw new java.lang.AssertionError();
    }

    static boolean m(byte[] bArr) {
        return f22107a.c(bArr, 0, bArr.length);
    }

    static boolean n(byte[] bArr, int i6, int i10) {
        return f22107a.c(bArr, i6, i10);
    }
}
