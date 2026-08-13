package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4827pj0 extends com.google.android.gms.internal.ads.AbstractC5156sj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C4387lj0 f38055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.lang.Character f38056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.AbstractC5156sj0 f38057d;

    C4827pj0(com.google.android.gms.internal.ads.C4387lj0 c4387lj0, java.lang.Character ch) {
        this.f38055b = c4387lj0;
        boolean z6 = true;
        if (ch != null && c4387lj0.e('=')) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.AbstractC2164Ag0.i(z6, "Padding character %s was already in alphabet", ch);
        this.f38056c = ch;
    }

    C4827pj0(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.C4387lj0(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    int a(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.C4717oj0 {
        com.google.android.gms.internal.ads.C4387lj0 c4387lj0;
        java.lang.CharSequence charSequenceF = f(charSequence);
        if (!this.f38055b.d(charSequenceF.length())) {
            throw new com.google.android.gms.internal.ads.C4717oj0("Invalid input length " + charSequenceF.length());
        }
        int i6 = 0;
        int i10 = 0;
        while (i6 < charSequenceF.length()) {
            long jB = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                c4387lj0 = this.f38055b;
                if (i11 >= c4387lj0.f37210e) {
                    break;
                }
                jB <<= c4387lj0.f37209d;
                if (i6 + i11 < charSequenceF.length()) {
                    jB |= (long) this.f38055b.b(charSequenceF.charAt(i12 + i6));
                    i12++;
                }
                i11++;
            }
            int i13 = c4387lj0.f37211f;
            int i14 = i12 * c4387lj0.f37209d;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i10] = (byte) ((jB >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i6 += this.f38055b.f37210e;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    void b(java.lang.Appendable appendable, byte[] bArr, int i6, int i10) {
        int i11 = 0;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(0, i10, bArr.length);
        while (i11 < i10) {
            k(appendable, bArr, i11, java.lang.Math.min(this.f38055b.f37211f, i10 - i11));
            i11 += this.f38055b.f37211f;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    final int c(int i6) {
        return (int) (((((long) this.f38055b.f37209d) * ((long) i6)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    final int d(int i6) {
        com.google.android.gms.internal.ads.C4387lj0 c4387lj0 = this.f38055b;
        return c4387lj0.f37210e * com.google.android.gms.internal.ads.AbstractC2207Bj0.b(i6, c4387lj0.f37211f, java.math.RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    public final com.google.android.gms.internal.ads.AbstractC5156sj0 e() {
        com.google.android.gms.internal.ads.AbstractC5156sj0 abstractC5156sj0J = this.f38057d;
        if (abstractC5156sj0J == null) {
            com.google.android.gms.internal.ads.C4387lj0 c4387lj0 = this.f38055b;
            com.google.android.gms.internal.ads.C4387lj0 c4387lj0C = c4387lj0.c();
            abstractC5156sj0J = c4387lj0C == c4387lj0 ? this : j(c4387lj0C, this.f38056c);
            this.f38057d = abstractC5156sj0J;
        }
        return abstractC5156sj0J;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C4827pj0) {
            com.google.android.gms.internal.ads.C4827pj0 c4827pj0 = (com.google.android.gms.internal.ads.C4827pj0) obj;
            if (this.f38055b.equals(c4827pj0.f38055b) && j$.util.Objects.equals(this.f38056c, c4827pj0.f38056c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5156sj0
    final java.lang.CharSequence f(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        if (this.f38056c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        java.lang.Character ch = this.f38056c;
        return j$.util.Objects.hashCode(ch) ^ this.f38055b.hashCode();
    }

    com.google.android.gms.internal.ads.AbstractC5156sj0 j(com.google.android.gms.internal.ads.C4387lj0 c4387lj0, java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.C4827pj0(c4387lj0, ch);
    }

    final void k(java.lang.Appendable appendable, byte[] bArr, int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(i6, i6 + i10, bArr.length);
        int i11 = 0;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.e(i10 <= this.f38055b.f37211f);
        long j6 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j6 = (j6 | ((long) (bArr[i6 + i12] & 255))) << 8;
        }
        int i13 = (i10 + 1) * 8;
        com.google.android.gms.internal.ads.C4387lj0 c4387lj0 = this.f38055b;
        while (i11 < i10 * 8) {
            long j10 = j6 >>> ((i13 - c4387lj0.f37209d) - i11);
            com.google.android.gms.internal.ads.C4387lj0 c4387lj1 = this.f38055b;
            appendable.append(c4387lj1.a(((int) j10) & c4387lj1.f37208c));
            i11 += this.f38055b.f37209d;
        }
        if (this.f38056c != null) {
            while (i11 < this.f38055b.f37211f * 8) {
                this.f38056c.charValue();
                appendable.append('=');
                i11 += this.f38055b.f37209d;
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        sb.append(this.f38055b);
        if (8 % this.f38055b.f37209d != 0) {
            if (this.f38056c == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f38056c);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
