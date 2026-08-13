.class final Lx/D$c;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/D;->f(Lz0/c;Lz0/B;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:J

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lz0/B;


# direct methods
.method constructor <init>(Lz0/B;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/D$c;->H:Lz0/B;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/D$c;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lx/D$c;->E:J

    iget-object v1, p0, Lx/D$c;->G:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/D$c;->G:Ljava/lang/Object;

    check-cast p1, Lz0/c;

    iget-object v1, p0, Lx/D$c;->H:Lz0/B;

    invoke-virtual {v1}, Lz0/B;->o()J

    move-result-wide v3

    invoke-interface {p1}, Lz0/c;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/platform/A1;->b()J

    move-result-wide v5

    add-long/2addr v3, v5

    move-object v1, p1

    :cond_2
    iput-object v1, p0, Lx/D$c;->G:Ljava/lang/Object;

    iput-wide v3, p0, Lx/D$c;->E:J

    iput v2, p0, Lx/D$c;->F:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v1

    move-object v8, p0

    invoke-static/range {v5 .. v10}, Lx/D;->e(Lz0/c;ZLz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lz0/B;

    invoke-virtual {p1}, Lz0/B;->o()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-ltz v5, :cond_2

    return-object p1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/D$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/D$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/D$c;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lx/D$c;

    iget-object v1, p0, Lx/D$c;->H:Lz0/B;

    invoke-direct {v0, v1, p2}, Lx/D$c;-><init>(Lz0/B;Lm7/e;)V

    iput-object p1, v0, Lx/D$c;->G:Ljava/lang/Object;

    return-object v0
.end method
