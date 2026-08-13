package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    static class a implements M4.k, java.io.Serializable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final M4.k f7020C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        volatile transient boolean f7021D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        transient java.lang.Object f7022E;

        a(M4.k kVar) {
            this.f7020C = (M4.k) M4.h.i(kVar);
        }

        @Override // M4.k
        public java.lang.Object get() {
            if (!this.f7021D) {
                synchronized (this) {
                    try {
                        if (!this.f7021D) {
                            java.lang.Object obj = this.f7020C.get();
                            this.f7022E = obj;
                            this.f7021D = true;
                            return obj;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            return M4.e.a(this.f7022E);
        }

        public java.lang.String toString() {
            java.lang.Object string;
            if (this.f7021D) {
                java.lang.String strValueOf = java.lang.String.valueOf(this.f7022E);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.f7020C;
            }
            java.lang.String strValueOf2 = java.lang.String.valueOf(string);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b implements M4.k {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        volatile M4.k f7023C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        volatile boolean f7024D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f7025E;

        b(M4.k kVar) {
            this.f7023C = (M4.k) M4.h.i(kVar);
        }

        @Override // M4.k
        public java.lang.Object get() {
            if (!this.f7024D) {
                synchronized (this) {
                    try {
                        if (!this.f7024D) {
                            M4.k kVar = this.f7023C;
                            j$.util.Objects.requireNonNull(kVar);
                            java.lang.Object obj = kVar.get();
                            this.f7025E = obj;
                            this.f7024D = true;
                            this.f7023C = null;
                            return obj;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            return M4.e.a(this.f7025E);
        }

        public java.lang.String toString() {
            java.lang.Object string = this.f7023C;
            if (string == null) {
                java.lang.String strValueOf = java.lang.String.valueOf(this.f7025E);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            java.lang.String strValueOf2 = java.lang.String.valueOf(string);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c implements M4.k, java.io.Serializable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final java.lang.Object f7026C;

        c(java.lang.Object obj) {
            this.f7026C = obj;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof M4.l.c) {
                return M4.f.a(this.f7026C, ((M4.l.c) obj).f7026C);
            }
            return false;
        }

        @Override // M4.k
        public java.lang.Object get() {
            return this.f7026C;
        }

        public int hashCode() {
            return M4.f.b(this.f7026C);
        }

        public java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(this.f7026C);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static M4.k a(M4.k kVar) {
        if ((kVar instanceof M4.l.b) || (kVar instanceof M4.l.a)) {
            return kVar;
        }
        return kVar instanceof java.io.Serializable ? new M4.l.a(kVar) : new M4.l.b(kVar);
    }

    public static M4.k b(java.lang.Object obj) {
        return new M4.l.c(obj);
    }
}
