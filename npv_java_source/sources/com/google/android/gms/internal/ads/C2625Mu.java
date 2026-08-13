package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2625Mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29846c;

    private C2625Mu(int i6, int i10, int i11) {
        this.f29844a = i6;
        this.f29846c = i10;
        this.f29845b = i11;
    }

    public static com.google.android.gms.internal.ads.C2625Mu a() {
        return new com.google.android.gms.internal.ads.C2625Mu(0, 0, 0);
    }

    public static com.google.android.gms.internal.ads.C2625Mu b(int i6, int i10) {
        return new com.google.android.gms.internal.ads.C2625Mu(1, i6, i10);
    }

    public static com.google.android.gms.internal.ads.C2625Mu c(p184s3.c2 c2Var) {
        if (c2Var.f54201F) {
            return new com.google.android.gms.internal.ads.C2625Mu(3, 0, 0);
        }
        if (c2Var.f54206K) {
            return new com.google.android.gms.internal.ads.C2625Mu(2, 0, 0);
        }
        return c2Var.f54205J ? new com.google.android.gms.internal.ads.C2625Mu(0, 0, 0) : new com.google.android.gms.internal.ads.C2625Mu(1, c2Var.f54203H, c2Var.f54200E);
    }

    public static com.google.android.gms.internal.ads.C2625Mu d() {
        return new com.google.android.gms.internal.ads.C2625Mu(5, 0, 0);
    }

    public static com.google.android.gms.internal.ads.C2625Mu e() {
        return new com.google.android.gms.internal.ads.C2625Mu(4, 0, 0);
    }

    public final boolean f() {
        return this.f29844a == 0;
    }

    public final boolean g() {
        return this.f29844a == 2;
    }

    public final boolean h() {
        return this.f29844a == 5;
    }

    public final boolean i() {
        return this.f29844a == 3;
    }

    public final boolean j() {
        return this.f29844a == 4;
    }
}
