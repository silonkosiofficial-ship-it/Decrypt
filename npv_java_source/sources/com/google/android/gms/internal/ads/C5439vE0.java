package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5439vE0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C5439vE0 f39363d = new com.google.android.gms.internal.ads.C5219tE0().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39366c;

    /* synthetic */ C5439vE0(com.google.android.gms.internal.ads.C5219tE0 c5219tE0, com.google.android.gms.internal.ads.AbstractC5329uE0 abstractC5329uE0) {
        this.f39364a = c5219tE0.f38908a;
        this.f39365b = c5219tE0.f38909b;
        this.f39366c = c5219tE0.f38910c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C5439vE0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C5439vE0 c5439vE0 = (com.google.android.gms.internal.ads.C5439vE0) obj;
            if (this.f39364a == c5439vE0.f39364a && this.f39365b == c5439vE0.f39365b && this.f39366c == c5439vE0.f39366c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z6 = this.f39364a;
        boolean z10 = this.f39365b;
        return ((z6 ? 1 : 0) << 2) + (z10 ? 1 : 0) + (z10 ? 1 : 0) + (this.f39366c ? 1 : 0);
    }
}
