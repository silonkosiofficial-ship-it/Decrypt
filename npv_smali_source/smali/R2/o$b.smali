.class LR2/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/o;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/work/impl/utils/futures/c;

.field final synthetic D:LR2/o;


# direct methods
.method constructor <init>(LR2/o;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    iput-object p1, p0, LR2/o$b;->D:LR2/o;

    iput-object p2, p0, LR2/o$b;->C:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, LR2/o$b;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v2}, Landroidx/work/impl/utils/futures/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI2/e;

    if-eqz v2, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LR2/o;->I:Ljava/lang/String;

    const-string v5, "Updating notification for %s"

    iget-object v6, p0, LR2/o$b;->D:LR2/o;

    iget-object v6, v6, LR2/o;->E:LQ2/p;

    iget-object v6, v6, LQ2/p;->c:Ljava/lang/String;

    new-array v7, v1, [Ljava/lang/Object;

    aput-object v6, v7, v0

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LR2/o$b;->D:LR2/o;

    iget-object v0, v0, LR2/o;->F:Landroidx/work/ListenableWorker;

    invoke-virtual {v0, v1}, Landroidx/work/ListenableWorker;->setRunInForeground(Z)V

    iget-object v0, p0, LR2/o$b;->D:LR2/o;

    iget-object v1, v0, LR2/o;->C:Landroidx/work/impl/utils/futures/c;

    iget-object v3, v0, LR2/o;->G:LI2/f;

    iget-object v4, v0, LR2/o;->D:Landroid/content/Context;

    iget-object v0, v0, LR2/o;->F:Landroidx/work/ListenableWorker;

    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {v3, v4, v0, v2}, LI2/f;->a(Landroid/content/Context;Ljava/util/UUID;LI2/e;)LP4/d;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->s(LP4/d;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    const-string v2, "Worker was marked important (%s) but did not provide ForegroundInfo"

    iget-object v3, p0, LR2/o$b;->D:LR2/o;

    iget-object v3, v3, LR2/o;->E:LQ2/p;

    iget-object v3, v3, LQ2/p;->c:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, LR2/o$b;->D:LR2/o;

    iget-object v1, v1, LR2/o;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->r(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
