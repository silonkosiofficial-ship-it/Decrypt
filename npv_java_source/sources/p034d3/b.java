package p034d3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static java.lang.Object a(int i6, java.lang.Object obj, p034d3.a aVar, p034d3.c cVar) {
        java.lang.Object objApply;
        if (i6 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i6--;
        } while (i6 >= 1);
        return objApply;
    }
}
