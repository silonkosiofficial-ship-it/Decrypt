package Z8;

/* JADX INFO: renamed from: Z8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1875l {
    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f, int i6, Y8.EnumC1863d enumC1863d) {
        if (i6 < 0 && i6 != -2 && i6 != -1) {
            throw new java.lang.IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i6).toString());
        }
        if (i6 == -1 && enumC1863d != Y8.EnumC1863d.SUSPEND) {
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i6 == -1) {
            enumC1863d = Y8.EnumC1863d.DROP_OLDEST;
            i6 = 0;
        }
        int i10 = i6;
        Y8.EnumC1863d enumC1863d2 = enumC1863d;
        return interfaceC1869f instanceof p009a9.q ? a9.q.a.a((p009a9.q) interfaceC1869f, null, i10, enumC1863d2, 1, null) : new p009a9.h(interfaceC1869f, null, i10, enumC1863d2, 2, null);
    }

    public static /* synthetic */ Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, int i6, Y8.EnumC1863d enumC1863d, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = -2;
        }
        if ((i10 & 2) != 0) {
            enumC1863d = Y8.EnumC1863d.SUSPEND;
        }
        return Z8.AbstractC1871h.c(interfaceC1869f, i6, enumC1863d);
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f interfaceC1869f) {
        return b(interfaceC1869f, -1, null, 2, null);
    }
}
