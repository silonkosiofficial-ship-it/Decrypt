package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final o2.C.a f52294D = new o2.C.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p243y2.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "it");
            return java.lang.Boolean.valueOf(eVar.p());
        }
    }

    public static final java.lang.Object a(p143o2.k kVar, java.lang.String str, p127m7.e eVar) {
        java.lang.Object objB = kVar.b(str, o2.C.a.f52294D, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }
}
