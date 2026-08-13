.class public LR2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final E:Ljava/lang/String;


# instance fields
.field private final C:LJ2/g;

.field private final D:LJ2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EnqueueRunnable"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LR2/b;->E:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LJ2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/b;->C:LJ2/g;

    new-instance p1, LJ2/c;

    invoke-direct {p1}, LJ2/c;-><init>()V

    iput-object p1, p0, LR2/b;->D:LJ2/c;

    return-void
.end method

.method private static b(LJ2/g;)Z
    .locals 5

    invoke-static {p0}, LJ2/g;->l(LJ2/g;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, LJ2/g;->g()LJ2/j;

    move-result-object v1

    invoke-virtual {p0}, LJ2/g;->f()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0}, LJ2/g;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LJ2/g;->b()LI2/d;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, LR2/b;->c(LJ2/j;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;LI2/d;)Z

    move-result v0

    invoke-virtual {p0}, LJ2/g;->k()V

    return v0
.end method

.method private static c(LJ2/j;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;LI2/d;)Z
    .locals 16

    .prologue
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    array-length v8, v0

    if-lez v8, :cond_0

    move v8, v6

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    if-eqz v8, :cond_5

    array-length v9, v0

    move v11, v6

    move v10, v7

    move v12, v10

    move v13, v12

    :goto_1
    if-ge v10, v9, :cond_6

    aget-object v14, v0, v10

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v15

    invoke-interface {v15, v14}, LQ2/q;->n(Ljava/lang/String;)LQ2/p;

    move-result-object v15

    if-nez v15, :cond_1

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v0

    sget-object v1, LR2/b;->E:Ljava/lang/String;

    const-string v2, "Prerequisite %s doesn\'t exist; not enqueuing"

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v14, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    return v7

    :cond_1
    iget-object v14, v15, LQ2/p;->b:LI2/s;

    sget-object v15, LI2/s;->E:LI2/s;

    if-ne v14, v15, :cond_2

    move v15, v6

    goto :goto_2

    :cond_2
    move v15, v7

    :goto_2
    and-int/2addr v11, v15

    sget-object v15, LI2/s;->F:LI2/s;

    if-ne v14, v15, :cond_3

    move v13, v6

    goto :goto_3

    :cond_3
    sget-object v15, LI2/s;->H:LI2/s;

    if-ne v14, v15, :cond_4

    move v12, v6

    :cond_4
    :goto_3
    add-int/2addr v10, v6

    goto :goto_1

    :cond_5
    move v11, v6

    move v12, v7

    move v13, v12

    :cond_6
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    xor-int/2addr v9, v6

    if-eqz v9, :cond_15

    if-nez v8, :cond_15

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v10

    invoke-interface {v10, v1}, LQ2/q;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_15

    sget-object v14, LI2/d;->E:LI2/d;

    if-eq v2, v14, :cond_b

    sget-object v14, LI2/d;->F:LI2/d;

    if-ne v2, v14, :cond_7

    goto :goto_5

    :cond_7
    sget-object v14, LI2/d;->D:LI2/d;

    if-ne v2, v14, :cond_a

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LQ2/p$b;

    iget-object v14, v14, LQ2/p$b;->b:LI2/s;

    sget-object v15, LI2/s;->C:LI2/s;

    if-eq v14, v15, :cond_9

    sget-object v15, LI2/s;->D:LI2/s;

    if-ne v14, v15, :cond_8

    :cond_9
    return v7

    :cond_a
    move-object/from16 v2, p0

    invoke-static {v1, v2, v7}, LR2/a;->c(Ljava/lang/String;LJ2/j;Z)LR2/a;

    move-result-object v2

    invoke-virtual {v2}, LR2/a;->run()V

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v2

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LQ2/p$b;

    iget-object v14, v14, LQ2/p$b;->a:Ljava/lang/String;

    invoke-interface {v2, v14}, LQ2/q;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    :goto_5
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Q()LQ2/b;

    move-result-object v8

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LQ2/p$b;

    iget-object v7, v15, LQ2/p$b;->a:Ljava/lang/String;

    invoke-interface {v8, v7}, LQ2/b;->d(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_f

    iget-object v7, v15, LQ2/p$b;->b:LI2/s;

    sget-object v6, LI2/s;->E:LI2/s;

    if-ne v7, v6, :cond_c

    const/4 v6, 0x1

    goto :goto_7

    :cond_c
    const/4 v6, 0x0

    :goto_7
    and-int/2addr v6, v11

    sget-object v11, LI2/s;->F:LI2/s;

    if-ne v7, v11, :cond_d

    const/4 v13, 0x1

    goto :goto_8

    :cond_d
    sget-object v11, LI2/s;->H:LI2/s;

    if-ne v7, v11, :cond_e

    const/4 v12, 0x1

    :cond_e
    :goto_8
    iget-object v7, v15, LQ2/p$b;->a:Ljava/lang/String;

    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v11, v6

    :cond_f
    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_6

    :cond_10
    sget-object v6, LI2/d;->F:LI2/d;

    if-ne v2, v6, :cond_13

    if-nez v12, :cond_11

    if-eqz v13, :cond_13

    :cond_11
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v2

    invoke-interface {v2, v1}, LQ2/q;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LQ2/p$b;

    iget-object v7, v7, LQ2/p$b;->a:Ljava/lang/String;

    invoke-interface {v2, v7}, LQ2/q;->a(Ljava/lang/String;)V

    goto :goto_9

    :cond_12
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v14

    const/4 v12, 0x0

    const/4 v13, 0x0

    :cond_13
    invoke-interface {v14, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    if-lez v2, :cond_14

    const/4 v8, 0x1

    goto :goto_a

    :cond_14
    const/4 v8, 0x0

    :cond_15
    :goto_a
    const/4 v6, 0x0

    :cond_16
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LI2/u;

    invoke-virtual {v7}, LI2/u;->c()LQ2/p;

    move-result-object v10

    if-eqz v8, :cond_19

    if-nez v11, :cond_19

    if-eqz v13, :cond_17

    sget-object v14, LI2/s;->F:LI2/s;

    :goto_c
    iput-object v14, v10, LQ2/p;->b:LI2/s;

    goto :goto_d

    :cond_17
    if-eqz v12, :cond_18

    sget-object v14, LI2/s;->H:LI2/s;

    goto :goto_c

    :cond_18
    sget-object v14, LI2/s;->G:LI2/s;

    goto :goto_c

    :cond_19
    invoke-virtual {v10}, LQ2/p;->d()Z

    move-result v14

    if-nez v14, :cond_1a

    iput-wide v3, v10, LQ2/p;->n:J

    goto :goto_d

    :cond_1a
    const-wide/16 v14, 0x0

    iput-wide v14, v10, LQ2/p;->n:J

    :goto_d
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x19

    if-gt v14, v15, :cond_1b

    invoke-static {v10}, LR2/b;->g(LQ2/p;)V

    :cond_1b
    iget-object v14, v10, LQ2/p;->b:LI2/s;

    sget-object v15, LI2/s;->C:LI2/s;

    if-ne v14, v15, :cond_1c

    const/4 v6, 0x1

    :cond_1c
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v14

    invoke-interface {v14, v10}, LQ2/q;->c(LQ2/p;)V

    if-eqz v8, :cond_1d

    array-length v10, v0

    const/4 v14, 0x0

    :goto_e
    if-ge v14, v10, :cond_1d

    aget-object v15, v0, v14

    move-object/from16 p0, v0

    new-instance v0, LQ2/a;

    move-object/from16 p1, v2

    invoke-virtual {v7}, LI2/u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v15}, LQ2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Q()LQ2/b;

    move-result-object v2

    invoke-interface {v2, v0}, LQ2/b;->b(LQ2/a;)V

    const/4 v0, 0x1

    add-int/2addr v14, v0

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto :goto_e

    :cond_1d
    move-object/from16 p0, v0

    move-object/from16 p1, v2

    const/4 v0, 0x1

    invoke-virtual {v7}, LI2/u;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Z()LQ2/t;

    move-result-object v14

    new-instance v15, LQ2/s;

    invoke-virtual {v7}, LI2/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v15, v10, v0}, LQ2/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v14, v15}, LQ2/t;->a(LQ2/s;)V

    const/4 v0, 0x1

    goto :goto_f

    :cond_1e
    if-eqz v9, :cond_1f

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->W()LQ2/k;

    move-result-object v0

    new-instance v2, LQ2/j;

    invoke-virtual {v7}, LI2/u;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v1, v7}, LQ2/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, LQ2/k;->a(LQ2/j;)V

    :cond_1f
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto/16 :goto_b

    :cond_20
    return v6
