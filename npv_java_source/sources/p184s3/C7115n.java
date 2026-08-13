package p184s3;

/* JADX INFO: renamed from: s3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7115n extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.c2 f54298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.lang.String f54299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54300e;

    C7115n(p184s3.C7141w c7141w, android.content.Context context, p184s3.c2 c2Var, java.lang.String str) {
        this.f54297b = context;
        this.f54298c = c2Var;
        this.f54299d = str;
        this.f54300e = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54297b, "search");
        return new p184s3.B1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.F4(X3.b.c2(this.f54297b), this.f54298c, this.f54299d, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        return this.f54300e.f54335a.c(this.f54297b, this.f54298c, this.f54299d, null, 3);
    }
}
