package M0;

/* JADX INFO: renamed from: M0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1341m {
    public static final int a(java.util.List list, int i6) {
        byte b6;
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            M0.C1345q c1345q = (M0.C1345q) list.get(i11);
            if (c1345q.f() > i6) {
                b6 = 1;
            } else {
                b6 = c1345q.b() <= i6 ? (byte) -1 : (byte) 0;
            }
            if (b6 < 0) {
                i10 = i11 + 1;
            } else {
                if (b6 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int b(java.util.List list, int i6) {
        byte b6;
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            M0.C1345q c1345q = (M0.C1345q) list.get(i11);
            if (c1345q.g() > i6) {
                b6 = 1;
            } else {
                b6 = c1345q.c() <= i6 ? (byte) -1 : (byte) 0;
            }
            if (b6 < 0) {
                i10 = i11 + 1;
            } else {
                if (b6 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int c(java.util.List list, float f6) {
        byte b6;
        if (f6 <= 0.0f) {
            return 0;
        }
        if (f6 >= ((M0.C1345q) p097j7.AbstractC6879v.t0(list)).a()) {
            return p097j7.AbstractC6879v.o(list);
        }
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i10 = (i6 + size) >>> 1;
            M0.C1345q c1345q = (M0.C1345q) list.get(i10);
            if (c1345q.h() > f6) {
                b6 = 1;
            } else {
                b6 = c1345q.a() <= f6 ? (byte) -1 : (byte) 0;
            }
            if (b6 < 0) {
                i6 = i10 + 1;
            } else {
                if (b6 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final void d(java.util.List list, long j6, p237x7.l lVar) {
        int size = list.size();
        for (int iA = a(list, M0.N.l(j6)); iA < size; iA++) {
            M0.C1345q c1345q = (M0.C1345q) list.get(iA);
            if (c1345q.f() >= M0.N.k(j6)) {
                return;
            }
            if (c1345q.f() != c1345q.b()) {
                lVar.l(c1345q);
            }
        }
    }
}
