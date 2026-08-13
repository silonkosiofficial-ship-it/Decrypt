package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3244bE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f34256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3134aE0 f34257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f34258c;

    static {
        if (com.google.android.gms.internal.ads.EW.f27061a < 31) {
            new com.google.android.gms.internal.ads.C3244bE0("");
        } else {
            int i6 = com.google.android.gms.internal.ads.C3134aE0.f34027b;
        }
    }

    public C3244bE0(android.media.metrics.LogSessionId logSessionId, java.lang.String str) {
        this.f34257b = new com.google.android.gms.internal.ads.C3134aE0(logSessionId);
        this.f34256a = str;
        this.f34258c = new java.lang.Object();
    }

    public C3244bE0(java.lang.String str) {
        com.google.android.gms.internal.ads.LC.f(com.google.android.gms.internal.ads.EW.f27061a < 31);
        this.f34256a = str;
        this.f34257b = null;
        this.f34258c = new java.lang.Object();
    }

    public final android.media.metrics.LogSessionId a() {
        com.google.android.gms.internal.ads.C3134aE0 c3134aE0 = this.f34257b;
        c3134aE0.getClass();
        return c3134aE0.f34028a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C3244bE0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C3244bE0 c3244bE0 = (com.google.android.gms.internal.ads.C3244bE0) obj;
        return j$.util.Objects.equals(this.f34256a, c3244bE0.f34256a) && j$.util.Objects.equals(this.f34257b, c3244bE0.f34257b) && j$.util.Objects.equals(this.f34258c, c3244bE0.f34258c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f34256a, this.f34257b, this.f34258c);
    }
}
