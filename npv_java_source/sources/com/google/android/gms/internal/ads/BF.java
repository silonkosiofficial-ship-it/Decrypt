package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BF {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final java.util.Map f25918C = new java.util.HashMap();

    protected BF(java.util.Set set) {
        G0(set);
    }

    public final synchronized void E0(com.google.android.gms.internal.ads.EG eg) {
        F0(eg.f26999a, eg.f27000b);
    }

    public final synchronized void F0(java.lang.Object obj, java.util.concurrent.Executor executor) {
        this.f25918C.put(obj, executor);
    }

    public final synchronized void G0(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            E0((com.google.android.gms.internal.ads.EG) it.next());
        }
    }

    protected final synchronized void p1(final com.google.android.gms.internal.ads.AF af) {
        for (java.util.Map.Entry entry : this.f25918C.entrySet()) {
            final java.lang.Object key = entry.getKey();
            ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zF
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        af.b(key);
                    } catch (java.lang.Throwable th) {
                        p174r3.v.s().w(th, "EventEmitter.notify");
                        p214v3.AbstractC7265q0.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
