.class public final Lo9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/q;
.implements Lo9/p;


# instance fields
.field private C:Lo9/k;

.field private D:Lo9/k;

.field private E:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final g0(J)Ljava/lang/Void;
    .locals 4

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Buffer doesn\'t contain required number of bytes (size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", required: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final D()V
    .locals 3

    .prologue
    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->e()Lo9/k;

    move-result-object v1

    iput-object v1, p0, Lo9/a;->C:Lo9/k;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iput-object v2, p0, Lo9/a;->D:Lo9/k;

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Lo9/k;->t(Lo9/k;)V

    :goto_0
    invoke-virtual {v0, v2}, Lo9/k;->r(Lo9/k;)V

    invoke-static {v0}, Lo9/n;->d(Lo9/k;)V

    return-void
.end method

.method public F(S)V
    .locals 4

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo9/k;->D(S)V

    iget-wide v0, p0, Lo9/a;->E:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo9/a;->E:J

    return-void
.end method

.method public G0(J)Z
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " < 0"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final synthetic H()V
    .locals 3

    .prologue
    iget-object v0, p0, Lo9/a;->D:Lo9/k;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->g()Lo9/k;

    move-result-object v1

    iput-object v1, p0, Lo9/a;->D:Lo9/k;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iput-object v2, p0, Lo9/a;->C:Lo9/k;

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Lo9/k;->r(Lo9/k;)V

    :goto_0
    invoke-virtual {v0, v2}, Lo9/k;->t(Lo9/k;)V

    invoke-static {v0}, Lo9/n;->d(Lo9/k;)V

    return-void
.end method

.method public I0(Lo9/a;J)J
    .locals 4

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide p2

    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lo9/a;->m0(Lo9/a;J)V

    return-wide p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ") < 0"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public J0()V
    .locals 0

    return-void
.end method

.method public final synthetic N(Lo9/k;)V
    .locals 0

    iput-object p1, p0, Lo9/a;->C:Lo9/k;

    return-void
.end method

