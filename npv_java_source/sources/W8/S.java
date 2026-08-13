package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S {
    public static final java.lang.String a(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final java.lang.String b(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String c(p127m7.e eVar) {
        java.lang.Object objB;
        if (eVar instanceof p019b9.C2121h) {
            return ((p019b9.C2121h) eVar).toString();
        }
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            objB = p087i7.w.b(eVar + '@' + b(eVar));
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        if (p087i7.w.e(objB) != null) {
            objB = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (java.lang.String) objB;
    }
}
