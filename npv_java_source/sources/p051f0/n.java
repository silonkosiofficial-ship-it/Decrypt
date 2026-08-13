package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final f0.n.a f44834G = new f0.n.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p051f0.n f44835H = new p051f0.n(0, 0, 0, null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f44836C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f44837D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f44838E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f44839F;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p051f0.n a() {
            return p051f0.n.f44835H;
        }
    }

    static final class b extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f44840E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f44841F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f44842G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f44843H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f44844I;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.n.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(R8.j jVar, p127m7.e eVar) {
            return ((f0.n.b) x(jVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            f0.n.b bVar = p051f0.n.this.new b(eVar);
            bVar.f44844I = obj;
            return bVar;
        }
    }

    private n(long j6, long j10, int i6, int[] iArr) {
        this.f44836C = j6;
        this.f44837D = j10;
        this.f44838E = i6;
        this.f44839F = iArr;
    }

    public final p051f0.n C(int i6) {
        int[] iArr;
        int iA;
        int i10 = this.f44838E;
        int i11 = i6 - i10;
        if (i11 >= 0 && i11 < 64) {
            long j6 = 1 << i11;
            long j10 = this.f44837D;
            if ((j10 & j6) != 0) {
                return new p051f0.n(this.f44836C, j10 & (~j6), i10, this.f44839F);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j11 = 1 << (i11 - 64);
            long j12 = this.f44836C;
            if ((j12 & j11) != 0) {
                return new p051f0.n(j12 & (~j11), this.f44837D, i10, this.f44839F);
            }
        } else if (i11 < 0 && (iArr = this.f44839F) != null && (iA = p051f0.o.a(iArr, i6)) >= 0) {
            int length = iArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                return new p051f0.n(this.f44836C, this.f44837D, this.f44838E, null);
            }
            int[] iArr2 = new int[i12];
            if (iA > 0) {
                p097j7.AbstractC6872n.j(iArr, iArr2, 0, 0, iA);
            }
            if (iA < i12) {
                p097j7.AbstractC6872n.j(iArr, iArr2, iA, iA + 1, length);
            }
            return new p051f0.n(this.f44836C, this.f44837D, this.f44838E, iArr2);
        }
        return this;
    }

    public final boolean D(int i6) {
        int[] iArr;
        int i10 = i6 - this.f44838E;
        if (i10 >= 0 && i10 < 64) {
            return ((1 << i10) & this.f44837D) != 0;
        }
        if (i10 >= 64 && i10 < 128) {
            return ((1 << (i10 - 64)) & this.f44836C) != 0;
        }
        if (i10 <= 0 && (iArr = this.f44839F) != null) {
            return p051f0.o.a(iArr, i6) >= 0;
        }
        return false;
    }

    public final int E(int i6) {
        int[] iArr = this.f44839F;
        if (iArr != null) {
            return iArr[0];
        }
        long j6 = this.f44837D;
        if (j6 != 0) {
            return this.f44838E + java.lang.Long.numberOfTrailingZeros(j6);
        }
        long j10 = this.f44836C;
        return j10 != 0 ? this.f44838E + 64 + java.lang.Long.numberOfTrailingZeros(j10) : i6;
    }

    public final p051f0.n M(p051f0.n nVar) {
        p051f0.n nVarN;
        p051f0.n nVar2 = f44835H;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i6 = nVar.f44838E;
        int i10 = this.f44838E;
        if (i6 == i10) {
            int[] iArr = nVar.f44839F;
            int[] iArr2 = this.f44839F;
            if (iArr == iArr2) {
                return new p051f0.n(this.f44836C | nVar.f44836C, this.f44837D | nVar.f44837D, i10, iArr2);
            }
        }
        int i11 = 0;
        if (this.f44839F == null) {
            int[] iArr3 = this.f44839F;
            if (iArr3 != null) {
                for (int i12 : iArr3) {
                    nVar = nVar.N(i12);
                }
            }
            if (this.f44837D != 0) {
                for (int i13 = 0; i13 < 64; i13++) {
                    if ((this.f44837D & (1 << i13)) != 0) {
                        nVar = nVar.N(this.f44838E + i13);
                    }
                }
            }
            if (this.f44836C != 0) {
                while (i11 < 64) {
                    if ((this.f44836C & (1 << i11)) != 0) {
                        nVar = nVar.N(i11 + 64 + this.f44838E);
                    }
                    i11++;
                }
            }
            return nVar;
        }
        int[] iArr4 = nVar.f44839F;
        if (iArr4 != null) {
            nVarN = this;
            for (int i14 : iArr4) {
                nVarN = nVarN.N(i14);
            }
        } else {
            nVarN = this;
        }
        if (nVar.f44837D != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if ((nVar.f44837D & (1 << i15)) != 0) {
                    nVarN = nVarN.N(nVar.f44838E + i15);
                }
            }
        }
        if (nVar.f44836C != 0) {
            while (i11 < 64) {
                if ((nVar.f44836C & (1 << i11)) != 0) {
                    nVarN = nVarN.N(i11 + 64 + nVar.f44838E);
                }
                i11++;
            }
        }
        return nVarN;
    }

    public final p051f0.n N(int i6) {
        int i10;
        int[] iArrS0;
        int i11 = this.f44838E;
        int i12 = i6 - i11;
        long j6 = 0;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f44837D;
            if ((j11 & j10) == 0) {
                return new p051f0.n(this.f44836C, j11 | j10, i11, this.f44839F);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f44836C;
            if ((j13 & j12) == 0) {
                return new p051f0.n(j13 | j12, this.f44837D, i11, this.f44839F);
            }
        } else if (i12 < 128) {
            int[] iArr = this.f44839F;
            if (iArr == null) {
                return new p051f0.n(this.f44836C, this.f44837D, i11, new int[]{i6});
            }
            int iA = p051f0.o.a(iArr, i6);
            if (iA < 0) {
                int i13 = -(iA + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                p097j7.AbstractC6872n.j(iArr, iArr2, 0, 0, i13);
                p097j7.AbstractC6872n.j(iArr, iArr2, i13 + 1, i13, length);
                iArr2[i13] = i6;
                return new p051f0.n(this.f44836C, this.f44837D, this.f44838E, iArr2);
            }
        } else if (!D(i6)) {
            long j14 = this.f44836C;
            long j15 = this.f44837D;
            int i14 = this.f44838E;
            int i15 = ((i6 + 1) / 64) * 64;
            java.util.ArrayList arrayList = null;
            long j16 = j15;
            long j17 = j14;
            while (true) {
                if (i14 >= i15) {
                    i10 = i14;
                    break;
                }
                if (j16 != j6) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        int[] iArr3 = this.f44839F;
                        if (iArr3 != null) {
                            for (int i16 : iArr3) {
                                arrayList.add(java.lang.Integer.valueOf(i16));
                            }
                        }
                    }
                    for (int i17 = 0; i17 < 64; i17++) {
                        if (((1 << i17) & j16) != 0) {
                            arrayList.add(java.lang.Integer.valueOf(i17 + i14));
                        }
                    }
                    j6 = 0;
                }
                if (j17 == j6) {
                    i10 = i15;
                    j16 = j6;
                    break;
                }
                i14 += 64;
                j16 = j17;
                j17 = j6;
            }
            if (arrayList == null || (iArrS0 = p097j7.AbstractC6879v.S0(arrayList)) == null) {
                iArrS0 = this.f44839F;
            }
            return new p051f0.n(j17, j16, i10, iArrS0).N(i6);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return R8.k.b(new f0.n.b(null)).iterator();
    }

    public final p051f0.n s(p051f0.n nVar) {
        p051f0.n nVarC;
        p051f0.n nVar2 = f44835H;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i6 = nVar.f44838E;
        int i10 = this.f44838E;
        if (i6 == i10) {
            int[] iArr = nVar.f44839F;
            int[] iArr2 = this.f44839F;
            if (iArr == iArr2) {
                return new p051f0.n(this.f44836C & (~nVar.f44836C), this.f44837D & (~nVar.f44837D), i10, iArr2);
            }
        }
        int[] iArr3 = nVar.f44839F;
        if (iArr3 != null) {
            nVarC = this;
            for (int i11 : iArr3) {
                nVarC = nVarC.C(i11);
            }
        } else {
            nVarC = this;
        }
        if (nVar.f44837D != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((nVar.f44837D & (1 << i12)) != 0) {
                    nVarC = nVarC.C(nVar.f44838E + i12);
                }
            }
        }
        if (nVar.f44836C != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((nVar.f44836C & (1 << i13)) != 0) {
                    nVarC = nVarC.C(i13 + 64 + nVar.f44838E);
                }
            }
        }
        return nVarC;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        sb.append(p051f0.AbstractC6540b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
