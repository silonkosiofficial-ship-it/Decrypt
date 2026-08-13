package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4387lj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f37207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f37208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f37209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f37210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f37211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f37212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f37213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f37214i;

    /* JADX WARN: Illegal instructions before constructor call */
    C4387lj0(java.lang.String str, char[] cArr) {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < cArr.length; i6++) {
            char c6 = cArr[i6];
            boolean z6 = true;
            com.google.android.gms.internal.ads.AbstractC2164Ag0.g(c6 < 128, "Non-ASCII character: %s", c6);
            if (bArr[c6] != -1) {
                z6 = false;
            }
            com.google.android.gms.internal.ads.AbstractC2164Ag0.g(z6, "Duplicate character: %s", c6);
            bArr[c6] = (byte) i6;
        }
        this(str, cArr, bArr, false);
    }

    private C4387lj0(java.lang.String str, char[] cArr, byte[] bArr, boolean z6) {
        this.f37206a = str;
        cArr.getClass();
        this.f37207b = cArr;
        try {
            int length = cArr.length;
            int iC = com.google.android.gms.internal.ads.AbstractC2207Bj0.c(length, java.math.RoundingMode.UNNECESSARY);
            this.f37209d = iC;
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(iC);
            int i6 = 1 << (3 - iNumberOfTrailingZeros);
            this.f37210e = i6;
            this.f37211f = iC >> iNumberOfTrailingZeros;
            this.f37208c = length - 1;
            this.f37212g = bArr;
            boolean[] zArr = new boolean[i6];
            for (int i10 = 0; i10 < this.f37211f; i10++) {
                zArr[com.google.android.gms.internal.ads.AbstractC2207Bj0.b(i10 * 8, this.f37209d, java.math.RoundingMode.CEILING)] = true;
            }
            this.f37213h = zArr;
            this.f37214i = z6;
        } catch (java.lang.ArithmeticException e6) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e6);
        }
    }

    final char a(int i6) {
        return this.f37207b[i6];
    }

    final int b(char c6) throws com.google.android.gms.internal.ads.C4717oj0 {
        if (c6 > 127) {
            throw new com.google.android.gms.internal.ads.C4717oj0("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c6))));
        }
        byte b6 = this.f37212g[c6];
        if (b6 != -1) {
            return b6;
        }
        if (c6 <= ' ' || c6 == 127) {
            throw new com.google.android.gms.internal.ads.C4717oj0("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c6))));
        }
        throw new com.google.android.gms.internal.ads.C4717oj0("Unrecognized character: " + c6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    final com.google.android.gms.internal.ads.C4387lj0 c() {
        boolean z6;
        int i6 = 0;
        while (true) {
            char[] cArr = this.f37207b;
            if (i6 >= cArr.length) {
                return this;
            }
            if (com.google.android.gms.internal.ads.AbstractC3723fg0.e(cArr[i6])) {
                int i10 = 0;
                while (true) {
                    if (i10 >= cArr.length) {
                        z6 = false;
                        break;
                    }
                    if (com.google.android.gms.internal.ads.AbstractC3723fg0.d(cArr[i10])) {
                        z6 = true;
                        break;
                    }
                    i10++;
                }
                com.google.android.gms.internal.ads.AbstractC2164Ag0.m(!z6, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f37207b.length];
                int i11 = 0;
                while (true) {
                    char[] cArr3 = this.f37207b;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c6 = cArr3[i11];
                    if (com.google.android.gms.internal.ads.AbstractC3723fg0.e(c6)) {
                        c6 ^= 32;
                    }
                    cArr2[i11] = (char) c6;
                    i11++;
                }
                com.google.android.gms.internal.ads.C4387lj0 c4387lj0 = new com.google.android.gms.internal.ads.C4387lj0(this.f37206a.concat(".lowerCase()"), cArr2);
                if (!this.f37214i || c4387lj0.f37214i) {
                    return c4387lj0;
                }
                byte[] bArr = c4387lj0.f37212g;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                for (int i12 = 65; i12 <= 90; i12++) {
                    int i13 = i12 | 32;
                    byte[] bArr2 = c4387lj0.f37212g;
                    byte b6 = bArr2[i12];
                    byte b10 = bArr2[i13];
                    if (b6 == -1) {
                        bArrCopyOf[i12] = b10;
                    } else {
                        char c10 = (char) i12;
                        char c11 = (char) i13;
                        if (b10 != -1) {
                            throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(c10), java.lang.Character.valueOf(c11)));
                        }
                        bArrCopyOf[i13] = b6;
                    }
                }
                return new com.google.android.gms.internal.ads.C4387lj0(c4387lj0.f37206a.concat(".ignoreCase()"), c4387lj0.f37207b, bArrCopyOf, true);
            }
            i6++;
        }
    }

    final boolean d(int i6) {
        return this.f37213h[i6 % this.f37210e];
    }

    public final boolean e(char c6) {
        byte[] bArr = this.f37212g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C4387lj0) {
            com.google.android.gms.internal.ads.C4387lj0 c4387lj0 = (com.google.android.gms.internal.ads.C4387lj0) obj;
            if (this.f37214i == c4387lj0.f37214i && java.util.Arrays.equals(this.f37207b, c4387lj0.f37207b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f37207b) + (true != this.f37214i ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return this.f37206a;
    }
}
