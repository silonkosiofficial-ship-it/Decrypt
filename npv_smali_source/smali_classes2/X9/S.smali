.class public final LX9/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/e;


# instance fields
.field public final C:LX9/X;

.field public final D:LX9/d;

.field public E:Z


# direct methods
.method public constructor <init>(LX9/X;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/S;->C:LX9/X;

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LX9/S;->D:LX9/d;

    return-void
.end method


# virtual methods
.method public D0(J)LX9/e;
    .locals 1

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1, p2}, LX9/d;->w1(J)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E()LX9/e;
    .locals 4

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, LX9/S;->C:LX9/X;

    iget-object v3, p0, LX9/S;->D:LX9/d;

    invoke-interface {v2, v3, v0, v1}, LX9/X;->F0(LX9/d;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F0(LX9/d;J)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->F0(LX9/d;J)V

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public G(I)LX9/e;
    .locals 1

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->z1(I)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public L(I)LX9/e;
    .locals 1

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->x1(I)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public U(I)LX9/e;
    .locals 1

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->v1(I)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public X0([B)LX9/e;
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->t1([B)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c0(LX9/Z;)J
    .locals 6

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, LX9/S;->D:LX9/d;

    const-wide/16 v3, 0x2000

    invoke-interface {p1, v2, v3, v4}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public close()V
    .locals 4

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    if-nez v0, :cond_3

    :try_start_0
    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, LX9/S;->C:LX9/X;

    iget-object v1, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v1}, LX9/d;->d1()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, LX9/X;->F0(LX9/d;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    :try_start_1
    iget-object v1, p0, LX9/S;->C:LX9/X;

    invoke-interface {v1}, LX9/X;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, LX9/S;->E:Z

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    throw v0

    :cond_3
    :goto_3
    return-void
.end method

.method public d()LX9/d;
    .locals 1

    iget-object v0, p0, LX9/S;->D:LX9/d;

    return-object v0
.end method

.method public d0()LX9/e;
    .locals 4

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->y()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, LX9/S;->C:LX9/X;

    iget-object v3, p0, LX9/S;->D:LX9/d;

    invoke-interface {v2, v3, v0, v1}, LX9/X;->F0(LX9/d;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 4

    .prologue
    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, LX9/S;->C:LX9/X;

    iget-object v1, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v1}, LX9/d;->d1()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, LX9/X;->F0(LX9/d;J)V

    :cond_0
    iget-object v0, p0, LX9/S;->C:LX9/X;

    invoke-interface {v0}, LX9/X;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h1(LX9/g;)LX9/e;
    .locals 1

    .prologue
    const-string v0, "byteString"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->m1(LX9/g;)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/S;->C:LX9/X;

    invoke-interface {v0}, LX9/X;->k()LX9/a0;

    move-result-object v0

    return-object v0
.end method

.method public p1()Ljava/io/OutputStream;
    .locals 1

    new-instance v0, LX9/S$a;

    invoke-direct {v0, p0}, LX9/S$a;-><init>(LX9/S;)V

    return-object v0
.end method

.method public t0(Ljava/lang/String;)LX9/e;
    .locals 1

    .prologue
    const-string v0, "string"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->B1(Ljava/lang/String;)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX9/S;->C:LX9/X;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)LX9/e;
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX9/S;->E:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/S;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->u1([BII)LX9/d;

    invoke-virtual {p0}, LX9/S;->d0()LX9/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
