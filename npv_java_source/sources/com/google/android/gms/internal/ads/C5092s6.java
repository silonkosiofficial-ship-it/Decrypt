package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5092s6 implements com.google.android.gms.internal.ads.InterfaceC5202t6 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f38647m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f38648n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5520w0 f38649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f38650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5532w6 f38651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f38653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f38655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D f38656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f38658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f38660l;

    public C5092s6(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, com.google.android.gms.internal.ads.C5532w6 c5532w6) throws com.google.android.gms.internal.ads.C4708of {
        this.f38649a = interfaceC5520w0;
        this.f38650b = interfaceC3107a1;
        this.f38651c = c5532w6;
        int iMax = java.lang.Math.max(1, c5532w6.f39538c / 10);
        this.f38655g = iMax;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(c5532w6.f39541f);
        c5128sR.A();
        int iA = c5128sR.A();
        this.f38652d = iA;
        int i6 = c5532w6.f39537b;
        int i10 = c5532w6.f39539d;
        int i11 = (((i10 - (i6 * 4)) * 8) / (c5532w6.f39540e * i6)) + 1;
        if (iA != i11) {
            throw com.google.android.gms.internal.ads.C4708of.a("Expected frames per block: " + i11 + "; got: " + iA, null);
        }
        int i12 = com.google.android.gms.internal.ads.EW.f27061a;
        int i13 = ((iMax + iA) - 1) / iA;
        this.f38653e = new byte[i10 * i13];
        this.f38654f = new com.google.android.gms.internal.ads.C5128sR(i13 * (iA + iA) * i6);
        int i14 = ((c5532w6.f39538c * c5532w6.f39539d) * 8) / iA;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("audio/raw");
        c4682oK0.q0(i14);
        c4682oK0.v(i14);
        c4682oK0.r((iMax + iMax) * i6);
        c4682oK0.r0(c5532w6.f39537b);
        c4682oK0.C(c5532w6.f39538c);
        c4682oK0.u(2);
        this.f38656h = c4682oK0.H();
    }

    private final int b(int i6) {
        int i10 = this.f38651c.f39537b;
        return i6 / (i10 + i10);
    }

    private final int c(int i6) {
        return (i6 + i6) * this.f38651c.f39537b;
    }

    private final void d(int i6) {
        long jM = this.f38658j + com.google.android.gms.internal.ads.EW.M(this.f38660l, 1000000L, this.f38651c.f39538c, java.math.RoundingMode.DOWN);
        int iC = c(i6);
        this.f38650b.b(jM, 1, iC, this.f38659k - iC, null);
        this.f38660l += (long) i6;
        this.f38659k -= iC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final void a(long j6) {
        this.f38657i = 0;
        this.f38658j = j6;
        this.f38659k = 0;
        this.f38660l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final void e(int i6, long j6) {
        this.f38649a.R(new com.google.android.gms.internal.ads.C5862z6(this.f38651c, this.f38652d, i6, j6));
        this.f38650b.c(this.f38656h);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final boolean f(com.google.android.gms.internal.ads.InterfaceC5300u0 r21, long r22) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5092s6.f(com.google.android.gms.internal.ads.u0, long):boolean");
    }
}
