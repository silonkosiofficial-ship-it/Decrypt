package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes3.dex */
class p extends androidx.concurrent.futures.a implements java.util.concurrent.ScheduledFuture {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.concurrent.ScheduledFuture f43994J;

    class a implements com.google.firebase.concurrent.p.b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(java.lang.Throwable th) {
            com.google.firebase.concurrent.p.this.A(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(java.lang.Object obj) {
            com.google.firebase.concurrent.p.this.z(obj);
        }
    }

    interface b {
        void a(java.lang.Throwable th);

        void set(java.lang.Object obj);
    }

    interface c {
        java.util.concurrent.ScheduledFuture a(com.google.firebase.concurrent.p.b bVar);
    }

    p(com.google.firebase.concurrent.p.c cVar) {
        this.f43994J = cVar.a(new com.google.firebase.concurrent.p.a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public int compareTo(java.util.concurrent.Delayed delayed) {
        return this.f43994J.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.f43994J.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void m() {
        this.f43994J.cancel(C());
    }
}
