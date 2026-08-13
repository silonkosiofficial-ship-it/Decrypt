package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4350lJ0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f37158C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f37159D;

    public C4350lJ0(com.google.android.gms.internal.ads.D d6, int i6) {
        this.f37158C = 1 == (d6.f26564e & 1);
        this.f37159D = com.google.android.gms.internal.ads.BB0.a(i6, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.C4350lJ0 c4350lJ0) {
        return com.google.android.gms.internal.ads.AbstractC2794Rh0.i().d(this.f37159D, c4350lJ0.f37159D).d(this.f37158C, c4350lJ0.f37158C).a();
    }
}
