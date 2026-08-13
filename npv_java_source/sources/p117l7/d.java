package p117l7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends p117l7.c {
    public static int g(int i6, int... iArr) {
        p247y7.AbstractC7350t.f(iArr, "other");
        for (int i10 : iArr) {
            i6 = java.lang.Math.max(i6, i10);
        }
        return i6;
    }

    public static java.lang.Comparable h(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        p247y7.AbstractC7350t.f(comparable, "a");
        p247y7.AbstractC7350t.f(comparable2, "b");
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }
}
