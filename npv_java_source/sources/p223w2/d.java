package p223w2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class d {

    public static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56167G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p143o2.n f56168H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f56169I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f56170J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56171K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p127m7.e eVar, p143o2.n nVar, boolean z6, boolean z10, p237x7.l lVar) {
            super(2, eVar);
            this.f56168H = nVar;
            this.f56169I = z6;
            this.f56170J = z10;
            this.f56171K = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56167G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.n nVar = this.f56168H;
                boolean z6 = this.f56169I;
                w2.d.c cVar = new w2.d.c(this.f56170J, z6, nVar, null, this.f56171K);
                this.f56167G = 1;
                obj = nVar.O(z6, cVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((w2.d.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new w2.d.a(eVar, this.f56168H, this.f56169I, this.f56170J, this.f56171K);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56172F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56173G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f56174H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f56175I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56176J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f56177K;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56176J = obj;
            this.f56177K |= Integer.MIN_VALUE;
            return p223w2.b.d(null, false, false, null, this);
        }
    }

    public static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56178G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f56179H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56180I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f56181J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f56182K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p143o2.n f56183L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56184M;

        public static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f56185G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f56186H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p237x7.l f56187I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p127m7.e eVar, p237x7.l lVar) {
                super(2, eVar);
                this.f56187I = lVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f56185G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                p143o2.A a6 = (p143o2.A) this.f56186H;
                p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f56187I.l(((p163q2.j) a6).d());
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p143o2.A a6, p127m7.e eVar) {
                return ((w2.d.c.a) x(a6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                w2.d.c.a aVar = new w2.d.c.a(eVar, this.f56187I);
                aVar.f56186H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z6, boolean z10, p143o2.n nVar, p127m7.e eVar, p237x7.l lVar) {
            super(2, eVar);
            this.f56181J = z6;
            this.f56182K = z10;
            this.f56183L = nVar;
            this.f56184M = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            o2.B.a aVar;
            p143o2.B b6;
            p143o2.B b10;
            o2.B.a aVar2;
            p143o2.B b11;
            java.lang.Object objA;
            java.lang.Object obj2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56179H;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.B b12 = (p143o2.B) this.f56180I;
                if (!this.f56181J) {
                    p247y7.AbstractC7350t.d(b12, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f56184M.l(((p163q2.j) b12).d());
                }
                boolean z6 = this.f56182K;
                aVar = z6 ? o2.B.a.DEFERRED : o2.B.a.IMMEDIATE;
                if (z6) {
                    b6 = b12;
                } else {
                    this.f56180I = b12;
                    this.f56178G = aVar;
                    this.f56179H = 1;
                    java.lang.Object objA2 = b12.a(this);
                    if (objA2 == objG) {
                        return objG;
                    }
                    b10 = b12;
                    obj = objA2;
                    aVar2 = aVar;
                }
                w2.d.c.a aVar3 = new w2.d.c.a(null, this.f56184M);
                this.f56180I = b6;
                this.f56178G = null;
                this.f56179H = 3;
                obj = b6.c(aVar, aVar3, this);
                if (obj == objG) {
                    return objG;
                }
                if (!this.f56182K) {
                    return obj;
                }
                this.f56180I = obj;
                this.f56179H = 4;
                objA = b6.a(this);
                if (objA == objG) {
                    return objG;
                }
                obj2 = obj;
                obj = objA;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    this.f56183L.r().q();
                }
                return obj2;
            }
            if (i6 == 1) {
                aVar2 = (o2.B.a) this.f56178G;
                b10 = (p143o2.B) this.f56180I;
                p087i7.x.b(obj);
            } else if (i6 == 2) {
                aVar2 = (o2.B.a) this.f56178G;
                b11 = (p143o2.B) this.f56180I;
                p087i7.x.b(obj);
                aVar = aVar2;
                b6 = b11;
                w2.d.c.a aVar4 = new w2.d.c.a(null, this.f56184M);
                this.f56180I = b6;
                this.f56178G = null;
                this.f56179H = 3;
                obj = b6.c(aVar, aVar4, this);
                if (obj == objG) {
                    return objG;
                }
                if (!this.f56182K) {
                    return obj;
                }
                this.f56180I = obj;
                this.f56179H = 4;
                objA = b6.a(this);
                if (objA == objG) {
                    return objG;
                }
                obj2 = obj;
                obj = objA;
            } else if (i6 == 3) {
                b6 = (p143o2.B) this.f56180I;
                p087i7.x.b(obj);
                if (!this.f56182K) {
                    return obj;
                }
                this.f56180I = obj;
                this.f56179H = 4;
                objA = b6.a(this);
                if (objA == objG) {
                    return objG;
                }
                obj2 = obj;
                obj = objA;
            } else {
                if (i6 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f56180I;
                p087i7.x.b(obj);
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                this.f56183L.r().q();
            }
            return obj2;
            if (((java.lang.Boolean) obj).booleanValue()) {
                aVar = aVar2;
                b6 = b10;
            } else {
                androidx.room.c cVarR = this.f56183L.r();
                this.f56180I = b10;
                this.f56178G = aVar2;
                this.f56179H = 2;
                if (cVarR.w(this) == objG) {
                    return objG;
                }
                b11 = b10;
                aVar = aVar2;
                b6 = b11;
            }
            w2.d.c.a aVar5 = new w2.d.c.a(null, this.f56184M);
            this.f56180I = b6;
            this.f56178G = null;
            this.f56179H = 3;
            obj = b6.c(aVar, aVar5, this);
            if (obj == objG) {
                return objG;
            }
            if (!this.f56182K) {
                return obj;
            }
            this.f56180I = obj;
            this.f56179H = 4;
            objA = b6.a(this);
            if (objA == objG) {
                return objG;
            }
            obj2 = obj;
            obj = objA;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                this.f56183L.r().q();
            }
            return obj2;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p143o2.B b6, p127m7.e eVar) {
            return ((w2.d.c) x(b6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            w2.d.c cVar = new w2.d.c(this.f56181J, this.f56182K, this.f56183L, eVar, this.f56184M);
            cVar.f56180I = obj;
            return cVar;
        }
    }

    public static final void a(p253z2.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "db");
        p223w2.b.a(new p173r2.a(dVar));
    }

    public static final java.lang.Object b(p143o2.n nVar, boolean z6, p127m7.e eVar) {
        if (!nVar.C()) {
            return nVar.q().getCoroutineContext();
        }
        androidx.appcompat.app.D.a(eVar.getContext().i(p143o2.x.f52529C));
        return z6 ? nVar.z() : nVar.t();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final java.lang.Object c(p143o2.n nVar, boolean z6, boolean z10, p237x7.l lVar, p127m7.e eVar) {
        w2.d.b bVar;
        p237x7.l lVar2;
        boolean z11;
        p143o2.n nVar2;
        boolean z12;
        if (eVar instanceof w2.d.b) {
            bVar = (w2.d.b) eVar;
            int i6 = bVar.f56177K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f56177K = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new w2.d.b(eVar);
            }
        } else {
            bVar = new w2.d.b(eVar);
        }
        w2.d.b bVar2 = bVar;
        java.lang.Object objO = bVar2.f56176J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar2.f56177K;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    boolean z13 = bVar2.f56175I;
                    boolean z14 = bVar2.f56174H;
                    p237x7.l lVar3 = (p237x7.l) bVar2.f56173G;
                    p143o2.n nVar3 = (p143o2.n) bVar2.f56172F;
                    p087i7.x.b(objO);
                    z11 = z13;
                    z12 = z14;
                    lVar2 = lVar3;
                    nVar2 = nVar3;
                    w2.d.a aVar = new w2.d.a(null, nVar2, z12, z11, lVar2);
                    bVar2.f56172F = null;
                    bVar2.f56173G = null;
                    bVar2.f56177K = 3;
                    objO = W8.AbstractC1784g.g((p127m7.i) objO, aVar, bVar2);
                    if (objO == objG) {
                        return objG;
                    }
                } else if (i10 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            p087i7.x.b(objO);
        } else {
            p087i7.x.b(objO);
            if (nVar.C() && nVar.K() && nVar.D()) {
                w2.d.c cVar = new w2.d.c(z10, z6, nVar, null, lVar);
                bVar2.f56177K = 1;
                objO = nVar.O(z6, cVar, bVar2);
                if (objO == objG) {
                    return objG;
                }
            } else {
                bVar2.f56172F = nVar;
                bVar2.f56173G = lVar;
                bVar2.f56174H = z6;
                bVar2.f56175I = z10;
                bVar2.f56177K = 2;
                java.lang.Object objC = p223w2.b.c(nVar, z10, bVar2);
                if (objC == objG) {
                    return objG;
                }
                lVar2 = lVar;
                z11 = z10;
                objO = objC;
                nVar2 = nVar;
                z12 = z6;
                w2.d.a aVar2 = new w2.d.a(null, nVar2, z12, z11, lVar2);
                bVar2.f56172F = null;
                bVar2.f56173G = null;
                bVar2.f56177K = 3;
                objO = W8.AbstractC1784g.g((p127m7.i) objO, aVar2, bVar2);
                if (objO == objG) {
                    return objG;
                }
            }
        }
        return objO;
    }

    public static final android.database.Cursor d(p143o2.n nVar, p253z2.g gVar, boolean z6, android.os.CancellationSignal cancellationSignal) {
        p247y7.AbstractC7350t.f(nVar, "db");
        p247y7.AbstractC7350t.f(gVar, "sqLiteQuery");
        android.database.Cursor cursorM = nVar.M(gVar, cancellationSignal);
        if (!z6 || !(cursorM instanceof android.database.AbstractWindowedCursor)) {
            return cursorM;
        }
        android.database.AbstractWindowedCursor abstractWindowedCursor = (android.database.AbstractWindowedCursor) cursorM;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? p223w2.a.a(cursorM) : cursorM;
    }

    public static final int e(java.io.File file) throws java.io.IOException {
        p247y7.AbstractC7350t.f(file, "databaseFile");
        java.nio.channels.FileChannel channel = new java.io.FileInputStream(file).getChannel();
        try {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new java.io.IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i6 = byteBufferAllocate.getInt();
            p197t7.b.a(channel, null);
            return i6;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                p197t7.b.a(channel, th);
                throw th2;
            }
        }
    }
}
