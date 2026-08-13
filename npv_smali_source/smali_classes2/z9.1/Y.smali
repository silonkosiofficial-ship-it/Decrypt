.class public Lz9/Y;
.super Lw9/a;
.source "SourceFile"

# interfaces
.implements Ly9/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/Y$a;,
        Lz9/Y$b;
    }
.end annotation


# instance fields
.field private final b:Ly9/b;

.field private final c:Lz9/i0;

.field public final d:Lz9/a;

.field private final e:LA9/b;

.field private f:I

.field private g:Lz9/Y$a;

.field private final h:Ly9/g;

.field private final i:Lz9/D;


# direct methods
.method public constructor <init>(Ly9/b;Lz9/i0;Lz9/a;Lv9/f;Lz9/Y$a;)V
    .locals 0

    .prologue
    const-string p5, "json"

    invoke-static {p1, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "mode"

    invoke-static {p2, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "lexer"

    invoke-static {p3, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "descriptor"

    invoke-static {p4, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lw9/a;-><init>()V

    iput-object p1, p0, Lz9/Y;->b:Ly9/b;

    iput-object p2, p0, Lz9/Y;->c:Lz9/i0;

    iput-object p3, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {p1}, Ly9/b;->f()LA9/b;

    move-result-object p2

    iput-object p2, p0, Lz9/Y;->e:LA9/b;

    const/4 p2, -0x1

    iput p2, p0, Lz9/Y;->f:I

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    iput-object p1, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {p1}, Ly9/g;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lz9/D;

    invoke-direct {p1, p4}, Lz9/D;-><init>(Lv9/f;)V

    :goto_0
    iput-object p1, p0, Lz9/Y;->i:Lz9/D;

    return-void
.end method

.method private final I()V
    .locals 8

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->D()B

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "Unexpected leading comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method private final J(Lv9/f;I)Z
    .locals 5

    .prologue
    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-interface {p1, p2}, Lv9/f;->i(I)Z

    move-result v1

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v2, p2}, Lz9/a;->L(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v2

    sget-object v3, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v2, v3}, Lz9/a;->L(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    move p2, v3

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    iget-object v4, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {v4}, Ly9/g;->q()Z

    move-result v4

    invoke-virtual {v2, v4}, Lz9/a;->E(Z)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1, v0, v2}, Lz9/I;->i(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, p2

    goto :goto_1

    :cond_4
    move p1, v3

    :goto_1
    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    if-nez v1, :cond_5

    if-eqz p1, :cond_1

    :cond_5
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {p1}, Lz9/a;->q()Ljava/lang/String;

    :goto_2
    return p2
.end method

.method private final K()I
    .locals 9

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->K()Z

    move-result v0

    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v1}, Lz9/a;->f()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    iget v1, p0, Lz9/Y;->f:I

    if-eq v1, v2, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lz9/Y;->d:Lz9/a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "Expected end of the array or comma"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    :goto_0
    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lz9/Y;->f:I

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_4

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    const-string v1, "array"

    invoke-static {v0, v1}, Lz9/G;->g(Lz9/a;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_4
    :goto_1
    return v2
.end method

.method private final L()I
    .locals 11

    .prologue
    iget v0, p0, Lz9/Y;->f:I

    rem-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, -0x1

    if-eqz v1, :cond_1

    if-eq v0, v4, :cond_2

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->K()Z

    move-result v3

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    const/16 v5, 0x3a

    invoke-virtual {v0, v5}, Lz9/a;->m(C)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v1, :cond_6

    iget v0, p0, Lz9/Y;->f:I

    if-ne v0, v4, :cond_4

    iget-object v5, p0, Lz9/Y;->d:Lz9/a;

    xor-int/lit8 v0, v3, 0x1

    iget v7, v5, Lz9/a;->a:I

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "Unexpected leading comma"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_4
    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    iget v0, v1, Lz9/a;->a:I

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Expected comma after the key-value pair"

    const/4 v4, 0x0

    move v3, v0

    invoke-static/range {v1 .. v6}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_6
    :goto_2
    iget v0, p0, Lz9/Y;->f:I

    add-int/lit8 v4, v0, 0x1

    iput v4, p0, Lz9/Y;->f:I

    goto :goto_3

    :cond_7
    if-eqz v3, :cond_9

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v1}, Lz9/G;->h(Lz9/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_9
    :goto_3
    return v4
.end method

.method private final M(Lv9/f;)I
    .locals 5

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->K()Z

    move-result v0

    :goto_0
    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v1}, Lz9/a;->f()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lz9/Y;->N()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    const/16 v3, 0x3a

    invoke-virtual {v1, v3}, Lz9/a;->m(C)V

    iget-object v1, p0, Lz9/Y;->b:Ly9/b;

    invoke-static {p1, v1, v0}, Lz9/I;->i(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result v1

    const/4 v3, -0x3

    const/4 v4, 0x0

    if-eq v1, v3, :cond_2

    iget-object v2, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {v2}, Ly9/g;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, p1, v1}, Lz9/Y;->J(Lv9/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v1}, Lz9/a;->K()Z

    move-result v1

    move v2, v4

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lz9/Y;->i:Lz9/D;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, Lz9/D;->c(I)V

    :cond_1
    return v1

    :cond_2
    move v1, v4

    :goto_1
    if-eqz v2, :cond_3

    invoke-direct {p0, p1, v0}, Lz9/Y;->O(Lv9/f;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_6

    iget-object p1, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    invoke-virtual {p1}, Ly9/g;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v2, v0}, Lz9/G;->h(Lz9/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_6
    :goto_2
    iget-object p1, p0, Lz9/Y;->i:Lz9/D;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lz9/D;->d()I

    move-result p1

    goto :goto_3

    :cond_7
    const/4 p1, -0x1

    :goto_3
    return p1
.end method

.method private final N()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->t()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->j()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final O(Lv9/f;Ljava/lang/String;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-static {p1, v0}, Lz9/I;->m(Lv9/f;Ly9/b;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lz9/Y;->g:Lz9/Y$a;

    invoke-direct {p0, p1, p2}, Lz9/Y;->Q(Lz9/Y$a;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    iget-object p1, p1, Lz9/a;->b:Lz9/J;

    invoke-virtual {p1}, Lz9/J;->b()V

    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {p1, p2}, Lz9/a;->z(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    iget-object p2, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {p2}, Ly9/g;->q()Z

    move-result p2

    invoke-virtual {p1, p2}, Lz9/a;->G(Z)V

    :goto_1
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {p1}, Lz9/a;->K()Z

    move-result p1

    return p1
.end method

.method private final P(Lv9/f;)V
    .locals 2

    .prologue
    :cond_0
    invoke-virtual {p0, p1}, Lz9/Y;->r(Lv9/f;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void
.end method

.method private final Q(Lz9/Y$a;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public A()S
    .locals 10

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-short v2, v2

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lz9/Y;->d:Lz9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse short for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Y;->c:Lz9/i0;

    sget-object v1, Lz9/i0;->G:Lz9/i0;

    if-ne v0, v1, :cond_0

    and-int/lit8 v0, p2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    iget-object v1, v1, Lz9/a;->b:Lz9/J;

    invoke-virtual {v1}, Lz9/J;->d()V

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lw9/a;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_2

    iget-object p2, p0, Lz9/Y;->d:Lz9/a;

    iget-object p2, p2, Lz9/a;->b:Lz9/J;

    invoke-virtual {p2, p1}, Lz9/J;->f(Ljava/lang/Object;)V

    :cond_2
    return-object p1
.end method

.method public C()F
    .locals 6

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->b()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v1, v0}, Lz9/G;->k(Lz9/a;Ljava/lang/Number;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return v0

    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "float"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public F()D
    .locals 6

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v2}, Ly9/b;->e()Ly9/g;

    move-result-object v2

    invoke-virtual {v2}, Ly9/g;->b()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v2, v0}, Lz9/G;->k(Lz9/a;Ljava/lang/Number;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return-wide v0

    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "double"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public a(Lv9/f;)Lw9/d;
    .locals 7

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-static {v0, p1}, Lz9/j0;->b(Ly9/b;Lv9/f;)Lz9/i0;

    move-result-object v3

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    iget-object v0, v0, Lz9/a;->b:Lz9/J;

    invoke-virtual {v0, p1}, Lz9/J;->c(Lv9/f;)V

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    iget-char v1, v3, Lz9/i0;->C:C

    invoke-virtual {v0, v1}, Lz9/a;->m(C)V

    invoke-direct {p0}, Lz9/Y;->I()V

    sget-object v0, Lz9/Y$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz9/Y;->c:Lz9/i0;

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lz9/Y;

    iget-object v2, p0, Lz9/Y;->b:Ly9/b;

    iget-object v4, p0, Lz9/Y;->d:Lz9/a;

    iget-object v6, p0, Lz9/Y;->g:Lz9/Y$a;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lz9/Y;-><init>(Ly9/b;Lz9/i0;Lz9/a;Lv9/f;Lz9/Y$a;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lz9/Y;

    iget-object v2, p0, Lz9/Y;->b:Ly9/b;

    iget-object v4, p0, Lz9/Y;->d:Lz9/a;

    iget-object v6, p0, Lz9/Y;->g:Lz9/Y$a;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lz9/Y;-><init>(Ly9/b;Lz9/i0;Lz9/a;Lv9/f;Lz9/Y$a;)V

    :goto_0
    return-object v0
.end method

.method public b(Lv9/f;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lv9/f;->e()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-static {p1, v0}, Lz9/I;->m(Lv9/f;Ly9/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lz9/Y;->P(Lv9/f;)V

    :cond_0
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {p1}, Lz9/a;->K()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    invoke-virtual {p1}, Ly9/g;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    const-string v0, ""

    invoke-static {p1, v0}, Lz9/G;->g(Lz9/a;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    iget-object v0, p0, Lz9/Y;->c:Lz9/i0;

    iget-char v0, v0, Lz9/i0;->D:C

    invoke-virtual {p1, v0}, Lz9/a;->m(C)V

    iget-object p1, p0, Lz9/Y;->d:Lz9/a;

    iget-object p1, p1, Lz9/a;->b:Lz9/J;

    invoke-virtual {p1}, Lz9/J;->b()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->h()Z

    move-result v0

    return v0
.end method

.method public f()C
    .locals 7

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    iget-object v1, p0, Lz9/Y;->d:Lz9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected single char, but got \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public k(Lv9/f;)I
    .locals 4

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {p0}, Lz9/Y;->o()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " at path "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz9/Y;->d:Lz9/a;

    iget-object v3, v3, Lz9/a;->b:Lz9/J;

    invoke-virtual {v3}, Lz9/J;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lz9/I;->j(Lv9/f;Ly9/b;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public l()Ly9/i;
    .locals 3

    new-instance v0, Lz9/W;

    iget-object v1, p0, Lz9/Y;->b:Ly9/b;

    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    iget-object v2, p0, Lz9/Y;->d:Lz9/a;

    invoke-direct {v0, v1, v2}, Lz9/W;-><init>(Ly9/g;Lz9/a;)V

    invoke-virtual {v0}, Lz9/W;->e()Ly9/i;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 10

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lz9/Y;->d:Lz9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse int for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public n()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, Lz9/Y;->h:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->t()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public p(Lv9/f;)Lw9/h;
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz9/a0;->b(Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lz9/B;

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    iget-object v1, p0, Lz9/Y;->b:Ly9/b;

    invoke-direct {p1, v0, v1}, Lz9/B;-><init>(Lz9/a;Ly9/b;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lw9/a;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public q()J
    .locals 2

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public r(Lv9/f;)I
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Y;->c:Lz9/i0;

    sget-object v1, Lz9/Y$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lz9/Y;->K()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lz9/Y;->M(Lv9/f;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lz9/Y;->L()I

    move-result p1

    :goto_0
    iget-object v0, p0, Lz9/Y;->c:Lz9/i0;

    sget-object v1, Lz9/i0;->G:Lz9/i0;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    iget-object v0, v0, Lz9/a;->b:Lz9/J;

    invoke-virtual {v0, p1}, Lz9/J;->g(I)V

    :cond_2
    return p1
.end method

.method public s()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lz9/Y;->i:Lz9/D;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz9/D;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lz9/a;->M(Lz9/a;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v1, v3

    :cond_1
    return v1
.end method

.method public x(Lt9/a;)Ljava/lang/Object;
    .locals 5

    .prologue
    const-string v0, "deserializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1, p0}, Lt9/a;->b(Lw9/h;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lt9/c; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "at path"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    throw p1

    :cond_0
    new-instance v0, Lt9/c;

    invoke-virtual {p1}, Lt9/c;->a()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " at path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz9/Y;->d:Lz9/a;

    iget-object v3, v3, Lz9/a;->b:Lz9/J;

    invoke-virtual {v3}, Lz9/J;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lt9/c;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public y()B
    .locals 10

    .prologue
    iget-object v0, p0, Lz9/Y;->d:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->n()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-byte v2, v2

    int-to-long v3, v2

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    iget-object v4, p0, Lz9/Y;->d:Lz9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse byte for input \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method
