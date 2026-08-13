package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static final O7.InterfaceC1421b a(java.util.Collection collection) {
        java.lang.Integer numD;
        p247y7.AbstractC7350t.f(collection, "descriptors");
        collection.isEmpty();
        java.util.Iterator it = collection.iterator();
        O7.InterfaceC1421b interfaceC1421b = null;
        while (it.hasNext()) {
            O7.InterfaceC1421b interfaceC1421b2 = (O7.InterfaceC1421b) it.next();
            if (interfaceC1421b == null || ((numD = O7.AbstractC1438t.d(interfaceC1421b.h(), interfaceC1421b2.h())) != null && numD.intValue() < 0)) {
                interfaceC1421b = interfaceC1421b2;
            }
        }
        p247y7.AbstractC7350t.c(interfaceC1421b);
        return interfaceC1421b;
    }
}
