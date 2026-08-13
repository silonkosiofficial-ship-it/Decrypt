package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class ZH0 implements com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.IH0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.JH0[] f33535C;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.IH0 f33539G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.PI0 f33540H;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.ArrayList f33537E = new java.util.ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.HashMap f33538F = new java.util.HashMap();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.HI0 f33542J = new com.google.android.gms.internal.ads.C5335uH0(com.google.android.gms.internal.ads.AbstractC3398ci0.O(), com.google.android.gms.internal.ads.AbstractC3398ci0.O());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.IdentityHashMap f33536D = new java.util.IdentityHashMap();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.google.android.gms.internal.ads.JH0[] f33541I = new com.google.android.gms.internal.ads.JH0[0];

    public ZH0(com.google.android.gms.internal.ads.C5445vH0 c5445vH0, long[] jArr, com.google.android.gms.internal.ads.JH0... jh0Arr) {
        this.f33535C = jh0Arr;
        for (int i6 = 0; i6 < jh0Arr.length; i6++) {
            long j6 = jArr[i6];
            if (j6 != 0) {
                this.f33535C[i6] = new com.google.android.gms.internal.ads.MI0(jh0Arr[i6], j6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
        this.f33542J.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long b() {
        return this.f33542J.b();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long c() {
        return this.f33542J.c();
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        if (this.f33537E.isEmpty()) {
            return this.f33542J.d(za0);
        }
        int size = this.f33537E.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((com.google.android.gms.internal.ads.JH0) this.f33537E.get(i6)).d(za0);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.HI0 hi0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f33539G;
        ih0.getClass();
        ih0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long f() {
        long j6 = -9223372036854775807L;
        for (com.google.android.gms.internal.ads.JH0 jh0 : this.f33541I) {
            long jF = jh0.f();
            if (jF == -9223372036854775807L) {
                if (j6 != -9223372036854775807L && jh0.h(j6) != j6) {
                    throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j6 == -9223372036854775807L) {
                for (com.google.android.gms.internal.ads.JH0 jh1 : this.f33541I) {
                    if (jh1 == jh0) {
                        break;
                    }
                    if (jh1.h(jF) != jF) {
                        throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j6 = jF;
            } else if (jF != j6) {
                throw new java.lang.IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final com.google.android.gms.internal.ads.PI0 g() {
        com.google.android.gms.internal.ads.PI0 pi0 = this.f33540H;
        pi0.getClass();
        return pi0;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long h(long j6) {
        long jH = this.f33541I[0].h(j6);
        int i6 = 1;
        while (true) {
            com.google.android.gms.internal.ads.JH0[] jh0Arr = this.f33541I;
            if (i6 >= jh0Arr.length) {
                return jH;
            }
            if (jh0Arr[i6].h(jH) != jH) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long i(long j6, com.google.android.gms.internal.ads.GB0 gb0) {
        com.google.android.gms.internal.ads.JH0[] jh0Arr = this.f33541I;
        return (jh0Arr.length > 0 ? jh0Arr[0] : this.f33535C[0]).i(j6, gb0);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void j(long j6, boolean z6) {
        for (com.google.android.gms.internal.ads.JH0 jh0 : this.f33541I) {
            jh0.j(j6, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void k() {
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.JH0[] jh0Arr = this.f33535C;
            if (i6 >= jh0Arr.length) {
                return;
            }
            jh0Arr[i6].k();
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.IH0
    public final void l(com.google.android.gms.internal.ads.JH0 jh0) {
        this.f33537E.remove(jh0);
        if (!this.f33537E.isEmpty()) {
            return;
        }
        int i6 = 0;
        for (com.google.android.gms.internal.ads.JH0 jh1 : this.f33535C) {
            i6 += jh1.g().f30686a;
        }
        com.google.android.gms.internal.ads.C2728Pm[] c2728PmArr = new com.google.android.gms.internal.ads.C2728Pm[i6];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            com.google.android.gms.internal.ads.JH0[] jh0Arr = this.f33535C;
            if (i10 >= jh0Arr.length) {
                this.f33540H = new com.google.android.gms.internal.ads.PI0(c2728PmArr);
                com.google.android.gms.internal.ads.IH0 ih0 = this.f33539G;
                ih0.getClass();
                ih0.l(this);
                return;
            }
            com.google.android.gms.internal.ads.PI0 pi0G = jh0Arr[i10].g();
            int i12 = pi0G.f30686a;
            int i13 = 0;
            while (i13 < i12) {
                com.google.android.gms.internal.ads.C2728Pm c2728PmB = pi0G.b(i13);
                com.google.android.gms.internal.ads.D[] dArr = new com.google.android.gms.internal.ads.D[c2728PmB.f30777a];
                for (int i14 = 0; i14 < c2728PmB.f30777a; i14++) {
                    com.google.android.gms.internal.ads.D dB = c2728PmB.b(i14);
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = dB.b();
                    java.lang.String str = dB.f26560a;
                    if (str == null) {
                        str = "";
                    }
                    c4682oK0B.m(i10 + ":" + str);
                    dArr[i14] = c4682oK0B.H();
                }
                com.google.android.gms.internal.ads.C2728Pm c2728Pm = new com.google.android.gms.internal.ads.C2728Pm(i10 + ":" + c2728PmB.f30778b, dArr);
                this.f33538F.put(c2728Pm, c2728PmB);
                c2728PmArr[i11] = c2728Pm;
                i13++;
                i11++;
            }
            i10++;
        }
    }

    public final com.google.android.gms.internal.ads.JH0 m(int i6) {
        com.google.android.gms.internal.ads.JH0 jh0 = this.f33535C[i6];
        return jh0 instanceof com.google.android.gms.internal.ads.MI0 ? ((com.google.android.gms.internal.ads.MI0) jh0).m() : jh0;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long o(com.google.android.gms.internal.ads.IJ0[] ij0Arr, boolean[] zArr, com.google.android.gms.internal.ads.EI0[] ei0Arr, boolean[] zArr2, long j6) {
        int length;
        int length2 = ij0Arr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i6 = 0;
        int i10 = 0;
        while (true) {
            length = ij0Arr.length;
            if (i10 >= length) {
                break;
            }
            com.google.android.gms.internal.ads.EI0 ei0 = ei0Arr[i10];
            java.lang.Integer num = ei0 != null ? (java.lang.Integer) this.f33536D.get(ei0) : null;
            iArr[i10] = num == null ? -1 : num.intValue();
            com.google.android.gms.internal.ads.IJ0 ij0 = ij0Arr[i10];
            if (ij0 != null) {
                java.lang.String str = ij0.i().f30778b;
                iArr2[i10] = java.lang.Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        this.f33536D.clear();
        com.google.android.gms.internal.ads.EI0[] ei0Arr2 = new com.google.android.gms.internal.ads.EI0[length];
        com.google.android.gms.internal.ads.EI0[] ei0Arr3 = new com.google.android.gms.internal.ads.EI0[length];
        com.google.android.gms.internal.ads.IJ0[] ij0Arr2 = new com.google.android.gms.internal.ads.IJ0[length];
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f33535C.length);
        long j10 = j6;
        int i11 = 0;
        while (i11 < this.f33535C.length) {
            for (int i12 = i6; i12 < ij0Arr.length; i12++) {
                ei0Arr3[i12] = iArr[i12] == i11 ? ei0Arr[i12] : null;
                if (iArr2[i12] == i11) {
                    com.google.android.gms.internal.ads.IJ0 ij1 = ij0Arr[i12];
                    ij1.getClass();
                    com.google.android.gms.internal.ads.C2728Pm c2728Pm = (com.google.android.gms.internal.ads.C2728Pm) this.f33538F.get(ij1.i());
                    c2728Pm.getClass();
                    ij0Arr2[i12] = new com.google.android.gms.internal.ads.YH0(ij1, c2728Pm);
                } else {
                    ij0Arr2[i12] = null;
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            com.google.android.gms.internal.ads.IJ0[] ij0Arr3 = ij0Arr2;
            com.google.android.gms.internal.ads.EI0[] ei0Arr4 = ei0Arr3;
            long jO = this.f33535C[i11].o(ij0Arr2, zArr, ei0Arr3, zArr2, j10);
            if (i11 == 0) {
                j10 = jO;
            } else if (jO != j10) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i13 = 0; i13 < ij0Arr.length; i13++) {
                if (iArr2[i13] == i11) {
                    com.google.android.gms.internal.ads.EI0 ei1 = ei0Arr4[i13];
                    ei1.getClass();
                    ei0Arr2[i13] = ei1;
                    this.f33536D.put(ei1, java.lang.Integer.valueOf(i11));
                    z6 = true;
                } else if (iArr[i13] == i11) {
                    com.google.android.gms.internal.ads.LC.f(ei0Arr4[i13] == null);
                }
            }
            if (z6) {
                arrayList2.add(this.f33535C[i11]);
            }
            i11++;
            arrayList = arrayList2;
            ij0Arr2 = ij0Arr3;
            ei0Arr3 = ei0Arr4;
            i6 = 0;
        }
        int i14 = i6;
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.System.arraycopy(ei0Arr2, i14, ei0Arr, i14, length);
        this.f33541I = (com.google.android.gms.internal.ads.JH0[]) arrayList3.toArray(new com.google.android.gms.internal.ads.JH0[i14]);
        this.f33542J = new com.google.android.gms.internal.ads.C5335uH0(arrayList3, com.google.android.gms.internal.ads.AbstractC5264ti0.b(arrayList3, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.XH0
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.internal.ads.JH0) obj).g().c();
            }
        }));
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void p(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f33539G = ih0;
        java.util.Collections.addAll(this.f33537E, this.f33535C);
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.JH0[] jh0Arr = this.f33535C;
            if (i6 >= jh0Arr.length) {
                return;
            }
            jh0Arr[i6].p(this, j6);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        return this.f33542J.q();
    }
}
