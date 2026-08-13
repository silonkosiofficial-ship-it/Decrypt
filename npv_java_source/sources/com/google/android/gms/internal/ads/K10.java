package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f28807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f28808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.pm.PackageInfo f28809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f28810d;

    public K10(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4546n70 c4546n70, android.content.pm.PackageInfo packageInfo, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f28807a = yk0;
        this.f28808b = c4546n70;
        this.f28809c = packageInfo;
        this.f28810d = interfaceC7268s0;
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.L10 c(com.google.android.gms.internal.ads.K10 k10) {
        return new com.google.android.gms.internal.ads.L10(k10.f28808b, k10.f28809c, k10.f28810d);
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f28807a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.J10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.ads.K10.c(this.f28577a);
            }
        });
    }
}
