package p182s1;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f54089h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p182s1.m f54092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p182s1.m f54093d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f54095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f54096g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54090a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54091b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.util.ArrayList f54094e = new java.util.ArrayList();

    public k(p182s1.m mVar, int i6) {
        this.f54092c = null;
        this.f54093d = null;
        int i10 = f54089h;
        this.f54095f = i10;
        f54089h = i10 + 1;
        this.f54092c = mVar;
        this.f54093d = mVar;
        this.f54096g = i6;
    }

    private long c(p182s1.f fVar, long j6) {
        p182s1.m mVar = fVar.f54068d;
        if (mVar instanceof p182s1.i) {
            return j6;
        }
        int size = fVar.f54075k.size();
        long jMin = j6;
        for (int i6 = 0; i6 < size; i6++) {
            p182s1.d dVar = (p182s1.d) fVar.f54075k.get(i6);
            if (dVar instanceof p182s1.f) {
                p182s1.f fVar2 = (p182s1.f) dVar;
                if (fVar2.f54068d != mVar) {
                    jMin = java.lang.Math.min(jMin, c(fVar2, ((long) fVar2.f54070f) + j6));
                }
            }
        }
        if (fVar != mVar.f54108i) {
            return jMin;
        }
        long j10 = j6 - mVar.j();
        return java.lang.Math.min(java.lang.Math.min(jMin, c(mVar.f54107h, j10)), j10 - ((long) mVar.f54107h.f54070f));
    }

    private long d(p182s1.f fVar, long j6) {
        p182s1.m mVar = fVar.f54068d;
        if (mVar instanceof p182s1.i) {
            return j6;
        }
        int size = fVar.f54075k.size();
        long jMax = j6;
        for (int i6 = 0; i6 < size; i6++) {
            p182s1.d dVar = (p182s1.d) fVar.f54075k.get(i6);
            if (dVar instanceof p182s1.f) {
                p182s1.f fVar2 = (p182s1.f) dVar;
                if (fVar2.f54068d != mVar) {
                    jMax = java.lang.Math.max(jMax, d(fVar2, ((long) fVar2.f54070f) + j6));
                }
            }
        }
        if (fVar != mVar.f54107h) {
            return jMax;
        }
        long j10 = j6 + mVar.j();
        return java.lang.Math.max(java.lang.Math.max(jMax, d(mVar.f54108i, j10)), j10 - ((long) mVar.f54108i.f54070f));
    }

    public void a(p182s1.m mVar) {
        this.f54094e.add(mVar);
        this.f54093d = mVar;
    }

    public long b(p172r1.f fVar, int i6) {
        long j6;
        p182s1.m mVar;
        long j10;
        long jD;
        p182s1.m mVar2 = this.f54092c;
        if (mVar2 instanceof p182s1.c) {
            if (((p182s1.c) mVar2).f54105f != i6) {
                return 0L;
            }
        } else if (i6 == 0) {
            if (!(mVar2 instanceof p182s1.j)) {
                return 0L;
            }
        } else if (!(mVar2 instanceof p182s1.l)) {
            return 0L;
        }
        p182s1.f fVar2 = (i6 == 0 ? fVar.f53673e : fVar.f53675f).f54107h;
        p182s1.f fVar3 = (i6 == 0 ? fVar.f53673e : fVar.f53675f).f54108i;
        boolean zContains = mVar2.f54107h.f54076l.contains(fVar2);
        boolean zContains2 = this.f54092c.f54108i.f54076l.contains(fVar3);
        long j11 = this.f54092c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                p182s1.f fVar4 = this.f54092c.f54107h;
                jD = d(fVar4, fVar4.f54070f);
                j10 = ((long) this.f54092c.f54107h.f54070f) + j11;
            } else if (zContains2) {
                p182s1.f fVar5 = this.f54092c.f54108i;
                long jC = c(fVar5, fVar5.f54070f);
                j10 = ((long) (-this.f54092c.f54108i.f54070f)) + j11;
                jD = -jC;
            } else {
                p182s1.m mVar3 = this.f54092c;
                j6 = ((long) mVar3.f54107h.f54070f) + mVar3.j();
                mVar = this.f54092c;
            }
            return java.lang.Math.max(jD, j10);
        }
        long jD2 = d(this.f54092c.f54107h, 0L);
        long jC2 = c(this.f54092c.f54108i, 0L);
        long j12 = jD2 - j11;
        p182s1.m mVar4 = this.f54092c;
        int i10 = mVar4.f54108i.f54070f;
        if (j12 >= (-i10)) {
            j12 += (long) i10;
        }
        int i11 = mVar4.f54107h.f54070f;
        long j13 = ((-jC2) - j11) - ((long) i11);
        if (j13 >= i11) {
            j13 -= (long) i11;
        }
        float fO = mVar4.f54101b.o(i6);
        float f6 = fO > 0.0f ? (long) ((j13 / fO) + (j12 / (1.0f - fO))) : 0L;
        long j14 = ((long) ((f6 * fO) + 0.5f)) + j11 + ((long) ((f6 * (1.0f - fO)) + 0.5f));
        mVar = this.f54092c;
        j6 = ((long) mVar.f54107h.f54070f) + j14;
        return j6 - ((long) mVar.f54108i.f54070f);
    }
}
