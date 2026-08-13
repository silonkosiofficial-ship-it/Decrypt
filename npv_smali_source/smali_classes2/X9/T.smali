.class public final LX9/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/f;


# instance fields
.field public final C:LX9/Z;

.field public final D:LX9/d;

.field public E:Z


# direct methods
.method public constructor <init>(LX9/Z;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/T;->C:LX9/Z;

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LX9/T;->D:LX9/d;

    return-void
.end method


# virtual methods
.method public A(J)LX9/g;
    .locals 1

    invoke-virtual {p0, p1, p2}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2}, LX9/d;->A(J)LX9/g;

    move-result-object p1

    return-object p1
.end method

.method public C0([B)V
    .locals 6

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->C0([B)V

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v2}, LX9/d;->d1()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v2}, LX9/d;->d1()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v2, p1, v1, v3}, LX9/d;->z0([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    throw v0
.end method

.method public G0(J)Z
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    iget-boolean v0, p0, LX9/T;->E:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v2

    cmp-long v0, v2, p1

    if-gez v0, :cond_1

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v2, p0, LX9/T;->D:LX9/d;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v1, 0x0

    :cond_1
    return v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public K()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->K()I

    move-result v0

    return v0
.end method

.method public N0()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, LX9/T;->f0(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public O()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public O0()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->O0()I

    move-result v0

    return v0
.end method

.method public Q0(LX9/d;J)V
    .locals 1

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p2, p3}, LX9/T;->q(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->Q0(LX9/d;J)V

    return-void

    :catch_0
    move-exception p2

    iget-object p3, p0, LX9/T;->D:LX9/d;

    invoke-virtual {p1, p3}, LX9/d;->c0(LX9/Z;)J

    throw p2
.end method

.method public T0(J)[B
    .locals 1

    invoke-virtual {p0, p1, p2}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2}, LX9/d;->T0(J)[B

    move-result-object p1

    return-object p1
.end method

.method public Z0()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->Z0()S

    move-result v0

    return v0
.end method

.method public a(B)J
    .locals 6

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, LX9/T;->f(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public b0(LX9/d;J)J
    .locals 5

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3

    iget-boolean v3, p0, LX9/T;->E:Z

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    iget-object v3, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v3}, LX9/d;->d1()J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-nez v3, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v1, p0, LX9/T;->D:LX9/d;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    move-wide v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->b0(LX9/d;J)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b1()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->b1()J

    move-result-wide v0

    return-wide v0
.end method

.method public close()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LX9/T;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LX9/T;->E:Z

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    invoke-interface {v0}, LX9/Z;->close()V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->a()V

    :cond_0
    return-void
.end method

.method public d()LX9/d;
    .locals 1

    iget-object v0, p0, LX9/T;->D:LX9/d;

    return-object v0
.end method

.method public f(BJJ)J
    .locals 9

    .prologue
    iget-boolean v0, p0, LX9/T;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    cmp-long v0, v0, p2

    if-gtz v0, :cond_3

    cmp-long v0, p2, p4

    if-gtz v0, :cond_3

    :goto_0
    cmp-long v0, p2, p4

    const-wide/16 v7, -0x1

    if-gez v0, :cond_2

    iget-object v1, p0, LX9/T;->D:LX9/d;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, LX9/d;->s0(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v7

    if-eqz v2, :cond_0

    move-wide v7, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    cmp-long v2, v0, p4

    if-gez v2, :cond_2

    iget-object v2, p0, LX9/T;->C:LX9/Z;

    iget-object v3, p0, LX9/T;->D:LX9/d;

    const-wide/16 v4, 0x2000

    invoke-interface {v2, v3, v4, v5}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v2

    cmp-long v2, v2, v7

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v7

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "fromIndex="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " toIndex="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f0(J)Ljava/lang/String;
    .locals 13

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_0

    move-wide v5, v0

    goto :goto_0

    :cond_0
    add-long v5, p1, v3

    :goto_0
    const/16 v8, 0xa

    const-wide/16 v9, 0x0

    move-object v7, p0

    move-wide v11, v5

    invoke-virtual/range {v7 .. v12}, LX9/T;->f(BJJ)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v2, v7, v9

    if-eqz v2, :cond_1

    iget-object p1, p0, LX9/T;->D:LX9/d;

    invoke-static {p1, v7, v8}, LY9/a;->c(LX9/d;J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    cmp-long v0, v5, v0

    if-gez v0, :cond_2

    invoke-virtual {p0, v5, v6}, LX9/T;->G0(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LX9/T;->D:LX9/d;

    sub-long v1, v5, v3

    invoke-virtual {v0, v1, v2}, LX9/d;->r0(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    add-long/2addr v3, v5

    invoke-virtual {p0, v3, v4}, LX9/T;->G0(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, v5, v6}, LX9/d;->r0(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget-object p1, p0, LX9/T;->D:LX9/d;

    invoke-static {p1, v5, v6}, LY9/a;->c(LX9/d;J)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance v6, LX9/d;

    invoke-direct {v6}, LX9/d;-><init>()V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v1

    const/16 v3, 0x20

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, LX9/d;->n0(LX9/d;JJ)LX9/d;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: limit="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v2}, LX9/d;->d1()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LX9/d;->P0()LX9/g;

    move-result-object p1

    invoke-virtual {p1}, LX9/g;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public g(LX9/g;J)J
    .locals 8

    .prologue
    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/T;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->u0(LX9/g;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    iget-object v4, p0, LX9/T;->C:LX9/Z;

    iget-object v5, p0, LX9/T;->D:LX9/d;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_1

    move-wide v0, v2

    :goto_1
    return-wide v0

    :cond_1
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h0(LX9/g;)J
    .locals 2

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, LX9/T;->g(LX9/g;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, LX9/T;->E:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j()Z
    .locals 6

    .prologue
    iget-boolean v0, p0, LX9/T;->E:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v2, p0, LX9/T;->D:LX9/d;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    invoke-interface {v0}, LX9/Z;->k()LX9/a0;

    move-result-object v0

    return-object v0
.end method

.method public k0(LX9/N;)I
    .locals 8

    .prologue
    const-string v0, "options"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/T;->E:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-static {v0, p1, v1}, LY9/a;->d(LX9/d;LX9/N;Z)I

    move-result v0

    const/4 v2, -0x2

    const/4 v3, -0x1

    if-eq v0, v2, :cond_2

    if-eq v0, v3, :cond_1

    invoke-virtual {p1}, LX9/N;->s()[LX9/g;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p1}, LX9/g;->I()I

    move-result p1

    iget-object v1, p0, LX9/T;->D:LX9/d;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, LX9/d;->skip(J)V

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    goto :goto_1

    :cond_2
    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v2, p0, LX9/T;->D:LX9/d;

    const-wide/16 v4, 0x2000

    invoke-interface {v0, v2, v4, v5}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    goto :goto_0

    :goto_1
    return v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->m()B

    move-result v0

    return v0
.end method

.method public p()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->p()S

    move-result v0

    return v0
.end method

.method public q(J)V
    .locals 0

    .prologue
    invoke-virtual {p0, p1, p2}, LX9/T;->G0(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public q1()J
    .locals 5

    .prologue
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, LX9/T;->q(J)V

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    invoke-virtual {p0, v2, v3}, LX9/T;->G0(J)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, LX9/T;->D:LX9/d;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, LX9/d;->r0(J)B

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_0
    const/16 v3, 0x61

    if-lt v2, v3, :cond_1

    const/16 v3, 0x66

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x41

    if-lt v2, v3, :cond_3

    const/16 v3, 0x46

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v3}, LS8/a;->a(I)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->q1()J

    move-result-wide v0

    return-wide v0
.end method

.method public r1()Ljava/io/InputStream;
    .locals 1

    new-instance v0, LX9/T$a;

    invoke-direct {v0, p0}, LX9/T$a;-><init>(LX9/T;)V

    return-object v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 4

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v1, p0, LX9/T;->D:LX9/d;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public skip(J)V
    .locals 4

    .prologue
    iget-boolean v0, p0, LX9/T;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    iget-object v2, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v2}, LX9/d;->d1()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    iget-object v0, p0, LX9/T;->C:LX9/Z;

    iget-object v1, p0, LX9/T;->D:LX9/d;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    :goto_1
    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v2, v0, v1}, LX9/d;->skip(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX9/T;->C:LX9/Z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(J)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1, p2}, LX9/T;->q(J)V

    iget-object v0, p0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2}, LX9/d;->w(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
