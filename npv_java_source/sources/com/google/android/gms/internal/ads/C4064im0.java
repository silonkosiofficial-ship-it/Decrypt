package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4064im0 implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f36344b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f36345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4825pi0 f36353k;

    public C4064im0(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0) {
        this.f36343a = context.getApplicationContext();
        this.f36345c = interfaceC4825pi0;
    }

    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 g() {
        if (this.f36347e == null) {
            com.google.android.gms.internal.ads.C4817pe0 c4817pe0 = new com.google.android.gms.internal.ads.C4817pe0(this.f36343a);
            this.f36347e = c4817pe0;
            h(c4817pe0);
        }
        return this.f36347e;
    }

    private final void h(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0) {
        for (int i6 = 0; i6 < this.f36344b.size(); i6++) {
            interfaceC4825pi0.b((com.google.android.gms.internal.ads.Pv0) this.f36344b.get(i6));
        }
    }

    private static final void i(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.Pv0 pv0) {
        if (interfaceC4825pi0 != null) {
            interfaceC4825pi0.b(pv0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0 = this.f36353k;
        interfaceC4825pi0.getClass();
        return interfaceC4825pi0.H(bArr, i6, i10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0G;
        com.google.android.gms.internal.ads.LC.f(this.f36353k == null);
        java.lang.String scheme = c3843gl0.f35675a.getScheme();
        android.net.Uri uri = c3843gl0.f35675a;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        java.lang.String scheme2 = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            java.lang.String path = c3843gl0.f35675a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f36346d == null) {
                    com.google.android.gms.internal.ads.C4841pq0 c4841pq0 = new com.google.android.gms.internal.ads.C4841pq0();
                    this.f36346d = c4841pq0;
                    h(c4841pq0);
                }
                interfaceC4825pi0G = this.f36346d;
            } else {
                interfaceC4825pi0G = g();
            }
        } else if ("asset".equals(scheme)) {
            interfaceC4825pi0G = g();
        } else if ("content".equals(scheme)) {
            if (this.f36348f == null) {
                com.google.android.gms.internal.ads.C2644Ng0 c2644Ng0 = new com.google.android.gms.internal.ads.C2644Ng0(this.f36343a);
                this.f36348f = c2644Ng0;
                h(c2644Ng0);
            }
            interfaceC4825pi0G = this.f36348f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f36349g == null) {
                try {
                    com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0 = (com.google.android.gms.internal.ads.InterfaceC4825pi0) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f36349g = interfaceC4825pi0;
                    h(interfaceC4825pi0);
                } catch (java.lang.ClassNotFoundException unused) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Error instantiating RTMP extension", e6);
                }
                if (this.f36349g == null) {
                    this.f36349g = this.f36345c;
                }
            }
            interfaceC4825pi0G = this.f36349g;
        } else if ("udp".equals(scheme)) {
            if (this.f36350h == null) {
                com.google.android.gms.internal.ads.Iw0 iw0 = new com.google.android.gms.internal.ads.Iw0(2000);
                this.f36350h = iw0;
                h(iw0);
            }
            interfaceC4825pi0G = this.f36350h;
        } else if ("data".equals(scheme)) {
            if (this.f36351i == null) {
                com.google.android.gms.internal.ads.C4603nh0 c4603nh0 = new com.google.android.gms.internal.ads.C4603nh0();
                this.f36351i = c4603nh0;
                h(c4603nh0);
            }
            interfaceC4825pi0G = this.f36351i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f36352j == null) {
                com.google.android.gms.internal.ads.Vu0 vu0 = new com.google.android.gms.internal.ads.Vu0(this.f36343a);
                this.f36352j = vu0;
                h(vu0);
            }
            interfaceC4825pi0G = this.f36352j;
        } else {
            interfaceC4825pi0G = this.f36345c;
        }
        this.f36353k = interfaceC4825pi0G;
        return this.f36353k.a(c3843gl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
        pv0.getClass();
        this.f36345c.b(pv0);
        this.f36344b.add(pv0);
        i(this.f36346d, pv0);
        i(this.f36347e, pv0);
        i(this.f36348f, pv0);
        i(this.f36349g, pv0);
        i(this.f36350h, pv0);
        i(this.f36351i, pv0);
        i(this.f36352j, pv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0 = this.f36353k;
        if (interfaceC4825pi0 == null) {
            return null;
        }
        return interfaceC4825pi0.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0 = this.f36353k;
        return interfaceC4825pi0 == null ? java.util.Collections.emptyMap() : interfaceC4825pi0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0 = this.f36353k;
        if (interfaceC4825pi0 != null) {
            try {
                interfaceC4825pi0.f();
            } finally {
                this.f36353k = null;
            }
        }
    }
}
