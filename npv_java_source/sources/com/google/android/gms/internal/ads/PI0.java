package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PI0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.PI0 f30685d = new com.google.android.gms.internal.ads.PI0(new com.google.android.gms.internal.ads.C2728Pm[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f30687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30688c;

    static {
        java.lang.Integer.toString(0, 36);
    }

    public PI0(com.google.android.gms.internal.ads.C2728Pm... c2728PmArr) {
        this.f30687b = com.google.android.gms.internal.ads.AbstractC3398ci0.N(c2728PmArr);
        this.f30686a = c2728PmArr.length;
        int i6 = 0;
        while (i6 < this.f30687b.size()) {
            int i10 = i6 + 1;
            for (int i11 = i10; i11 < this.f30687b.size(); i11++) {
                if (((com.google.android.gms.internal.ads.C2728Pm) this.f30687b.get(i6)).equals(this.f30687b.get(i11))) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.d("TrackGroupArray", "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i6 = i10;
        }
    }

    public final int a(com.google.android.gms.internal.ads.C2728Pm c2728Pm) {
        int iIndexOf = this.f30687b.indexOf(c2728Pm);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final com.google.android.gms.internal.ads.C2728Pm b(int i6) {
        return (com.google.android.gms.internal.ads.C2728Pm) this.f30687b.get(i6);
    }

    public final com.google.android.gms.internal.ads.AbstractC3398ci0 c() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.M(com.google.android.gms.internal.ads.AbstractC5264ti0.b(this.f30687b, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.OI0
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.PI0 pi0 = com.google.android.gms.internal.ads.PI0.f30685d;
                return java.lang.Integer.valueOf(((com.google.android.gms.internal.ads.C2728Pm) obj).f30779c);
            }
        }));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.PI0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.PI0 pi0 = (com.google.android.gms.internal.ads.PI0) obj;
            if (this.f30686a == pi0.f30686a && this.f30687b.equals(pi0.f30687b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f30688c;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = this.f30687b.hashCode();
        this.f30688c = iHashCode;
        return iHashCode;
    }
}
