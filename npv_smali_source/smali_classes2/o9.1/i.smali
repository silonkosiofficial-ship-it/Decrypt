.class public final Lo9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/q;


# instance fields
.field private final C:Lo9/h;

.field public D:Z

.field private final E:Lo9/a;


# direct methods
.method public constructor <init>(Lo9/h;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/i;->C:Lo9/h;

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    iput-object p1, p0, Lo9/i;->E:Lo9/a;

    return-void
.end method


# virtual methods
.method public G0(J)Z
    .locals 6

    .prologue
    iget-boolean v0, p0, Lo9/i;->D:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v2

    cmp-long v0, v2, p1

    if-gez v0, :cond_1

    iget-object v0, p0, Lo9/i;->C:Lo9/h;

    iget-object v2, p0, Lo9/i;->E:Lo9/a;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Source is closed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public I0(Lo9/a;J)J
    .locals 4

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lo9/i;->D:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    iget-object v2, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v2}, Lo9/a;->r()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo9/i;->C:Lo9/h;

    iget-object v1, p0, Lo9/i;->E:Lo9/a;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-wide v2

    :cond_0
    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0, p1, p2, p3}, Lo9/a;->I0(Lo9/a;J)J

    move-result-wide p1

    return-wide p1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Source is closed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public V([BII)I
    .locals 7

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lo9/t;->a(JJJ)V

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lo9/i;->C:Lo9/h;

    iget-object v1, p0, Lo9/i;->E:Lo9/a;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr p3, p2

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    add-int/2addr p3, p2

    invoke-virtual {v0, p1, p2, p3}, Lo9/a;->V([BII)I

    move-result p1

    return p1
.end method

.method public close()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lo9/i;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo9/i;->D:Z

    iget-object v0, p0, Lo9/i;->C:Lo9/h;

    invoke-interface {v0}, Lo9/h;->close()V

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->a()V

    return-void
.end method

.method public d()Lo9/a;
    .locals 1

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    return-object v0
.end method

.method public g1()Lo9/q;
    .locals 2

    .prologue
    iget-boolean v0, p0, Lo9/i;->D:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Lo9/f;

    invoke-direct {v0, p0}, Lo9/f;-><init>(Lo9/q;)V

    invoke-static {v0}, Lo9/c;->a(Lo9/h;)Lo9/q;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Source is closed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Z
    .locals 6

    .prologue
    iget-boolean v0, p0, Lo9/i;->D:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo9/i;->C:Lo9/h;

    iget-object v2, p0, Lo9/i;->E:Lo9/a;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lo9/h;->I0(Lo9/a;J)J

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

    const-string v1, "Source is closed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lo9/i;->q(J)V

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->m()B

    move-result v0

    return v0
.end method

.method public p()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lo9/i;->q(J)V

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->p()S

    move-result v0

    return v0
.end method

.method public q(J)V
    .locals 3

    .prologue
    invoke-virtual {p0, p1, p2}, Lo9/i;->G0(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Source doesn\'t contain required number of bytes ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public s1(Lo9/g;J)V
    .locals 2

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lo9/i;->q(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0, p1, p2, p3}, Lo9/a;->s1(Lo9/g;J)V

    return-void

    :catch_0
    move-exception p2

    iget-object p3, p0, Lo9/i;->E:Lo9/a;

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    invoke-interface {p1, p3, v0, v1}, Lo9/g;->m0(Lo9/a;J)V

    throw p2
.end method

.method public t(Lo9/g;)J
    .locals 8

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :cond_0
    :goto_0
    iget-object v4, p0, Lo9/i;->C:Lo9/h;

    iget-object v5, p0, Lo9/i;->E:Lo9/a;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    iget-object v4, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v4}, Lo9/a;->f()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    add-long/2addr v2, v4

    iget-object v6, p0, Lo9/i;->E:Lo9/a;

    invoke-interface {p1, v6, v4, v5}, Lo9/g;->m0(Lo9/a;J)V

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v4}, Lo9/a;->r()J

    move-result-wide v4

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v0

    add-long/2addr v2, v0

    iget-object v0, p0, Lo9/i;->E:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->r()J

    move-result-wide v4

    invoke-interface {p1, v0, v4, v5}, Lo9/g;->m0(Lo9/a;J)V

    :cond_2
    return-wide v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffered("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo9/i;->C:Lo9/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
