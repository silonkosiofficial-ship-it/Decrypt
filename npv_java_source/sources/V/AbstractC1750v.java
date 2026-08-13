package V;

/* JADX INFO: renamed from: V.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1750v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f15049a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.D f15050b = new V.AbstractC1750v.a();

    /* JADX INFO: renamed from: V.v$a */
    public static final class a implements V.D {
        a() {
        }
    }

    public static final V.r a(V.InterfaceC1713g interfaceC1713g, V.AbstractC1744s abstractC1744s) {
        return new V.C1748u(abstractC1744s, interfaceC1713g, null, 4, null);
    }

    public static final V.InterfaceC1700b1 b(V.InterfaceC1713g interfaceC1713g, V.AbstractC1744s abstractC1744s) {
        return new V.C1748u(abstractC1744s, interfaceC1713g, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(java.util.List list, int i6, int i10) {
        java.lang.Object obj = list.get(i6);
        list.set(i6, list.get(i10));
        list.set(i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p170r.B b6, int i6, int i10) {
        int iA = b6.a(i6);
        b6.m(i6, b6.a(i10));
        b6.m(i10, iA);
    }
}
