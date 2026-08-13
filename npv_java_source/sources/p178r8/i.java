package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public class i implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p178r8.i f54005C = new p178r8.i();

    private i() {
    }

    private static java.lang.Integer b(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
        int iC = c(interfaceC1432m2) - c(interfaceC1432m);
        if (iC != 0) {
            return java.lang.Integer.valueOf(iC);
        }
        if (p178r8.f.B(interfaceC1432m) && p178r8.f.B(interfaceC1432m2)) {
            return 0;
        }
        int iCompareTo = interfaceC1432m.getName().compareTo(interfaceC1432m2.getName());
        if (iCompareTo != 0) {
            return java.lang.Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(O7.InterfaceC1432m interfaceC1432m) {
        if (p178r8.f.B(interfaceC1432m)) {
            return 8;
        }
        if (interfaceC1432m instanceof O7.InterfaceC1431l) {
            return 7;
        }
        if (interfaceC1432m instanceof O7.U) {
            return ((O7.U) interfaceC1432m).v0() == null ? 6 : 5;
        }
        if (interfaceC1432m instanceof O7.InterfaceC1443y) {
            return ((O7.InterfaceC1443y) interfaceC1432m).v0() == null ? 4 : 3;
        }
        if (interfaceC1432m instanceof O7.InterfaceC1424e) {
            return 2;
        }
        return interfaceC1432m instanceof O7.e0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1432m interfaceC1432m2) {
        java.lang.Integer numB = b(interfaceC1432m, interfaceC1432m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
