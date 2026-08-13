.class Landroidx/work/impl/background/systemalarm/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:I

.field private final c:Landroidx/work/impl/background/systemalarm/e;

.field private final d:LM2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ConstraintsCmdHandler"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemalarm/c;->e:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;ILandroidx/work/impl/background/systemalarm/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/c;->a:Landroid/content/Context;

    iput p2, p0, Landroidx/work/impl/background/systemalarm/c;->b:I

    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/c;->c:Landroidx/work/impl/background/systemalarm/e;

    invoke-virtual {p3}, Landroidx/work/impl/background/systemalarm/e;->f()LS2/a;

    move-result-object p2

    new-instance p3, LM2/d;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, LM2/d;-><init>(Landroid/content/Context;LS2/a;LM2/c;)V

    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/c;->d:LM2/d;

    return-void
.end method


# virtual methods
.method a()V
    .locals 9

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/c;->c:Landroidx/work/impl/background/systemalarm/e;

    invoke-virtual {v1}, Landroidx/work/impl/background/systemalarm/e;->g()LJ2/j;

    move-result-object v1

    invoke-virtual {v1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v1

    invoke-interface {v1}, LQ2/q;->h()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/c;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Landroidx/work/impl/background/systemalarm/ConstraintProxy;->a(Landroid/content/Context;Ljava/util/List;)V

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/c;->d:LM2/d;

    invoke-virtual {v2, v1}, LM2/d;->d(Ljava/lang/Iterable;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LQ2/p;

    iget-object v6, v5, LQ2/p;->a:Ljava/lang/String;

    invoke-virtual {v5}, LQ2/p;->a()J

    move-result-wide v7

    cmp-long v7, v3, v7

    if-ltz v7, :cond_0

    invoke-virtual {v5}, LQ2/p;->b()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, p0, Landroidx/work/impl/background/systemalarm/c;->d:LM2/d;

    invoke-virtual {v7, v6}, LM2/d;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    :cond_1
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ2/p;

    iget-object v2, v2, LQ2/p;->a:Ljava/lang/String;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/c;->a:Landroid/content/Context;

    invoke-static {v3, v2}, Landroidx/work/impl/background/systemalarm/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v4

    sget-object v5, Landroidx/work/impl/background/systemalarm/c;->e:Ljava/lang/String;

    const-string v6, "Creating a delay_met command for workSpec with id (%s)"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v0

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v6, v0, [Ljava/lang/Throwable;

    invoke-virtual {v4, v5, v2, v6}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/c;->c:Landroidx/work/impl/background/systemalarm/e;

    new-instance v4, Landroidx/work/impl/background/systemalarm/e$b;

    iget v5, p0, Landroidx/work/impl/background/systemalarm/c;->b:I

    invoke-direct {v4, v2, v3, v5}, Landroidx/work/impl/background/systemalarm/e$b;-><init>(Landroidx/work/impl/background/systemalarm/e;Landroid/content/Intent;I)V

    invoke-virtual {v2, v4}, Landroidx/work/impl/background/systemalarm/e;->k(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/c;->d:LM2/d;

    invoke-virtual {v0}, LM2/d;->e()V

    return-void
.end method
