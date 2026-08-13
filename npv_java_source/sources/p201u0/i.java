package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(char c6, java.util.ArrayList arrayList, float[] fArr, int i6) {
        if (c6 == 'z' || c6 == 'Z') {
            arrayList.add(u0.h.b.f55256c);
            return;
        }
        if (c6 == 'm') {
            c(arrayList, fArr, i6);
            return;
        }
        if (c6 == 'M') {
            b(arrayList, fArr, i6);
            return;
        }
        int i10 = 0;
        if (c6 == 'l') {
            int i11 = i6 - 2;
            while (i10 <= i11) {
                arrayList.add(new u0.h.m(fArr[i10], fArr[i10 + 1]));
                i10 += 2;
            }
            return;
        }
        if (c6 == 'L') {
            int i12 = i6 - 2;
            while (i10 <= i12) {
                arrayList.add(new u0.h.e(fArr[i10], fArr[i10 + 1]));
                i10 += 2;
            }
            return;
        }
        if (c6 == 'h') {
            int i13 = i6 - 1;
            while (i10 <= i13) {
                arrayList.add(new u0.h.l(fArr[i10]));
                i10++;
            }
            return;
        }
        if (c6 == 'H') {
            int i14 = i6 - 1;
            while (i10 <= i14) {
                arrayList.add(new u0.h.d(fArr[i10]));
                i10++;
            }
            return;
        }
        if (c6 == 'v') {
            int i15 = i6 - 1;
            while (i10 <= i15) {
                arrayList.add(new u0.h.r(fArr[i10]));
                i10++;
            }
            return;
        }
        if (c6 == 'V') {
            int i16 = i6 - 1;
            while (i10 <= i16) {
                arrayList.add(new u0.h.s(fArr[i10]));
                i10++;
            }
            return;
        }
        if (c6 == 'c') {
            int i17 = i6 - 6;
            while (i10 <= i17) {
                arrayList.add(new u0.h.k(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]));
                i10 += 6;
            }
            return;
        }
        if (c6 == 'C') {
            int i18 = i6 - 6;
            while (i10 <= i18) {
                arrayList.add(new u0.h.c(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]));
                i10 += 6;
            }
            return;
        }
        if (c6 == 's') {
            int i19 = i6 - 4;
            while (i10 <= i19) {
                arrayList.add(new u0.h.p(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                i10 += 4;
            }
            return;
        }
        if (c6 == 'S') {
            int i20 = i6 - 4;
            while (i10 <= i20) {
                arrayList.add(new p201u0.h.C0724h(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                i10 += 4;
            }
            return;
        }
        if (c6 == 'q') {
            int i21 = i6 - 4;
            while (i10 <= i21) {
                arrayList.add(new u0.h.o(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                i10 += 4;
            }
            return;
        }
        if (c6 == 'Q') {
            int i22 = i6 - 4;
            while (i10 <= i22) {
                arrayList.add(new u0.h.g(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3]));
                i10 += 4;
            }
            return;
        }
        if (c6 == 't') {
            int i23 = i6 - 2;
            while (i10 <= i23) {
                arrayList.add(new u0.h.q(fArr[i10], fArr[i10 + 1]));
                i10 += 2;
            }
            return;
        }
        if (c6 == 'T') {
            int i24 = i6 - 2;
            while (i10 <= i24) {
                arrayList.add(new u0.h.i(fArr[i10], fArr[i10 + 1]));
                i10 += 2;
            }
            return;
        }
        if (c6 == 'a') {
            int i25 = i6 - 7;
            for (int i26 = 0; i26 <= i25; i26 += 7) {
                arrayList.add(new u0.h.j(fArr[i26], fArr[i26 + 1], fArr[i26 + 2], java.lang.Float.compare(fArr[i26 + 3], 0.0f) != 0, java.lang.Float.compare(fArr[i26 + 4], 0.0f) != 0, fArr[i26 + 5], fArr[i26 + 6]));
            }
            return;
        }
        if (c6 != 'A') {
            throw new java.lang.IllegalArgumentException("Unknown command for: " + c6);
        }
        int i27 = i6 - 7;
        for (int i28 = 0; i28 <= i27; i28 += 7) {
            arrayList.add(new u0.h.a(fArr[i28], fArr[i28 + 1], fArr[i28 + 2], java.lang.Float.compare(fArr[i28 + 3], 0.0f) != 0, java.lang.Float.compare(fArr[i28 + 4], 0.0f) != 0, fArr[i28 + 5], fArr[i28 + 6]));
        }
    }

    private static final void b(java.util.List list, float[] fArr, int i6) {
        int i10 = i6 - 2;
        if (i10 >= 0) {
            list.add(new u0.h.f(fArr[0], fArr[1]));
            for (int i11 = 2; i11 <= i10; i11 += 2) {
                list.add(new u0.h.e(fArr[i11], fArr[i11 + 1]));
            }
        }
    }

    private static final void c(java.util.List list, float[] fArr, int i6) {
        int i10 = i6 - 2;
        if (i10 >= 0) {
            list.add(new u0.h.n(fArr[0], fArr[1]));
            for (int i11 = 2; i11 <= i10; i11 += 2) {
                list.add(new u0.h.m(fArr[i11], fArr[i11 + 1]));
            }
        }
    }
}
