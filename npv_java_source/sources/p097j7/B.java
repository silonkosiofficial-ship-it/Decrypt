package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B extends p097j7.A {
    public static void A(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static void B(java.util.List list, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(list, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}
