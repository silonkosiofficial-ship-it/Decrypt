package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4497mj0 extends com.google.android.gms.internal.ads.C4827pj0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final char[] f37395e;

    private C4497mj0(com.google.android.gms.internal.ads.C4387lj0 c4387lj0) {
        super(c4387lj0, null);
        this.f37395e = new char[512];
        com.google.android.gms.internal.ads.AbstractC2164Ag0.e(c4387lj0.f37207b.length == 16);
        for (int i6 = 0; i6 < 256; i6++) {
            this.f37395e[i6] = c4387lj0.a(i6 >>> 4);
            this.f37395e[i6 | 256] = c4387lj0.a(i6 & 15);
        }
    }

    C4497mj0(java.lang.String str, java.lang.String str2) {
        this(new com.google.android.gms.internal.ads.C4387lj0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0, com.google.android.gms.internal.ads.AbstractC5156sj0
    final int a(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.C4717oj0 {
        if (charSequence.length() % 2 == 1) {
            throw new com.google.android.gms.internal.ads.C4717oj0("Invalid input length " + charSequence.length());
        }
        int i6 = 0;
        int i10 = 0;
        while (i6 < charSequence.length()) {
            bArr[i10] = (byte) ((this.f38055b.b(charSequence.charAt(i6)) << 4) | this.f38055b.b(charSequence.charAt(i6 + 1)));
            i6 += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0, com.google.android.gms.internal.ads.AbstractC5156sj0
    final void b(java.lang.Appendable appendable, byte[] bArr, int i6, int i10) throws java.io.IOException {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            appendable.append(this.f37395e[i12]);
            appendable.append(this.f37395e[i12 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C4827pj0
    final com.google.android.gms.internal.ads.AbstractC5156sj0 j(com.google.android.gms.internal.ads.C4387lj0 c4387lj0, java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.C4497mj0(c4387lj0);
    }
}
