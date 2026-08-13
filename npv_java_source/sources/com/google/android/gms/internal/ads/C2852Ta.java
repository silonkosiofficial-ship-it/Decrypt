package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2852Ta extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {
    public C2852Ta(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c5316u8, i6, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        this.f38977d.x0(-1L);
        this.f38977d.w0(-1L);
        int[] iArr = (int[]) this.f38978e.invoke(null, this.f38974a.b());
        synchronized (this.f38977d) {
            try {
                this.f38977d.x0(iArr[0]);
                this.f38977d.w0(iArr[1]);
                int i6 = iArr[2];
                if (i6 != Integer.MIN_VALUE) {
                    this.f38977d.v0(i6);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
