package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f44872a = new java.lang.Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void e() {
        throw new java.lang.IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void f() {
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i6, int i10) {
        if (i6 < 0 || i6 >= i10) {
            throw new java.lang.IndexOutOfBoundsException("index (" + i6 + ") is out of bound of [0, " + i10 + ')');
        }
    }
}
