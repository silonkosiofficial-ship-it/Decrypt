.class public Lcom/google/firebase/crashlytics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lk5/w;


# direct methods
.method private constructor <init>(Lk5/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/a;->a:Lk5/w;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/crashlytics/a;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method static b(LQ4/f;LG5/e;LF5/a;LF5/a;LF5/a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)Lcom/google/firebase/crashlytics/a;
    .locals 18

    .prologue
    invoke-virtual/range {p0 .. p0}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk5/w;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh5/g;->g(Ljava/lang/String;)V

    new-instance v15, Ll5/f;

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-direct {v15, v2, v3}, Ll5/f;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    new-instance v3, Lq5/g;

    invoke-direct {v3, v1}, Lq5/g;-><init>(Landroid/content/Context;)V

    new-instance v2, Lk5/C;

    move-object/from16 v14, p0

    invoke-direct {v2, v14}, Lk5/C;-><init>(LQ4/f;)V

    new-instance v13, Lk5/H;

    move-object/from16 v4, p1

    invoke-direct {v13, v1, v0, v4, v2}, Lk5/H;-><init>(Landroid/content/Context;Ljava/lang/String;LG5/e;Lk5/C;)V

    new-instance v7, Lh5/d;

    move-object/from16 v0, p2

    invoke-direct {v7, v0}, Lh5/d;-><init>(LF5/a;)V

    new-instance v0, Lg5/d;

    move-object/from16 v4, p3

    invoke-direct {v0, v4}, Lg5/d;-><init>(LF5/a;)V

    new-instance v12, Lk5/m;

    invoke-direct {v12, v2, v3}, Lk5/m;-><init>(Lk5/C;Lq5/g;)V

    invoke-static {v12}, LT5/a;->e(LT5/b;)V

    new-instance v11, Lh5/l;

    move-object/from16 v4, p4

    invoke-direct {v11, v4}, Lh5/l;-><init>(LF5/a;)V

    new-instance v10, Lk5/w;

    invoke-virtual {v0}, Lg5/d;->e()Lj5/b;

    move-result-object v9

    invoke-virtual {v0}, Lg5/d;->d()Li5/a;

    move-result-object v0

    move-object v4, v10

    move-object/from16 v5, p0

    move-object v6, v13

    move-object v8, v2

    move-object/from16 v16, v10

    move-object v10, v0

    move-object v0, v11

    move-object v11, v3

    move-object/from16 v17, v13

    move-object v13, v0

    move-object v14, v15

    invoke-direct/range {v4 .. v14}, Lk5/w;-><init>(LQ4/f;Lk5/H;Lh5/a;Lk5/C;Lj5/b;Li5/a;Lq5/g;Lk5/m;Lh5/l;Ll5/f;)V

    invoke-virtual/range {p0 .. p0}, LQ4/f;->n()LQ4/o;

    move-result-object v0

    invoke-virtual {v0}, LQ4/o;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lk5/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Lk5/i;->j(Landroid/content/Context;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Mapping file ID is: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk5/f;

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v8

    invoke-virtual {v7}, Lk5/f;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lk5/f;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lk5/f;->b()Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x3

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v9, v11, v12

    const/4 v9, 0x1

    aput-object v10, v11, v9

    const/4 v9, 0x2

    aput-object v7, v11, v9

    const-string v7, "Build id for %s on %s: %s"

    invoke-static {v7, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lh5/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v6, Lh5/f;

    invoke-direct {v6, v1}, Lh5/f;-><init>(Landroid/content/Context;)V

    move-object/from16 p0, v1

    move-object/from16 p1, v17

    move-object/from16 p2, v0

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    :try_start_0
    invoke-static/range {p0 .. p5}, Lk5/a;->a(Landroid/content/Context;Lk5/H;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lh5/f;)Lk5/a;

    move-result-object v9
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Installer package name is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v9, Lk5/a;->d:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lh5/g;->i(Ljava/lang/String;)V

    new-instance v4, Lp5/b;

    invoke-direct {v4}, Lp5/b;-><init>()V

    iget-object v5, v9, Lk5/a;->f:Ljava/lang/String;

    iget-object v6, v9, Lk5/a;->g:Ljava/lang/String;

    move-object v8, v2

    move-object v2, v0

    move-object v0, v3

    move-object/from16 v3, v17

    move-object v7, v0

    invoke-static/range {v1 .. v8}, Ls5/g;->l(Landroid/content/Context;Ljava/lang/String;Lk5/H;Lp5/b;Ljava/lang/String;Ljava/lang/String;Lq5/g;Lk5/C;)Ls5/g;

    move-result-object v0

    invoke-virtual {v0, v15}, Ls5/g;->o(Ll5/f;)Ll4/l;

    move-result-object v1

    new-instance v2, Lg5/g;

    invoke-direct {v2}, Lg5/g;-><init>()V

    move-object/from16 v3, p7

    invoke-virtual {v1, v3, v2}, Ll4/l;->d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;

    move-object/from16 v1, v16

    invoke-virtual {v1, v9, v0}, Lk5/w;->u(Lk5/a;Ls5/j;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Lk5/w;->i(Ls5/j;)Ll4/l;

    :cond_1
    new-instance v0, Lcom/google/firebase/crashlytics/a;

    invoke-direct {v0, v1}, Lcom/google/firebase/crashlytics/a;-><init>(Lk5/w;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private static synthetic c(Ljava/lang/Exception;)V
    .locals 2

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Error fetching settings."

    invoke-virtual {v0, v1, p0}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
