package B3;

/* JADX INFO: loaded from: classes.dex */
final class q0 extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ B3.s0 f675C;

    q0(B3.s0 s0Var) {
        this.f675C = s0Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        synchronized (this.f675C) {
            try {
                int size = size();
                B3.s0 s0Var = this.f675C;
                if (size <= s0Var.f685a) {
                    return false;
                }
                s0Var.f690f.add(new android.util.Pair((java.lang.String) entry.getKey(), ((B3.r0) entry.getValue()).f678b));
                return size() > this.f675C.f685a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
