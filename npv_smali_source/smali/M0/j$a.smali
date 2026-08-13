.class final LM0/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/j;->a(J[FI)[F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:[F

.field final synthetic F:Ly7/M;

.field final synthetic G:Ly7/L;


# direct methods
.method constructor <init>(J[FLy7/M;Ly7/L;)V
    .locals 0

    iput-wide p1, p0, LM0/j$a;->D:J

    iput-object p3, p0, LM0/j$a;->E:[F

    iput-object p4, p0, LM0/j$a;->F:Ly7/M;

    iput-object p5, p0, LM0/j$a;->G:Ly7/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/q;)V
    .locals 8

    .prologue
    iget-wide v0, p0, LM0/j$a;->D:J

    iget-object v2, p0, LM0/j$a;->E:[F

    iget-object v3, p0, LM0/j$a;->F:Ly7/M;

    iget-object v4, p0, LM0/j$a;->G:Ly7/L;

    invoke-virtual {p1}, LM0/q;->f()I

    move-result v5

    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result v6

    if-le v5, v6, :cond_0

    invoke-virtual {p1}, LM0/q;->f()I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result v5

    :goto_0
    invoke-virtual {p1}, LM0/q;->b()I

    move-result v6

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result v7

    if-ge v6, v7, :cond_1

    invoke-virtual {p1}, LM0/q;->b()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result v0

    :goto_1
    invoke-virtual {p1, v5}, LM0/q;->r(I)I

    move-result v1

    invoke-virtual {p1, v0}, LM0/q;->r(I)I

    move-result v0

    invoke-static {v1, v0}, LM0/O;->b(II)J

    move-result-wide v0

    invoke-virtual {p1}, LM0/q;->e()LM0/p;

    move-result-object v5

    iget v6, v3, Ly7/M;->C:I

    invoke-interface {v5, v0, v1, v2, v6}, LM0/p;->e(J[FI)V

    iget v5, v3, Ly7/M;->C:I

    invoke-static {v0, v1}, LM0/N;->j(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v5, v0

    iget v0, v3, Ly7/M;->C:I

    :goto_2
    if-ge v0, v5, :cond_2

    add-int/lit8 v1, v0, 0x1

    aget v6, v2, v1

    iget v7, v4, Ly7/L;->C:F

    add-float/2addr v6, v7

    aput v6, v2, v1

    add-int/lit8 v1, v0, 0x3

    aget v6, v2, v1

    add-float/2addr v6, v7

    aput v6, v2, v1

    add-int/lit8 v0, v0, 0x4

    goto :goto_2

    :cond_2
    iput v5, v3, Ly7/M;->C:I

    iget v0, v4, Ly7/L;->C:F

    invoke-virtual {p1}, LM0/q;->e()LM0/p;

    move-result-object p1

    invoke-interface {p1}, LM0/p;->getHeight()F

    move-result p1

    add-float/2addr v0, p1

    iput v0, v4, Ly7/L;->C:F

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/q;

    invoke-virtual {p0, p1}, LM0/j$a;->a(LM0/q;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
