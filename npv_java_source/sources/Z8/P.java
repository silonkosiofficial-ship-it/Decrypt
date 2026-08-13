package Z8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f16791a = new p019b9.D("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p019b9.D f16792b = new p019b9.D("PENDING");

    public static final Z8.y a(java.lang.Object obj) {
        if (obj == null) {
            obj = p009a9.t.f17223a;
        }
        return new Z8.O(obj);
    }

    public static final Z8.InterfaceC1869f d(Z8.N n6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return (((i6 < 0 || i6 >= 2) && i6 != -2) || enumC1863d != Y8.EnumC1863d.DROP_OLDEST) ? Z8.E.e(n6, iVar, i6, enumC1863d) : n6;
    }
}
