package N2;

/* JADX INFO: loaded from: classes.dex */
public class f extends N2.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f7614e = I2.j.f("NetworkNotRoamingCtrlr");

    public f(android.content.Context context, S2.a aVar) {
        super(O2.h.c(context, aVar).d());
    }

    @Override // N2.c
    boolean b(Q2.p pVar) {
        return pVar.f8812j.b() == I2.k.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(M2.b bVar) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        I2.j.c().a(f7614e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new java.lang.Throwable[0]);
        return !bVar.a();
    }
}
