package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5424v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f39332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f39333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.lang.String f39334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f39335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f39336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f39337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f39338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final java.util.List f39339h;

    /* JADX WARN: Illegal instructions before constructor call */
    C5424v7(java.lang.String str, com.google.android.gms.internal.ads.M6 m6) {
        java.lang.String str2 = m6.f29657b;
        long j6 = m6.f29658c;
        long j10 = m6.f29659d;
        long j11 = m6.f29660e;
        long j12 = m6.f29661f;
        java.util.List arrayList = m6.f29663h;
        if (arrayList == null) {
            java.util.Map map = m6.f29662g;
            arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(new com.google.android.gms.internal.ads.V6((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
            }
        }
        this(str, str2, j6, j10, j11, j12, arrayList);
    }

    private C5424v7(java.lang.String str, java.lang.String str2, long j6, long j10, long j11, long j12, java.util.List list) {
        this.f39333b = str;
        this.f39334c = true == "".equals(str2) ? null : str2;
        this.f39335d = j6;
        this.f39336e = j10;
        this.f39337f = j11;
        this.f39338g = j12;
        this.f39339h = list;
    }

    static com.google.android.gms.internal.ads.C5424v7 a(com.google.android.gms.internal.ads.C5534w7 c5534w7) throws java.io.IOException {
        if (com.google.android.gms.internal.ads.C5754y7.a(c5534w7) != 538247942) {
            throw new java.io.IOException();
        }
        java.lang.String strE = com.google.android.gms.internal.ads.C5754y7.e(c5534w7);
        java.lang.String strE2 = com.google.android.gms.internal.ads.C5754y7.e(c5534w7);
        long jC = com.google.android.gms.internal.ads.C5754y7.c(c5534w7);
        long jC2 = com.google.android.gms.internal.ads.C5754y7.c(c5534w7);
        long jC3 = com.google.android.gms.internal.ads.C5754y7.c(c5534w7);
        long jC4 = com.google.android.gms.internal.ads.C5754y7.c(c5534w7);
        int iA = com.google.android.gms.internal.ads.C5754y7.a(c5534w7);
        if (iA < 0) {
            throw new java.io.IOException("readHeaderList size=" + iA);
        }
        java.util.List listEmptyList = iA == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList();
        for (int i6 = 0; i6 < iA; i6++) {
            listEmptyList.add(new com.google.android.gms.internal.ads.V6(com.google.android.gms.internal.ads.C5754y7.e(c5534w7).intern(), com.google.android.gms.internal.ads.C5754y7.e(c5534w7).intern()));
        }
        return new com.google.android.gms.internal.ads.C5424v7(strE, strE2, jC, jC2, jC3, jC4, listEmptyList);
    }
}
