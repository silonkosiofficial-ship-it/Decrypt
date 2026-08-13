.class public final Lp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lx7/a;

.field private final b:LV8/c;

.field private final c:LV8/a;


# direct methods
.method public constructor <init>(Lx7/a;)V
    .locals 1

    const-string v0, "closeAction"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/a;->a:Lx7/a;

    const/4 p1, 0x0

    invoke-static {p1}, LV8/b;->c(I)LV8/c;

    move-result-object v0

    iput-object v0, p0, Lp2/a;->b:LV8/c;

    invoke-static {p1}, LV8/b;->a(Z)LV8/a;

    move-result-object p1

    iput-object p1, p0, Lp2/a;->c:LV8/a;

    return-void
.end method

.method private final b()Z
    .locals 1

    iget-object v0, p0, Lp2/a;->c:LV8/a;

    invoke-virtual {v0}, LV8/a;->c()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lp2/a;->b()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lp2/a;->b:LV8/c;

    invoke-virtual {v0}, LV8/c;->d()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp2/a;->b:LV8/c;

    invoke-virtual {v0}, LV8/c;->b()I

    iget-object v0, p0, Lp2/a;->b:LV8/c;

    invoke-virtual {v0}, LV8/c;->c()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v0, "Unbalanced call to unblock() detected."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method
