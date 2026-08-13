.class public abstract LW8/k0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LW8/f0;
.implements Lb9/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public C:J

.field private D:I

.field private volatile _heap:Ljava/lang/Object;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LW8/k0$c;->C:J

    const/4 p1, -0x1

    iput p1, p0, LW8/k0$c;->D:I

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LW8/k0$c;

    invoke-virtual {p0, p1}, LW8/k0$c;->n(LW8/k0$c;)I

    move-result p1

    return p1
.end method

.method public final e()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LW8/n0;->b()Lb9/D;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    instance-of v1, v0, LW8/k0$d;

    if-eqz v1, :cond_1

    check-cast v0, LW8/k0$d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lb9/O;->h(Lb9/P;)Z

    :cond_2
    invoke-static {}, LW8/n0;->b()Lb9/D;

    move-result-object v0

    iput-object v0, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LW8/k0$c;->D:I

    return v0
.end method

.method public i()Lb9/O;
    .locals 2

    .prologue
    iget-object v0, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    instance-of v1, v0, Lb9/O;

    if-eqz v1, :cond_0

    check-cast v0, Lb9/O;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public m(Lb9/O;)V
    .locals 2

    .prologue
    iget-object v0, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LW8/n0;->b()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iput-object p1, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(LW8/k0$c;)I
    .locals 4

    .prologue
    iget-wide v0, p0, LW8/k0$c;->C:J

    iget-wide v2, p1, LW8/k0$c;->C:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final o(JLW8/k0$d;LW8/k0;)I
    .locals 7

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LW8/k0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LW8/n0;->b()Lb9/D;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    monitor-exit p0

    const/4 p1, 0x2

    return p1

    :cond_0
    :try_start_1
    monitor-enter p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p3}, Lb9/O;->b()Lb9/P;

    move-result-object v0

    check-cast v0, LW8/k0$c;

    invoke-static {p4}, LW8/k0;->O1(LW8/k0;)Z

    move-result p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p4, :cond_1

    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    const-wide/16 v1, 0x0

    if-nez v0, :cond_2

    :goto_0
    :try_start_4
    iput-wide p1, p3, LW8/k0$d;->c:J

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    iget-wide v3, v0, LW8/k0$c;->C:J

    sub-long v5, v3, p1

    cmp-long p4, v5, v1

    if-ltz p4, :cond_3

    goto :goto_1

    :cond_3
    move-wide p1, v3

    :goto_1
    iget-wide v3, p3, LW8/k0$d;->c:J

    sub-long v3, p1, v3

    cmp-long p4, v3, v1

    if-lez p4, :cond_4

    goto :goto_0

    :cond_4
    :goto_2
    iget-wide p1, p0, LW8/k0$c;->C:J

    iget-wide v3, p3, LW8/k0$d;->c:J

    sub-long/2addr p1, v3

    cmp-long p1, p1, v1

    if-gez p1, :cond_5

    iput-wide v3, p0, LW8/k0$c;->C:J

    :cond_5
    invoke-virtual {p3, p0}, Lb9/O;->a(Lb9/P;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_3
    :try_start_6
    monitor-exit p3

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_4
    monitor-exit p0

    throw p1
.end method

.method public final q(J)Z
    .locals 2

    .prologue
    iget-wide v0, p0, LW8/k0$c;->C:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setIndex(I)V
    .locals 0

    iput p1, p0, LW8/k0$c;->D:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delayed[nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW8/k0$c;->C:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
