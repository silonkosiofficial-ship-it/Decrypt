.class public abstract Ln1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/p$a;,
        Ln1/p$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lm1/e;

.field private c:Ln1/m;

.field private d:Lm1/e$b;

.field private e:Ln1/g;

.field private f:I

.field private g:Z

.field private h:Ln1/f;

.field private i:Ln1/f;

.field private j:Ln1/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/p;->b:Lm1/e;

    new-instance p1, Ln1/g;

    invoke-direct {p1, p0}, Ln1/g;-><init>(Ln1/p;)V

    iput-object p1, p0, Ln1/p;->e:Ln1/g;

    new-instance p1, Ln1/f;

    invoke-direct {p1, p0}, Ln1/f;-><init>(Ln1/p;)V

    iput-object p1, p0, Ln1/p;->h:Ln1/f;

    new-instance p1, Ln1/f;

    invoke-direct {p1, p0}, Ln1/f;-><init>(Ln1/p;)V

    iput-object p1, p0, Ln1/p;->i:Ln1/f;

    sget-object p1, Ln1/p$a;->C:Ln1/p$a;

    iput-object p1, p0, Ln1/p;->j:Ln1/p$a;

    return-void
.end method

.method private final v(II)V
    .locals 4

    .prologue
    iget v0, p0, Ln1/p;->a:I

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->j()Lm1/e$b;

    move-result-object v0

    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->o()I

    move-result v0

    if-ne v0, p2, :cond_1

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->j()Lm1/e$b;

    move-result-object v0

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->o()I

    move-result v0

    if-eq v0, p2, :cond_9

    :cond_1
    iget-object p2, p0, Ln1/p;->b:Lm1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez p1, :cond_2

    invoke-virtual {p2}, Lm1/e;->e0()Ln1/n;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lm1/e;->K()Ln1/l;

    move-result-object p2

    goto :goto_0

    :goto_1
    iget-object v0, p2, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0}, Ln1/f;->i()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->s()F

    move-result v0

    if-ne p1, v1, :cond_3

    iget-object p1, p2, Ln1/p;->e:Ln1/g;

    invoke-virtual {p1}, Ln1/f;->j()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_2

    :cond_3
    iget-object p1, p2, Ln1/p;->e:Ln1/g;

    invoke-virtual {p1}, Ln1/f;->j()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr v0, p1

    add-float/2addr v0, v2

    float-to-int p1, v0

    :goto_2
    iget-object p2, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {p2, p1}, Ln1/g;->k(I)V

    goto :goto_7

    :cond_4
    iget-object p2, p0, Ln1/p;->b:Lm1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    invoke-virtual {p2}, Lm1/e;->K()Ln1/l;

    move-result-object p2

    :goto_3
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lm1/e;->e0()Ln1/n;

    move-result-object p2

    goto :goto_3

    :goto_4
    iget-object v0, p2, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0}, Ln1/f;->i()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez p1, :cond_6

    invoke-virtual {v0}, Lm1/e;->W()F

    move-result v0

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lm1/e;->V()F

    move-result v0

    :goto_5
    iget-object p2, p2, Ln1/p;->e:Ln1/g;

    invoke-virtual {p2}, Ln1/f;->j()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    :cond_7
    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {p0, p2, p1}, Ln1/p;->h(II)I

    move-result p1

    :goto_6
    invoke-virtual {v0, p1}, Ln1/g;->k(I)V

    goto :goto_7

    :cond_8
    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0}, Ln1/g;->u()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Ln1/p;->h(II)I

    move-result p1

    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_6

    :cond_9
    :goto_7
    return-void
.end method


# virtual methods
.method public final A(Lm1/e;)V
    .locals 0

    iput-object p1, p0, Ln1/p;->b:Lm1/e;

    return-void
.end method

.method public final B(I)V
    .locals 0

    iput p1, p0, Ln1/p;->a:I

    return-void
.end method

.method public final C(I)V
    .locals 0

    iput p1, p0, Ln1/p;->f:I

    return-void
.end method

.method public abstract D()Z
.end method

