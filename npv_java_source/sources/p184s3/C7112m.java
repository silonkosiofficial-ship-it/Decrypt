package p184s3;

/* JADX INFO: renamed from: s3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7112m extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.c2 f54292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.lang.String f54293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54295f;

    C7112m(p184s3.C7141w c7141w, android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54291b = context;
        this.f54292c = c2Var;
        this.f54293d = str;
        this.f54294e = interfaceC2945Vl;
        this.f54295f = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54291b, "app_open");
        return new p184s3.B1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.i1(X3.b.c2(this.f54291b), this.f54292c, this.f54293d, this.f54294e, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        return this.f54295f.f54335a.c(this.f54291b, this.f54292c, this.f54293d, this.f54294e, 4);
    }
}
