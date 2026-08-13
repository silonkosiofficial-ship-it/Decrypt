package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3943hg0 extends com.google.android.gms.internal.ads.AbstractC3833gg0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final char f36109C;

    C3943hg0(char c6) {
        this.f36109C = c6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4271kg0
    public final boolean a(char c6) {
        return c6 == this.f36109C;
    }

    public final java.lang.String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i6 = this.f36109C;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i6 & 15);
            i6 >>= 4;
        }
        return "CharMatcher.is('" + java.lang.String.copyValueOf(cArr) + "')";
    }
}
