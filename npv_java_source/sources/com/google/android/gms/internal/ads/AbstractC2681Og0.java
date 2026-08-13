package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Og0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2681Og0 extends com.google.android.gms.internal.ads.AbstractC3613eg0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.lang.CharSequence f30548E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f30549F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f30550G = Integer.MAX_VALUE;

    protected AbstractC2681Og0(com.google.android.gms.internal.ads.C2755Qg0 c2755Qg0, java.lang.CharSequence charSequence) {
        this.f30548E = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3613eg0
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        int iC;
        int i6 = this.f30549F;
        while (true) {
            int i10 = this.f30549F;
            if (i10 == -1) {
                b();
                return null;
            }
            int iD = d(i10);
            if (iD == -1) {
                iD = this.f30548E.length();
                this.f30549F = -1;
                iC = -1;
            } else {
                iC = c(iD);
                this.f30549F = iC;
            }
            if (iC != i6) {
                if (i6 < iD) {
                    this.f30548E.charAt(i6);
                }
                if (i6 < iD) {
                    this.f30548E.charAt(iD - 1);
                }
                int i11 = this.f30550G;
                if (i11 == 1) {
                    iD = this.f30548E.length();
                    this.f30549F = -1;
                    if (iD > i6) {
                        this.f30548E.charAt(iD - 1);
                    }
                } else {
                    this.f30550G = i11 - 1;
                }
                return this.f30548E.subSequence(i6, iD).toString();
            }
            int i12 = iC + 1;
            this.f30549F = i12;
            if (i12 > this.f30548E.length()) {
                this.f30549F = -1;
            }
        }
    }

    abstract int c(int i6);

    abstract int d(int i6);
}
