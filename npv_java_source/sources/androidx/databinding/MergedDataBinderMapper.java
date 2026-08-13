package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends androidx.databinding.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Set f21881a = new java.util.HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f21882b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.List f21883c = new java.util.concurrent.CopyOnWriteArrayList();

    private boolean e() {
        java.lang.StringBuilder sb;
        boolean z6 = false;
        for (java.lang.String str : this.f21883c) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str);
                if (androidx.databinding.d.class.isAssignableFrom(cls)) {
                    d((androidx.databinding.d) cls.newInstance());
                    this.f21883c.remove(str);
                    z6 = true;
                }
            } catch (java.lang.ClassNotFoundException unused) {
            } catch (java.lang.IllegalAccessException e6) {
                sb = new java.lang.StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
                sb.toString();
            } catch (java.lang.InstantiationException e10) {
                sb = new java.lang.StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
                sb.toString();
            }
        }
        return z6;
    }

    @Override // androidx.databinding.d
    public androidx.databinding.g b(androidx.databinding.e eVar, android.view.View view, int i6) {
        java.util.Iterator it = this.f21882b.iterator();
        while (it.hasNext()) {
            androidx.databinding.g gVarB = ((androidx.databinding.d) it.next()).b(eVar, view, i6);
            if (gVarB != null) {
                return gVarB;
            }
        }
        if (e()) {
            return b(eVar, view, i6);
        }
        return null;
    }

    @Override // androidx.databinding.d
    public androidx.databinding.g c(androidx.databinding.e eVar, android.view.View[] viewArr, int i6) {
        java.util.Iterator it = this.f21882b.iterator();
        while (it.hasNext()) {
            androidx.databinding.g gVarC = ((androidx.databinding.d) it.next()).c(eVar, viewArr, i6);
            if (gVarC != null) {
                return gVarC;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i6);
        }
        return null;
    }

    public void d(androidx.databinding.d dVar) {
        if (this.f21881a.add(dVar.getClass())) {
            this.f21882b.add(dVar);
            java.util.Iterator it = dVar.a().iterator();
            while (it.hasNext()) {
                d((androidx.databinding.d) it.next());
            }
        }
    }
}
