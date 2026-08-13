package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f8689c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P9.k f8687a = new P9.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f8688b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final P9.k.a f8690d = new P9.k.a();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final P9.k.a[] f8691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8693c;

        public a() {
            this.f8691a = new P9.k.a[256];
            this.f8692b = 0;
            this.f8693c = 0;
        }

        public a(int i6, int i10) {
            this.f8691a = null;
            this.f8692b = i6;
            int i11 = i10 & 7;
            this.f8693c = i11 == 0 ? 8 : i11;
        }

        public final P9.k.a[] a() {
            return this.f8691a;
        }

        public final int b() {
            return this.f8692b;
        }

        public final int c() {
            return this.f8693c;
        }
    }

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f8689c = bArr;
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            f8687a.a(i6, f8688b[i6], f8689c[i6]);
        }
    }

    private k() {
    }

    private final void a(int i6, int i10, int i11) {
        P9.k.a aVar = new P9.k.a(i6, i11);
        P9.k.a aVar2 = f8690d;
        while (i11 > 8) {
            i11 -= 8;
            int i12 = (i10 >>> i11) & 255;
            P9.k.a[] aVarArrA = aVar2.a();
            p247y7.AbstractC7350t.c(aVarArrA);
            P9.k.a aVar3 = aVarArrA[i12];
            if (aVar3 == null) {
                aVar3 = new P9.k.a();
                aVarArrA[i12] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i13 = 8 - i11;
        int i14 = (i10 << i13) & 255;
        P9.k.a[] aVarArrA2 = aVar2.a();
        p247y7.AbstractC7350t.c(aVarArrA2);
        p097j7.AbstractC6872n.w(aVarArrA2, aVar, i14, (1 << i13) + i14);
    }

    public final void b(X9.InterfaceC1838f interfaceC1838f, long j6, X9.InterfaceC1837e interfaceC1837e) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        P9.k.a aVar = f8690d;
        int iD = 0;
        int iC = 0;
        for (long j10 = 0; j10 < j6; j10++) {
            iD = (iD << 8) | I9.d.d(interfaceC1838f.m(), 255);
            iC += 8;
            while (iC >= 8) {
                P9.k.a[] aVarArrA = aVar.a();
                p247y7.AbstractC7350t.c(aVarArrA);
                aVar = aVarArrA[(iD >>> (iC - 8)) & 255];
                p247y7.AbstractC7350t.c(aVar);
                if (aVar.a() == null) {
                    interfaceC1837e.U(aVar.b());
                    iC -= aVar.c();
                    aVar = f8690d;
                } else {
                    iC -= 8;
                }
            }
        }
        while (iC > 0) {
            P9.k.a[] aVarArrA2 = aVar.a();
            p247y7.AbstractC7350t.c(aVarArrA2);
            P9.k.a aVar2 = aVarArrA2[(iD << (8 - iC)) & 255];
            p247y7.AbstractC7350t.c(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            interfaceC1837e.U(aVar2.b());
            iC -= aVar2.c();
            aVar = f8690d;
        }
    }

    public final void c(X9.C1839g c1839g, X9.InterfaceC1837e interfaceC1837e) {
        p247y7.AbstractC7350t.f(c1839g, "source");
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        int I10 = c1839g.I();
        long j6 = 0;
        int i6 = 0;
        for (int i10 = 0; i10 < I10; i10++) {
            int iD = I9.d.d(c1839g.n(i10), 255);
            int i11 = f8688b[iD];
            byte b6 = f8689c[iD];
            j6 = (j6 << b6) | ((long) i11);
            i6 += b6;
            while (i6 >= 8) {
                i6 -= 8;
                interfaceC1837e.U((int) (j6 >> i6));
            }
        }
        if (i6 > 0) {
            interfaceC1837e.U((int) ((j6 << (8 - i6)) | (255 >>> i6)));
        }
    }

    public final int d(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        int I10 = c1839g.I();
        long j6 = 0;
        for (int i6 = 0; i6 < I10; i6++) {
            j6 += (long) f8689c[I9.d.d(c1839g.n(i6), 255)];
        }
        return (int) ((j6 + ((long) 7)) >> 3);
    }
}
