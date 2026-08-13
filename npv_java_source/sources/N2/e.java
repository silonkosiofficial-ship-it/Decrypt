package N2;

/* JADX INFO: loaded from: classes.dex */
public class e extends N2.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f7613e = I2.j.f("NetworkMeteredCtrlr");

    public e(android.content.Context context, S2.a aVar) {
        super(O2.h.c(context, aVar).d());
    }

    @Override // N2.c
    boolean b(Q2.p pVar) {
        return pVar.f8812j.b() == I2.k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(M2.b bVar) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        I2.j.c().a(f7613e, "Metered network constraint is not supported before API 26, only checking for connected state.", new java.lang.Throwable[0]);
        return !bVar.a();
    }
}
