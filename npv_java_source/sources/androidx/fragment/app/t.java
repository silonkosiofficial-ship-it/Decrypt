package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f22673a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f22674b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f22675c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.fragment.app.q f22676d;

    t() {
    }

    void A(androidx.fragment.app.q qVar) {
        this.f22676d = qVar;
    }

    androidx.fragment.app.r B(java.lang.String str, androidx.fragment.app.r rVar) {
        return (androidx.fragment.app.r) (rVar != null ? this.f22675c.put(str, rVar) : this.f22675c.remove(str));
    }

    void a(androidx.fragment.app.f fVar) {
        if (this.f22673a.contains(fVar)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + fVar);
        }
        synchronized (this.f22673a) {
            this.f22673a.add(fVar);
        }
        fVar.f22484N = true;
    }

    void b() {
        this.f22674b.values().removeAll(java.util.Collections.singleton(null));
    }

    boolean c(java.lang.String str) {
        return this.f22674b.get(str) != null;
    }

    void d(int i6) {
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null) {
                sVar.t(i6);
            }
        }
    }

    void e(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2 = str + "    ";
        if (!this.f22674b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.s sVar : this.f22674b.values()) {
                printWriter.print(str);
                if (sVar != null) {
                    androidx.fragment.app.f fVarK = sVar.k();
                    printWriter.println(fVarK);
                    fVarK.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f22673a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f22673a.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(fVar.toString());
            }
        }
    }

    androidx.fragment.app.f f(java.lang.String str) {
        androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f22674b.get(str);
        if (sVar != null) {
            return sVar.k();
        }
        return null;
    }

    androidx.fragment.app.f g(int i6) {
        for (int size = this.f22673a.size() - 1; size >= 0; size--) {
            androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f22673a.get(size);
            if (fVar != null && fVar.f22496Z == i6) {
                return fVar;
            }
        }
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null) {
                androidx.fragment.app.f fVarK = sVar.k();
                if (fVarK.f22496Z == i6) {
                    return fVarK;
                }
            }
        }
        return null;
    }

    androidx.fragment.app.f h(java.lang.String str) {
        if (str != null) {
            for (int size = this.f22673a.size() - 1; size >= 0; size--) {
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f22673a.get(size);
                if (fVar != null && str.equals(fVar.f22498b0)) {
                    return fVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null) {
                androidx.fragment.app.f fVarK = sVar.k();
                if (str.equals(fVarK.f22498b0)) {
                    return fVarK;
                }
            }
        }
        return null;
    }

    androidx.fragment.app.f i(java.lang.String str) {
        androidx.fragment.app.f fVarI;
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null && (fVarI = sVar.k().i(str)) != null) {
                return fVarI;
            }
        }
        return null;
    }

    int j(androidx.fragment.app.f fVar) {
        android.view.View view;
        android.view.View view2;
        android.view.ViewGroup viewGroup = fVar.f22506j0;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f22673a.indexOf(fVar);
        for (int i6 = iIndexOf - 1; i6 >= 0; i6--) {
            androidx.fragment.app.f fVar2 = (androidx.fragment.app.f) this.f22673a.get(i6);
            if (fVar2.f22506j0 == viewGroup && (view2 = fVar2.f22507k0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f22673a.size()) {
                return -1;
            }
            androidx.fragment.app.f fVar3 = (androidx.fragment.app.f) this.f22673a.get(iIndexOf);
            if (fVar3.f22506j0 == viewGroup && (view = fVar3.f22507k0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    java.util.List k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        return arrayList;
    }

    java.util.List l() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            arrayList.add(sVar != null ? sVar.k() : null);
        }
        return arrayList;
    }

    java.util.ArrayList m() {
        return new java.util.ArrayList(this.f22675c.values());
    }

    androidx.fragment.app.s n(java.lang.String str) {
        return (androidx.fragment.app.s) this.f22674b.get(str);
    }

    java.util.List o() {
        java.util.ArrayList arrayList;
        if (this.f22673a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f22673a) {
            arrayList = new java.util.ArrayList(this.f22673a);
        }
        return arrayList;
    }

    androidx.fragment.app.q p() {
        return this.f22676d;
    }

    androidx.fragment.app.r q(java.lang.String str) {
        return (androidx.fragment.app.r) this.f22675c.get(str);
    }

    void r(androidx.fragment.app.s sVar) {
        androidx.fragment.app.f fVarK = sVar.k();
        if (c(fVarK.f22478H)) {
            return;
        }
        this.f22674b.put(fVarK.f22478H, sVar);
        if (fVarK.f22502f0) {
            if (fVarK.f22501e0) {
                this.f22676d.h(fVarK);
            } else {
                this.f22676d.r(fVarK);
            }
            fVarK.f22502f0 = false;
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Added fragment to active set " + fVarK;
        }
    }

    void s(androidx.fragment.app.s sVar) {
        androidx.fragment.app.f fVarK = sVar.k();
        if (fVarK.f22501e0) {
            this.f22676d.r(fVarK);
        }
        if (((androidx.fragment.app.s) this.f22674b.put(fVarK.f22478H, null)) != null && androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Removed fragment from active set " + fVarK;
        }
    }

    void t() {
        java.util.Iterator it = this.f22673a.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f22674b.get(((androidx.fragment.app.f) it.next()).f22478H);
            if (sVar != null) {
                sVar.m();
            }
        }
        for (androidx.fragment.app.s sVar2 : this.f22674b.values()) {
            if (sVar2 != null) {
                sVar2.m();
                androidx.fragment.app.f fVarK = sVar2.k();
                if (fVarK.f22485O && !fVarK.c0()) {
                    if (fVarK.f22486P && !this.f22675c.containsKey(fVarK.f22478H)) {
                        sVar2.r();
                    }
                    s(sVar2);
                }
            }
        }
    }

    void u(androidx.fragment.app.f fVar) {
        synchronized (this.f22673a) {
            this.f22673a.remove(fVar);
        }
        fVar.f22484N = false;
    }

    void v() {
        this.f22674b.clear();
    }

    void w(java.util.List list) {
        this.f22673a.clear();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                androidx.fragment.app.f fVarF = f(str);
                if (fVarF == null) {
                    throw new java.lang.IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (androidx.fragment.app.n.E0(2)) {
                    java.lang.String str2 = "restoreSaveState: added (" + str + "): " + fVarF;
                }
                a(fVarF);
            }
        }
    }

    void x(java.util.ArrayList arrayList) {
        this.f22675c.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) it.next();
            this.f22675c.put(rVar.f22653D, rVar);
        }
    }

    java.util.ArrayList y() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f22674b.size());
        for (androidx.fragment.app.s sVar : this.f22674b.values()) {
            if (sVar != null) {
                androidx.fragment.app.f fVarK = sVar.k();
                sVar.r();
                arrayList.add(fVarK.f22478H);
                if (androidx.fragment.app.n.E0(2)) {
                    java.lang.String str = "Saved state of " + fVarK + ": " + fVarK.f22473D;
                }
            }
        }
        return arrayList;
    }

    java.util.ArrayList z() {
        synchronized (this.f22673a) {
            try {
                if (this.f22673a.isEmpty()) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f22673a.size());
                for (androidx.fragment.app.f fVar : this.f22673a) {
                    arrayList.add(fVar.f22478H);
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str = "saveAllState: adding fragment (" + fVar.f22478H + "): " + fVar;
                    }
                }
                return arrayList;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
