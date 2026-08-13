package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3985i1 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f36194p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f36195q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f36196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f36197s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f36199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36203f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f36207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f36208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f36209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.gms.internal.ads.T0 f36210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36212o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f36198a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36204g = -1;

    static {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        f36196r = "#!AMR\n".getBytes(charset);
        f36197s = "#!AMR-WB\n".getBytes(charset);
    }

    public C3985i1(int i6) {
        com.google.android.gms.internal.ads.C4641o0 c4641o0 = new com.google.android.gms.internal.ads.C4641o0();
        this.f36199b = c4641o0;
        this.f36209l = c4641o0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    private final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws com.google.android.gms.internal.ads.C4708of {
        int i6 = this.f36203f;
        if (i6 == 0) {
            try {
                interfaceC5300u0.j();
                interfaceC5300u0.N(this.f36198a, 0, 1);
                byte b6 = this.f36198a[0];
                if ((b6 & 131) > 0) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Invalid padding bits for frame header " + ((int) b6), null);
                }
                boolean z6 = this.f36200c;
                int i10 = (b6 >> 3) & 15;
                if (!z6) {
                    if (!z6) {
                        if (i10 >= 12 && i10 <= 14) {
                        }
                    }
                    throw com.google.android.gms.internal.ads.C4708of.a("Illegal AMR " + (true != z6 ? "NB" : "WB") + " frame type " + i10, null);
                }
                if (i10 >= 10 && i10 <= 13) {
                    if (!z6) {
                        if (i10 >= 12) {
                        }
                    }
                    if (true != z6) {
                    }
                    throw com.google.android.gms.internal.ads.C4708of.a("Illegal AMR " + (true != z6 ? "NB" : "WB") + " frame type " + i10, null);
                }
                i6 = z6 ? f36195q[i10] : f36194p[i10];
                this.f36202e = i6;
                this.f36203f = i6;
                int i11 = this.f36204g;
                if (i11 == -1) {
                    this.f36204g = i6;
                    i11 = i6;
                }
                if (i11 == i6) {
                    this.f36205h++;
                }
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int iE = this.f36209l.e(interfaceC5300u0, i6, true);
        if (iE == -1) {
            return -1;
        }
        int i12 = this.f36203f - iE;
        this.f36203f = i12;
        if (i12 > 0) {
            return 0;
        }
        this.f36209l.b(this.f36201d, 1, this.f36202e, 0, null);
        this.f36201d += 20000;
        return 0;
    }

    private static boolean b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, byte[] bArr) {
        interfaceC5300u0.j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        interfaceC5300u0.N(bArr2, 0, length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    private final boolean d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        int length;
        byte[] bArr = f36196r;
        if (b(interfaceC5300u0, bArr)) {
            this.f36200c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f36197s;
            if (!b(interfaceC5300u0, bArr2)) {
                return false;
            }
            this.f36200c = true;
            length = bArr2.length;
        }
        interfaceC5300u0.I(length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f36201d = 0L;
        this.f36202e = 0;
        this.f36203f = 0;
        this.f36211n = j10;
        this.f36206i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.LC.b(this.f36208k);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (interfaceC5300u0.e() == 0 && !d(interfaceC5300u0)) {
            throw com.google.android.gms.internal.ads.C4708of.a("Could not find AMR header.", null);
        }
        if (!this.f36212o) {
            this.f36212o = true;
            boolean z6 = this.f36200c;
            java.lang.String str = true != z6 ? "audio/3gpp" : "audio/amr-wb";
            int i10 = true != z6 ? 8000 : 16000;
            int i11 = z6 ? f36195q[8] : f36194p[7];
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f36209l;
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.B(str);
            c4682oK0.r(i11);
            c4682oK0.r0(1);
            c4682oK0.C(i10);
            interfaceC3107a1.c(c4682oK0.H());
        }
        int iA = a(interfaceC5300u0);
        if (this.f36210m == null) {
            com.google.android.gms.internal.ads.S0 s6 = new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L);
            this.f36210m = s6;
            this.f36207j.R(s6);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        return d(interfaceC5300u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f36207j = interfaceC5520w0;
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(0, 1);
        this.f36208k = interfaceC3107a1S;
        this.f36209l = interfaceC3107a1S;
        interfaceC5520w0.Q();
    }
}
