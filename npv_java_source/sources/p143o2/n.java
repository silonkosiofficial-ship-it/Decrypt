package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o2.n.c f52443o = new o2.n.c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile p253z2.d f52444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private W8.N f52445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p127m7.i f52446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.concurrent.Executor f52447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.concurrent.Executor f52448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p143o2.m f52449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.room.c f52450g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected java.util.List f52453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p213v2.b f52454k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p153p2.a f52451h = new p153p2.a(new o2.n.h(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.lang.ThreadLocal f52455l = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.Map f52456m = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f52457n = true;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private boolean f52458A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F7.c f52459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.content.Context f52460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.String f52461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p237x7.a f52462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.util.List f52463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.util.List f52464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.util.concurrent.Executor f52465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.util.concurrent.Executor f52466h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private z2.e.c f52467i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f52468j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private o2.n.d f52469k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private android.content.Intent f52470l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f52471m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private java.util.concurrent.TimeUnit f52472n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final o2.n.e f52473o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private java.util.Set f52474p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final java.util.Set f52475q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final java.util.List f52476r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f52477s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f52478t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f52479u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private java.lang.String f52480v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private java.io.File f52481w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private java.util.concurrent.Callable f52482x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private p243y2.c f52483y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private p127m7.i f52484z;

        public a(F7.c cVar, java.lang.String str, p237x7.a aVar, android.content.Context context) {
            p247y7.AbstractC7350t.f(cVar, "klass");
            p247y7.AbstractC7350t.f(context, "context");
            this.f52463e = new java.util.ArrayList();
            this.f52464f = new java.util.ArrayList();
            this.f52469k = o2.n.d.AUTOMATIC;
            this.f52471m = -1L;
            this.f52473o = new o2.n.e();
            this.f52474p = new java.util.LinkedHashSet();
            this.f52475q = new java.util.LinkedHashSet();
            this.f52476r = new java.util.ArrayList();
            this.f52477s = true;
            this.f52458A = true;
            this.f52459a = cVar;
            this.f52460b = context;
            this.f52461c = str;
            this.f52462d = aVar;
        }

        public a(android.content.Context context, java.lang.Class cls, java.lang.String str) {
            p247y7.AbstractC7350t.f(context, "context");
            p247y7.AbstractC7350t.f(cls, "klass");
            this.f52463e = new java.util.ArrayList();
            this.f52464f = new java.util.ArrayList();
            this.f52469k = o2.n.d.AUTOMATIC;
            this.f52471m = -1L;
            this.f52473o = new o2.n.e();
            this.f52474p = new java.util.LinkedHashSet();
            this.f52475q = new java.util.LinkedHashSet();
            this.f52476r = new java.util.ArrayList();
            this.f52477s = true;
            this.f52458A = true;
            this.f52459a = p227w7.a.e(cls);
            this.f52460b = context;
            this.f52461c = str;
            this.f52462d = null;
        }

        public o2.n.a a(o2.n.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "callback");
            this.f52463e.add(bVar);
            return this;
        }

        public o2.n.a b(p183s2.a... aVarArr) {
            p247y7.AbstractC7350t.f(aVarArr, "migrations");
            for (p183s2.a aVar : aVarArr) {
                this.f52475q.add(java.lang.Integer.valueOf(aVar.f54116a));
                this.f52475q.add(java.lang.Integer.valueOf(aVar.f54117b));
            }
            this.f52473o.b((p183s2.a[]) java.util.Arrays.copyOf(aVarArr, aVarArr.length));
            return this;
        }

        public o2.n.a c(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "typeConverter");
            this.f52464f.add(obj);
            return this;
        }

        public o2.n.a d() {
            this.f52468j = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x003c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0040  */
        /* JADX WARN: Code duplicated, block: B:26:0x0045  */
        /* JADX WARN: Code duplicated, block: B:28:0x004d  */
        /* JADX WARN: Code duplicated, block: B:30:0x0051  */
        /* JADX WARN: Code duplicated, block: B:32:0x0059  */
        /* JADX WARN: Code duplicated, block: B:33:0x0067  */
        /* JADX WARN: Code duplicated, block: B:35:0x0071  */
        /* JADX WARN: Code duplicated, block: B:43:0x0089  */
        /* JADX WARN: Code duplicated, block: B:45:0x008d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0091  */
        /* JADX WARN: Code duplicated, block: B:48:0x0093  */
        /* JADX WARN: Code duplicated, block: B:51:0x0098  */
        /* JADX WARN: Code duplicated, block: B:52:0x009a  */
        /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:74:0x0121  */
        /* JADX WARN: Code duplicated, block: B:77:0x0133  */
        /* JADX WARN: Code duplicated, block: B:79:0x013d  */
        /* JADX WARN: Code duplicated, block: B:81:0x0147  */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x008d, please report this as an issue */
        public p143o2.n e() {
            java.util.concurrent.Executor executorF;
            p243y2.c cVar;
            z2.e.c fVar;
            z2.e.c cVar2;
            android.content.Context context;
            java.lang.String str;
            o2.n.e eVar;
            java.util.List list;
            boolean z6;
            o2.n.d dVarG;
            java.util.concurrent.Executor executor;
            java.util.concurrent.Executor executor2;
            p237x7.a aVar;
            p143o2.n nVar;
            java.lang.String str2;
            int i6;
            java.io.File file;
            int i10;
            java.util.concurrent.Callable callable;
            long j6;
            java.util.concurrent.TimeUnit timeUnit;
            java.util.concurrent.Executor executor3 = this.f52465g;
            if (executor3 != null || this.f52466h != null) {
                if (executor3 != null && this.f52466h == null) {
                    this.f52466h = executor3;
                } else if (executor3 == null) {
                    executorF = this.f52466h;
                }
                p143o2.o.c(this.f52475q, this.f52474p);
                cVar = this.f52483y;
                if (cVar != null && this.f52467i == null) {
                    fVar = new A2.f();
                } else if (cVar == null) {
                    fVar = this.f52467i;
                } else {
                    if (this.f52467i != null) {
                        throw new java.lang.IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                    }
                    fVar = null;
                }
                if (fVar != null) {
                    if (this.f52471m > 0) {
                        if (this.f52461c != null) {
                            throw new java.lang.IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                        }
                        j6 = this.f52471m;
                        timeUnit = this.f52472n;
                        if (timeUnit != null) {
                            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                        }
                        fVar = new p213v2.d(fVar, new p213v2.b(j6, timeUnit, null, 4, null));
                    }
                    str2 = this.f52480v;
                    if (str2 == null || this.f52481w != null || this.f52482x != null) {
                        if (this.f52461c == null) {
                            throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                        }
                        if (str2 == null) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                        file = this.f52481w;
                        if (file == null) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        callable = this.f52482x;
                        if (i6 + i10 + (callable != null ? 1 : 0) != 1) {
                            throw new java.lang.IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                        fVar = new p213v2.f(str2, file, callable, fVar);
                    }
                    cVar2 = fVar;
                } else {
                    cVar2 = null;
                }
                context = this.f52460b;
                str = this.f52461c;
                eVar = this.f52473o;
                list = this.f52463e;
                z6 = this.f52468j;
                dVarG = this.f52469k.g(context);
                executor = this.f52465g;
                if (executor != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                executor2 = this.f52466h;
                if (executor2 != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                p143o2.C7023c c7023c = new p143o2.C7023c(context, str, cVar2, eVar, list, z6, dVarG, executor, executor2, this.f52470l, this.f52477s, this.f52478t, this.f52474p, this.f52480v, this.f52481w, this.f52482x, null, this.f52464f, this.f52476r, this.f52479u, this.f52483y, this.f52484z);
                c7023c.f(this.f52458A);
                aVar = this.f52462d;
                if (aVar != null || (nVar = (p143o2.n) aVar.b()) == null) {
                    nVar = (p143o2.n) p223w2.g.b(p227w7.a.b(this.f52459a), null, 2, null);
                }
                nVar.E(c7023c);
                return nVar;
            }
            executorF = p130n.c.f();
            this.f52466h = executorF;
            this.f52465g = executorF;
            p143o2.o.c(this.f52475q, this.f52474p);
            cVar = this.f52483y;
            if (cVar != null) {
                if (cVar == null) {
                    fVar = this.f52467i;
                } else {
                    if (this.f52467i != null) {
                        throw new java.lang.IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                    }
                    fVar = null;
                }
            } else if (cVar == null) {
                fVar = this.f52467i;
            } else {
                if (this.f52467i != null) {
                    throw new java.lang.IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                fVar = null;
            }
            if (fVar != null) {
                if (this.f52471m > 0) {
                    if (this.f52461c != null) {
                        throw new java.lang.IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    j6 = this.f52471m;
                    timeUnit = this.f52472n;
                    if (timeUnit != null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    fVar = new p213v2.d(fVar, new p213v2.b(j6, timeUnit, null, 4, null));
                }
                str2 = this.f52480v;
                if (str2 == null) {
                    if (this.f52461c == null) {
                        throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    if (str2 == null) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    file = this.f52481w;
                    if (file == null) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    callable = this.f52482x;
                    if (i6 + i10 + (callable != null ? 1 : 0) != 1) {
                        throw new java.lang.IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    fVar = new p213v2.f(str2, file, callable, fVar);
                } else {
                    if (this.f52461c == null) {
                        throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    if (str2 == null) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    file = this.f52481w;
                    if (file == null) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    callable = this.f52482x;
                    if (i6 + i10 + (callable != null ? 1 : 0) != 1) {
                        throw new java.lang.IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    fVar = new p213v2.f(str2, file, callable, fVar);
                }
                cVar2 = fVar;
            } else {
                cVar2 = null;
            }
            context = this.f52460b;
            str = this.f52461c;
            eVar = this.f52473o;
            list = this.f52463e;
            z6 = this.f52468j;
            dVarG = this.f52469k.g(context);
            executor = this.f52465g;
            if (executor != null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            executor2 = this.f52466h;
            if (executor2 != null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            p143o2.C7023c c7023c2 = new p143o2.C7023c(context, str, cVar2, eVar, list, z6, dVarG, executor, executor2, this.f52470l, this.f52477s, this.f52478t, this.f52474p, this.f52480v, this.f52481w, this.f52482x, null, this.f52464f, this.f52476r, this.f52479u, this.f52483y, this.f52484z);
            c7023c2.f(this.f52458A);
            aVar = this.f52462d;
            if (aVar != null) {
                nVar = (p143o2.n) p223w2.g.b(p227w7.a.b(this.f52459a), null, 2, null);
            } else {
                nVar = (p143o2.n) p223w2.g.b(p227w7.a.b(this.f52459a), null, 2, null);
            }
            nVar.E(c7023c2);
            return nVar;
        }

        public o2.n.a f() {
            this.f52477s = false;
            this.f52478t = true;
            return this;
        }

        public final o2.n.a g(boolean z6) {
            this.f52477s = false;
            this.f52478t = true;
            this.f52479u = z6;
            return this;
        }

        public o2.n.a h(z2.e.c cVar) {
            this.f52467i = cVar;
            return this;
        }

        public final o2.n.a i(p243y2.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "driver");
            this.f52483y = cVar;
            return this;
        }

        public final o2.n.a j(p127m7.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "context");
            if (this.f52465g != null || this.f52466h != null) {
                throw new java.lang.IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.".toString());
            }
            if (iVar.i(p127m7.f.f51196A) == null) {
                throw new java.lang.IllegalArgumentException("It is required that the coroutine context contain a dispatcher.".toString());
            }
            this.f52484z = iVar;
            return this;
        }

        public o2.n.a k(java.util.concurrent.Executor executor) {
            p247y7.AbstractC7350t.f(executor, "executor");
            if (this.f52484z != null) {
                throw new java.lang.IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.".toString());
            }
            this.f52465g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            if (bVar instanceof p173r2.a) {
                b(((p173r2.a) bVar).a());
            }
        }

        public void b(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
        }

        public void c(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            if (bVar instanceof p173r2.a) {
                d(((p173r2.a) bVar).a());
            }
        }

        public void d(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
        }

        public void e(p243y2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            if (bVar instanceof p173r2.a) {
                f(((p173r2.a) bVar).a());
            }
        }

        public void f(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final o2.n.d g(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            java.lang.Object systemService = context.getSystemService("activity");
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map f52489a = new java.util.LinkedHashMap();

        public final void a(p183s2.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "migration");
            int i6 = aVar.f54116a;
            int i10 = aVar.f54117b;
            java.util.Map map = this.f52489a;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
            java.lang.Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new java.util.TreeMap();
                map.put(numValueOf, treeMap);
            }
            java.util.TreeMap treeMap2 = (java.util.TreeMap) treeMap;
            if (treeMap2.containsKey(java.lang.Integer.valueOf(i10))) {
                java.lang.String str = "Overriding migration " + treeMap2.get(java.lang.Integer.valueOf(i10)) + " with " + aVar;
            }
            treeMap2.put(java.lang.Integer.valueOf(i10), aVar);
        }

        public void b(p183s2.a... aVarArr) {
            p247y7.AbstractC7350t.f(aVarArr, "migrations");
            for (p183s2.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public final boolean c(int i6, int i10) {
            return p223w2.h.a(this, i6, i10);
        }

        public java.util.List d(int i6, int i10) {
            return p223w2.h.b(this, i6, i10);
        }

        public java.util.Map e() {
            return this.f52489a;
        }

        public final p087i7.u f(int i6) {
            java.util.TreeMap treeMap = (java.util.TreeMap) this.f52489a.get(java.lang.Integer.valueOf(i6));
            if (treeMap == null) {
                return null;
            }
            return p087i7.B.a(treeMap, treeMap.descendingKeySet());
        }

        public final p087i7.u g(int i6) {
            java.util.TreeMap treeMap = (java.util.TreeMap) this.f52489a.get(java.lang.Integer.valueOf(i6));
            if (treeMap == null) {
                return null;
            }
            return p087i7.B.a(treeMap, treeMap.keySet());
        }
    }

    public static abstract class f {
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {
        g() {
            super(1);
        }

        public final void a(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "it");
            p143o2.n.this.F();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p253z2.d) obj);
            return p087i7.M.f46721a;
        }
    }

    /* synthetic */ class h extends p247y7.C7348q implements p237x7.a {
        h(java.lang.Object obj) {
            super(0, obj, p143o2.n.class, "onClosed", "onClosed()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p143o2.n) this.f57287D).L();
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.l {
        i() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p253z2.e l(p143o2.C7023c c7023c) {
            p247y7.AbstractC7350t.f(c7023c, "config");
            return p143o2.n.this.m(c7023c);
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.l {
        j() {
            super(1);
        }

        public final void a(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "it");
            p143o2.n.this.G();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p253z2.d) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        e();
        p253z2.d dVarV0 = s().v0();
        if (!dVarV0.V0()) {
            r().x();
        }
        if (dVarV0.a1()) {
            dVarV0.l0();
        } else {
            dVarV0.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        s().v0().B0();
        if (D()) {
            return;
        }
        r().r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        W8.N n6 = this.f52445b;
        p143o2.m mVar = null;
        if (n6 == null) {
            p247y7.AbstractC7350t.p("coroutineScope");
            n6 = null;
        }
        W8.O.e(n6, null, 1, null);
        r().v();
        p143o2.m mVar2 = this.f52449f;
        if (mVar2 == null) {
            p247y7.AbstractC7350t.p("connectionManager");
        } else {
            mVar = mVar2;
        }
        mVar.C();
    }

    public final java.lang.Object A(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "klass");
        java.lang.Object obj = this.f52456m.get(cVar);
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return obj;
    }

    public final boolean B() {
        return this.f52457n;
    }

    public final boolean C() {
        p143o2.m mVar = this.f52449f;
        if (mVar == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar = null;
        }
        return mVar.D() != null;
    }

    public boolean D() {
        return s().v0().V0();
    }

    public void E(p143o2.C7023c c7023c) {
        p127m7.i iVarO0;
        p247y7.AbstractC7350t.f(c7023c, "configuration");
        this.f52449f = j(c7023c);
        this.f52450g = k();
        p143o2.o.b(this, c7023c);
        p143o2.o.d(this, c7023c);
        p127m7.i iVar = c7023c.f52417u;
        W8.N n6 = null;
        if (iVar != null) {
            m7.i.b bVarI = iVar.i(p127m7.f.f51196A);
            p247y7.AbstractC7350t.d(bVarI, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            W8.J j6 = (W8.J) bVarI;
            java.util.concurrent.Executor executorA = W8.AbstractC1808s0.a(j6);
            this.f52447d = executorA;
            if (executorA == null) {
                p247y7.AbstractC7350t.p("internalQueryExecutor");
                executorA = null;
            }
            this.f52448e = new p143o2.z(executorA);
            this.f52445b = W8.O.a(c7023c.f52417u.o0(W8.U0.a((W8.InterfaceC1822z0) c7023c.f52417u.i(W8.InterfaceC1822z0.f15544h))));
            if (C()) {
                W8.N n10 = this.f52445b;
                if (n10 == null) {
                    p247y7.AbstractC7350t.p("coroutineScope");
                    n10 = null;
                }
                iVarO0 = n10.getCoroutineContext().o0(j6.w1(1));
            } else {
                W8.N n11 = this.f52445b;
                if (n11 == null) {
                    p247y7.AbstractC7350t.p("coroutineScope");
                    n11 = null;
                }
                iVarO0 = n11.getCoroutineContext();
            }
        } else {
            this.f52447d = c7023c.f52404h;
            this.f52448e = new p143o2.z(c7023c.f52405i);
            java.util.concurrent.Executor executor = this.f52447d;
            if (executor == null) {
                p247y7.AbstractC7350t.p("internalQueryExecutor");
                executor = null;
            }
            W8.N nA = W8.O.a(W8.AbstractC1808s0.b(executor).o0(W8.U0.b(null, 1, null)));
            this.f52445b = nA;
            if (nA == null) {
                p247y7.AbstractC7350t.p("coroutineScope");
                nA = null;
            }
            p127m7.i coroutineContext = nA.getCoroutineContext();
            java.util.concurrent.Executor executor2 = this.f52448e;
            if (executor2 == null) {
                p247y7.AbstractC7350t.p("internalTransactionExecutor");
                executor2 = null;
            }
            iVarO0 = coroutineContext.o0(W8.AbstractC1808s0.b(executor2));
        }
        this.f52446c = iVarO0;
        this.f52452i = c7023c.f52402f;
        p143o2.m mVar = this.f52449f;
        if (mVar == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar = null;
        }
        p253z2.e eVarD = mVar.D();
        if (eVarD != null) {
            while (!(eVarD instanceof p213v2.e)) {
                if (!(eVarD instanceof p143o2.InterfaceC7024d)) {
                    eVarD = null;
                    break;
                }
                eVarD = ((p143o2.InterfaceC7024d) eVarD).a();
            }
        } else {
            eVarD = null;
            break;
        }
        p213v2.e eVar = (p213v2.e) eVarD;
        if (eVar != null) {
            eVar.i(c7023c);
        }
        p143o2.m mVar2 = this.f52449f;
        if (mVar2 == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar2 = null;
        }
        p253z2.e eVarD2 = mVar2.D();
        if (eVarD2 != null) {
            while (!(eVarD2 instanceof p213v2.c)) {
                if (!(eVarD2 instanceof p143o2.InterfaceC7024d)) {
                    eVarD2 = null;
                    break;
                }
                eVarD2 = ((p143o2.InterfaceC7024d) eVarD2).a();
            }
        } else {
            eVarD2 = null;
            break;
        }
        p213v2.c cVar = (p213v2.c) eVarD2;
        if (cVar != null) {
            this.f52454k = cVar.f();
            p213v2.b bVarF = cVar.f();
            W8.N n12 = this.f52445b;
            if (n12 == null) {
                p247y7.AbstractC7350t.p("coroutineScope");
            } else {
                n6 = n12;
            }
            bVarF.k(n6);
            r().u(cVar.f());
        }
        if (c7023c.f52406j != null) {
            if (c7023c.f52398b == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            r().k(c7023c.f52397a, c7023c.f52398b, c7023c.f52406j);
        }
        this.f52457n = c7023c.d();
    }

    protected final void H(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        r().l(bVar);
    }

    protected void I(p253z2.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "db");
        H(new p173r2.a(dVar));
    }

    public final boolean J() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    public final boolean K() {
        p143o2.m mVar = this.f52449f;
        if (mVar == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar = null;
        }
        return mVar.G();
    }

    public android.database.Cursor M(p253z2.g gVar, android.os.CancellationSignal cancellationSignal) {
        p247y7.AbstractC7350t.f(gVar, "query");
        e();
        f();
        return cancellationSignal != null ? s().v0().L0(gVar, cancellationSignal) : s().v0().T(gVar);
    }

    public void N() {
        s().v0().i0();
    }

    public final java.lang.Object O(boolean z6, p237x7.p pVar, p127m7.e eVar) {
        p143o2.m mVar = this.f52449f;
        if (mVar == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar = null;
        }
        return mVar.H(z6, pVar, eVar);
    }

    public final void d(F7.c cVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(cVar, "kclass");
        p247y7.AbstractC7350t.f(obj, "converter");
        this.f52456m.put(cVar, obj);
    }

    public void e() {
        if (!this.f52452i && !(!J())) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void f() {
        if (C() && !D() && this.f52455l.get() != null) {
            throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void g() {
        e();
        p213v2.b bVar = this.f52454k;
        if (bVar == null) {
            F();
        } else {
            bVar.h(new o2.n.g());
        }
    }

    public p253z2.h h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        e();
        f();
        return s().v0().J(str);
    }

    public java.util.List i(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "autoMigrationSpecs");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p097j7.S.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(p227w7.a.b((F7.c) entry.getKey()), entry.getValue());
        }
        return o(linkedHashMap);
    }

    public final p143o2.m j(p143o2.C7023c c7023c) {
        p143o2.r rVar;
        p247y7.AbstractC7350t.f(c7023c, "configuration");
        try {
            p143o2.s sVarL = l();
            p247y7.AbstractC7350t.d(sVarL, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            rVar = (p143o2.r) sVarL;
        } catch (p087i7.t unused) {
            rVar = null;
        }
        return rVar == null ? new p143o2.m(c7023c, new o2.n.i()) : new p143o2.m(c7023c, rVar);
    }

    protected abstract androidx.room.c k();

    protected p143o2.s l() {
        throw new p087i7.t(null, 1, null);
    }

    protected p253z2.e m(p143o2.C7023c c7023c) {
        p247y7.AbstractC7350t.f(c7023c, "config");
        throw new p087i7.t(null, 1, null);
    }

    public void n() {
        p213v2.b bVar = this.f52454k;
        if (bVar == null) {
            G();
        } else {
            bVar.h(new o2.n.j());
        }
    }

    public java.util.List o(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "autoMigrationSpecs");
        return p097j7.AbstractC6879v.m();
    }

    public final p153p2.a p() {
        return this.f52451h;
    }

    public final W8.N q() {
        W8.N n6 = this.f52445b;
        if (n6 != null) {
            return n6;
        }
        p247y7.AbstractC7350t.p("coroutineScope");
        return null;
    }

    public androidx.room.c r() {
        androidx.room.c cVar = this.f52450g;
        if (cVar != null) {
            return cVar;
        }
        p247y7.AbstractC7350t.p("internalTracker");
        return null;
    }

    public p253z2.e s() {
        p143o2.m mVar = this.f52449f;
        if (mVar == null) {
            p247y7.AbstractC7350t.p("connectionManager");
            mVar = null;
        }
        p253z2.e eVarD = mVar.D();
        if (eVarD != null) {
            return eVarD;
        }
        throw new java.lang.IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.".toString());
    }

    public final p127m7.i t() {
        W8.N n6 = this.f52445b;
        if (n6 == null) {
            p247y7.AbstractC7350t.p("coroutineScope");
            n6 = null;
        }
        return n6.getCoroutineContext();
    }

    public java.util.Set u() {
        java.util.Set setV = v();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(setV, 10));
        java.util.Iterator it = setV.iterator();
        while (it.hasNext()) {
            arrayList.add(p227w7.a.e((java.lang.Class) it.next()));
        }
        return p097j7.AbstractC6879v.Y0(arrayList);
    }

    public java.util.Set v() {
        return p097j7.Z.d();
    }

    protected java.util.Map w() {
        java.util.Set<java.util.Map.Entry> setEntrySet = y().entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(setEntrySet, 10)), 16));
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            F7.c cVarE = p227w7.a.e(cls);
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(p227w7.a.e((java.lang.Class) it.next()));
            }
            p087i7.u uVarA = p087i7.B.a(cVarE, arrayList);
            linkedHashMap.put(uVarA.c(), uVarA.d());
        }
        return linkedHashMap;
    }

    public final java.util.Map x() {
        return w();
    }

    protected java.util.Map y() {
        return p097j7.S.h();
    }

    public final p127m7.i z() {
        p127m7.i iVar = this.f52446c;
        if (iVar != null) {
            return iVar;
        }
        p247y7.AbstractC7350t.p("transactionContext");
        return null;
    }
}
