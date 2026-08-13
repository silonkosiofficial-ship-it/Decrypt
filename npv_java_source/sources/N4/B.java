package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B {
    static boolean a(N4.A a6, java.lang.Object obj) {
        if (obj == a6) {
            return true;
        }
        if (obj instanceof N4.A) {
            return a6.a().equals(((N4.A) obj).a());
        }
        return false;
    }
}
