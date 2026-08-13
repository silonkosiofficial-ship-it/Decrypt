.class public abstract Lm1/l;
.super Lm1/j;
.source "SourceFile"


# instance fields
.field private I0:I

.field private J0:I

.field private K0:I

.field private L0:I

.field private M0:I

.field private N0:I

.field private O0:Z

.field private P0:I

.field private Q0:I

.field private R0:Ln1/b$b;

.field private S0:Ln1/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm1/j;-><init>()V

    new-instance v0, Ln1/b$b;

    invoke-direct {v0}, Ln1/b$b;-><init>()V

    iput-object v0, p0, Lm1/l;->R0:Ln1/b$b;

    return-void
.end method


# virtual methods
.method public final f2(Ljava/util/HashSet;)Z
    .locals 4

    .prologue
    const-string v0, "widgets"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {p1, v3}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final g2()I
    .locals 1

    iget v0, p0, Lm1/l;->Q0:I

    return v0
.end method

.method public final h2()I
    .locals 1

    iget v0, p0, Lm1/l;->P0:I

    return v0
.end method

.method public final i2()I
    .locals 1

    iget v0, p0, Lm1/l;->J0:I

    return v0
.end method

.method public final j2()I
    .locals 1

    iget v0, p0, Lm1/l;->M0:I

    return v0
.end method

.method public final k2()I
    .locals 1

    iget v0, p0, Lm1/l;->N0:I

    return v0
.end method

.method public final l2()I
    .locals 1

    iget v0, p0, Lm1/l;->I0:I

    return v0
.end method

.method public m2(IIII)V
    .locals 0

    return-void
.end method

.method protected final n2(Lm1/e;Lm1/e$b;ILm1/e$b;I)V
    .locals 2

    .prologue
    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalBehavior"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verticalBehavior"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lm1/l;->S0:Ln1/b$c;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.ConstraintWidgetContainer"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/f;

    invoke-virtual {v0}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v0

    iput-object v0, p0, Lm1/l;->S0:Ln1/b$c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v0, p2}, Ln1/b$b;->n(Lm1/e$b;)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2, p4}, Ln1/b$b;->v(Lm1/e$b;)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2, p3}, Ln1/b$b;->o(I)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2, p5}, Ln1/b$b;->w(I)V

    iget-object p2, p0, Lm1/l;->S0:Ln1/b$c;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p3, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-interface {p2, p1, p3}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->k()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->U1(I)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->i()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->m1(I)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->h()Z

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->l1(Z)V

    iget-object p2, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->a1(I)V

    return-void
.end method

.method protected final o2()Z
    .locals 10

    .prologue
    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.ConstraintWidgetContainer"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/f;

    invoke-virtual {v0}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v2

    move v3, v1

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v2, :cond_7

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v5

    aget-object v5, v5, v3

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    instance-of v6, v5, Lm1/h;

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v5, v1}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v6

    invoke-virtual {v5, v4}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v7

    sget-object v8, Lm1/e$b;->E:Lm1/e$b;

    if-ne v6, v8, :cond_4

    invoke-virtual {v5}, Lm1/e;->Q()I

    move-result v9

    if-eq v9, v4, :cond_4

    if-ne v7, v8, :cond_4

    invoke-virtual {v5}, Lm1/e;->P()I

    move-result v9

    if-eq v9, v4, :cond_4

    goto :goto_2

    :cond_4
    if-ne v6, v8, :cond_5

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    :cond_5
    if-ne v7, v8, :cond_6

    sget-object v7, Lm1/e$b;->D:Lm1/e$b;

    :cond_6
    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Ln1/b$b;->n(Lm1/e$b;)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Ln1/b$b;->v(Lm1/e$b;)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v5}, Lm1/e;->B0()I

    move-result v6

    invoke-virtual {v4, v6}, Ln1/b$b;->o(I)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v5}, Lm1/e;->w()I

    move-result v6

    invoke-virtual {v4, v6}, Ln1/b$b;->w(I)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-interface {v0, v5, v4}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v4}, Ln1/b$b;->k()I

    move-result v4

    invoke-virtual {v5, v4}, Lm1/e;->U1(I)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v4}, Ln1/b$b;->i()I

    move-result v4

    invoke-virtual {v5, v4}, Lm1/e;->m1(I)V

    iget-object v4, p0, Lm1/l;->R0:Ln1/b$b;

    invoke-virtual {v4}, Ln1/b$b;->g()I

    move-result v4

    invoke-virtual {v5, v4}, Lm1/e;->a1(I)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    return v4
.end method

.method public final p2()Z
    .locals 1

    iget-boolean v0, p0, Lm1/l;->O0:Z

    return v0
.end method

.method protected final q2(Z)V
    .locals 0

    iput-boolean p1, p0, Lm1/l;->O0:Z

    return-void
.end method

.method public final r2(II)V
    .locals 0

    iput p1, p0, Lm1/l;->P0:I

    iput p2, p0, Lm1/l;->Q0:I

    return-void
.end method

.method public final s2(I)V
    .locals 0

    iput p1, p0, Lm1/l;->J0:I

    return-void
.end method

.method public final t2(I)V
    .locals 0

    iput p1, p0, Lm1/l;->K0:I

    iput p1, p0, Lm1/l;->M0:I

    return-void
.end method

.method public final u2(I)V
    .locals 0

    iput p1, p0, Lm1/l;->L0:I

    iput p1, p0, Lm1/l;->N0:I

    return-void
.end method

.method public final v2(I)V
    .locals 0

    iput p1, p0, Lm1/l;->I0:I

    return-void
.end method
