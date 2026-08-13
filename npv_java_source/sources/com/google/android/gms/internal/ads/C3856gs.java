package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3856gs {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final boolean f35693r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f35695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.a f35696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2604Mf f35697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2752Qf f35698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p214v3.J f35699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f35700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String[] f35701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2549Kr f35707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f35710q;

    static {
        f35693r = p184s3.C7147y.e().nextInt(100) < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Bc)).intValue();
    }

    public C3856gs(android.content.Context context, p224w3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.C2752Qf c2752Qf, com.google.android.gms.internal.ads.C2604Mf c2604Mf) {
        p214v3.H h6 = new p214v3.H();
        h6.a("min_1", Double.MIN_VALUE, 1.0d);
        h6.a("1_5", 1.0d, 5.0d);
        h6.a("5_10", 5.0d, 10.0d);
        h6.a("10_20", 10.0d, 20.0d);
        h6.a("20_30", 20.0d, 30.0d);
        h6.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f35699f = h6.b();
        this.f35702i = false;
        this.f35703j = false;
        this.f35704k = false;
        this.f35705l = false;
        this.f35710q = -1L;
        this.f35694a = context;
        this.f35696c = aVar;
        this.f35695b = str;
        this.f35698e = c2752Qf;
        this.f35697d = c2604Mf;
        java.lang.String str2 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25349N);
        if (str2 == null) {
            this.f35701h = new java.lang.String[0];
            this.f35700g = new long[0];
            return;
        }
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f35701h = new java.lang.String[length];
        this.f35700g = new long[length];
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            try {
                this.f35700g[i6] = java.lang.Long.parseLong(strArrSplit[i6]);
            } catch (java.lang.NumberFormatException e6) {
                p224w3.p.h("Unable to parse frame hash target time number.", e6);
                this.f35700g[i6] = -1;
            }
        }
    }

    public final void a(com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr) {
        com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f35698e, this.f35697d, "vpc2");
        this.f35702i = true;
        this.f35698e.d("vpn", abstractC2549Kr.l());
        this.f35707n = abstractC2549Kr;
    }

    public final void b() {
        if (!this.f35702i || this.f35703j) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f35698e, this.f35697d, "vfr2");
        this.f35703j = true;
    }

    public final void c() {
        this.f35706m = true;
        if (!this.f35703j || this.f35704k) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f35698e, this.f35697d, "vfp2");
        this.f35704k = true;
    }

    public final void d() {
        if (!f35693r || this.f35708o) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f35695b);
        bundle.putString("player", this.f35707n.l());
        for (p214v3.G g6 : this.f35699f.a()) {
            java.lang.String strValueOf = java.lang.String.valueOf(g6.f55838a);
            bundle.putString("fps_c_".concat(strValueOf), java.lang.Integer.toString(g6.f55842e));
            java.lang.String strValueOf2 = java.lang.String.valueOf(g6.f55838a);
            bundle.putString("fps_p_".concat(strValueOf2), java.lang.Double.toString(g6.f55841d));
        }
        int i6 = 0;
        while (true) {
            long[] jArr = this.f35700g;
            if (i6 >= jArr.length) {
                p174r3.v.t().N(this.f35694a, this.f35696c.f56217C, "gmob-apps", bundle, true);
                this.f35708o = true;
                return;
            }
            java.lang.String str = this.f35701h[i6];
            if (str != null) {
                bundle.putString("fh_".concat(java.lang.Long.valueOf(jArr[i6]).toString()), str);
            }
            i6++;
        }
    }

    public final void e() {
        this.f35706m = false;
    }

    public final void f(com.google.android.gms.internal.ads.AbstractC2549Kr abstractC2549Kr) {
        if (this.f35704k && !this.f35705l) {
            if (p214v3.AbstractC7265q0.m() && !this.f35705l) {
                p214v3.AbstractC7265q0.k("VideoMetricsMixin first frame");
            }
            com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f35698e, this.f35697d, "vff2");
            this.f35705l = true;
        }
        long jB = p174r3.v.c().b();
        if (this.f35706m && this.f35709p && this.f35710q != -1) {
            this.f35699f.b(java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / (jB - this.f35710q));
        }
        this.f35709p = this.f35706m;
        this.f35710q = jB;
        long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25360O)).longValue();
        long jD = abstractC2549Kr.d();
        int i6 = 0;
        while (true) {
            java.lang.String[] strArr = this.f35701h;
            if (i6 >= strArr.length) {
                return;
            }
            if (strArr[i6] == null && jLongValue > java.lang.Math.abs(jD - this.f35700g[i6])) {
                java.lang.String[] strArr2 = this.f35701h;
                int i10 = 8;
                android.graphics.Bitmap bitmap = abstractC2549Kr.getBitmap(8, 8);
                long j6 = 63;
                int i11 = 0;
                long j10 = 0;
                while (i11 < i10) {
                    int i12 = 0;
                    while (i12 < i10) {
                        int pixel = bitmap.getPixel(i12, i11);
                        j10 |= ((android.graphics.Color.blue(pixel) + android.graphics.Color.red(pixel)) + android.graphics.Color.green(pixel) > 128 ? 1L : 0L) << ((int) j6);
                        j6--;
                        i12++;
                        i10 = 8;
                    }
                    i11++;
                    i10 = 8;
                }
                strArr2[i6] = java.lang.String.format("%016X", java.lang.Long.valueOf(j10));
                return;
            }
            i6++;
        }
    }
}
