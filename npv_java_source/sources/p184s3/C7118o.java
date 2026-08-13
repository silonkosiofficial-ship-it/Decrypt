package p184s3;

/* JADX INFO: renamed from: s3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7118o extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.c2 f54302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.lang.String f54303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54305f;

    C7118o(p184s3.C7141w c7141w, android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54301b = context;
        this.f54302c = c2Var;
        this.f54303d = str;
        this.f54304e = interfaceC2945Vl;
        this.f54305f = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54301b, "interstitial");
        return new p184s3.B1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.v5(X3.b.c2(this.f54301b), this.f54302c, this.f54303d, this.f54304e, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        return this.f54305f.f54335a.c(this.f54301b, this.f54302c, this.f54303d, this.f54304e, 2);
    }
}