.method public final synthetic R(J)V
    .locals 0

    iput-wide p1, p0, Lo9/a;->E:J

    return-void
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

    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr p3, p2

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    add-int v1, p2, p3

    invoke-virtual {v0, p1, p2, v1}, Lo9/k;->p([BII)V

    iget-wide p1, p0, Lo9/a;->E:J

    int-to-long v1, p3

    sub-long/2addr p1, v1

    iput-wide p1, p0, Lo9/a;->E:J

    invoke-static {v0}, Lo9/m;->a(Lo9/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lo9/a;->D()V

    :cond_1
    return p3
.end method

.method public X(Lo9/h;)J
    .locals 6

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    const-wide/16 v2, 0x2000

    invoke-interface {p1, p0, v2, v3}, Lo9/h;->I0(Lo9/a;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo9/a;->skip(J)V

    return-void
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public d()Lo9/a;
    .locals 0

    return-object p0
.end method

.method public final synthetic e0(Lo9/k;)V
    .locals 0

    iput-object p1, p0, Lo9/a;->D:Lo9/k;

    return-void
.end method

.method public final f()J
    .locals 5

    .prologue
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v2, p0, Lo9/a;->D:Lo9/k;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lo9/k;->d()I

    move-result v3

    const/16 v4, 0x2000

    if-ge v3, v4, :cond_1

    iget-boolean v3, v2, Lo9/k;->e:Z

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lo9/k;->d()I

    move-result v3

    invoke-virtual {v2}, Lo9/k;->f()I

    move-result v2

    sub-int/2addr v3, v2

    int-to-long v2, v3

    sub-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public final g()Lo9/a;
    .locals 5

    .prologue
    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lo9/a;->C:Lo9/k;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo9/k;->y()Lo9/k;

    move-result-object v2

    iput-object v2, v0, Lo9/a;->C:Lo9/k;

    :goto_0
    iput-object v2, v0, Lo9/a;->D:Lo9/k;

    invoke-virtual {v1}, Lo9/k;->e()Lo9/k;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v0, Lo9/a;->D:Lo9/k;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo9/k;->y()Lo9/k;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo9/k;->m(Lo9/k;)Lo9/k;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    iput-wide v1, v0, Lo9/a;->E:J

    return-object v0
.end method

.method public g1()Lo9/q;
    .locals 1

    new-instance v0, Lo9/f;

    invoke-direct {v0, p0}, Lo9/f;-><init>(Lo9/q;)V

    invoke-static {v0}, Lo9/c;->a(Lo9/h;)Lo9/q;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lo9/a;JJ)V
    .locals 7

    .prologue
    const-string v0, "out"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v1 .. v6}, Lo9/t;->a(JJJ)V

    cmp-long v0, p2, p4

    if-nez v0, :cond_0

    return-void

    :cond_0
    sub-long/2addr p4, p2

    iget-wide v0, p1, Lo9/a;->E:J

    add-long/2addr v0, p4

    iput-wide v0, p1, Lo9/a;->E:J

    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->d()I

    move-result v1

    invoke-virtual {v0}, Lo9/k;->f()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-long v1, v1

    cmp-long v1, p2, v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Lo9/k;->d()I

    move-result v1

    invoke-virtual {v0}, Lo9/k;->f()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-long v1, v1

    sub-long/2addr p2, v1

    invoke-virtual {v0}, Lo9/k;->e()Lo9/k;

    move-result-object v0

    goto :goto_0

    :cond_1
    :goto_1
    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-lez v3, :cond_3

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->y()Lo9/k;

    move-result-object v3

    invoke-virtual {v3}, Lo9/k;->f()I

    move-result v4

    long-to-int p2, p2

    add-int/2addr v4, p2

    invoke-virtual {v3, v4}, Lo9/k;->s(I)V

    invoke-virtual {v3}, Lo9/k;->f()I

    move-result p2

    long-to-int p3, p4

    add-int/2addr p2, p3

    invoke-virtual {v3}, Lo9/k;->d()I

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v3, p2}, Lo9/k;->q(I)V

    invoke-virtual {p1}, Lo9/a;->o()Lo9/k;

    move-result-object p2

    if-nez p2, :cond_2

    invoke-virtual {p1, v3}, Lo9/a;->N(Lo9/k;)V

    invoke-virtual {p1, v3}, Lo9/a;->e0(Lo9/k;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lo9/a;->y()Lo9/k;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2, v3}, Lo9/k;->m(Lo9/k;)Lo9/k;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo9/a;->e0(Lo9/k;)V

    :goto_2
    invoke-virtual {v3}, Lo9/k;->d()I

    move-result p2

    invoke-virtual {v3}, Lo9/k;->f()I

    move-result p3

    sub-int/2addr p2, p3

    int-to-long p2, p2

    sub-long/2addr p4, p2

    invoke-virtual {v0}, Lo9/k;->e()Lo9/k;

    move-result-object v0

    move-wide p2, v1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public j()Z
    .locals 4

    .prologue
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()B
    .locals 6

    .prologue
    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lo9/a;->D()V

    invoke-virtual {p0}, Lo9/a;->m()B

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lo9/k;->n()B

    move-result v0

    iget-wide v4, p0, Lo9/a;->E:J

    sub-long/2addr v4, v1

    iput-wide v4, p0, Lo9/a;->E:J

    const/4 v1, 0x1

    if-ne v3, v1, :cond_1

    invoke-virtual {p0}, Lo9/a;->D()V

    :cond_1
    return v0

    :cond_2
    invoke-direct {p0, v1, v2}, Lo9/a;->g0(J)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public m0(Lo9/a;J)V
    .locals 7

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_7

    iget-wide v1, p1, Lo9/a;->E:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lo9/t;->b(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_6

    iget-object v0, p1, Lo9/a;->C:Lo9/k;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-gez v0, :cond_2

    iget-object v0, p0, Lo9/a;->D:Lo9/k;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lo9/k;->e:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lo9/k;->d()I

    move-result v1

    int-to-long v1, v1

    add-long/2addr v1, p2

    invoke-virtual {v0}, Lo9/k;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lo9/k;->f()I

    move-result v3

    :goto_1
    int-to-long v3, v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2000

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    iget-object v1, p1, Lo9/a;->C:Lo9/k;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    long-to-int v2, p2

    invoke-virtual {v1, v0, v2}, Lo9/k;->E(Lo9/k;I)V

    iget-wide v0, p1, Lo9/a;->E:J

    sub-long/2addr v0, p2

    iput-wide v0, p1, Lo9/a;->E:J

    iget-wide v0, p0, Lo9/a;->E:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lo9/a;->E:J

    return-void

    :cond_1
    iget-object v0, p1, Lo9/a;->C:Lo9/k;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    long-to-int v1, p2

    invoke-virtual {v0, v1}, Lo9/k;->z(I)Lo9/k;

    move-result-object v0

    iput-object v0, p1, Lo9/a;->C:Lo9/k;

    :cond_2
    iget-object v0, p1, Lo9/a;->C:Lo9/k;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Lo9/k;->l()Lo9/k;

    move-result-object v3

    iput-object v3, p1, Lo9/a;->C:Lo9/k;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    iput-object v3, p1, Lo9/a;->D:Lo9/k;

    :cond_3
    invoke-virtual {p0}, Lo9/a;->o()Lo9/k;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {p0, v0}, Lo9/a;->N(Lo9/k;)V

    invoke-virtual {p0, v0}, Lo9/a;->e0(Lo9/k;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lo9/a;->y()Lo9/k;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lo9/k;->m(Lo9/k;)Lo9/k;

    move-result-object v0

    invoke-virtual {v0}, Lo9/k;->a()Lo9/k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo9/a;->e0(Lo9/k;)V

    invoke-virtual {p0}, Lo9/a;->y()Lo9/k;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo9/k;->g()Lo9/k;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lo9/a;->y()Lo9/k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo9/a;->N(Lo9/k;)V

    :cond_5
    :goto_2
    iget-wide v3, p1, Lo9/a;->E:J

    sub-long/2addr v3, v1

    iput-wide v3, p1, Lo9/a;->E:J

    iget-wide v3, p0, Lo9/a;->E:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lo9/a;->E:J

    sub-long/2addr p2, v1

    goto/16 :goto_0

    :cond_6
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == this"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic n0(I)Lo9/k;
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-lt p1, v0, :cond_3

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_3

    iget-object v1, p0, Lo9/a;->D:Lo9/k;

    if-nez v1, :cond_0

    invoke-static {}, Lo9/n;->f()Lo9/k;

    move-result-object p1

    iput-object p1, p0, Lo9/a;->C:Lo9/k;

    :goto_0
    iput-object p1, p0, Lo9/a;->D:Lo9/k;

    return-object p1

    :cond_0
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v2

    add-int/2addr v2, p1

    if-gt v2, v0, :cond_2

    iget-boolean p1, v1, Lo9/k;->e:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    invoke-static {}, Lo9/n;->f()Lo9/k;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo9/k;->m(Lo9/k;)Lo9/k;

    move-result-object p1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected capacity"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic o()Lo9/k;
    .locals 1

    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    return-object v0
.end method

.method public o0(B)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo9/k;->C(B)V

    iget-wide v0, p0, Lo9/a;->E:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo9/a;->E:J

    return-void
.end method

.method public p()S
    .locals 7

    .prologue
    iget-object v0, p0, Lo9/a;->C:Lo9/k;

    const-wide/16 v1, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    invoke-virtual {p0, v1, v2}, Lo9/a;->q(J)V

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lo9/a;->D()V

    invoke-virtual {p0}, Lo9/a;->p()S

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lo9/a;->m()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lo9/a;->m()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0

    :cond_1
    invoke-virtual {v0}, Lo9/k;->o()S

    move-result v0

    iget-wide v5, p0, Lo9/a;->E:J

    sub-long/2addr v5, v1

    iput-wide v5, p0, Lo9/a;->E:J

    if-ne v3, v4, :cond_2

    invoke-virtual {p0}, Lo9/a;->D()V

    :cond_2
    return v0

    :cond_3
    invoke-direct {p0, v1, v2}, Lo9/a;->g0(J)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public q(J)V
    .locals 4

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Buffer doesn\'t contain required number of bytes (size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", required: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
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
.end method

.method public final r()J
    .locals 2

    iget-wide v0, p0, Lo9/a;->E:J

    return-wide v0
.end method

.method public final synthetic s()J
    .locals 2

    iget-wide v0, p0, Lo9/a;->E:J

    return-wide v0
.end method

.method public s1(Lo9/g;J)V
    .locals 2

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-ltz v0, :cond_0

    invoke-interface {p1, p0, p2, p3}, Lo9/g;->m0(Lo9/a;J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    invoke-interface {p1, p0, v0, v1}, Lo9/g;->m0(Lo9/a;J)V

    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Buffer exhausted before writing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " bytes. Only "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " bytes were written."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ") < 0"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public skip(J)V
    .locals 10

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    move-wide v2, p1

    :cond_0
    :goto_0
    cmp-long v4, v2, v0

    if-lez v4, :cond_2

    iget-object v4, p0, Lo9/a;->C:Lo9/k;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo9/k;->d()I

    move-result v5

    invoke-virtual {v4}, Lo9/k;->f()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-long v5, v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    iget-wide v6, p0, Lo9/a;->E:J

    int-to-long v8, v5

    sub-long/2addr v6, v8

    iput-wide v6, p0, Lo9/a;->E:J

    sub-long/2addr v2, v8

    invoke-virtual {v4}, Lo9/k;->f()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v4, v6}, Lo9/k;->s(I)V

    invoke-virtual {v4}, Lo9/k;->f()I

    move-result v5

    invoke-virtual {v4}, Lo9/k;->d()I

    move-result v4

    if-ne v5, v4, :cond_0

    invoke-virtual {p0}, Lo9/a;->D()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Buffer exhausted before skipping "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") < 0"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public t(Lo9/g;)J
    .locals 4

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lo9/g;->m0(Lo9/a;J)V

    :cond_0
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const-string v0, "Buffer(size=0)"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    const/16 v3, 0x40

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    new-instance v2, Ljava/lang/StringBuilder;

    mul-int/lit8 v5, v1, 0x2

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v6

    cmp-long v6, v6, v3

    const/4 v7, 0x0

    if-lez v6, :cond_1

    move v6, v0

    goto :goto_0

    :cond_1
    move v6, v7

    :goto_0
    add-int/2addr v5, v6

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    sget-object v5, Ls9/d;->a:Ls9/d;

    invoke-virtual {p0}, Lo9/a;->o()Lo9/k;

    move-result-object v5

    move v6, v7

    :goto_1
    if-eqz v5, :cond_3

    invoke-static {}, Ls9/e;->a()Ls9/b;

    move-result-object v8

    move v9, v7

    :goto_2
    if-ge v6, v1, :cond_2

    invoke-virtual {v5}, Lo9/k;->j()I

    move-result v10

    if-ge v9, v10, :cond_2

    add-int/lit8 v10, v9, 0x1

    invoke-interface {v8, v5, v9}, Ls9/b;->a(Lo9/k;I)B

    move-result v9

    add-int/2addr v6, v0

    invoke-static {}, Lo9/t;->c()[C

    move-result-object v11

    shr-int/lit8 v12, v9, 0x4

    and-int/lit8 v12, v12, 0xf

    aget-char v11, v11, v12

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lo9/t;->c()[C

    move-result-object v11

    and-int/lit8 v9, v9, 0xf

    aget-char v9, v11, v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v9, v10

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lo9/k;->e()Lo9/k;

    move-result-object v5

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-lez v0, :cond_4

    const/16 v0, 0x2026

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Buffer(size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " hex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write([BII)V
    .locals 7

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lo9/t;->a(JJJ)V

    move v0, p2

    :goto_0
    if-ge v0, p3, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v1

    sub-int v2, p3, v0

    invoke-virtual {v1}, Lo9/k;->h()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {v1, p1, v0, v2}, Lo9/k;->A([BII)V

    move v0, v2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lo9/a;->E:J

    sub-int/2addr p3, p2

    int-to-long p1, p3

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo9/a;->E:J

    return-void
.end method

.method public final synthetic y()Lo9/k;
    .locals 1

    iget-object v0, p0, Lo9/a;->D:Lo9/k;

    return-object v0
.end method
