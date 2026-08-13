package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5219tE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38910c;

    public final com.google.android.gms.internal.ads.C5219tE0 a(boolean z6) {
        this.f38908a = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5219tE0 b(boolean z6) {
        this.f38909b = z6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5219tE0 c(boolean z6) {
        this.f38910c = z6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5439vE0 d() {
        if (this.f38908a || !(this.f38909b || this.f38910c)) {
            return new com.google.android.gms.internal.ads.C5439vE0(this, null);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
