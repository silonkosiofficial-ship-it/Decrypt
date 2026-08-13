.class public final Lf4/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/c;


# instance fields
.field private final a:Lf4/q;

.field private final b:Lf4/p1;

.field private final c:Lf4/P;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;

.field private f:Z

.field private g:Z

.field private h:LL4/d;


# direct methods
.method public constructor <init>(Lf4/q;Lf4/p1;Lf4/P;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf4/c1;->d:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf4/c1;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf4/c1;->f:Z

    iput-boolean v0, p0, Lf4/c1;->g:Z

    new-instance v0, LL4/d$a;

    invoke-direct {v0}, LL4/d$a;-><init>()V

    invoke-virtual {v0}, LL4/d$a;->a()LL4/d;

    move-result-object v0

    iput-object v0, p0, Lf4/c1;->h:LL4/d;

    iput-object p1, p0, Lf4/c1;->a:Lf4/q;

    iput-object p2, p0, Lf4/c1;->b:Lf4/p1;

    iput-object p3, p0, Lf4/c1;->c:Lf4/P;

    return-void
.end method


# virtual methods
.method public final a()LL4/c$c;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lf4/c1;->g()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LL4/c$c;->C:LL4/c$c;

    return-object v0

    :cond_0
    iget-object v0, p0, Lf4/c1;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->b()LL4/c$c;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lf4/c1;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->j()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lf4/c1;->g()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf4/c1;->a:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->a()I

    move-result v0

    :goto_0
    if-eq v0, v1, :cond_2

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v1
.end method

.method public final c(Landroid/app/Activity;LL4/d;LL4/c$b;LL4/c$a;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/c1;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lf4/c1;->f:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p2, p0, Lf4/c1;->h:LL4/d;

    iget-object v0, p0, Lf4/c1;->b:Lf4/p1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf4/p1;->c(Landroid/app/Activity;LL4/d;LL4/c$b;LL4/c$a;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lf4/c1;->c:Lf4/P;

    invoke-virtual {v0}, Lf4/P;->f()Z

    move-result v0

    return v0
.end method

.method public final e(Landroid/app/Activity;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lf4/c1;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lf4/c1;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf4/c1;->f(Z)V

    iget-object v0, p0, Lf4/c1;->b:Lf4/p1;

    iget-object v1, p0, Lf4/c1;->h:LL4/d;

    new-instance v2, Lf4/a1;

    invoke-direct {v2, p0}, Lf4/a1;-><init>(Lf4/c1;)V

    new-instance v3, Lf4/b1;

    invoke-direct {v3, p0}, Lf4/b1;-><init>(Lf4/c1;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lf4/p1;->c(Landroid/app/Activity;LL4/d;LL4/c$b;LL4/c$a;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lf4/c1;->g()Z

    move-result p1

    invoke-virtual {p0}, Lf4/c1;->h()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retry request is not executed. consentInfoUpdateHasBeenCalled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", retryRequestIsInProgress="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UserMessagingPlatform"

    nop

    return-void
.end method

.method public final f(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, Lf4/c1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lf4/c1;->g:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/c1;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lf4/c1;->f:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lf4/c1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lf4/c1;->g:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
