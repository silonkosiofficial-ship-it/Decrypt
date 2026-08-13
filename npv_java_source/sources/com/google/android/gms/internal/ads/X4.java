package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class X4 implements com.google.android.gms.internal.ads.InterfaceC4539n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q4 f33041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f33042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f33043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f33044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f33045e;

    public X4(com.google.android.gms.internal.ads.Q4 q6, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.f33041a = q6;
        this.f33044d = map2;
        this.f33045e = map3;
        this.f33043c = j$.util.DesugarCollections.unmodifiableMap(map);
        this.f33042b = q6.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final long B(int i6) {
        return this.f33042b[i6];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final java.util.List C(long j6) {
        return this.f33041a.e(j6, this.f33043c, this.f33044d, this.f33045e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final int a() {
        return this.f33042b.length;
    }
}
