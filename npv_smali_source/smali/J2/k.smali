.class public LJ2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/k$c;
    }
.end annotation


# static fields
.field static final V:Ljava/lang/String;


# instance fields
.field C:Landroid/content/Context;

.field private D:Ljava/lang/String;

.field private E:Ljava/util/List;

.field private F:Landroidx/work/WorkerParameters$a;

.field G:LQ2/p;

.field H:Landroidx/work/ListenableWorker;

.field I:LS2/a;

.field J:Landroidx/work/ListenableWorker$a;

.field private K:Landroidx/work/a;

.field private L:LP2/a;

.field private M:Landroidx/work/impl/WorkDatabase;

.field private N:LQ2/q;

.field private O:LQ2/b;

.field private P:LQ2/t;

.field private Q:Ljava/util/List;

.field private R:Ljava/lang/String;

.field S:Landroidx/work/impl/utils/futures/c;

.field T:LP4/d;

.field private volatile U:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LJ2/k;->V:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(LJ2/k$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/ListenableWorker$a;->a()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    iput-object v0, p0, LJ2/k;->J:Landroidx/work/ListenableWorker$a;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, LJ2/k;->S:Landroidx/work/impl/utils/futures/c;

    const/4 v0, 0x0

    iput-object v0, p0, LJ2/k;->T:LP4/d;

    iget-object v0, p1, LJ2/k$c;->a:Landroid/content/Context;

    iput-object v0, p0, LJ2/k;->C:Landroid/content/Context;

    iget-object v0, p1, LJ2/k$c;->d:LS2/a;

    iput-object v0, p0, LJ2/k;->I:LS2/a;

    iget-object v0, p1, LJ2/k$c;->c:LP2/a;

    iput-object v0, p0, LJ2/k;->L:LP2/a;

    iget-object v0, p1, LJ2/k$c;->g:Ljava/lang/String;

    iput-object v0, p0, LJ2/k;->D:Ljava/lang/String;

    iget-object v0, p1, LJ2/k$c;->h:Ljava/util/List;

    iput-object v0, p0, LJ2/k;->E:Ljava/util/List;

    iget-object v0, p1, LJ2/k$c;->i:Landroidx/work/WorkerParameters$a;

    iput-object v0, p0, LJ2/k;->F:Landroidx/work/WorkerParameters$a;

    iget-object v0, p1, LJ2/k$c;->b:Landroidx/work/ListenableWorker;

    iput-object v0, p0, LJ2/k;->H:Landroidx/work/ListenableWorker;

    iget-object v0, p1, LJ2/k$c;->e:Landroidx/work/a;

    iput-object v0, p0, LJ2/k;->K:Landroidx/work/a;

    iget-object p1, p1, LJ2/k$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object p1

    iput-object p1, p0, LJ2/k;->N:LQ2/q;

    iget-object p1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Q()LQ2/b;

    move-result-object p1

    iput-object p1, p0, LJ2/k;->O:LQ2/b;

    iget-object p1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Z()LQ2/t;

    move-result-object p1

    iput-object p1, p0, LJ2/k;->P:LQ2/t;

    return-void
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Work [ id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tags={ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, " } ]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private c(Landroidx/work/ListenableWorker$a;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    instance-of v1, p1, Landroidx/work/ListenableWorker$a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v1, LJ2/k;->V:Ljava/lang/String;

    iget-object v3, p0, LJ2/k;->R:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v3, v0, v2

    const-string v3, "Worker result SUCCESS for %s"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v1, v0, v2}, LI2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, LJ2/k;->G:LQ2/p;

    invoke-virtual {p1}, LQ2/p;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-direct {p0}, LJ2/k;->h()V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, LJ2/k;->m()V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Landroidx/work/ListenableWorker$a$b;

    if-eqz p1, :cond_2

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v1, LJ2/k;->V:Ljava/lang/String;

    iget-object v3, p0, LJ2/k;->R:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v3, v0, v2

    const-string v3, "Worker result RETRY for %s"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v1, v0, v2}, LI2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-direct {p0}, LJ2/k;->g()V

    goto :goto_1

    :cond_2
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v1, LJ2/k;->V:Ljava/lang/String;

    iget-object v3, p0, LJ2/k;->R:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v3, v0, v2

    const-string v3, "Worker result FAILURE for %s"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v1, v0, v2}, LI2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, LJ2/k;->G:LQ2/p;

    invoke-virtual {p1}, LQ2/p;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LJ2/k;->l()V

    :goto_1
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .prologue
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    invoke-interface {v1, p1}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v1

    sget-object v2, LI2/s;->H:LI2/s;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    sget-object v2, LI2/s;->F:LI2/s;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, LJ2/k;->O:LQ2/b;

    invoke-interface {v1, p1}, LQ2/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private g()V
    .locals 5

    .prologue
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    sget-object v2, LI2/s;->C:LI2/s;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, LQ2/q;->s(Ljava/lang/String;J)V

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, LQ2/q;->d(Ljava/lang/String;J)I

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    throw v1
.end method

