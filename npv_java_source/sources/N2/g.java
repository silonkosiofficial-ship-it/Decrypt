package N2;

/* JADX INFO: loaded from: classes.dex */
public class g extends N2.c {
    public g(android.content.Context context, S2.a aVar) {
        super(O2.h.c(context, aVar).d());
    }

    @Override // N2.c
    boolean b(Q2.p pVar) {
        return pVar.f8812j.b() == I2.k.UNMETERED || (android.os.Build.VERSION.SDK_INT >= 30 && pVar.f8812j.b() == I2.k.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(M2.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
