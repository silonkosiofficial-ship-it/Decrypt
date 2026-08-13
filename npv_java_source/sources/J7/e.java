package J7;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {
        public static void a(J7.e eVar, java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            if (J7.g.a(eVar) == objArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Callable expects " + J7.g.a(eVar) + " arguments, but " + objArr.length + " were provided.");
        }
    }

    java.lang.reflect.Type l();

    java.util.List m();

    java.lang.reflect.Member n();

    java.lang.Object z(java.lang.Object[] objArr);
}