.method private h()V
    .locals 5

    .prologue
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, LQ2/q;->s(Ljava/lang/String;J)V

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    sget-object v2, LI2/s;->C:LI2/s;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v1, v2}, LQ2/q;->o(Ljava/lang/String;)I

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, LQ2/q;->d(Ljava/lang/String;J)I

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    throw v1
.end method

.method private i(Z)V
    .locals 4

    .prologue
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v0

    invoke-interface {v0}, LQ2/q;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LJ2/k;->C:Landroid/content/Context;

    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LR2/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    sget-object v1, LI2/s;->C:LI2/s;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, LQ2/q;->d(Ljava/lang/String;J)I

    :cond_1
    iget-object v0, p0, LJ2/k;->G:LQ2/p;

    if-eqz v0, :cond_2

    iget-object v0, p0, LJ2/k;->H:Landroidx/work/ListenableWorker;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isRunInForeground()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LJ2/k;->L:LP2/a;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v0, v1}, LP2/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    iget-object v0, p0, LJ2/k;->S:Landroidx/work/impl/utils/futures/c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z

    return-void

    :goto_1
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    throw p1
.end method

.method private j()V
    .locals 7

    .prologue
    const/4 v0, 0x1

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v1, v2}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v1

    sget-object v2, LI2/s;->D:LI2/s;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v2, LJ2/k;->V:Ljava/lang/String;

    iget-object v4, p0, LJ2/k;->D:Ljava/lang/String;

    new-array v5, v0, [Ljava/lang/Object;

    aput-object v4, v5, v3

    const-string v4, "Status for %s is RUNNING;not doing any work and rescheduling for later execution"

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v4, v3}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v4, LJ2/k;->V:Ljava/lang/String;

    iget-object v5, p0, LJ2/k;->D:Ljava/lang/String;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v3

    aput-object v1, v6, v0

    const-string v0, "Status for %s is %s; not doing any work"

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Throwable;

    invoke-virtual {v2, v4, v0, v1}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-direct {p0, v3}, LJ2/k;->i(Z)V

    :goto_0
    return-void
.end method

