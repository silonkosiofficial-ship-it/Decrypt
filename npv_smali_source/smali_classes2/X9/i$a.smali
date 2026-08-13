.class final LX9/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final C:LX9/i;

.field private D:J

.field private E:Z


# direct methods
.method public constructor <init>(LX9/i;J)V
    .locals 1

    const-string v0, "fileHandle"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/i$a;->C:LX9/i;

    iput-wide p2, p0, LX9/i$a;->D:J

    return-void
.end method


# virtual methods
.method public F0(LX9/d;J)V
    .locals 7

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/i$a;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, LX9/i$a;->C:LX9/i;

    iget-wide v2, p0, LX9/i$a;->D:J

    move-object v4, p1

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LX9/i;->o(LX9/i;JLX9/d;J)V

    iget-wide v0, p0, LX9/i$a;->D:J

    add-long/2addr v0, p2

    iput-wide v0, p0, LX9/i$a;->D:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LX9/i$a;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LX9/i$a;->E:Z

    iget-object v0, p0, LX9/i$a;->C:LX9/i;

    invoke-virtual {v0}, LX9/i;->r()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, LX9/i$a;->C:LX9/i;

    invoke-static {v1}, LX9/i;->f(LX9/i;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, LX9/i;->i(LX9/i;I)V

    iget-object v1, p0, LX9/i$a;->C:LX9/i;

    invoke-static {v1}, LX9/i;->f(LX9/i;)I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LX9/i$a;->C:LX9/i;

    invoke-static {v1}, LX9/i;->a(LX9/i;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v0, p0, LX9/i$a;->C:LX9/i;

    invoke-virtual {v0}, LX9/i;->s()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public flush()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LX9/i$a;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/i$a;->C:LX9/i;

    invoke-virtual {v0}, LX9/i;->y()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()LX9/a0;
    .locals 1

    sget-object v0, LX9/a0;->e:LX9/a0;

    return-object v0
.end method
