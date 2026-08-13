package ha;

/* JADX INFO: loaded from: classes2.dex */
public class b implements ia.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ha.n f46580a = new ha.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.InheritableThreadLocal f46581b = new ha.b.a();

    class a extends java.lang.InheritableThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Map childValue(java.util.Map map) {
            if (map == null) {
                return null;
            }
            return new java.util.HashMap(map);
        }
    }
}
