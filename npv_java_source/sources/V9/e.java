package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final V9.e.a f15199g = new V9.e.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f15201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f15203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15205f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final V9.e a(H9.t tVar) {
            p247y7.AbstractC7350t.f(tVar, "responseHeaders");
            int size = tVar.size();
            boolean z6 = false;
            java.lang.Integer numV = null;
            boolean z10 = false;
            java.lang.Integer numV2 = null;
            boolean z11 = false;
            boolean z12 = false;
            for (int i6 = 0; i6 < size; i6++) {
                if (S8.r.K(tVar.e(i6), "Sec-WebSocket-Extensions", true)) {
                    java.lang.String strS = tVar.s(i6);
                    int i10 = 0;
                    while (i10 < strS.length()) {
                        int iR = I9.d.r(strS, ',', i10, 0, 4, null);
                        int iP = I9.d.p(strS, ';', i10, iR);
                        java.lang.String strX = I9.d.X(strS, i10, iP);
                        int i11 = iP + 1;
                        if (S8.r.K(strX, "permessage-deflate", true)) {
                            if (z6) {
                                z12 = true;
                            }
                            i10 = i11;
                            while (i10 < iR) {
                                int iP2 = I9.d.p(strS, ';', i10, iR);
                                int iP3 = I9.d.p(strS, '=', i10, iP2);
                                java.lang.String strX2 = I9.d.X(strS, i10, iP3);
                                java.lang.String strL0 = iP3 < iP2 ? S8.r.L0(I9.d.X(strS, iP3 + 1, iP2), "\"") : null;
                                i10 = iP2 + 1;
                                if (S8.r.K(strX2, "client_max_window_bits", true)) {
                                    if (numV != null) {
                                        z12 = true;
                                    }
                                    numV = strL0 != null ? S8.r.v(strL0) : null;
                                    if (numV == null) {
                                        z12 = true;
                                    }
                                } else if (S8.r.K(strX2, "client_no_context_takeover", true)) {
                                    if (z10) {
                                        z12 = true;
                                    }
                                    if (strL0 != null) {
                                        z12 = true;
                                    }
                                    z10 = true;
                                } else if (S8.r.K(strX2, "server_max_window_bits", true)) {
                                    if (numV2 != null) {
                                        z12 = true;
                                    }
                                    numV2 = strL0 != null ? S8.r.v(strL0) : null;
                                    if (numV2 == null) {
                                        z12 = true;
                                    }
                                } else if (S8.r.K(strX2, "server_no_context_takeover", true)) {
                                    if (z11) {
                                        z12 = true;
                                    }
                                    if (strL0 != null) {
                                        z12 = true;
                                    }
                                    z11 = true;
                                } else {
                                    z12 = true;
                                }
                            }
                            z6 = true;
                        } else {
                            i10 = i11;
                            z12 = true;
                        }
                    }
                }
            }
            return new V9.e(z6, numV, z10, numV2, z11, z12);
        }
    }

    public e(boolean z6, java.lang.Integer num, boolean z10, java.lang.Integer num2, boolean z11, boolean z12) {
        this.f15200a = z6;
        this.f15201b = num;
        this.f15202c = z10;
        this.f15203d = num2;
        this.f15204e = z11;
        this.f15205f = z12;
    }

    public final boolean a(boolean z6) {
        return z6 ? this.f15202c : this.f15204e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9.e)) {
            return false;
        }
        V9.e eVar = (V9.e) obj;
        return this.f15200a == eVar.f15200a && p247y7.AbstractC7350t.b(this.f15201b, eVar.f15201b) && this.f15202c == eVar.f15202c && p247y7.AbstractC7350t.b(this.f15203d, eVar.f15203d) && this.f15204e == eVar.f15204e && this.f15205f == eVar.f15205f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z6 = this.f15200a;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = r6 * 31;
        java.lang.Integer num = this.f15201b;
        int iHashCode = (i6 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f15202c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        java.lang.Integer num2 = this.f15203d;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.f15204e;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode2 + r11) * 31;
        boolean z12 = this.f15205f;
        return i11 + (z12 ? 1 : z12);
    }

    public java.lang.String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f15200a + ", clientMaxWindowBits=" + this.f15201b + ", clientNoContextTakeover=" + this.f15202c + ", serverMaxWindowBits=" + this.f15203d + ", serverNoContextTakeover=" + this.f15204e + ", unknownValues=" + this.f15205f + ')';
    }
}