.method private k()V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-direct/range {p0 .. p0}, LJ2/k;->n()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    iget-object v3, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lo2/n;->g()V

    :try_start_0
    iget-object v3, v1, LJ2/k;->N:LQ2/q;

    iget-object v4, v1, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v3, v4}, LQ2/q;->n(Ljava/lang/String;)LQ2/p;

    move-result-object v3

    iput-object v3, v1, LJ2/k;->G:LQ2/p;

    if-nez v3, :cond_1

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/k;->V:Ljava/lang/String;

    const-string v5, "Didn\'t find WorkSpec for id %s"

    iget-object v6, v1, LJ2/k;->D:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v6, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v5, v2, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v0, v5}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, LJ2/k;->i(Z)V

    iget-object v0, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    :try_start_1
    iget-object v4, v3, LQ2/p;->b:LI2/s;

    sget-object v5, LI2/s;->C:LI2/s;

    if-eq v4, v5, :cond_2

    invoke-direct/range {p0 .. p0}, LJ2/k;->j()V

    iget-object v3, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lo2/n;->N()V

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/k;->V:Ljava/lang/String;

    const-string v5, "%s is not in ENQUEUED state. Nothing more to do."

    iget-object v6, v1, LJ2/k;->G:LQ2/p;

    iget-object v6, v6, LQ2/p;->c:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v6, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v0, v2}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {v3}, LQ2/p;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v1, LJ2/k;->G:LQ2/p;

    invoke-virtual {v3}, LQ2/p;->c()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, v1, LJ2/k;->G:LQ2/p;

    iget-wide v6, v5, LQ2/p;->n:J

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v5}, LQ2/p;->a()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gez v3, :cond_5

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/k;->V:Ljava/lang/String;

    const-string v5, "Delaying execution for %s because it is being executed before schedule."

    iget-object v6, v1, LJ2/k;->G:LQ2/p;

    iget-object v6, v6, LQ2/p;->c:Ljava/lang/String;

    new-array v7, v0, [Ljava/lang/Object;

    aput-object v6, v7, v2

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5, v2}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-direct {v1, v0}, LJ2/k;->i(Z)V

    iget-object v0, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    return-void

    :cond_5
    :goto_0
    :try_start_3
    iget-object v3, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lo2/n;->N()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v3, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lo2/n;->n()V

    iget-object v3, v1, LJ2/k;->G:LQ2/p;

    invoke-virtual {v3}, LQ2/p;->d()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v1, LJ2/k;->G:LQ2/p;

    iget-object v3, v3, LQ2/p;->e:Landroidx/work/b;

    :goto_1
    move-object v6, v3

    goto :goto_2

    :cond_6
    iget-object v3, v1, LJ2/k;->K:Landroidx/work/a;

    invoke-virtual {v3}, Landroidx/work/a;->f()LI2/i;

    move-result-object v3

    iget-object v4, v1, LJ2/k;->G:LQ2/p;

    iget-object v4, v4, LQ2/p;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, LI2/i;->b(Ljava/lang/String;)LI2/h;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/k;->V:Ljava/lang/String;

    iget-object v5, v1, LJ2/k;->G:LQ2/p;

    iget-object v5, v5, LQ2/p;->d:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v5, v0, v2

    const-string v5, "Could not create Input Merger %s"

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v0, v2}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, LJ2/k;->l()V

    return-void

    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v1, LJ2/k;->G:LQ2/p;

    iget-object v5, v5, LQ2/p;->e:Landroidx/work/b;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, v1, LJ2/k;->N:LQ2/q;

    iget-object v6, v1, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v5, v6}, LQ2/q;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3, v4}, LI2/h;->b(Ljava/util/List;)Landroidx/work/b;

    move-result-object v3

    goto :goto_1

    :goto_2
    new-instance v3, Landroidx/work/WorkerParameters;

    iget-object v4, v1, LJ2/k;->D:Ljava/lang/String;

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    iget-object v7, v1, LJ2/k;->Q:Ljava/util/List;

    iget-object v8, v1, LJ2/k;->F:Landroidx/work/WorkerParameters$a;

    iget-object v4, v1, LJ2/k;->G:LQ2/p;

    iget v9, v4, LQ2/p;->k:I

    iget-object v4, v1, LJ2/k;->K:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->e()Ljava/util/concurrent/Executor;

    move-result-object v10

    iget-object v11, v1, LJ2/k;->I:LS2/a;

    iget-object v4, v1, LJ2/k;->K:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->m()LI2/v;

    move-result-object v12

    new-instance v13, LR2/q;

    iget-object v4, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    iget-object v14, v1, LJ2/k;->I:LS2/a;

    invoke-direct {v13, v4, v14}, LR2/q;-><init>(Landroidx/work/impl/WorkDatabase;LS2/a;)V

    new-instance v14, LR2/p;

    iget-object v4, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    iget-object v15, v1, LJ2/k;->L:LP2/a;

    iget-object v2, v1, LJ2/k;->I:LS2/a;

    invoke-direct {v14, v4, v15, v2}, LR2/p;-><init>(Landroidx/work/impl/WorkDatabase;LP2/a;LS2/a;)V

    move-object v4, v3

    invoke-direct/range {v4 .. v14}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection;Landroidx/work/WorkerParameters$a;ILjava/util/concurrent/Executor;LS2/a;LI2/v;LI2/o;LI2/f;)V

    iget-object v2, v1, LJ2/k;->H:Landroidx/work/ListenableWorker;

    if-nez v2, :cond_8

    iget-object v2, v1, LJ2/k;->K:Landroidx/work/a;

    invoke-virtual {v2}, Landroidx/work/a;->m()LI2/v;

    move-result-object v2

    iget-object v4, v1, LJ2/k;->C:Landroid/content/Context;

    iget-object v5, v1, LJ2/k;->G:LQ2/p;

    iget-object v5, v5, LQ2/p;->c:Ljava/lang/String;

    invoke-virtual {v2, v4, v5, v3}, LI2/v;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    move-result-object v2

    iput-object v2, v1, LJ2/k;->H:Landroidx/work/ListenableWorker;

    :cond_8
    iget-object v2, v1, LJ2/k;->H:Landroidx/work/ListenableWorker;

    if-nez v2, :cond_9

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/k;->V:Ljava/lang/String;

    iget-object v4, v1, LJ2/k;->G:LQ2/p;

    iget-object v4, v4, LQ2/p;->c:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    const-string v4, "Could not create Worker %s"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v0, v4}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, LJ2/k;->l()V

    return-void

    :cond_9
    const/4 v5, 0x0

    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->isUsed()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/k;->V:Ljava/lang/String;

    iget-object v4, v1, LJ2/k;->G:LQ2/p;

    iget-object v4, v4, LQ2/p;->c:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v4, v0, v5

    const-string v4, "Received an already-used Worker %s; WorkerFactory should return new instances"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v0, v4}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, LJ2/k;->l()V

    return-void

    :cond_a
    iget-object v0, v1, LJ2/k;->H:Landroidx/work/ListenableWorker;

    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->setUsed()V

    invoke-direct/range {p0 .. p0}, LJ2/k;->o()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-direct/range {p0 .. p0}, LJ2/k;->n()Z

    move-result v0

    if-eqz v0, :cond_b

    return-void

    :cond_b
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    new-instance v2, LR2/o;

    iget-object v5, v1, LJ2/k;->C:Landroid/content/Context;

    iget-object v6, v1, LJ2/k;->G:LQ2/p;

    iget-object v7, v1, LJ2/k;->H:Landroidx/work/ListenableWorker;

    invoke-virtual {v3}, Landroidx/work/WorkerParameters;->b()LI2/f;

    move-result-object v8

    iget-object v9, v1, LJ2/k;->I:LS2/a;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, LR2/o;-><init>(Landroid/content/Context;LQ2/p;Landroidx/work/ListenableWorker;LI2/f;LS2/a;)V

    iget-object v3, v1, LJ2/k;->I:LS2/a;

    invoke-interface {v3}, LS2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, LR2/o;->a()LP4/d;

    move-result-object v2

    new-instance v3, LJ2/k$a;

    invoke-direct {v3, v1, v2, v0}, LJ2/k$a;-><init>(LJ2/k;LP4/d;Landroidx/work/impl/utils/futures/c;)V

    iget-object v4, v1, LJ2/k;->I:LS2/a;

    invoke-interface {v4}, LS2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v2, v1, LJ2/k;->R:Ljava/lang/String;

    new-instance v3, LJ2/k$b;

    invoke-direct {v3, v1, v0, v2}, LJ2/k$b;-><init>(LJ2/k;Landroidx/work/impl/utils/futures/c;Ljava/lang/String;)V

    iget-object v2, v1, LJ2/k;->I:LS2/a;

    invoke-interface {v2}, LS2/a;->c()LR2/k;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroidx/work/impl/utils/futures/a;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_c
    invoke-direct/range {p0 .. p0}, LJ2/k;->j()V

    :goto_3
    return-void

    :goto_4
    iget-object v2, v1, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo2/n;->n()V

    throw v0
