package Q3;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ Q3.q0 f9002C;

    /* synthetic */ p0(Q3.q0 q0Var, Q3.o0 o0Var) {
        this.f9002C = q0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i6 = message.what;
        if (i6 == 0) {
            synchronized (this.f9002C.f9006f) {
                try {
                    Q3.l0 l0Var = (Q3.l0) message.obj;
                    Q3.n0 n0Var = (Q3.n0) this.f9002C.f9006f.get(l0Var);
                    if (n0Var != null && n0Var.i()) {
                        if (n0Var.j()) {
                            n0Var.g("GmsClientSupervisor");
                        }
                        this.f9002C.f9006f.remove(l0Var);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i6 != 1) {
            return false;
        }
        synchronized (this.f9002C.f9006f) {
            try {
                Q3.l0 l0Var2 = (Q3.l0) message.obj;
                Q3.n0 n0Var2 = (Q3.n0) this.f9002C.f9006f.get(l0Var2);
                if (n0Var2 != null && n0Var2.a() == 3) {
                    java.lang.String str = "Timeout waiting for ServiceConnection callback " + java.lang.String.valueOf(l0Var2);
                    new java.lang.Exception();
                    android.content.ComponentName componentNameB = n0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = l0Var2.a();
                    }
                    if (componentNameB == null) {
                        java.lang.String strC = l0Var2.c();
                        Q3.AbstractC1477p.l(strC);
                        componentNameB = new android.content.ComponentName(strC, "unknown");
                    }
                    n0Var2.onServiceDisconnected(componentNameB);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
