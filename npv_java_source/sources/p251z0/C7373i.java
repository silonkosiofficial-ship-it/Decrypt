package p251z0;

/* JADX INFO: renamed from: z0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7373i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f57565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseLongArray f57566b = new android.util.SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.util.SparseBooleanArray f57567c = new android.util.SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f57568d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57569e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57570f = -1;

    private final void a(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f57566b.indexOfKey(pointerId) < 0) {
                android.util.SparseLongArray sparseLongArray = this.f57566b;
                long j6 = this.f57565a;
                this.f57565a = 1 + j6;
                sparseLongArray.put(pointerId, j6);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f57566b.indexOfKey(pointerId2) < 0) {
            android.util.SparseLongArray sparseLongArray2 = this.f57566b;
            long j10 = this.f57565a;
            this.f57565a = 1 + j10;
            sparseLongArray2.put(pointerId2, j10);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f57567c.put(pointerId2, true);
            }
        }
    }

    private final void b(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f57569e && source == this.f57570f) {
            return;
        }
        this.f57569e = toolType;
        this.f57570f = source;
        this.f57567c.clear();
        this.f57566b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    private final p251z0.E d(p251z0.Q q6, android.view.MotionEvent motionEvent, int i6, boolean z6) {
        long jS;
        long j6;
        long jA;
        int toolType;
        int iE;
        int historySize;
        int i10;
        long jC;
        float historicalX;
        long jF = f(motionEvent.getPointerId(i6));
        float pressure = motionEvent.getPressure(i6);
        long jA2 = p131n0.h.a(motionEvent.getX(i6), motionEvent.getY(i6));
        long jG = p131n0.g.g(jA2, 0.0f, 0.0f, 3, null);
        if (i6 != 0) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                jA = p251z0.C7376l.f57571a.a(motionEvent, i6);
            } else {
                jS = jA2;
                j6 = q6.j(jA2);
            }
            toolType = motionEvent.getToolType(i6);
            if (toolType == 0) {
                iE = p251z0.P.f57513a.e();
            } else if (toolType != 1) {
                iE = p251z0.P.f57513a.d();
            } else if (toolType != 2) {
                iE = p251z0.P.f57513a.c();
            } else if (toolType != 3) {
                iE = p251z0.P.f57513a.b();
            } else if (toolType != 4) {
                iE = p251z0.P.f57513a.e();
            } else {
                iE = p251z0.P.f57513a.a();
            }
            int i11 = iE;
            java.util.ArrayList arrayList = new java.util.ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            for (i10 = 0; i10 < historySize; i10++) {
                historicalX = motionEvent.getHistoricalX(i6, i10);
                float historicalY = motionEvent.getHistoricalY(i6, i10);
                if (java.lang.Float.isInfinite(historicalX) && !java.lang.Float.isNaN(historicalX) && !java.lang.Float.isInfinite(historicalY) && !java.lang.Float.isNaN(historicalY)) {
                    long jA3 = p131n0.h.a(historicalX, historicalY);
                    arrayList.add(new p251z0.C7370f(motionEvent.getHistoricalEventTime(i10), jA3, jA3, null));
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                jC = p131n0.h.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                jC = p131n0.g.f51312b.c();
            }
            return new p251z0.E(jF, motionEvent.getEventTime(), j6, jS, z6, pressure, i11, this.f57567c.get(motionEvent.getPointerId(i6), false), arrayList, jC, jG, null);
        }
        jA = p131n0.h.a(motionEvent.getRawX(), motionEvent.getRawY());
        j6 = jA;
        jS = q6.s(jA);
        toolType = motionEvent.getToolType(i6);
        if (toolType == 0) {
            iE = p251z0.P.f57513a.e();
        } else if (toolType != 1) {
            iE = p251z0.P.f57513a.d();
        } else if (toolType != 2) {
            iE = p251z0.P.f57513a.c();
        } else if (toolType != 3) {
            iE = p251z0.P.f57513a.b();
        } else if (toolType != 4) {
            iE = p251z0.P.f57513a.e();
        } else {
            iE = p251z0.P.f57513a.a();
        }
        int i12 = iE;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        while (i10 < historySize) {
            historicalX = motionEvent.getHistoricalX(i6, i10);
            float historicalY2 = motionEvent.getHistoricalY(i6, i10);
            if (java.lang.Float.isInfinite(historicalX)) {
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            jC = p131n0.h.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
        } else {
            jC = p131n0.g.f51312b.c();
        }
        return new p251z0.E(jF, motionEvent.getEventTime(), j6, jS, z6, pressure, i12, this.f57567c.get(motionEvent.getPointerId(i6), false), arrayList2, jC, jG, null);
    }

    private final long f(int i6) {
        long jValueAt;
        int iIndexOfKey = this.f57566b.indexOfKey(i6);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f57566b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f57565a;
            this.f57565a = 1 + jValueAt;
            this.f57566b.put(i6, jValueAt);
        }
        return p251z0.A.b(jValueAt);
    }

    private final boolean g(android.view.MotionEvent motionEvent, int i6) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            if (motionEvent.getPointerId(i10) == i6) {
                return true;
            }
        }
        return false;
    }

    private final void h(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f57567c.get(pointerId, false)) {
                this.f57566b.delete(pointerId);
                this.f57567c.delete(pointerId);
            }
        }
        if (this.f57566b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f57566b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f57566b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f57566b.removeAt(size);
                    this.f57567c.delete(iKeyAt);
                }
            }
        }
    }

    public final p251z0.D c(android.view.MotionEvent motionEvent, p251z0.Q q6) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f57566b.clear();
            this.f57567c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z6 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z10 = actionMasked == 8;
        if (z6) {
            this.f57567c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f57568d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i6 = 0;
        while (i6 < pointerCount) {
            this.f57568d.add(d(q6, motionEvent, i6, (z6 || i6 == actionIndex || (z10 && motionEvent.getButtonState() == 0)) ? false : true));
            i6++;
        }
        h(motionEvent);
        return new p251z0.D(motionEvent.getEventTime(), this.f57568d, motionEvent);
    }

    public final void e(int i6) {
        this.f57567c.delete(i6);
        this.f57566b.delete(i6);
    }
}
