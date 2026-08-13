package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f23883e = I2.j.f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f23884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.background.systemalarm.e f23886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M2.d f23887d;

    c(android.content.Context context, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        this.f23884a = context;
        this.f23885b = i6;
        this.f23886c = eVar;
        this.f23887d = new M2.d(context, eVar.f(), null);
    }

    void a() {
        java.util.List<Q2.p> listH = this.f23886c.g().o().Y().h();
        androidx.work.impl.background.systemalarm.ConstraintProxy.a(this.f23884a, listH);
        this.f23887d.d(listH);
        java.util.ArrayList arrayList = new java.util.ArrayList(listH.size());
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        for (Q2.p pVar : listH) {
            java.lang.String str = pVar.f8803a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f23887d.c(str))) {
                arrayList.add(pVar);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((Q2.p) it.next()).f8803a;
            android.content.Intent intentB = androidx.work.impl.background.systemalarm.b.b(this.f23884a, str2);
            I2.j.c().a(f23883e, java.lang.String.format("Creating a delay_met command for workSpec with id (%s)", str2), new java.lang.Throwable[0]);
            androidx.work.impl.background.systemalarm.e eVar = this.f23886c;
            eVar.k(new androidx.work.impl.background.systemalarm.e.b(eVar, intentB, this.f23885b));
        }
        this.f23887d.e();
    }
}
