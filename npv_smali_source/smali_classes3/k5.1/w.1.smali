.class public Lk5/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LQ4/f;

.field private final c:Lk5/C;

.field private final d:Lk5/M;

.field private final e:J

.field private f:Lk5/x;

.field private g:Lk5/x;

.field private h:Z

.field private i:Lk5/p;

.field private final j:Lk5/H;

.field private final k:Lq5/g;

.field public final l:Lj5/b;

.field private final m:Li5/a;

.field private final n:Lk5/m;

.field private final o:Lh5/a;

.field private final p:Lh5/l;

.field private final q:Ll5/f;


# direct methods
.method public constructor <init>(LQ4/f;Lk5/H;Lh5/a;Lk5/C;Lj5/b;Li5/a;Lq5/g;Lk5/m;Lh5/l;Ll5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/w;->b:LQ4/f;

    iput-object p4, p0, Lk5/w;->c:Lk5/C;

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lk5/w;->a:Landroid/content/Context;

    iput-object p2, p0, Lk5/w;->j:Lk5/H;

    iput-object p3, p0, Lk5/w;->o:Lh5/a;

    iput-object p5, p0, Lk5/w;->l:Lj5/b;

    iput-object p6, p0, Lk5/w;->m:Li5/a;

    iput-object p7, p0, Lk5/w;->k:Lq5/g;

    iput-object p8, p0, Lk5/w;->n:Lk5/m;

    iput-object p9, p0, Lk5/w;->p:Lh5/l;

    iput-object p10, p0, Lk5/w;->q:Ll5/f;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lk5/w;->e:J

    new-instance p1, Lk5/M;

    invoke-direct {p1}, Lk5/M;-><init>()V

    iput-object p1, p0, Lk5/w;->d:Lk5/M;

    return-void
.end method

.method public static synthetic a(Lk5/w;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk5/w;->q(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lk5/w;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lk5/w;->m()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk5/w;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk5/w;->p(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lk5/w;Ls5/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lk5/w;->o(Ls5/j;)V

    return-void
.end method

.method public static synthetic e(Lk5/w;Ls5/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lk5/w;->n(Ls5/j;)V

    return-void
.end method

.method private f()V
    .locals 4

    .prologue
    iget-object v0, p0, Lk5/w;->q:Ll5/f;

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    invoke-virtual {v0}, Ll5/e;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lk5/r;

    invoke-direct {v1, p0}, Lk5/r;-><init>(Lk5/w;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Lk5/w;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h(Ls5/j;)V
    .locals 3

    .prologue
    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-static {}, Ll5/f;->c()V

    invoke-virtual {p0}, Lk5/w;->t()V

    :try_start_0
    iget-object v1, p0, Lk5/w;->l:Lj5/b;

    new-instance v2, Lk5/t;

    invoke-direct {v2, p0}, Lk5/t;-><init>(Lk5/w;)V

    invoke-interface {v1, v2}, Lj5/b;->a(Lj5/a;)V

    iget-object v1, p0, Lk5/w;->i:Lk5/p;

    invoke-virtual {v1}, Lk5/p;->S()V

    invoke-interface {p1}, Ls5/j;->b()Ls5/d;

    move-result-object v1

    iget-object v1, v1, Ls5/d;->b:Ls5/d$a;

    iget-boolean v1, v1, Ls5/d$a;->a:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lk5/w;->i:Lk5/p;

    invoke-virtual {v0, p1}, Lk5/p;->y(Ls5/j;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, Lh5/g;->k(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lk5/w;->i:Lk5/p;

    invoke-interface {p1}, Ls5/j;->a()Ll4/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk5/p;->U(Ll4/l;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lk5/w;->s()V

    goto :goto_3

    :cond_1
    :try_start_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Lh5/g;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    :try_start_2
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    invoke-virtual {p0}, Lk5/w;->s()V

    throw p1
.end method

.method private j(Ls5/j;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk5/w;->q:Ll5/f;

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    invoke-virtual {v0}, Ll5/e;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lk5/s;

    invoke-direct {v1, p0, p1}, Lk5/s;-><init>(Lk5/w;Ls5/j;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :goto_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    :goto_1
    invoke-virtual {v0, v1, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :goto_2
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    goto :goto_1

    :goto_3
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    invoke-virtual {v0, v1, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :goto_4
    return-void
.end method

.method public static k()Ljava/lang/String;
    .locals 1

    const-string v0, "19.3.0"

    return-object v0
.end method

.method static l(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Lh5/g;->i(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string p0, "FirebaseCrashlytics"

    const-string p1, "."

    nop

    const-string v0, ".     |  | "

    nop

    const-string v0, ".     |  |"

    nop

    nop

    const-string v1, ".   \\ |  | /"

    nop

    const-string v1, ".    \\    /"

    nop

    const-string v1, ".     \\  /"

    nop

    const-string v1, ".      \\/"

    nop

    nop

    const-string v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    nop

    nop

    const-string v1, ".      /\\"

    nop

    const-string v1, ".     /  \\"

    nop

    const-string v1, ".    /    \\"

    nop

    const-string v1, ".   / |  | \\"

    nop

    nop

    nop

    nop

    nop

    const/4 p0, 0x0

    return p0
.end method

.method private synthetic m()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lk5/w;->i:Lk5/p;

    invoke-virtual {v0}, Lk5/p;->r()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic n(Ls5/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lk5/w;->h(Ls5/j;)V

    return-void
.end method

.method private synthetic o(Ls5/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lk5/w;->h(Ls5/j;)V

    return-void
.end method

.method private synthetic p(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk5/w;->i:Lk5/p;

    invoke-virtual {v0, p1, p2, p3}, Lk5/p;->X(JLjava/lang/String;)V

    return-void
.end method

.method private synthetic q(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lk5/w;->q:Ll5/f;

    iget-object v0, v0, Ll5/f;->b:Ll5/e;

    new-instance v1, Lk5/v;

    invoke-direct {v1, p0, p1, p2, p3}, Lk5/v;-><init>(Lk5/w;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    return-void
.end method


# virtual methods
.method g()Z
    .locals 1

    iget-object v0, p0, Lk5/w;->f:Lk5/x;

    invoke-virtual {v0}, Lk5/x;->c()Z

    move-result v0

    return v0
.end method

.method public i(Ls5/j;)Ll4/l;
    .locals 2

    iget-object v0, p0, Lk5/w;->q:Ll5/f;

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    new-instance v1, Lk5/q;

    invoke-direct {v1, p0, p1}, Lk5/q;-><init>(Lk5/w;Ls5/j;)V

    invoke-virtual {v0, v1}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lk5/w;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lk5/w;->q:Ll5/f;

    iget-object v2, v2, Ll5/f;->a:Ll5/e;

    new-instance v3, Lk5/u;

    invoke-direct {v3, p0, v0, v1, p1}, Lk5/u;-><init>(Lk5/w;JLjava/lang/String;)V

    invoke-virtual {v2, v3}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    return-void
.end method

.method s()V
    .locals 3

    .prologue
    invoke-static {}, Ll5/f;->c()V

    :try_start_0
    iget-object v0, p0, Lk5/w;->f:Lk5/x;

    invoke-virtual {v0}, Lk5/x;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Initialization marker file was not properly removed."

    invoke-virtual {v0, v1}, Lh5/g;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v1

    const-string v2, "Problem encountered deleting Crashlytics initialization marker."

    invoke-virtual {v1, v2, v0}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method t()V
    .locals 2

    invoke-static {}, Ll5/f;->c()V

    iget-object v0, p0, Lk5/w;->f:Lk5/x;

    invoke-virtual {v0}, Lk5/x;->a()Z

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, Lh5/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public u(Lk5/a;Ls5/j;)Z
    .locals 29

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v13, 0x0

    iget-object v2, v1, Lk5/w;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v14, 0x1

    invoke-static {v2, v3, v14}, Lk5/i;->i(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Lk5/a;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Lk5/w;->l(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lk5/h;

    invoke-direct {v2}, Lk5/h;-><init>()V

    invoke-virtual {v2}, Lk5/h;->c()Ljava/lang/String;

    move-result-object v12

    :try_start_0
    new-instance v2, Lk5/x;

    const-string v3, "crash_marker"

    iget-object v4, v1, Lk5/w;->k:Lq5/g;

    invoke-direct {v2, v3, v4}, Lk5/x;-><init>(Ljava/lang/String;Lq5/g;)V

    iput-object v2, v1, Lk5/w;->g:Lk5/x;

    new-instance v2, Lk5/x;

    const-string v3, "initialization_marker"

    iget-object v4, v1, Lk5/w;->k:Lq5/g;

    invoke-direct {v2, v3, v4}, Lk5/x;-><init>(Ljava/lang/String;Lq5/g;)V

    iput-object v2, v1, Lk5/w;->f:Lk5/x;

    new-instance v11, Lm5/n;

    iget-object v2, v1, Lk5/w;->k:Lq5/g;

    iget-object v3, v1, Lk5/w;->q:Ll5/f;

    invoke-direct {v11, v12, v2, v3}, Lm5/n;-><init>(Ljava/lang/String;Lq5/g;Ll5/f;)V

    new-instance v10, Lm5/e;

    iget-object v2, v1, Lk5/w;->k:Lq5/g;

    invoke-direct {v10, v2}, Lm5/e;-><init>(Lq5/g;)V

    new-instance v8, Lt5/a;

    new-instance v2, Lt5/c;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lt5/c;-><init>(I)V

    new-array v3, v14, [Lt5/d;

    aput-object v2, v3, v13

    const/16 v2, 0x400

    invoke-direct {v8, v2, v3}, Lt5/a;-><init>(I[Lt5/d;)V

    iget-object v2, v1, Lk5/w;->p:Lh5/l;

    invoke-virtual {v2, v11}, Lh5/l;->c(Lm5/n;)V

    iget-object v2, v1, Lk5/w;->a:Landroid/content/Context;

    iget-object v3, v1, Lk5/w;->j:Lk5/H;

    iget-object v4, v1, Lk5/w;->k:Lq5/g;

    iget-object v9, v1, Lk5/w;->d:Lk5/M;

    iget-object v7, v1, Lk5/w;->n:Lk5/m;

    iget-object v6, v1, Lk5/w;->q:Ll5/f;

    move-object/from16 v5, p1

    move-object/from16 v16, v6

    move-object v6, v10

    move-object/from16 v17, v7

    move-object v7, v11

    move-object/from16 v18, v9

    move-object/from16 v9, p2

    move-object/from16 v23, v10

    move-object/from16 v10, v18

    move-object/from16 v22, v11

    move-object/from16 v11, v17

    move-object v14, v12

    move-object/from16 v12, v16

    invoke-static/range {v2 .. v12}, Lk5/Z;->i(Landroid/content/Context;Lk5/H;Lq5/g;Lk5/a;Lm5/e;Lm5/n;Lt5/d;Ls5/j;Lk5/M;Lk5/m;Ll5/f;)Lk5/Z;

    move-result-object v24

    new-instance v2, Lk5/p;

    iget-object v3, v1, Lk5/w;->a:Landroid/content/Context;

    iget-object v4, v1, Lk5/w;->j:Lk5/H;

    iget-object v5, v1, Lk5/w;->c:Lk5/C;

    iget-object v6, v1, Lk5/w;->k:Lq5/g;

    iget-object v7, v1, Lk5/w;->g:Lk5/x;

    iget-object v8, v1, Lk5/w;->o:Lh5/a;

    iget-object v9, v1, Lk5/w;->m:Li5/a;

    iget-object v10, v1, Lk5/w;->n:Lk5/m;

    iget-object v11, v1, Lk5/w;->q:Ll5/f;

    move-object v15, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, p1

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    invoke-direct/range {v15 .. v28}, Lk5/p;-><init>(Landroid/content/Context;Lk5/H;Lk5/C;Lq5/g;Lk5/x;Lk5/a;Lm5/n;Lm5/e;Lk5/Z;Lh5/a;Li5/a;Lk5/m;Ll5/f;)V

    iput-object v2, v1, Lk5/w;->i:Lk5/p;

    invoke-virtual/range {p0 .. p0}, Lk5/w;->g()Z

    move-result v2

    invoke-direct/range {p0 .. p0}, Lk5/w;->f()V

    iget-object v3, v1, Lk5/w;->i:Lk5/p;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v4

    invoke-virtual {v3, v14, v4, v0}, Lk5/p;->w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ls5/j;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Lk5/w;->a:Landroid/content/Context;

    invoke-static {v2}, Lk5/i;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lk5/w;->j(Ls5/j;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v13

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, Lh5/g;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :goto_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lk5/w;->i:Lk5/p;

    return v13

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
