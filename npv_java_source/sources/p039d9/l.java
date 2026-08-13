package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f44347b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p039d9.l.class, java.lang.Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f44348c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p039d9.l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f44349d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p039d9.l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f44350e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p039d9.l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReferenceArray f44351a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final p039d9.h b(p039d9.h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f44338D) {
            f44350e.incrementAndGet(this);
        }
        int i6 = f44348c.get(this) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        while (this.f44351a.get(i6) != null) {
            java.lang.Thread.yield();
        }
        this.f44351a.lazySet(i6, hVar);
        f44348c.incrementAndGet(this);
        return null;
    }

    private final void c(p039d9.h hVar) {
        if (hVar == null || !hVar.f44338D) {
            return;
        }
        f44350e.decrementAndGet(this);
    }

    private final int e() {
        return f44348c.get(this) - f44349d.get(this);
    }

    private final p039d9.h m() {
        p039d9.h hVar;
        while (true) {
            int i6 = f44349d.get(this);
            if (i6 - f44348c.get(this) == 0) {
                return null;
            }
            int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
            if (f44349d.compareAndSet(this, i6, i6 + 1) && (hVar = (p039d9.h) this.f44351a.getAndSet(i10, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(p039d9.d dVar) {
        p039d9.h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final p039d9.h o(boolean z6) {
        p039d9.h hVar;
        do {
            hVar = (p039d9.h) f44347b.get(this);
            if (hVar == null || hVar.f44338D != z6) {
                int i6 = f44349d.get(this);
                int i10 = f44348c.get(this);
                while (i6 != i10) {
                    if (z6 && f44350e.get(this) == 0) {
                        return null;
                    }
                    i10--;
                    p039d9.h hVarQ = q(i10, z6);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f44347b, this, hVar, null));
        return hVar;
    }

    private final p039d9.h p(int i6) {
        int i10 = f44349d.get(this);
        int i11 = f44348c.get(this);
        boolean z6 = i6 == 1;
        while (i10 != i11) {
            if (z6 && f44350e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            p039d9.h hVarQ = q(i10, z6);
            if (hVarQ != null) {
                return hVarQ;
            }
            i10 = i12;
        }
        return null;
    }

    private final p039d9.h q(int i6, boolean z6) {
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        p039d9.h hVar = (p039d9.h) this.f44351a.get(i10);
        if (hVar == null || hVar.f44338D != z6 || !Y8.o.a(this.f44351a, i10, hVar, null)) {
            return null;
        }
        if (z6) {
            f44350e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i6, p247y7.O o6) {
        p039d9.h hVar;
        do {
            hVar = (p039d9.h) f44347b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f44338D ? 1 : 2) & i6) == 0) {
                return -2L;
            }
            long jA = p039d9.j.f44345f.a() - hVar.f44337C;
            long j6 = p039d9.j.f44341b;
            if (jA < j6) {
                return j6 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f44347b, this, hVar, null));
        o6.f57254C = hVar;
        return -1L;
    }

    public final p039d9.h a(p039d9.h hVar, boolean z6) {
        if (z6) {
            return b(hVar);
        }
        p039d9.h hVar2 = (p039d9.h) f44347b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f44347b.get(this) != null ? e() + 1 : e();
    }

    public final void j(p039d9.d dVar) {
        p039d9.h hVar = (p039d9.h) f44347b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final p039d9.h k() {
        p039d9.h hVar = (p039d9.h) f44347b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final p039d9.h l() {
        return o(true);
    }

    public final long r(int i6, p247y7.O o6) {
        p039d9.h hVarM = i6 == 3 ? m() : p(i6);
        if (hVarM == null) {
            return s(i6, o6);
        }
        o6.f57254C = hVarM;
        return -1L;
    }
}
