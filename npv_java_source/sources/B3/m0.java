package B3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends D3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B3.l0 f655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f659e = p174r3.v.c().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Boolean f660f;

    public m0(B3.l0 l0Var, boolean z6, int i6, java.lang.Boolean bool, com.google.android.gms.internal.ads.C4246kO c4246kO) {
        this.f655a = l0Var;
        this.f657c = z6;
        this.f658d = i6;
        this.f660f = bool;
        this.f656b = c4246kO;
    }

    private static long c() {
        return p174r3.v.c().a() + ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2422Hg.f28094f.e()).longValue();
    }

    private final long d() {
        return p174r3.v.c().a() - this.f659e;
    }

    @Override // D3.b
    public final void a(java.lang.String str) {
        B3.AbstractC0797c.d(this.f656b, null, "sgpcf", new android.util.Pair("sgf_reason", str), new android.util.Pair("se", "query_g"), new android.util.Pair("ad_format", p104k3.EnumC6886c.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("lat_ms", java.lang.Long.toString(d())), new android.util.Pair("sgpc_rn", java.lang.Integer.toString(this.f658d)), new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.f660f)), new android.util.Pair("tpc", true != this.f657c ? "0" : "1"));
        this.f655a.f(this.f657c, new B3.n0(null, str, c(), this.f658d));
    }

    @Override // D3.b
    public final void b(D3.a aVar) {
        B3.AbstractC0797c.d(this.f656b, null, "sgpcs", new android.util.Pair("se", "query_g"), new android.util.Pair("ad_format", p104k3.EnumC6886c.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("lat_ms", java.lang.Long.toString(d())), new android.util.Pair("sgpc_rn", java.lang.Integer.toString(this.f658d)), new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.f660f)), new android.util.Pair("tpc", true != this.f657c ? "0" : "1"));
        this.f655a.f(this.f657c, new B3.n0(aVar, "", c(), this.f658d));
    }
}
