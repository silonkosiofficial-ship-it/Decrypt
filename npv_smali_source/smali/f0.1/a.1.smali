.class public final Lf0/a;
.super Lf0/c;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILf0/n;)V
    .locals 3

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->h()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->I0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/l;

    if-nez v2, :cond_0

    new-instance v2, Lf0/a$a;

    invoke-direct {v2, v1}, Lf0/a$a;-><init>(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v2}, Lf0/c;-><init>(ILf0/n;Lx7/l;Lx7/l;)V

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public C()Lf0/l;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Q(Lx7/l;Lx7/l;)Lf0/c;
    .locals 1

    new-instance v0, Lf0/a$b;

    invoke-direct {v0, p1, p2}, Lf0/a$b;-><init>(Lx7/l;Lx7/l;)V

    invoke-static {v0}, Lf0/p;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    check-cast p1, Lf0/c;

    return-object p1
.end method

.method public T(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public U(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public d()V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/k;->q()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public bridge synthetic m(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/a;->T(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/a;->U(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 0

    invoke-static {}, Lf0/p;->b()V

    return-void
.end method

.method public x(Lx7/l;)Lf0/k;
    .locals 1

    new-instance v0, Lf0/a$c;

    invoke-direct {v0, p1}, Lf0/a$c;-><init>(Lx7/l;)V

    invoke-static {v0}, Lf0/p;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    return-object p1
.end method
