package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3217b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34190a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34196g;

    public final void a(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, com.google.android.gms.internal.ads.Z0 z6) {
        if (this.f34192c > 0) {
            interfaceC3107a1.b(this.f34193d, this.f34194e, this.f34195f, this.f34196g, z6);
            this.f34192c = 0;
        }
    }

    public final void b() {
        this.f34191b = false;
        this.f34192c = 0;
    }

    public final void c(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, long j6, int i6, int i10, int i11, com.google.android.gms.internal.ads.Z0 z6) {
        com.google.android.gms.internal.ads.LC.g(this.f34196g <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f34191b) {
            int i12 = this.f34192c;
            int i13 = i12 + 1;
            this.f34192c = i13;
            if (i12 == 0) {
                this.f34193d = j6;
                this.f34194e = i6;
                this.f34195f = 0;
            }
            this.f34195f += i10;
            this.f34196g = i11;
            if (i13 >= 16) {
                a(interfaceC3107a1, z6);
            }
        }
    }

    public final void d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        if (this.f34191b) {
            return;
        }
        interfaceC5300u0.N(this.f34190a, 0, 10);
        interfaceC5300u0.j();
        byte[] bArr = this.f34190a;
        int i6 = com.google.android.gms.internal.ads.S.f31513g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f34191b = true;
        }
    }
}
