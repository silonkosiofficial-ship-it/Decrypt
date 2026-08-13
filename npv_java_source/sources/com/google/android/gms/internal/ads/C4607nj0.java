package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4607nj0 extends com.google.android.gms.internal.ads.C4827pj0 {
    private C4607nj0(com.google.android.gms.internal.ads.C4387lj0 c4387lj0, java.lang.Character ch) {
        super(c4387lj0, ch);
        com.google.android.gms.internal.ads.AbstractC2164Ag0.e(c4387lj0.f37207b.length == 64);
    }

    C4607nj0(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.C4387lj0(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0, com.google.android.gms.internal.ads.AbstractC5156sj0
    final int a(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.C4717oj0 {
        java.lang.CharSequence charSequenceF = f(charSequence);
        if (!this.f38055b.d(charSequenceF.length())) {
            throw new com.google.android.gms.internal.ads.C4717oj0("Invalid input length " + charSequenceF.length());
        }
        int i6 = 0;
        int i10 = 0;
        while (i6 < charSequenceF.length()) {
            int i11 = i10 + 1;
            int iB = (this.f38055b.b(charSequenceF.charAt(i6)) << 18) | (this.f38055b.b(charSequenceF.charAt(i6 + 1)) << 12);
            bArr[i10] = (byte) (iB >>> 16);
            int i12 = i6 + 2;
            if (i12 < charSequenceF.length()) {
                int i13 = i6 + 3;
                int iB2 = iB | (this.f38055b.b(charSequenceF.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iB2 >>> 8) & 255);
                if (i13 < charSequenceF.length()) {
                    i6 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iB2 | this.f38055b.b(charSequenceF.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i6 = i13;
                }
            } else {
                i6 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0, com.google.android.gms.internal.ads.AbstractC5156sj0
    final void b(java.lang.Appendable appendable, byte[] bArr, int i6, int i10) throws java.io.IOException {
        int i11 = 0;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.f38055b.a(i14 >>> 18));
            appendable.append(this.f38055b.a((i14 >>> 12) & 63));
            appendable.append(this.f38055b.a((i14 >>> 6) & 63));
            appendable.append(this.f38055b.a(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            k(appendable, bArr, i11, i10 - i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0
    final com.google.android.gms.internal.ads.AbstractC5156sj0 j(com.google.android.gms.internal.ads.C4387lj0 c4387lj0, java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.C4607nj0(c4387lj0, ch);
    }
}
