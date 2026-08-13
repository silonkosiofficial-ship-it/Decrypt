package Z8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p019b9.D f16749a = new p019b9.D("NO_VALUE");

    public static final Z8.x a(int i6, int i10, Y8.EnumC1863d enumC1863d) {
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("replay cannot be negative, but was " + i6).toString());
        }
        if (i10 < 0) {
            throw new java.lang.IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i10).toString());
        }
        if (i6 > 0 || i10 > 0 || enumC1863d == Y8.EnumC1863d.SUSPEND) {
            int i11 = i10 + i6;
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            return new Z8.D(i6, i11, enumC1863d);
        }
        throw new java.lang.IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC1863d).toString());
    }

    public static /* synthetic */ Z8.x b(int i6, int i10, Y8.EnumC1863d enumC1863d, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            enumC1863d = Y8.EnumC1863d.SUSPEND;
        }
        return a(i6, i10, enumC1863d);
    }

    public static final Z8.InterfaceC1869f e(Z8.C c6, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return ((i6 == 0 || i6 == -3) && enumC1863d == Y8.EnumC1863d.SUSPEND) ? c6 : new p009a9.h(c6, iVar, i6, enumC1863d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object f(java.lang.Object[] objArr, long j6) {
        return objArr[((int) j6) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(java.lang.Object[] objArr, long j6, java.lang.Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }
}
