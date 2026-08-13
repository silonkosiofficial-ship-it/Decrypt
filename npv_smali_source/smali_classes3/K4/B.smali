.class final LK4/B;
.super LK4/y;
.source "SourceFile"


# instance fields
.field final synthetic D:Ll4/m;

.field final synthetic E:LK4/y;

.field final synthetic F:LK4/d;


# direct methods
.method constructor <init>(LK4/d;Ll4/m;Ll4/m;LK4/y;)V
    .locals 0

    iput-object p1, p0, LK4/B;->F:LK4/d;

    iput-object p3, p0, LK4/B;->D:Ll4/m;

    iput-object p4, p0, LK4/B;->E:LK4/y;

    invoke-direct {p0, p2}, LK4/y;-><init>(Ll4/m;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .prologue
    iget-object v0, p0, LK4/B;->F:LK4/d;

    invoke-static {v0}, LK4/d;->h(LK4/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LK4/B;->F:LK4/d;

    iget-object v2, p0, LK4/B;->D:Ll4/m;

    invoke-static {v1, v2}, LK4/d;->o(LK4/d;Ll4/m;)V

    iget-object v1, p0, LK4/B;->F:LK4/d;

    invoke-static {v1}, LK4/d;->j(LK4/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, LK4/B;->F:LK4/d;

    invoke-static {v1}, LK4/d;->f(LK4/d;)LK4/x;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, LK4/x;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, LK4/B;->F:LK4/d;

    iget-object v2, p0, LK4/B;->E:LK4/y;

    invoke-static {v1, v2}, LK4/d;->q(LK4/d;LK4/y;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