.end method

.method private m()V
    .locals 9

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->g()V

    :try_start_0
    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    sget-object v2, LI2/s;->E:LI2/s;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v1, p0, LJ2/k;->J:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$c;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$c;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, LJ2/k;->N:LQ2/q;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, LQ2/q;->i(Ljava/lang/String;Landroidx/work/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, LJ2/k;->O:LQ2/b;

    iget-object v4, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v3, v4}, LQ2/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, LJ2/k;->N:LQ2/q;

    invoke-interface {v5, v4}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v5

    sget-object v6, LI2/s;->G:LI2/s;

    if-ne v5, v6, :cond_0

    iget-object v5, p0, LJ2/k;->O:LQ2/b;

    invoke-interface {v5, v4}, LQ2/b;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v5

    sget-object v6, LJ2/k;->V:Ljava/lang/String;

    const-string v7, "Setting status to enqueued for %s"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v4, v8, v0

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v0, [Ljava/lang/Throwable;

    invoke-virtual {v5, v6, v7, v8}, LI2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v5, p0, LJ2/k;->N:LQ2/q;

    sget-object v6, LI2/s;->C:LI2/s;

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v5, p0, LJ2/k;->N:LQ2/q;

    invoke-interface {v5, v4, v1, v2}, LQ2/q;->s(Ljava/lang/String;J)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    return-void

    :goto_1
    iget-object v2, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    throw v1
.end method

.method private n()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    iget-boolean v1, p0, LJ2/k;->U:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v3, LJ2/k;->V:Ljava/lang/String;

    iget-object v4, p0, LJ2/k;->R:Ljava/lang/String;

    new-array v5, v0, [Ljava/lang/Object;

    aput-object v4, v5, v2

    const-string v4, "Work interrupted for %s"

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Throwable;

    invoke-virtual {v1, v3, v4, v5}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, LJ2/k;->N:LQ2/q;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v1, v3}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0, v2}, LJ2/k;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LI2/s;->e()Z

    move-result v1

    xor-int/2addr v1, v0

    invoke-direct {p0, v1}, LJ2/k;->i(Z)V

    :goto_0
    return v0

    :cond_1
    return v2
