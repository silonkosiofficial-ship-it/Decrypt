package V6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final S8.o f15139a = new S8.o("\r\n|\r|\n");

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(java.lang.StringBuilder sb, java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            java.util.Iterator it = f15139a.g(obj.toString(), 0).iterator();
            while (it.hasNext()) {
                sb.append(str + ": " + ((java.lang.String) it.next()) + "\r\n");
            }
        }
    }
}
