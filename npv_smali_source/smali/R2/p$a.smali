.class LR2/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/p;->a(Landroid/content/Context;Ljava/util/UUID;LI2/e;)LP4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/work/impl/utils/futures/c;

.field final synthetic D:Ljava/util/UUID;

.field final synthetic E:LI2/e;

.field final synthetic F:Landroid/content/Context;

.field final synthetic G:LR2/p;


# direct methods
.method constructor <init>(LR2/p;Landroidx/work/impl/utils/futures/c;Ljava/util/UUID;LI2/e;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LR2/p$a;->G:LR2/p;

    iput-object p2, p0, LR2/p$a;->C:Landroidx/work/impl/utils/futures/c;

    iput-object p3, p0, LR2/p$a;->D:Ljava/util/UUID;

    iput-object p4, p0, LR2/p$a;->E:LI2/e;

    iput-object p5, p0, LR2/p$a;->F:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LR2/p$a;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LR2/p$a;->D:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LR2/p$a;->G:LR2/p;

    iget-object v1, v1, LR2/p;->c:LQ2/q;

    invoke-interface {v1, v0}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LI2/s;->e()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LR2/p$a;->G:LR2/p;

    iget-object v1, v1, LR2/p;->b:LP2/a;

    iget-object v2, p0, LR2/p$a;->E:LI2/e;

    invoke-interface {v1, v0, v2}, LP2/a;->a(Ljava/lang/String;LI2/e;)V

    iget-object v1, p0, LR2/p$a;->F:Landroid/content/Context;

    iget-object v2, p0, LR2/p$a;->E:LI2/e;

    invoke-static {v1, v0, v2}, Landroidx/work/impl/foreground/a;->a(Landroid/content/Context;Ljava/lang/String;LI2/e;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, LR2/p$a;->F:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LR2/p$a;->C:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, LR2/p$a;->C:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/c;->r(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method
