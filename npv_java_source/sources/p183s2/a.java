package p183s2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54117b;

    public a(int i6, int i10) {
        this.f54116a = i6;
        this.f54117b = i10;
    }

    public void a(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        if (!(bVar instanceof p173r2.a)) {
            throw new p087i7.t("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((p173r2.a) bVar).a());
    }

    public abstract void b(p253z2.d dVar);
}
