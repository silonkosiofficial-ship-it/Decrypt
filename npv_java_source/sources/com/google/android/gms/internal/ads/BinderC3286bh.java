package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3286bh extends com.google.android.gms.internal.ads.AbstractBinderC4602nh {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f34356C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.net.Uri f34357D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final double f34358E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f34359F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f34360G;

    public BinderC3286bh(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d6, int i6, int i10) {
        this.f34356C = drawable;
        this.f34357D = uri;
        this.f34358E = d6;
        this.f34359F = i6;
        this.f34360G = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final double b() {
        return this.f34358E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final int c() {
        return this.f34360G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final android.net.Uri d() {
        return this.f34357D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final X3.a e() {
        return X3.b.c2(this.f34356C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final int f() {
        return this.f34359F;
    }
}
