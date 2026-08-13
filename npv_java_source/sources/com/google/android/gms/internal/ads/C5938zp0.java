package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5938zp0 extends com.google.android.gms.internal.ads.Sl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5830yq0 f40402a;

    public C5938zp0(com.google.android.gms.internal.ads.C5830yq0 c5830yq0) {
        this.f40402a = c5830yq0;
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f40402a.c().f0() != com.google.android.gms.internal.ads.Kt0.RAW;
    }

    public final com.google.android.gms.internal.ads.C5830yq0 b() {
        return this.f40402a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C5938zp0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C5830yq0 c5830yq0 = ((com.google.android.gms.internal.ads.C5938zp0) obj).f40402a;
        return this.f40402a.c().f0().equals(c5830yq0.c().f0()) && this.f40402a.c().h0().equals(c5830yq0.c().h0()) && this.f40402a.c().g0().equals(c5830yq0.c().g0());
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.C5830yq0 c5830yq0 = this.f40402a;
        return j$.util.Objects.hash(c5830yq0.c(), c5830yq0.f());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strH0 = this.f40402a.c().h0();
        int iOrdinal = this.f40402a.c().f0().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", strH0, str);
    }
}
