package p184s3;

/* JADX INFO: renamed from: s3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7082c extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.lang.String f54195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54196d;

    C7082c(p184s3.C7141w c7141w, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54194b = context;
        this.f54195c = str;
        this.f54196d = interfaceC2945Vl;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54194b, "rewarded");
        return new p184s3.G1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.f2(X3.b.c2(this.f54194b), this.f54195c, this.f54196d, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        return com.google.android.gms.internal.ads.C2473Ip.a(this.f54194b, this.f54195c, this.f54196d);
    }
}
