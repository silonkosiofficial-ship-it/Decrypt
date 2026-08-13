package p023c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final androidx.lifecycle.T a(androidx.lifecycle.V.c cVar, F7.c cVar2, p023c2.a aVar) {
        p247y7.AbstractC7350t.f(cVar, "factory");
        p247y7.AbstractC7350t.f(cVar2, "modelClass");
        p247y7.AbstractC7350t.f(aVar, "extras");
        try {
            try {
                return cVar.b(cVar2, aVar);
            } catch (java.lang.AbstractMethodError unused) {
                return cVar.a(p227w7.a.b(cVar2));
            }
        } catch (java.lang.AbstractMethodError unused2) {
            return cVar.c(p227w7.a.b(cVar2), aVar);
        }
    }
}
