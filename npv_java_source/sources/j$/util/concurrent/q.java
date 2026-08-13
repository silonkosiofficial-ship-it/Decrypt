package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class q extends j$.util.concurrent.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f48099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f48100i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    j$.util.concurrent.r f48101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile j$.util.concurrent.r f48102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile java.lang.Thread f48103g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVarH = j$.sun.misc.a.h();
        f48099h = aVarH;
        f48100i = aVarH.j(j$.util.concurrent.q.class, "lockState");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r7
  0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    q(j$.util.concurrent.r rVar) {
        int i6;
        super(-2, null, null);
        this.f48102f = rVar;
        j$.util.concurrent.r rVar2 = null;
        while (rVar != null) {
            j$.util.concurrent.r rVar3 = (j$.util.concurrent.r) rVar.f48086d;
            rVar.f48106g = null;
            rVar.f48105f = null;
            if (rVar2 == null) {
                rVar.f48104e = null;
                rVar.f48108i = false;
            } else {
                java.lang.Object obj = rVar.f48084b;
                int i10 = rVar.f48083a;
                j$.util.concurrent.r rVar4 = rVar2;
                java.lang.Class<?> clsC = null;
                while (true) {
                    java.lang.Object obj2 = rVar4.f48084b;
                    int i11 = rVar4.f48083a;
                    if (i11 > i10) {
                        i6 = -1;
                    } else if (i11 < i10) {
                        i6 = 1;
                    } else if (clsC == null && (clsC = j$.util.concurrent.ConcurrentHashMap.c(obj)) == null) {
                        i6 = i(obj, obj2);
                    } else {
                        int i12 = j$.util.concurrent.ConcurrentHashMap.f48049g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((java.lang.Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i6 = i(obj, obj2);
                        } else {
                            i6 = iCompareTo;
                        }
                    }
                    j$.util.concurrent.r rVar5 = i6 <= 0 ? rVar4.f48105f : rVar4.f48106g;
                    if (rVar5 == null) {
                        break;
                    } else {
                        rVar4 = rVar5;
                    }
                }
                rVar.f48104e = rVar4;
                if (i6 <= 0) {
                    rVar4.f48105f = rVar;
                } else {
                    rVar4.f48106g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.f48101e = rVar2;
    }

    static j$.util.concurrent.r b(j$.util.concurrent.r rVar, j$.util.concurrent.r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            j$.util.concurrent.r rVar3 = rVar2.f48104e;
            if (rVar3 == null) {
                rVar2.f48108i = false;
                return rVar2;
            }
            if (rVar2.f48108i) {
                rVar2.f48108i = false;
                return rVar;
            }
            j$.util.concurrent.r rVar4 = rVar3.f48105f;
            if (rVar4 == rVar2) {
                rVar4 = rVar3.f48106g;
                if (rVar4 != null && rVar4.f48108i) {
                    rVar4.f48108i = false;
                    rVar3.f48108i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.f48104e;
                    rVar4 = rVar3 == null ? null : rVar3.f48106g;
                }
                if (rVar4 != null) {
                    j$.util.concurrent.r rVar5 = rVar4.f48105f;
                    j$.util.concurrent.r rVar6 = rVar4.f48106g;
                    if ((rVar6 == null || !rVar6.f48108i) && (rVar5 == null || !rVar5.f48108i)) {
                        rVar4.f48108i = true;
                    } else {
                        if (rVar6 == null || !rVar6.f48108i) {
                            if (rVar5 != null) {
                                rVar5.f48108i = false;
                            }
                            rVar4.f48108i = true;
                            rVar = h(rVar, rVar4);
                            rVar3 = rVar2.f48104e;
                            rVar4 = rVar3 != null ? rVar3.f48106g : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f48108i = rVar3 == null ? false : rVar3.f48108i;
                            j$.util.concurrent.r rVar7 = rVar4.f48106g;
                            if (rVar7 != null) {
                                rVar7.f48108i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f48108i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            } else {
                if (rVar4 != null && rVar4.f48108i) {
                    rVar4.f48108i = false;
                    rVar3.f48108i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.f48104e;
                    rVar4 = rVar3 == null ? null : rVar3.f48105f;
                }
                if (rVar4 != null) {
                    j$.util.concurrent.r rVar8 = rVar4.f48105f;
                    j$.util.concurrent.r rVar9 = rVar4.f48106g;
                    if ((rVar8 == null || !rVar8.f48108i) && (rVar9 == null || !rVar9.f48108i)) {
                        rVar4.f48108i = true;
                    } else {
                        if (rVar8 == null || !rVar8.f48108i) {
                            if (rVar9 != null) {
                                rVar9.f48108i = false;
                            }
                            rVar4.f48108i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.f48104e;
                            rVar4 = rVar3 != null ? rVar3.f48105f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f48108i = rVar3 == null ? false : rVar3.f48108i;
                            j$.util.concurrent.r rVar10 = rVar4.f48105f;
                            if (rVar10 != null) {
                                rVar10.f48108i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f48108i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    static j$.util.concurrent.r c(j$.util.concurrent.r rVar, j$.util.concurrent.r rVar2) {
        j$.util.concurrent.r rVar3;
        rVar2.f48108i = true;
        while (true) {
            j$.util.concurrent.r rVar4 = rVar2.f48104e;
            if (rVar4 == null) {
                rVar2.f48108i = false;
                return rVar2;
            }
            if (!rVar4.f48108i || (rVar3 = rVar4.f48104e) == null) {
                return rVar;
            }
            j$.util.concurrent.r rVar5 = rVar3.f48105f;
            if (rVar4 == rVar5) {
                rVar5 = rVar3.f48106g;
                if (rVar5 == null || !rVar5.f48108i) {
                    if (rVar2 == rVar4.f48106g) {
                        rVar = g(rVar, rVar4);
                        j$.util.concurrent.r rVar6 = rVar4.f48104e;
                        rVar3 = rVar6 == null ? null : rVar6.f48104e;
                        rVar4 = rVar6;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f48108i = false;
                        if (rVar3 != null) {
                            rVar3.f48108i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                } else {
                    rVar5.f48108i = false;
                    rVar4.f48108i = false;
                    rVar3.f48108i = true;
                    rVar2 = rVar3;
                }
            } else if (rVar5 == null || !rVar5.f48108i) {
                if (rVar2 == rVar4.f48105f) {
                    rVar = h(rVar, rVar4);
                    j$.util.concurrent.r rVar7 = rVar4.f48104e;
                    rVar3 = rVar7 == null ? null : rVar7.f48104e;
                    rVar4 = rVar7;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.f48108i = false;
                    if (rVar3 != null) {
                        rVar3.f48108i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            } else {
                rVar5.f48108i = false;
                rVar4.f48108i = false;
                rVar3.f48108i = true;
                rVar2 = rVar3;
            }
        }
    }

    private final void d() {
        if (f48099h.c(this, f48100i, 0, 1)) {
            return;
        }
        boolean z6 = false;
        while (true) {
            int i6 = this.lockState;
            if ((i6 & (-3)) == 0) {
                if (f48099h.c(this, f48100i, i6, 1)) {
                    break;
                }
            } else if ((i6 & 2) == 0) {
                if (f48099h.c(this, f48100i, i6, i6 | 2)) {
                    this.f48103g = java.lang.Thread.currentThread();
                    z6 = true;
                }
            } else if (z6) {
                java.util.concurrent.locks.LockSupport.park(this);
            }
        }
        if (z6) {
            this.f48103g = null;
        }
    }

    static j$.util.concurrent.r g(j$.util.concurrent.r rVar, j$.util.concurrent.r rVar2) {
        j$.util.concurrent.r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f48106g) != null) {
            j$.util.concurrent.r rVar4 = rVar3.f48105f;
            rVar2.f48106g = rVar4;
            if (rVar4 != null) {
                rVar4.f48104e = rVar2;
            }
            j$.util.concurrent.r rVar5 = rVar2.f48104e;
            rVar3.f48104e = rVar5;
            if (rVar5 == null) {
                rVar3.f48108i = false;
                rVar = rVar3;
            } else if (rVar5.f48105f == rVar2) {
                rVar5.f48105f = rVar3;
            } else {
                rVar5.f48106g = rVar3;
            }
            rVar3.f48105f = rVar2;
            rVar2.f48104e = rVar3;
        }
        return rVar;
    }

    static j$.util.concurrent.r h(j$.util.concurrent.r rVar, j$.util.concurrent.r rVar2) {
        j$.util.concurrent.r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f48105f) != null) {
            j$.util.concurrent.r rVar4 = rVar3.f48106g;
            rVar2.f48105f = rVar4;
            if (rVar4 != null) {
                rVar4.f48104e = rVar2;
            }
            j$.util.concurrent.r rVar5 = rVar2.f48104e;
            rVar3.f48104e = rVar5;
            if (rVar5 == null) {
                rVar3.f48108i = false;
                rVar = rVar3;
            } else if (rVar5.f48106g == rVar2) {
                rVar5.f48106g = rVar3;
            } else {
                rVar5.f48105f = rVar3;
            }
            rVar3.f48106g = rVar2;
            rVar2.f48104e = rVar3;
        }
        return rVar;
    }

    static int i(java.lang.Object obj, java.lang.Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return java.lang.System.identityHashCode(obj) <= java.lang.System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    @Override // j$.util.concurrent.l
    final j$.util.concurrent.l a(int i6, java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Thread thread;
        j$.util.concurrent.r rVarB = null;
        if (obj != null) {
            j$.util.concurrent.l lVar = this.f48102f;
            while (lVar != null) {
                int i10 = this.lockState;
                if ((i10 & 3) != 0) {
                    if (lVar.f48083a == i6 && ((obj2 = lVar.f48084b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.f48086d;
                } else if (f48099h.c(this, f48100i, i10, i10 + 4)) {
                    try {
                        j$.util.concurrent.r rVar = this.f48101e;
                        if (rVar != null) {
                            rVarB = rVar.b(i6, obj, null);
                        }
                        return rVarB;
                    } finally {
                        if (f48099h.f(this, f48100i) == 6 && (thread = this.f48103g) != null) {
                            java.util.concurrent.locks.LockSupport.unpark(thread);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7 A[LOOP:0: B:3:0x000c->B:61:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0081 A[SYNTHETIC] */
    final j$.util.concurrent.r e(int i6, java.lang.Object obj, java.lang.Object obj2) {
        int i10;
        int i11;
        j$.util.concurrent.r rVar;
        j$.util.concurrent.r rVarB;
        j$.util.concurrent.r rVar2;
        j$.util.concurrent.r rVar3;
        j$.util.concurrent.r rVar4;
        j$.util.concurrent.r rVar5 = this.f48101e;
        java.lang.Class<?> clsC = null;
        boolean z6 = false;
        while (rVar5 != null) {
            int i12 = rVar5.f48083a;
            if (i12 > i6) {
                i11 = -1;
            } else {
                if (i12 < i6) {
                    i10 = 1;
                } else {
                    java.lang.Object obj3 = rVar5.f48084b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return rVar5;
                    }
                    if (clsC != null || (clsC = j$.util.concurrent.ConcurrentHashMap.c(obj)) != null) {
                        int i13 = j$.util.concurrent.ConcurrentHashMap.f48049g;
                        int iCompareTo = (obj3 == null || obj3.getClass() != clsC) ? 0 : ((java.lang.Comparable) obj).compareTo(obj3);
                        if (iCompareTo != 0) {
                            i10 = iCompareTo;
                        }
                    }
                    if (!z6) {
                        j$.util.concurrent.r rVar6 = rVar5.f48105f;
                        if ((rVar6 != null && (rVarB = rVar6.b(i6, obj, clsC)) != null) || ((rVar = rVar5.f48106g) != null && (rVarB = rVar.b(i6, obj, clsC)) != null)) {
                            return rVarB;
                        }
                        z6 = true;
                    }
                    i11 = i(obj, obj3);
                }
                if (i10 <= 0) {
                    rVar2 = rVar5.f48105f;
                } else {
                    rVar2 = rVar5.f48106g;
                }
                if (rVar2 == null) {
                    rVar3 = this.f48102f;
                    rVar4 = new j$.util.concurrent.r(i6, obj, obj2, rVar3, rVar5);
                    this.f48102f = rVar4;
                    if (rVar3 != null) {
                        rVar3.f48107h = rVar4;
                    }
                    if (i10 <= 0) {
                        rVar5.f48105f = rVar4;
                    } else {
                        rVar5.f48106g = rVar4;
                    }
                    if (rVar5.f48108i) {
                        d();
                        try {
                            this.f48101e = c(this.f48101e, rVar4);
                        } finally {
                            this.lockState = 0;
                        }
                    } else {
                        rVar4.f48108i = true;
                    }
                    return null;
                }
                rVar5 = rVar2;
            }
            i10 = i11;
            if (i10 <= 0) {
                rVar2 = rVar5.f48105f;
            } else {
                rVar2 = rVar5.f48106g;
            }
            if (rVar2 == null) {
                rVar3 = this.f48102f;
                rVar4 = new j$.util.concurrent.r(i6, obj, obj2, rVar3, rVar5);
                this.f48102f = rVar4;
                if (rVar3 != null) {
                    rVar3.f48107h = rVar4;
                }
                if (i10 <= 0) {
                    rVar5.f48105f = rVar4;
                } else {
                    rVar5.f48106g = rVar4;
                }
                if (rVar5.f48108i) {
                    rVar4.f48108i = true;
                } else {
                    d();
                    this.f48101e = c(this.f48101e, rVar4);
                }
                return null;
            }
            rVar5 = rVar2;
        }
        j$.util.concurrent.r rVar7 = new j$.util.concurrent.r(i6, obj, obj2, null, null);
        this.f48101e = rVar7;
        this.f48102f = rVar7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x008e A[PHI: r0
  0x008e: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    final boolean f(j$.util.concurrent.r rVar) {
        j$.util.concurrent.r rVar2;
        j$.util.concurrent.r rVar3;
        j$.util.concurrent.r rVar4 = (j$.util.concurrent.r) rVar.f48086d;
        j$.util.concurrent.r rVar5 = rVar.f48107h;
        if (rVar5 == null) {
            this.f48102f = rVar4;
        } else {
            rVar5.f48086d = rVar4;
        }
        if (rVar4 != null) {
            rVar4.f48107h = rVar5;
        }
        if (this.f48102f == null) {
            this.f48101e = null;
            return true;
        }
        j$.util.concurrent.r rVarB = this.f48101e;
        if (rVarB == null || rVarB.f48106g == null || (rVar2 = rVarB.f48105f) == null || rVar2.f48105f == null) {
            return true;
        }
        d();
        try {
            j$.util.concurrent.r rVar6 = rVar.f48105f;
            j$.util.concurrent.r rVar7 = rVar.f48106g;
            if (rVar6 != null && rVar7 != null) {
                j$.util.concurrent.r rVar8 = rVar7;
                while (true) {
                    j$.util.concurrent.r rVar9 = rVar8.f48105f;
                    if (rVar9 == null) {
                        break;
                    }
                    rVar8 = rVar9;
                }
                boolean z6 = rVar8.f48108i;
                rVar8.f48108i = rVar.f48108i;
                rVar.f48108i = z6;
                j$.util.concurrent.r rVar10 = rVar8.f48106g;
                j$.util.concurrent.r rVar11 = rVar.f48104e;
                if (rVar8 == rVar7) {
                    rVar.f48104e = rVar8;
                    rVar8.f48106g = rVar;
                } else {
                    j$.util.concurrent.r rVar12 = rVar8.f48104e;
                    rVar.f48104e = rVar12;
                    if (rVar12 != null) {
                        if (rVar8 == rVar12.f48105f) {
                            rVar12.f48105f = rVar;
                        } else {
                            rVar12.f48106g = rVar;
                        }
                    }
                    rVar8.f48106g = rVar7;
                    rVar7.f48104e = rVar8;
                }
                rVar.f48105f = null;
                rVar.f48106g = rVar10;
                if (rVar10 != null) {
                    rVar10.f48104e = rVar;
                }
                rVar8.f48105f = rVar6;
                rVar6.f48104e = rVar8;
                rVar8.f48104e = rVar11;
                if (rVar11 == null) {
                    rVarB = rVar8;
                } else if (rVar == rVar11.f48105f) {
                    rVar11.f48105f = rVar8;
                } else {
                    rVar11.f48106g = rVar8;
                }
                if (rVar10 != null) {
                    rVar6 = rVar10;
                } else {
                    rVar6 = rVar;
                }
            } else if (rVar6 == null) {
                if (rVar7 != null) {
                    rVar6 = rVar7;
                } else {
                    rVar6 = rVar;
                }
            }
            if (rVar6 != rVar) {
                j$.util.concurrent.r rVar13 = rVar.f48104e;
                rVar6.f48104e = rVar13;
                if (rVar13 == null) {
                    rVarB = rVar6;
                } else if (rVar == rVar13.f48105f) {
                    rVar13.f48105f = rVar6;
                } else {
                    rVar13.f48106g = rVar6;
                }
                rVar.f48104e = null;
                rVar.f48106g = null;
                rVar.f48105f = null;
            }
            if (!rVar.f48108i) {
                rVarB = b(rVarB, rVar6);
            }
            this.f48101e = rVarB;
            if (rVar == rVar6 && (rVar3 = rVar.f48104e) != null) {
                if (rVar == rVar3.f48105f) {
                    rVar3.f48105f = null;
                } else if (rVar == rVar3.f48106g) {
                    rVar3.f48106g = null;
                }
                rVar.f48104e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }
}
