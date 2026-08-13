package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3852gq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C3852gq f35691b = new com.google.android.gms.internal.ads.C3852gq(com.google.android.gms.internal.ads.AbstractC3398ci0.O());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f35692a;

    static {
        java.lang.Integer.toString(0, 36);
    }

    public C3852gq(java.util.List list) {
        this.f35692a = com.google.android.gms.internal.ads.AbstractC3398ci0.M(list);
    }

    public final com.google.android.gms.internal.ads.AbstractC3398ci0 a() {
        return this.f35692a;
    }

    public final boolean b(int i6) {
        for (int i10 = 0; i10 < this.f35692a.size(); i10++) {
            com.google.android.gms.internal.ads.C2399Gp c2399Gp = (com.google.android.gms.internal.ads.C2399Gp) this.f35692a.get(i10);
            if (c2399Gp.c() && c2399Gp.a() == i6) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.internal.ads.C3852gq.class != obj.getClass()) {
            return false;
        }
        return this.f35692a.equals(((com.google.android.gms.internal.ads.C3852gq) obj).f35692a);
    }

    public final int hashCode() {
        return this.f35692a.hashCode();
    }
}
