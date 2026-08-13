package p249y9;

/* JADX INFO: renamed from: y9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7361e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f57403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f57407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f57408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f57409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f57410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p249y9.EnumC7357a f57411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f57412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f57414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f57415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f57416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f57417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f57418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private A9.b f57419q;

    public C7361e(p249y9.AbstractC7358b abstractC7358b) {
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        this.f57403a = abstractC7358b.e().i();
        this.f57404b = abstractC7358b.e().j();
        this.f57405c = abstractC7358b.e().k();
        this.f57406d = abstractC7358b.e().q();
        this.f57407e = abstractC7358b.e().m();
        this.f57408f = abstractC7358b.e().n();
        this.f57409g = abstractC7358b.e().g();
        this.f57410h = abstractC7358b.e().e();
        this.f57411i = abstractC7358b.e().f();
        this.f57412j = abstractC7358b.e().o();
        abstractC7358b.e().l();
        this.f57413k = abstractC7358b.e().h();
        this.f57414l = abstractC7358b.e().d();
        this.f57415m = abstractC7358b.e().a();
        this.f57416n = abstractC7358b.e().b();
        this.f57417o = abstractC7358b.e().c();
        this.f57418p = abstractC7358b.e().p();
        this.f57419q = abstractC7358b.f();
    }

    public final p249y9.C7363g a() {
        if (this.f57418p) {
            if (!p247y7.AbstractC7350t.b(this.f57410h, "type")) {
                throw new java.lang.IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (this.f57411i != p249y9.EnumC7357a.POLYMORPHIC) {
                throw new java.lang.IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (this.f57407e) {
            if (!p247y7.AbstractC7350t.b(this.f57408f, "    ")) {
                java.lang.String str = this.f57408f;
                for (int i6 = 0; i6 < str.length(); i6++) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new java.lang.IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f57408f).toString());
                    }
                }
            }
        } else if (!p247y7.AbstractC7350t.b(this.f57408f, "    ")) {
            throw new java.lang.IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new p249y9.C7363g(this.f57403a, this.f57405c, this.f57406d, this.f57417o, this.f57407e, this.f57404b, this.f57408f, this.f57409g, this.f57418p, this.f57410h, this.f57416n, this.f57412j, null, this.f57413k, this.f57414l, this.f57415m, this.f57411i);
    }

    public final A9.b b() {
        return this.f57419q;
    }

    public final void c(boolean z6) {
        this.f57409g = z6;
    }

    public final void d(boolean z6) {
        this.f57403a = z6;
    }

    public final void e(boolean z6) {
        this.f57404b = z6;
    }

    public final void f(boolean z6) {
        this.f57405c = z6;
    }

    public final void g(boolean z6) {
        this.f57406d = z6;
    }

    public final void h(boolean z6) {
        this.f57407e = z6;
    }
}
