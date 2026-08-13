package ga;

/* JADX INFO: loaded from: classes2.dex */
public class d implements ga.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ga.b f45725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.util.List f45726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.String f45727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ha.k f45728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.String f45729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.lang.String f45730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    java.lang.Object[] f45731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f45732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    java.lang.Throwable f45733i;

    public void a(fa.g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f45726b == null) {
            this.f45726b = new java.util.ArrayList(2);
        }
        this.f45726b.add(gVar);
    }

    public ga.b b() {
        return this.f45725a;
    }

    public ha.k c() {
        return this.f45728d;
    }

    public void d(java.lang.Object[] objArr) {
        this.f45731g = objArr;
    }

    public void e(ga.b bVar) {
        this.f45725a = bVar;
    }

    public void f(ha.k kVar) {
        this.f45728d = kVar;
    }

    public void g(java.lang.String str) {
        this.f45727c = str;
    }

    public void h(java.lang.String str) {
        this.f45730f = str;
    }

    public void i(java.lang.String str) {
        this.f45729e = str;
    }

    public void j(java.lang.Throwable th) {
        this.f45733i = th;
    }

    public void k(long j6) {
        this.f45732h = j6;
    }
}
