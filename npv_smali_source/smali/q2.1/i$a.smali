.class final Lq2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ly2/e;

.field private final b:J

.field final synthetic c:Lq2/i;


# direct methods
.method public constructor <init>(Lq2/i;Ly2/e;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq2/i$a;->c:Lq2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq2/i$a;->a:Ly2/e;

    invoke-static {}, Lp2/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lq2/i$a;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0}, Ly2/e;->a()V

    return-void

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public close()V
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0}, Ly2/e;->close()V

    return-void

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public getColumnCount()I
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0}, Ly2/e;->getColumnCount()I

    move-result v0

    return v0

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public getColumnName(I)Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1}, Ly2/e;->getColumnName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public synthetic getInt(I)I
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->b(Ly2/e;I)I

    move-result p1

    return p1
.end method

.method public getLong(I)J
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1}, Ly2/e;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public isNull(I)Z
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1}, Ly2/e;->isNull(I)Z

    move-result p1

    return p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public l(IJ)V
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1, p2, p3}, Ly2/e;->l(IJ)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public synthetic m(I)Z
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->a(Ly2/e;I)Z

    move-result p1

    return p1
.end method

.method public n(ILjava/lang/String;)V
    .locals 6

    .prologue
    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1, p2}, Ly2/e;->n(ILjava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public o(I)Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0, p1}, Ly2/e;->o(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v1, p1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public p()Z
    .locals 6

    .prologue
    iget-object v0, p0, Lq2/i$a;->c:Lq2/i;

    invoke-static {v0}, Lq2/i;->g(Lq2/i;)Z

    move-result v0

    const/16 v1, 0x15

    if-nez v0, :cond_1

    iget-wide v2, p0, Lq2/i$a;->b:J

    invoke-static {}, Lp2/d;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i$a;->a:Ly2/e;

    invoke-interface {v0}, Ly2/e;->p()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method
