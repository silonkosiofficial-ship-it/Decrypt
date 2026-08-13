.class LR2/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/q;->a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)LP4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/util/UUID;

.field final synthetic D:Landroidx/work/b;

.field final synthetic E:Landroidx/work/impl/utils/futures/c;

.field final synthetic F:LR2/q;


# direct methods
.method constructor <init>(LR2/q;Ljava/util/UUID;Landroidx/work/b;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    iput-object p1, p0, LR2/q$a;->F:LR2/q;

    iput-object p2, p0, LR2/q$a;->C:Ljava/util/UUID;

    iput-object p3, p0, LR2/q$a;->D:Landroidx/work/b;

    iput-object p4, p0, LR2/q$a;->E:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    iget-object v0, p0, LR2/q$a;->C:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v2, LR2/q;->c:Ljava/lang/String;

    iget-object v3, p0, LR2/q$a;->C:Ljava/util/UUID;

    iget-object v4, p0, LR2/q$a;->D:Landroidx/work/b;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v4, v5, v3

    const-string v4, "Updating progress for %s (%s)"

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v6, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v4, v5}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, LR2/q$a;->F:LR2/q;

    iget-object v1, v1, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->g()V

    :try_start_0
    iget-object v1, p0, LR2/q$a;->F:LR2/q;

    iget-object v1, v1, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v1

    invoke-interface {v1, v0}, LQ2/q;->n(Ljava/lang/String;)LQ2/p;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, LQ2/p;->b:LI2/s;

    sget-object v4, LI2/s;->D:LI2/s;

    if-ne v1, v4, :cond_0

    new-instance v1, LQ2/m;

    iget-object v2, p0, LR2/q$a;->D:Landroidx/work/b;

    invoke-direct {v1, v0, v2}, LQ2/m;-><init>(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v0, p0, LR2/q$a;->F:LR2/q;

    iget-object v0, v0, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->X()LQ2/n;

    move-result-object v0

    invoke-interface {v0, v1}, LQ2/n;->b(LQ2/m;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    const-string v4, "Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state."

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v0, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v4, v6, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v0, v4}, LI2/j;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, LR2/q$a;->E:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z

    iget-object v0, p0, LR2/q$a;->F:LR2/q;

    iget-object v0, v0, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v0, p0, LR2/q$a;->F:LR2/q;

    iget-object v0, v0, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    goto :goto_3

    :cond_1
    :try_start_1
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    :try_start_2
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v1

    sget-object v2, LR2/q;->c:Ljava/lang/String;

    const-string v4, "Error updating Worker progress"

    new-array v3, v3, [Ljava/lang/Throwable;

    aput-object v0, v3, v6

    invoke-virtual {v1, v2, v4, v3}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, LR2/q$a;->E:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->r(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :goto_3
    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, LR2/q$a;->F:LR2/q;

    iget-object v1, v1, LR2/q;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo2/n;->n()V

    throw v0
.end method
