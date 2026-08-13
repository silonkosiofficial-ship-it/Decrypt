package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4651o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.net.Uri f37715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f37716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f37717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f37718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 f37719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f37720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37721g;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
    }

    /* synthetic */ C4651o5(android.net.Uri uri, java.lang.String str, com.google.android.gms.internal.ads.L3 l6, com.google.android.gms.internal.ads.AbstractC3875h1 abstractC3875h1, java.util.List list, java.lang.String str2, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0, java.lang.Object obj, long j6, com.google.android.gms.internal.ads.AbstractC4765p7 abstractC4765p7) {
        this.f37715a = uri;
        int i6 = com.google.android.gms.internal.ads.AbstractC3606ed.f35017c;
        this.f37716b = null;
        this.f37717c = list;
        this.f37718d = null;
        this.f37719e = abstractC3398ci0;
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        if (abstractC3398ci0.size() > 0) {
            androidx.appcompat.app.D.a(abstractC3398ci0.get(0));
            throw null;
        }
        c3083Zh0.j();
        this.f37720f = null;
        this.f37721g = -9223372036854775807L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C4651o5)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4651o5 c4651o5 = (com.google.android.gms.internal.ads.C4651o5) obj;
        if (this.f37715a.equals(c4651o5.f37715a) && this.f37717c.equals(c4651o5.f37717c) && this.f37719e.equals(c4651o5.f37719e)) {
            java.lang.Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.f37715a.hashCode() * 923521) + this.f37717c.hashCode()) * 961) + this.f37719e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