.end method

.method private o()Z
    .locals 3

    .prologue
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v0, v1}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v0

    sget-object v1, LI2/s;->C:LI2/s;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    sget-object v1, LI2/s;->D:LI2/s;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v0, v1}, LQ2/q;->r(Ljava/lang/String;)I

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    return v0

    :goto_1
    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    throw v0
.end method


# virtual methods
.method public b()LP4/d;
    .locals 1

    iget-object v0, p0, LJ2/k;->S:Landroidx/work/impl/utils/futures/c;

    return-object v0
.end method

.method public d()V
    .locals 4

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LJ2/k;->U:Z

    invoke-direct {p0}, LJ2/k;->n()Z

    iget-object v1, p0, LJ2/k;->T:LP4/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    iget-object v3, p0, LJ2/k;->T:LP4/d;

    invoke-interface {v3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v3, p0, LJ2/k;->H:Landroidx/work/ListenableWorker;

    if-eqz v3, :cond_1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->stop()V

    goto :goto_1

    :cond_1
    iget-object v1, p0, LJ2/k;->G:LQ2/p;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v2

    const-string v1, "WorkSpec %s is already done. Not interrupting."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v3, LJ2/k;->V:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v1, v3, v0, v2}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method f()V
    .locals 3

    .prologue
    invoke-direct {p0}, LJ2/k;->n()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LJ2/k;->N:LQ2/q;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v0, v1}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->X()LQ2/n;

    move-result-object v1

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v1, v2}, LQ2/n;->a(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v1, LI2/s;->D:LI2/s;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LJ2/k;->J:Landroidx/work/ListenableWorker$a;

    invoke-direct {p0, v0}, LJ2/k;->c(Landroidx/work/ListenableWorker$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LI2/s;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, LJ2/k;->g()V

    :cond_2
    :goto_0
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    goto :goto_2

    :goto_1
    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    throw v0

    :cond_3
    :goto_2
    iget-object v0, p0, LJ2/k;->E:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ2/e;

    iget-object v2, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v1, v2}, LJ2/e;->d(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, LJ2/k;->K:Landroidx/work/a;

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, LJ2/k;->E:Ljava/util/List;

    invoke-static {v0, v1, v2}, LJ2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method l()V
    .locals 4

    .prologue
    iget-object v0, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-direct {p0, v1}, LJ2/k;->e(Ljava/lang/String;)V

    iget-object v1, p0, LJ2/k;->J:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$a;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$a;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, LJ2/k;->N:LQ2/q;

    iget-object v3, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, LQ2/q;->i(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LJ2/k;->M:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo2/n;->n()V

    invoke-direct {p0, v0}, LJ2/k;->i(Z)V

    throw v1
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, LJ2/k;->P:LQ2/t;

    iget-object v1, p0, LJ2/k;->D:Ljava/lang/String;

    invoke-interface {v0, v1}, LQ2/t;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LJ2/k;->Q:Ljava/util/List;

    invoke-direct {p0, v0}, LJ2/k;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ2/k;->R:Ljava/lang/String;

    invoke-direct {p0}, LJ2/k;->k()V

    return-void
.end method
