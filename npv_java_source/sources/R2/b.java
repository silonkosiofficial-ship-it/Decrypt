package R2;

/* JADX INFO: loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.String f9422E = I2.j.f("EnqueueRunnable");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final J2.g f9423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final J2.c f9424D = new J2.c();

    public b(J2.g gVar) {
        this.f9423C = gVar;
    }

    private static boolean b(J2.g gVar) {
        boolean zC = c(gVar.g(), gVar.f(), (java.lang.String[]) J2.g.l(gVar).toArray(new java.lang.String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0136 A[PHI: r0 r8 r11 r12 r13
  0x0136: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v15 java.lang.String[])
  (r0v15 java.lang.String[])
 binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0135, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0135, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0135, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0135, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0062, B:29:0x0064, B:31:0x0072, B:80:0x0135, B:79:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean c(J2.j jVar, java.util.List list, java.lang.String[] strArr, java.lang.String str, I2.d dVar) {
        boolean z6;
        boolean z10;
        boolean z11;
        java.lang.String[] strArr2 = strArr;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.work.impl.WorkDatabase workDatabaseO = jVar.o();
        boolean z12 = true;
        boolean z13 = strArr2 != null && strArr2.length > 0;
        if (z13) {
            z6 = true;
            z10 = false;
            z11 = false;
            for (java.lang.String str2 : strArr2) {
                Q2.p pVarN = workDatabaseO.Y().n(str2);
                if (pVarN == null) {
                    I2.j.c().b(f9422E, java.lang.String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new java.lang.Throwable[0]);
                    return false;
                }
                I2.s sVar = pVarN.f8804b;
                z6 &= sVar == I2.s.SUCCEEDED;
                if (sVar == I2.s.FAILED) {
                    z11 = true;
                } else if (sVar == I2.s.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z6 = true;
            z10 = false;
            z11 = false;
        }
        boolean z14 = !android.text.TextUtils.isEmpty(str);
        if (!z14 || z13) {
            z12 = false;
        } else {
            java.util.List<Q2.p.b> listE = workDatabaseO.Y().e(str);
            if (listE.isEmpty()) {
                z12 = false;
            } else if (dVar == I2.d.APPEND || dVar == I2.d.APPEND_OR_REPLACE) {
                Q2.b bVarQ = workDatabaseO.Q();
                java.util.List arrayList = new java.util.ArrayList();
                for (Q2.p.b bVar : listE) {
                    if (!bVarQ.d(bVar.f8821a)) {
                        I2.s sVar2 = bVar.f8822b;
                        boolean z15 = (sVar2 == I2.s.SUCCEEDED) & z6;
                        if (sVar2 == I2.s.FAILED) {
                            z11 = true;
                        } else if (sVar2 == I2.s.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(bVar.f8821a);
                        z6 = z15;
                    }
                }
                if (dVar == I2.d.APPEND_OR_REPLACE && (z10 || z11)) {
                    Q2.q qVarY = workDatabaseO.Y();
                    java.util.Iterator it = qVarY.e(str).iterator();
                    while (it.hasNext()) {
                        qVarY.a(((Q2.p.b) it.next()).f8821a);
                    }
                    arrayList = java.util.Collections.emptyList();
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (java.lang.String[]) arrayList.toArray(strArr2);
                z13 = strArr2.length > 0;
                z12 = false;
            } else {
                if (dVar == I2.d.KEEP) {
                    java.util.Iterator it2 = listE.iterator();
                    while (it2.hasNext()) {
                        I2.s sVar3 = ((Q2.p.b) it2.next()).f8822b;
                        if (sVar3 == I2.s.ENQUEUED || sVar3 == I2.s.RUNNING) {
                            return false;
                        }
                    }
                }
                R2.a.c(str, jVar, false).run();
                Q2.q qVarY2 = workDatabaseO.Y();
                java.util.Iterator it3 = listE.iterator();
                while (it3.hasNext()) {
                    qVarY2.a(((Q2.p.b) it3.next()).f8821a);
                }
            }
        }
        java.util.Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            I2.u uVar = (I2.u) it4.next();
            Q2.p pVarC = uVar.c();
            if (z13 && !z6) {
                pVarC.f8804b = z11 ? I2.s.FAILED : z10 ? I2.s.CANCELLED : I2.s.BLOCKED;
            } else if (pVarC.d()) {
                pVarC.f8816n = 0L;
            } else {
                pVarC.f8816n = jCurrentTimeMillis;
            }
            if (android.os.Build.VERSION.SDK_INT <= 25) {
                g(pVarC);
            }
            if (pVarC.f8804b == I2.s.ENQUEUED) {
                z12 = true;
            }
            workDatabaseO.Y().c(pVarC);
            if (z13) {
                int length = strArr2.length;
                int i6 = 0;
                while (i6 < length) {
                    workDatabaseO.Q().b(new Q2.a(uVar.a(), strArr2[i6]));
                    i6++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            java.lang.String[] strArr3 = strArr2;
            java.util.Iterator it5 = it4;
            java.util.Iterator it6 = uVar.b().iterator();
            while (it6.hasNext()) {
                workDatabaseO.Z().a(new Q2.s((java.lang.String) it6.next(), uVar.a()));
            }
            if (z14) {
                workDatabaseO.W().a(new Q2.j(str, uVar.a()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z12;
    }

    private static boolean e(J2.g gVar) {
        java.util.List<J2.g> listE = gVar.e();
        boolean z6 = false;
        if (listE != null) {
            boolean zE = false;
            for (J2.g gVar2 : listE) {
                if (gVar2.j()) {
                    I2.j.c().h(f9422E, java.lang.String.format("Already enqueued work ids (%s).", android.text.TextUtils.join(", ", gVar2.c())), new java.lang.Throwable[0]);
                } else {
                    zE |= e(gVar2);
                }
            }
            z6 = zE;
        }
        return b(gVar) | z6;
    }

    private static void g(Q2.p pVar) {
        I2.b bVar = pVar.f8812j;
        java.lang.String str = pVar.f8805c;
        if (str.equals(androidx.work.impl.workers.ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            androidx.work.b.a aVar = new androidx.work.b.a();
            aVar.c(pVar.f8807e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f8805c = androidx.work.impl.workers.ConstraintTrackingWorker.class.getName();
            pVar.f8807e = aVar.a();
        }
    }

    public boolean a() {
        androidx.work.impl.WorkDatabase workDatabaseO = this.f9423C.g().o();
        workDatabaseO.g();
        try {
            boolean zE = e(this.f9423C);
            workDatabaseO.N();
            return zE;
        } finally {
            workDatabaseO.n();
        }
    }

    public I2.m d() {
        return this.f9424D;
    }

    public void f() {
        J2.j jVarG = this.f9423C.g();
        J2.f.b(jVarG.i(), jVarG.o(), jVarG.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f9423C.h()) {
                throw new java.lang.IllegalStateException(java.lang.String.format("WorkContinuation has cycles (%s)", this.f9423C));
            }
            if (a()) {
                R2.g.a(this.f9423C.g().h(), androidx.work.impl.background.systemalarm.RescheduleReceiver.class, true);
                f();
            }
            this.f9424D.a(I2.m.f4980a);
        } catch (java.lang.Throwable th) {
            this.f9424D.a(new I2.m.b.a(th));
        }
    }
}
