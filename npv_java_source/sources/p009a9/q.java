package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public interface q extends Z8.InterfaceC1869f {

    public static final class a {
        public static /* synthetic */ Z8.InterfaceC1869f a(p009a9.q qVar, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i10 & 1) != 0) {
                iVar = p127m7.j.f51198C;
            }
            if ((i10 & 2) != 0) {
                i6 = -3;
            }
            if ((i10 & 4) != 0) {
                enumC1863d = Y8.EnumC1863d.SUSPEND;
            }
            return qVar.d(iVar, i6, enumC1863d);
        }
    }

    Z8.InterfaceC1869f d(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d);
}