.end method

.method private static e(LJ2/g;)Z
    .locals 7

    .prologue
    invoke-virtual {p0}, LJ2/g;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ2/g;

    invoke-virtual {v3}, LJ2/g;->j()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, LR2/b;->e(LJ2/g;)Z

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v4

    sget-object v5, LR2/b;->E:Ljava/lang/String;

    const-string v6, ", "

    invoke-virtual {v3}, LJ2/g;->c()Ljava/util/List;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v1

    const-string v3, "Already enqueued work ids (%s)."

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v6, v1, [Ljava/lang/Throwable;

    invoke-virtual {v4, v5, v3, v6}, LI2/j;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    move v1, v2

    :cond_2
    invoke-static {p0}, LR2/b;->b(LJ2/g;)Z

    move-result p0

    or-int/2addr p0, v1

    return p0
.end method

.method private static g(LQ2/p;)V
    .locals 5

    .prologue
    iget-object v0, p0, LQ2/p;->j:LI2/b;

    iget-object v1, p0, LQ2/p;->c:Ljava/lang/String;

    const-class v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, LI2/b;->f()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, LI2/b;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Landroidx/work/b$a;

    invoke-direct {v0}, Landroidx/work/b$a;-><init>()V

    iget-object v3, p0, LQ2/p;->e:Landroidx/work/b;

    invoke-virtual {v0, v3}, Landroidx/work/b$a;->c(Landroidx/work/b;)Landroidx/work/b$a;

    move-result-object v3

    const-string v4, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    invoke-virtual {v3, v4, v1}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LQ2/p;->c:Ljava/lang/String;

    invoke-virtual {v0}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v0

    iput-object v0, p0, LQ2/p;->e:Landroidx/work/b;

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    iget-object v0, p0, LR2/b;->C:LJ2/g;

    invoke-virtual {v0}, LJ2/g;->g()LJ2/j;

    move-result-object v0

    invoke-virtual {v0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v1, p0, LR2/b;->C:LJ2/g;

    invoke-static {v1}, LR2/b;->e(LJ2/g;)Z

    move-result v1

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lo2/n;->n()V

    return v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lo2/n;->n()V

    throw v1
.end method

.method public d()LI2/m;
    .locals 1

    iget-object v0, p0, LR2/b;->D:LJ2/c;

    return-object v0
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, LR2/b;->C:LJ2/g;

    invoke-virtual {v0}, LJ2/g;->g()LJ2/j;

    move-result-object v0

    invoke-virtual {v0}, LJ2/j;->i()Landroidx/work/a;

    move-result-object v1

    invoke-virtual {v0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v2

    invoke-virtual {v0}, LJ2/j;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v2, v0}, LJ2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public run()V
    .locals 5

    .prologue
    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, LR2/b;->C:LJ2/g;

    invoke-virtual {v1}, LJ2/g;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, LR2/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LR2/b;->C:LJ2/g;

    invoke-virtual {v1}, LJ2/g;->g()LJ2/j;

    move-result-object v1

    invoke-virtual {v1}, LJ2/j;->h()Landroid/content/Context;

    move-result-object v1

    const-class v2, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    invoke-static {v1, v2, v0}, LR2/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    invoke-virtual {p0}, LR2/b;->f()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LR2/b;->D:LJ2/c;

    sget-object v1, LI2/m;->a:LI2/m$b$c;

    invoke-virtual {v0, v1}, LJ2/c;->a(LI2/m$b;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "WorkContinuation has cycles (%s)"

    iget-object v3, p0, LR2/b;->C:LJ2/g;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v1, p0, LR2/b;->D:LJ2/c;

    new-instance v2, LI2/m$b$a;

    invoke-direct {v2, v0}, LI2/m$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LJ2/c;->a(LI2/m$b;)V

    :goto_2
    return-void
.end method
