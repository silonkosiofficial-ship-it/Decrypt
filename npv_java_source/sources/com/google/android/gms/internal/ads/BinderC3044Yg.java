package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3044Yg extends com.google.android.gms.internal.ads.AbstractBinderC3834gh {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final int f33379K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final int f33380L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final int f33381M;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f33382C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f33383D = new java.util.ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f33384E = new java.util.ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f33385F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f33386G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f33387H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f33388I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f33389J;

    static {
        int iRgb = android.graphics.Color.rgb(12, 174, 206);
        f33379K = iRgb;
        f33380L = android.graphics.Color.rgb(204, 204, 204);
        f33381M = iRgb;
    }

    public BinderC3044Yg(java.lang.String str, java.util.List list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i6, int i10, boolean z6) {
        this.f33382C = str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.android.gms.internal.ads.BinderC3286bh binderC3286bh = (com.google.android.gms.internal.ads.BinderC3286bh) list.get(i11);
            this.f33383D.add(binderC3286bh);
            this.f33384E.add(binderC3286bh);
        }
        this.f33385F = num != null ? num.intValue() : f33380L;
        this.f33386G = num2 != null ? num2.intValue() : f33381M;
        this.f33387H = num3 != null ? num3.intValue() : 12;
        this.f33388I = i6;
        this.f33389J = i10;
    }

    public final int b() {
        return this.f33388I;
    }

    public final int c() {
        return this.f33389J;
    }

    public final int d() {
        return this.f33386G;
    }

    public final int f() {
        return this.f33385F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3944hh
    public final java.util.List g() {
        return this.f33384E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3944hh
    public final java.lang.String i() {
        return this.f33382C;
    }

    public final int p6() {
        return this.f33387H;
    }

    public final java.util.List q6() {
        return this.f33383D;
    }
}
