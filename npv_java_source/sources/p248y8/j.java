package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final java.util.Set a(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Set setF = ((p248y8.h) it.next()).f();
            if (setF == null) {
                return null;
            }
            p097j7.AbstractC6879v.C(hashSet, setF);
        }
        return hashSet;
    }
}