.method protected E(Ln1/d;Lm1/d;Lm1/d;I)V
    .locals 4

    .prologue
    const-string p1, "startAnchor"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "endAnchor"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ln1/p;->r(Lm1/d;)Ln1/f;

    move-result-object p1

    invoke-virtual {p0, p3}, Ln1/p;->r(Lm1/d;)Ln1/f;

    move-result-object v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/f;->i()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/f;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ln1/f;->j()I

    move-result v1

    invoke-virtual {p2}, Lm1/d;->k()I

    move-result p2

    add-int/2addr v1, p2

    invoke-virtual {v0}, Ln1/f;->j()I

    move-result p2

    invoke-virtual {p3}, Lm1/d;->k()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v2}, Ln1/f;->i()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Ln1/p;->d:Lm1/e$b;

    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v3, :cond_1

    invoke-direct {p0, p4, p3}, Ln1/p;->v(II)V

    :cond_1
    iget-object v2, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v2}, Ln1/f;->i()Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    iget-object v2, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v2

    if-ne v2, p3, :cond_3

    iget-object p1, p0, Ln1/p;->h:Ln1/f;

    invoke-virtual {p1, v1}, Ln1/f;->k(I)V

    iget-object p1, p0, Ln1/p;->i:Ln1/f;

    :goto_0
    invoke-virtual {p1, p2}, Ln1/f;->k(I)V

    return-void

    :cond_3
    iget-object p3, p0, Ln1/p;->b:Lm1/e;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez p4, :cond_4

    invoke-virtual {p3}, Lm1/e;->x()F

    move-result p3

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, Lm1/e;->v0()F

    move-result p3

    :goto_1
    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz p4, :cond_5

    invoke-virtual {p1}, Ln1/f;->j()I

    move-result v1

    invoke-virtual {v0}, Ln1/f;->j()I

    move-result p2

    move p3, v2

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {p1}, Ln1/f;->j()I

    move-result p1

    sub-int/2addr p2, p1

    iget-object p1, p0, Ln1/p;->h:Ln1/f;

    int-to-float p4, v1

    add-float/2addr p4, v2

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr p4, p2

    float-to-int p2, p4

    invoke-virtual {p1, p2}, Ln1/f;->k(I)V

    iget-object p1, p0, Ln1/p;->i:Ln1/f;

    iget-object p2, p0, Ln1/p;->h:Ln1/f;

    invoke-virtual {p2}, Ln1/f;->j()I

    move-result p2

    iget-object p3, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {p3}, Ln1/f;->j()I

    move-result p3

    add-int/2addr p2, p3

    goto :goto_0

    :cond_6
    :goto_2
    return-void
.end method

.method protected F(Ln1/d;)V
    .locals 0

    return-void
.end method

.method protected G(Ln1/d;)V
    .locals 0

    return-void
.end method

.method public abstract a(Ln1/d;)V
.end method

.method protected final b(Ln1/f;Ln1/f;I)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, p3}, Ln1/f;->m(I)V

    invoke-virtual {p2}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final c(Ln1/f;Ln1/f;ILn1/g;)V
    .locals 2

    const-string v0, "node"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dimensionDependency"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, p3}, Ln1/f;->o(I)V

    invoke-virtual {p1, p4}, Ln1/f;->n(Ln1/g;)V

    invoke-virtual {p2}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g()Ln1/f;
    .locals 1

    iget-object v0, p0, Ln1/p;->i:Ln1/f;

    return-object v0
.end method

.method protected final h(II)I
    .locals 1

    .prologue
    if-nez p2, :cond_1

    iget-object p2, p0, Ln1/p;->b:Lm1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->S()I

    move-result p2

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->U()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez p2, :cond_0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_0
    if-eq v0, p1, :cond_3

    :goto_0
    move p1, v0

    goto :goto_1

    :cond_1
    iget-object p2, p0, Ln1/p;->b:Lm1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->R()I

    move-result p2

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->T()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez p2, :cond_2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_2
    if-eq v0, p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return p1
.end method

.method public final i()Ln1/g;
    .locals 1

    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    return-object v0
.end method

.method public final j()Lm1/e$b;
    .locals 1

    iget-object v0, p0, Ln1/p;->d:Lm1/e$b;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Ln1/p;->g:Z

    return v0
.end method

.method public final l()Ln1/m;
    .locals 1

    iget-object v0, p0, Ln1/p;->c:Ln1/m;

    return-object v0
.end method

.method public final m()Ln1/p$a;
    .locals 1

    iget-object v0, p0, Ln1/p;->j:Ln1/p$a;

    return-object v0
.end method

.method public final n()Lm1/e;
    .locals 1

    iget-object v0, p0, Ln1/p;->b:Lm1/e;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Ln1/p;->a:I

    return v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Ln1/p;->f:I

    return v0
.end method

.method public final q()Ln1/f;
    .locals 1

    iget-object v0, p0, Ln1/p;->h:Ln1/f;

    return-object v0
.end method

.method protected final r(Lm1/d;)Ln1/f;
    .locals 3

    .prologue
    const-string v0, "anchor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->g()Lm1/e;

    move-result-object v0

    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm1/d;->j()Lm1/d$b;

    move-result-object p1

    sget-object v2, Ln1/p$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/n;->H()Ln1/f;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    goto :goto_1

    :goto_2
    return-object v1
.end method

.method protected final s(Lm1/d;I)Ln1/f;
    .locals 2

    .prologue
    const-string v0, "anchor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->g()Lm1/e;

    move-result-object v0

    if-nez p2, :cond_1

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object p2

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lm1/d;->i()Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm1/d;->j()Lm1/d$b;

    move-result-object p1

    sget-object v0, Ln1/p$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p2, Ln1/p;->i:Ln1/f;

    goto :goto_2

    :cond_3
    iget-object v1, p2, Ln1/p;->h:Ln1/f;

    :goto_2
    return-object v1
.end method

.method public t()J
    .locals 2

    .prologue
    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0}, Ln1/f;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln1/p;->e:Ln1/g;

    invoke-virtual {v0}, Ln1/f;->j()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Ln1/p;->g:Z

    return v0
.end method

.method public final w(Lm1/e$b;)V
    .locals 0

    iput-object p1, p0, Ln1/p;->d:Lm1/e$b;

    return-void
.end method

.method public final x(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/p;->g:Z

    return-void
.end method

.method public final y(Ln1/m;)V
    .locals 0

    iput-object p1, p0, Ln1/p;->c:Ln1/m;

    return-void
.end method

.method public final z(Ln1/p$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln1/p;->j:Ln1/p$a;

    return-void
.end method
