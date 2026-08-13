package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3505dh extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3505dh> CREATOR = new com.google.android.gms.internal.ads.C3614eh();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f34775C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f34776D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f34777E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f34778F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f34779G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p184s3.Q1 f34780H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f34781I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f34782J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f34783K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f34784L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f34785M;

    public C3505dh(int i6, boolean z6, int i10, boolean z10, int i11, p184s3.Q1 q6, boolean z11, int i12, int i13, boolean z12, int i14) {
        this.f34775C = i6;
        this.f34776D = z6;
        this.f34777E = i10;
        this.f34778F = z10;
        this.f34779G = i11;
        this.f34780H = q6;
        this.f34781I = z11;
        this.f34782J = i12;
        this.f34784L = z12;
        this.f34783K = i13;
        this.f34785M = i14;
    }

    public C3505dh(p134n3.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new p184s3.Q1(eVar.d()) : null, eVar.g(), eVar.c(), 0, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static com.google.android.gms.ads.nativead.c e(com.google.android.gms.internal.ads.C3505dh c3505dh) {
        com.google.android.gms.ads.nativead.c.a aVar = new com.google.android.gms.ads.nativead.c.a();
        if (c3505dh == null) {
            return aVar.a();
        }
        int i6 = c3505dh.f34775C;
        int i10 = 2;
        if (i6 == 2) {
            aVar.c(c3505dh.f34779G);
        } else {
            if (i6 != 3) {
                if (i6 == 4) {
                    aVar.e(c3505dh.f34781I);
                    aVar.d(c3505dh.f34782J);
                    aVar.b(c3505dh.f34783K, c3505dh.f34784L);
                    int i11 = c3505dh.f34785M;
                    if (i11 == 0) {
                        i10 = 1;
                    } else if (i11 == 2) {
                        i10 = 3;
                    } else if (i11 != 1) {
                        i10 = 1;
                    }
                    aVar.q(i10);
                }
            }
            p184s3.Q1 q6 = c3505dh.f34780H;
            if (q6 != null) {
                aVar.h(new p104k3.x(q6));
            }
            aVar.c(c3505dh.f34779G);
        }
        aVar.g(c3505dh.f34776D);
        aVar.f(c3505dh.f34778F);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f34775C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.c(parcel, 2, this.f34776D);
        R3.c.k(parcel, 3, this.f34777E);
        R3.c.c(parcel, 4, this.f34778F);
        R3.c.k(parcel, 5, this.f34779G);
        R3.c.p(parcel, 6, this.f34780H, i6, false);
        R3.c.c(parcel, 7, this.f34781I);
        R3.c.k(parcel, 8, this.f34782J);
        R3.c.k(parcel, 9, this.f34783K);
        R3.c.c(parcel, 10, this.f34784L);
        R3.c.k(parcel, 11, this.f34785M);
        R3.c.b(parcel, iA);
    }
}
