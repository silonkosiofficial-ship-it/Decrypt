package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.c.AbstractC0443c f23512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f23513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String[] f23514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f23515d;

    public e(androidx.room.c.AbstractC0443c abstractC0443c, int[] iArr, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(abstractC0443c, "observer");
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        p247y7.AbstractC7350t.f(strArr, "tableNames");
        this.f23512a = abstractC0443c;
        this.f23513b = iArr;
        this.f23514c = strArr;
        if (iArr.length != strArr.length) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f23515d = (strArr.length == 0) ^ true ? p097j7.Z.c(strArr[0]) : p097j7.Z.d();
    }

    public final androidx.room.c.AbstractC0443c a() {
        return this.f23512a;
    }

    public final int[] b() {
        return this.f23513b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final void c(java.util.Set set) {
        java.util.Set setD;
        p247y7.AbstractC7350t.f(set, "invalidatedTablesIds");
        int[] iArr = this.f23513b;
        int length = iArr.length;
        if (length != 0) {
            int i6 = 0;
            if (length != 1) {
                java.util.Set setB = p097j7.Z.b();
                int[] iArr2 = this.f23513b;
                int length2 = iArr2.length;
                int i10 = 0;
                while (i6 < length2) {
                    int i11 = i10 + 1;
                    if (set.contains(java.lang.Integer.valueOf(iArr2[i6]))) {
                        setB.add(this.f23514c[i10]);
                    }
                    i6++;
                    i10 = i11;
                }
                setD = p097j7.Z.a(setB);
            } else if (set.contains(java.lang.Integer.valueOf(iArr[0]))) {
                setD = this.f23515d;
            } else {
                setD = p097j7.Z.d();
            }
        } else {
            setD = p097j7.Z.d();
        }
        if (!setD.isEmpty()) {
            this.f23512a.c(setD);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b A[EDGE_INSN: B:27:0x006b->B:28:0x006f BREAK  A[LOOP:2: B:22:0x0052->B:39:?]] */
    public final void d(java.util.Set set) {
        java.util.Set setD;
        p247y7.AbstractC7350t.f(set, "invalidatedTablesNames");
        int length = this.f23514c.length;
        if (length == 0) {
            setD = p097j7.Z.d();
            break;
        }
        if (length == 1) {
            java.util.Set set2 = set;
            if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                java.util.Iterator it = set2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (S8.r.K((java.lang.String) it.next(), this.f23514c[0], true)) {
                            setD = this.f23515d;
                            break;
                        }
                    } else {
                        setD = p097j7.Z.d();
                        break;
                    }
                }
            } else {
                setD = p097j7.Z.d();
                break;
            }
        } else {
            java.util.Set setB = p097j7.Z.b();
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                java.lang.String str = (java.lang.String) it2.next();
                for (java.lang.String str2 : this.f23514c) {
                    if (S8.r.K(str2, str, true)) {
                        setB.add(str2);
                        break;
                    }
                }
            }
            setD = p097j7.Z.a(setB);
        }
        if (!setD.isEmpty()) {
            this.f23512a.c(setD);
        }
    }
}
