.class abstract Lz9/e;
.super Lx9/V;
.source "SourceFile"

# interfaces
.implements Ly9/s;


# instance fields
.field private final b:Ly9/b;

.field private final c:Lx7/l;

.field protected final d:Ly9/g;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ly9/b;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Lx9/V;-><init>()V

    iput-object p1, p0, Lz9/e;->b:Ly9/b;

    iput-object p2, p0, Lz9/e;->c:Lx7/l;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    iput-object p1, p0, Lz9/e;->d:Ly9/g;

    return-void
.end method

.method public synthetic constructor <init>(Ly9/b;Lx7/l;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz9/e;-><init>(Ly9/b;Lx7/l;)V

    return-void
.end method

.method public static synthetic c0(Lz9/e;Ly9/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, Lz9/e;->d0(Lz9/e;Ly9/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lz9/e;Ly9/i;)Li7/M;
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->T()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final t0(Ljava/lang/String;Lv9/f;)Lz9/e$a;
    .locals 1

    new-instance v0, Lz9/e$a;

    invoke-direct {v0, p0, p1, p2}, Lz9/e$a;-><init>(Lz9/e;Ljava/lang/String;Lv9/f;)V

    return-object v0
.end method

.method private final u0(Ljava/lang/String;)Lz9/e$b;
    .locals 1

    new-instance v0, Lz9/e$b;

    invoke-direct {v0, p0, p1}, Lz9/e$b;-><init>(Lz9/e;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic H(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->e0(Ljava/lang/String;Z)V

    return-void
.end method

.method public bridge synthetic I(Ljava/lang/Object;B)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->f0(Ljava/lang/String;B)V

    return-void
.end method

.method public bridge synthetic J(Ljava/lang/Object;C)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->g0(Ljava/lang/String;C)V

    return-void
.end method

.method public bridge synthetic K(Ljava/lang/Object;D)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lz9/e;->h0(Ljava/lang/String;D)V

    return-void
.end method

.method public bridge synthetic L(Ljava/lang/Object;Lv9/f;I)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lz9/e;->i0(Ljava/lang/String;Lv9/f;I)V

    return-void
.end method

.method public bridge synthetic M(Ljava/lang/Object;F)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->j0(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic N(Ljava/lang/Object;Lv9/f;)Lw9/j;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->k0(Ljava/lang/String;Lv9/f;)Lw9/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic O(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->l0(Ljava/lang/String;I)V

    return-void
.end method

.method public bridge synthetic P(Ljava/lang/Object;J)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lz9/e;->m0(Ljava/lang/String;J)V

    return-void
.end method

.method public bridge synthetic Q(Ljava/lang/Object;S)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->o0(Ljava/lang/String;S)V

    return-void
.end method

.method public bridge synthetic R(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/e;->p0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected S(Lv9/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz9/e;->c:Lx7/l;

    invoke-virtual {p0}, Lz9/e;->q0()Ly9/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "parentName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "childName"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method protected Z(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/e;->b:Ly9/b;

    invoke-static {p1, v0, p2}, Lz9/I;->h(Lv9/f;Ly9/b;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lv9/f;)Lw9/f;
    .locals 5

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->U()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz9/e;->c:Lx7/l;

    goto :goto_0

    :cond_0
    new-instance v0, Lz9/d;

    invoke-direct {v0, p0}, Lz9/d;-><init>(Lz9/e;)V

    :goto_0
    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v1

    sget-object v2, Lv9/n$b;->a:Lv9/n$b;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    instance-of v2, v1, Lv9/c;

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    sget-object v2, Lv9/n$c;->a:Lv9/n$c;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lz9/e;->b:Ly9/b;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Lv9/f;->h(I)Lv9/f;

    move-result-object v2

    invoke-virtual {v1}, Ly9/b;->f()LA9/b;

    move-result-object v3

    invoke-static {v2, v3}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object v2

    invoke-interface {v2}, Lv9/f;->j()Lv9/m;

    move-result-object v3

    instance-of v4, v3, Lv9/d;

    if-nez v4, :cond_4

    sget-object v4, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lz9/T;

    iget-object v2, p0, Lz9/e;->b:Ly9/b;

    invoke-direct {v1, v2, v0}, Lz9/T;-><init>(Ly9/b;Lx7/l;)V

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lz9/G;->d(Lv9/f;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    new-instance v1, Lz9/V;

    iget-object v2, p0, Lz9/e;->b:Ly9/b;

    invoke-direct {v1, v2, v0}, Lz9/V;-><init>(Ly9/b;Lx7/l;)V

    goto :goto_3

    :cond_5
    new-instance v1, Lz9/Q;

    iget-object v2, p0, Lz9/e;->b:Ly9/b;

    invoke-direct {v1, v2, v0}, Lz9/Q;-><init>(Ly9/b;Lx7/l;)V

    goto :goto_3

    :cond_6
    :goto_2
    new-instance v1, Lz9/T;

    iget-object v2, p0, Lz9/e;->b:Ly9/b;

    invoke-direct {v1, v2, v0}, Lz9/T;-><init>(Ly9/b;Lx7/l;)V

    :goto_3
    iget-object v0, p0, Lz9/e;->e:Ljava/lang/String;

    if-eqz v0, :cond_a

    instance-of v2, v1, Lz9/V;

    if-eqz v2, :cond_8

    move-object v2, v1

    check-cast v2, Lz9/V;

    const-string v3, "key"

    invoke-static {v0}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lz9/V;->v0(Ljava/lang/String;Ly9/i;)V

    iget-object v0, p0, Lz9/e;->f:Ljava/lang/String;

    if-nez v0, :cond_7

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v0

    :cond_7
    invoke-static {v0}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p1

    const-string v0, "value"

    invoke-virtual {v2, v0, p1}, Lz9/V;->v0(Ljava/lang/String;Ly9/i;)V

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lz9/e;->f:Ljava/lang/String;

    if-nez v2, :cond_9

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v2

    :cond_9
    invoke-static {v2}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    :goto_4
    const/4 p1, 0x0

    iput-object p1, p0, Lz9/e;->e:Ljava/lang/String;

    iput-object p1, p0, Lz9/e;->f:Ljava/lang/String;

    :cond_a
    return-object v1
.end method

.method public d()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lx9/C0;->U()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lz9/e;->c:Lx7/l;

    sget-object v1, Ly9/A;->INSTANCE:Ly9/A;

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Lz9/e;->n0(Ljava/lang/String;)V

    return-void
.end method

.method protected e0(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->a(Ljava/lang/Boolean;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected f0(Ljava/lang/String;B)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected g0(Ljava/lang/String;C)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected h0(Ljava/lang/String;D)V
    .locals 1

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    iget-object v0, p0, Lz9/e;->d:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p0}, Lz9/e;->q0()Ly9/i;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lz9/G;->c(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method protected i0(Ljava/lang/String;Lv9/f;I)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected j0(Ljava/lang/String;F)V
    .locals 1

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    iget-object v0, p0, Lz9/e;->d:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p0}, Lz9/e;->q0()Ly9/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p1, v0}, Lz9/G;->c(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method protected k0(Ljava/lang/String;Lv9/f;)Lw9/j;
    .locals 1

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lz9/a0;->b(Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lz9/e;->u0(Ljava/lang/String;)Lz9/e$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lz9/a0;->a(Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Lz9/e;->t0(Ljava/lang/String;Lv9/f;)Lz9/e$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Lx9/C0;->N(Ljava/lang/Object;Lv9/f;)Lw9/j;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected l0(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected m0(Ljava/lang/String;J)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected n0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly9/A;->INSTANCE:Ly9/A;

    invoke-virtual {p0, p1, v0}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method public o(Lv9/f;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz9/e;->d:Ly9/g;

    invoke-virtual {p1}, Ly9/g;->i()Z

    move-result p1

    return p1
.end method

.method protected o0(Ljava/lang/String;S)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p2}, Ly9/j;->b(Ljava/lang/Number;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method protected p0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public abstract q0()Ly9/i;
.end method

.method protected final r0()Lx7/l;
    .locals 1

    iget-object v0, p0, Lz9/e;->c:Lx7/l;

    return-object v0
.end method

.method public final s0()LA9/b;
    .locals 1

    iget-object v0, p0, Lz9/e;->b:Ly9/b;

    invoke-virtual {v0}, Ly9/b;->f()LA9/b;

    move-result-object v0

    return-object v0
.end method

.method public t(Lt9/e;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->U()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-virtual {p0}, Lz9/e;->s0()LA9/b;

    move-result-object v1

    invoke-static {v0, v1}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object v0

    invoke-static {v0}, Lz9/h0;->b(Lv9/f;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lz9/L;

    iget-object v1, p0, Lz9/e;->b:Ly9/b;

    iget-object v2, p0, Lz9/e;->c:Lx7/l;

    invoke-direct {v0, v1, v2}, Lz9/L;-><init>(Ly9/b;Lx7/l;)V

    invoke-virtual {v0, p1, p2}, Lz9/e;->t(Lt9/e;Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v0

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_1
    invoke-interface {p1, p0, p2}, Lt9/e;->e(Lw9/j;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v0

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->f()Ly9/a;

    move-result-object v0

    sget-object v1, Lz9/X$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    sget-object v1, Lv9/n$a;->a:Lv9/n$a;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lv9/n$d;->a:Lv9/n$d;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_4
    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v1

    invoke-static {v0, v1}, Lz9/X;->a(Lv9/f;Ly9/b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v1

    invoke-interface {v1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v0, p0, Lz9/e;->e:Ljava/lang/String;

    iput-object v1, p0, Lz9/e;->f:Ljava/lang/String;

    goto :goto_1

    :goto_3
    return-void
.end method

.method public abstract v0(Ljava/lang/String;Ly9/i;)V
.end method

.method public w(Lv9/f;)Lw9/j;
    .locals 3

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->U()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz9/e;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lz9/e;->f:Ljava/lang/String;

    :cond_0
    invoke-super {p0, p1}, Lx9/C0;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Lz9/L;

    iget-object v1, p0, Lz9/e;->b:Ly9/b;

    iget-object v2, p0, Lz9/e;->c:Lx7/l;

    invoke-direct {v0, v1, v2}, Lz9/L;-><init>(Ly9/b;Lx7/l;)V

    invoke-virtual {v0, p1}, Lz9/e;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final z()Ly9/b;
    .locals 1

    iget-object v0, p0, Lz9/e;->b:Ly9/b;

    return-object v0
.end method
