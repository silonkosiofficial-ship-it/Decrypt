package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f32633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f32640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f32641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f32643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f32644l;

    private W(java.util.List list, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f6, java.lang.String str) {
        this.f32633a = list;
        this.f32634b = i6;
        this.f32635c = i10;
        this.f32636d = i11;
        this.f32637e = i12;
        this.f32638f = i13;
        this.f32639g = i14;
        this.f32640h = i15;
        this.f32641i = i16;
        this.f32642j = i17;
        this.f32643k = f6;
        this.f32644l = str;
    }

    public static com.google.android.gms.internal.ads.W a(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        java.lang.String strC;
        float f6;
        try {
            c5128sR.m(4);
            int iC = c5128sR.C() & 3;
            int i17 = iC + 1;
            if (i17 == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int iC2 = c5128sR.C() & 31;
            for (int i18 = 0; i18 < iC2; i18++) {
                arrayList.add(b(c5128sR));
            }
            int iC3 = c5128sR.C();
            for (int i19 = 0; i19 < iC3; i19++) {
                arrayList.add(b(c5128sR));
            }
            if (iC2 > 0) {
                com.google.android.gms.internal.ads.C2522Ka0 c2522Ka0F = com.google.android.gms.internal.ads.AbstractC4371lb0.f((byte[]) arrayList.get(0), iC + 2, ((byte[]) arrayList.get(0)).length);
                int i20 = c2522Ka0F.f28965e;
                int i21 = c2522Ka0F.f28966f;
                int i22 = c2522Ka0F.f28968h + 8;
                int i23 = c2522Ka0F.f28969i + 8;
                int i24 = c2522Ka0F.f28970j;
                int i25 = c2522Ka0F.f28971k;
                int i26 = c2522Ka0F.f28972l;
                int i27 = c2522Ka0F.f28973m;
                float f10 = c2522Ka0F.f28967g;
                strC = com.google.android.gms.internal.ads.ND.c(c2522Ka0F.f28961a, c2522Ka0F.f28962b, c2522Ka0F.f28963c);
                i15 = i26;
                i16 = i27;
                f6 = f10;
                i12 = i23;
                i13 = i24;
                i14 = i25;
                i6 = i20;
                i10 = i21;
                i11 = i22;
            } else {
                i6 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                strC = null;
                f6 = 1.0f;
            }
            return new com.google.android.gms.internal.ads.W(arrayList, i17, i6, i10, i11, i12, i13, i14, i15, i16, f6, strC);
        } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
            throw com.google.android.gms.internal.ads.C4708of.a("Error parsing AVC config", e6);
        }
    }

    private static byte[] b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iG = c5128sR.G();
        int iT = c5128sR.t();
        c5128sR.m(iG);
        return com.google.android.gms.internal.ads.ND.e(c5128sR.n(), iT, iG);
    }
}
