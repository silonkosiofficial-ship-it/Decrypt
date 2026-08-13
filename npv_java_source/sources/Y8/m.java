package Y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static final Y8.j a(int i6, Y8.EnumC1863d enumC1863d, p237x7.l lVar) {
        Y8.j hVar;
        if (i6 == -2) {
            hVar = enumC1863d == Y8.EnumC1863d.SUSPEND ? new Y8.h(Y8.j.f16552i.a(), lVar) : new Y8.v(1, enumC1863d, lVar);
        } else {
            if (i6 == -1) {
                if (enumC1863d == Y8.EnumC1863d.SUSPEND) {
                    return new Y8.v(1, Y8.EnumC1863d.DROP_OLDEST, lVar);
                }
                throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i6 != 0) {
                if (i6 != Integer.MAX_VALUE) {
                    return enumC1863d == Y8.EnumC1863d.SUSPEND ? new Y8.h(i6, lVar) : new Y8.v(i6, enumC1863d, lVar);
                }
                return new Y8.h(Integer.MAX_VALUE, lVar);
            }
            hVar = enumC1863d == Y8.EnumC1863d.SUSPEND ? new Y8.h(0, lVar) : new Y8.v(1, enumC1863d, lVar);
        }
        return hVar;
    }

    public static /* synthetic */ Y8.j b(int i6, Y8.EnumC1863d enumC1863d, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        if ((i10 & 2) != 0) {
            enumC1863d = Y8.EnumC1863d.SUSPEND;
        }
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return a(i6, enumC1863d, lVar);
    }
}
