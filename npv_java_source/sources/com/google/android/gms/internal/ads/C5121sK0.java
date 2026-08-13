package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5121sK0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Comparator f38719g = new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.nK0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.android.gms.internal.ads.C4902qK0) obj).f38247a - ((com.google.android.gms.internal.ads.C4902qK0) obj2).f38247a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Comparator f38720h = new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.pK0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Float.compare(((com.google.android.gms.internal.ads.C4902qK0) obj).f38249c, ((com.google.android.gms.internal.ads.C4902qK0) obj2).f38249c);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38726f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4902qK0[] f38722b = new com.google.android.gms.internal.ads.C4902qK0[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f38721a = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38723c = -1;

    public C5121sK0(int i6) {
    }

    public final float a(float f6) {
        if (this.f38723c != 0) {
            java.util.Collections.sort(this.f38721a, f38720h);
            this.f38723c = 0;
        }
        float f10 = this.f38725e;
        int i6 = 0;
        for (int i10 = 0; i10 < this.f38721a.size(); i10++) {
            float f11 = 0.5f * f10;
            com.google.android.gms.internal.ads.C4902qK0 c4902qK0 = (com.google.android.gms.internal.ads.C4902qK0) this.f38721a.get(i10);
            i6 += c4902qK0.f38248b;
            if (i6 >= f11) {
                return c4902qK0.f38249c;
            }
        }
        if (this.f38721a.isEmpty()) {
            return Float.NaN;
        }
        java.util.ArrayList arrayList = this.f38721a;
        return ((com.google.android.gms.internal.ads.C4902qK0) arrayList.get(arrayList.size() - 1)).f38249c;
    }

    public final void b(int i6, float f6) {
        com.google.android.gms.internal.ads.C4902qK0 c4902qK0;
        int i10;
        com.google.android.gms.internal.ads.C4902qK0 c4902qK1;
        int i11;
        if (this.f38723c != 1) {
            java.util.Collections.sort(this.f38721a, f38719g);
            this.f38723c = 1;
        }
        int i12 = this.f38726f;
        if (i12 > 0) {
            com.google.android.gms.internal.ads.C4902qK0[] c4902qK0Arr = this.f38722b;
            int i13 = i12 - 1;
            this.f38726f = i13;
            c4902qK0 = c4902qK0Arr[i13];
        } else {
            c4902qK0 = new com.google.android.gms.internal.ads.C4902qK0(null);
        }
        int i14 = this.f38724d;
        this.f38724d = i14 + 1;
        c4902qK0.f38247a = i14;
        c4902qK0.f38248b = i6;
        c4902qK0.f38249c = f6;
        this.f38721a.add(c4902qK0);
        int i15 = this.f38725e + i6;
        while (true) {
            this.f38725e = i15;
            while (true) {
                int i16 = this.f38725e;
                if (i16 <= 2000) {
                    return;
                }
                i10 = i16 - 2000;
                c4902qK1 = (com.google.android.gms.internal.ads.C4902qK0) this.f38721a.get(0);
                i11 = c4902qK1.f38248b;
                if (i11 <= i10) {
                    this.f38725e -= i11;
                    this.f38721a.remove(0);
                    int i17 = this.f38726f;
                    if (i17 < 5) {
                        com.google.android.gms.internal.ads.C4902qK0[] c4902qK0Arr2 = this.f38722b;
                        this.f38726f = i17 + 1;
                        c4902qK0Arr2[i17] = c4902qK1;
                    }
                }
            }
            c4902qK1.f38248b = i11 - i10;
            i15 = this.f38725e - i10;
        }
    }

    public final void c() {
        this.f38721a.clear();
        this.f38723c = -1;
        this.f38724d = 0;
        this.f38725e = 0;
    }
}
