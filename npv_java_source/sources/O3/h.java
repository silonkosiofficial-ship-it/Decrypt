package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static O3.g a(O3.k kVar, O3.f fVar) {
        Q3.AbstractC1477p.m(kVar, "Result must not be null");
        Q3.AbstractC1477p.b(!kVar.d().C(), "Status code must not be SUCCESS");
        O3.o oVar = new O3.o(fVar, kVar);
        oVar.f(kVar);
        return oVar;
    }

    public static O3.g b(com.google.android.gms.common.api.Status status, O3.f fVar) {
        Q3.AbstractC1477p.m(status, "Result must not be null");
        P3.l lVar = new P3.l(fVar);
        lVar.f(status);
        return lVar;
    }
}
