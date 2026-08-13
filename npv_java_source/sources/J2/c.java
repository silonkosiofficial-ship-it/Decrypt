package J2;

/* JADX INFO: loaded from: classes.dex */
public class c implements I2.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.C2093z f5647c = new androidx.lifecycle.C2093z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f5648d = androidx.work.impl.utils.futures.c.u();

    public c() {
        a(I2.m.f4981b);
    }

    public void a(I2.m.b bVar) {
        this.f5647c.l(bVar);
        if (bVar instanceof I2.m.b.c) {
            this.f5648d.q((I2.m.b.c) bVar);
        } else if (bVar instanceof I2.m.b.a) {
            this.f5648d.r(((I2.m.b.a) bVar).a());
        }
    }
}
