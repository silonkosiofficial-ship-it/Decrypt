package p094j3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.util.SparseArray f49261a = new android.util.SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.util.HashMap f49262b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f49262b = map;
        map.put(W2.e.DEFAULT, 0);
        f49262b.put(W2.e.VERY_LOW, 1);
        f49262b.put(W2.e.HIGHEST, 2);
        for (W2.e eVar : f49262b.keySet()) {
            f49261a.append(((java.lang.Integer) f49262b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(W2.e eVar) {
        java.lang.Integer num = (java.lang.Integer) f49262b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static W2.e b(int i6) {
        W2.e eVar = (W2.e) f49261a.get(i6);
        if (eVar != null) {
            return eVar;
        }
        throw new java.lang.IllegalArgumentException("Unknown Priority for value " + i6);
    }
}
