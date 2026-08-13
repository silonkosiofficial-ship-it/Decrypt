package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3227b6 implements com.google.android.gms.internal.ads.InterfaceC4653o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3117a6 f34222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f34223b = new com.google.android.gms.internal.ads.C5128sR(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34227f;

    public C3227b6(com.google.android.gms.internal.ads.InterfaceC3117a6 interfaceC3117a6) {
        this.f34222a = interfaceC3117a6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void a(com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        this.f34222a.a(c3267bV, interfaceC5520w0, c4543n6);
        this.f34227f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        int iT;
        int i10 = i6 & 1;
        if (i10 != 0) {
            iT = c5128sR.t() + c5128sR.C();
        } else {
            iT = -1;
        }
        if (this.f34227f) {
            if (i10 == 0) {
                return;
            }
            this.f34227f = false;
            c5128sR.l(iT);
            this.f34225d = 0;
        }
        while (c5128sR.r() > 0) {
            int i11 = this.f34225d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iC = c5128sR.C();
                    c5128sR.l(c5128sR.t() - 1);
                    if (iC == 255) {
                        this.f34227f = true;
                        return;
                    }
                }
                int iMin = java.lang.Math.min(c5128sR.r(), 3 - this.f34225d);
                c5128sR.h(this.f34223b.n(), this.f34225d, iMin);
                int i12 = this.f34225d + iMin;
                this.f34225d = i12;
                if (i12 == 3) {
                    this.f34223b.l(0);
                    this.f34223b.k(3);
                    this.f34223b.m(1);
                    com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f34223b;
                    int iC2 = c5128sR2.C();
                    boolean z6 = (iC2 & 128) != 0;
                    int iC3 = c5128sR2.C();
                    this.f34226e = z6;
                    this.f34224c = (iC3 | ((iC2 & 15) << 8)) + 3;
                    int iS = this.f34223b.s();
                    int i13 = this.f34224c;
                    if (iS < i13) {
                        int iS2 = this.f34223b.s();
                        this.f34223b.f(java.lang.Math.min(4098, java.lang.Math.max(i13, iS2 + iS2)));
                    }
                }
            } else {
                int iMin2 = java.lang.Math.min(c5128sR.r(), this.f34224c - i11);
                c5128sR.h(this.f34223b.n(), this.f34225d, iMin2);
                int i14 = this.f34225d + iMin2;
                this.f34225d = i14;
                int i15 = this.f34224c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f34226e) {
                        this.f34223b.k(i15);
                    } else {
                        if (com.google.android.gms.internal.ads.EW.x(this.f34223b.n(), 0, i15, -1) != 0) {
                            this.f34227f = true;
                            return;
                        }
                        this.f34223b.k(this.f34224c - 4);
                    }
                    this.f34223b.l(0);
                    this.f34222a.b(this.f34223b);
                    this.f34225d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4653o6
    public final void c() {
        this.f34227f = true;
    }
}
