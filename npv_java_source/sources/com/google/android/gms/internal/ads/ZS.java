package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class ZS extends com.google.android.gms.internal.ads.AbstractC5460vT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Activity f33584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p204u3.x f33585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f33586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f33587d;

    /* synthetic */ ZS(android.app.Activity activity, p204u3.x xVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.YS ys) {
        this.f33584a = activity;
        this.f33585b = xVar;
        this.f33586c = str;
        this.f33587d = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5460vT
    public final android.app.Activity a() {
        return this.f33584a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5460vT
    public final p204u3.x b() {
        return this.f33585b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5460vT
    public final java.lang.String c() {
        return this.f33586c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5460vT
    public final java.lang.String d() {
        return this.f33587d;
    }

    public final boolean equals(java.lang.Object obj) {
        p204u3.x xVar;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC5460vT) {
            com.google.android.gms.internal.ads.AbstractC5460vT abstractC5460vT = (com.google.android.gms.internal.ads.AbstractC5460vT) obj;
            if (this.f33584a.equals(abstractC5460vT.a()) && ((xVar = this.f33585b) != null ? xVar.equals(abstractC5460vT.b()) : abstractC5460vT.b() == null) && ((str = this.f33586c) != null ? str.equals(abstractC5460vT.c()) : abstractC5460vT.c() == null)) {
                java.lang.String str2 = this.f33587d;
                java.lang.String strD = abstractC5460vT.d();
                if (str2 != null ? str2.equals(strD) : strD == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f33584a.hashCode() ^ 1000003;
        p204u3.x xVar = this.f33585b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (xVar == null ? 0 : xVar.hashCode())) * 1000003;
        java.lang.String str = this.f33586c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.f33587d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        p204u3.x xVar = this.f33585b;
        return "OfflineUtilsParams{activity=" + this.f33584a.toString() + ", adOverlay=" + java.lang.String.valueOf(xVar) + ", gwsQueryId=" + this.f33586c + ", uri=" + this.f33587d + "}";
    }
}
