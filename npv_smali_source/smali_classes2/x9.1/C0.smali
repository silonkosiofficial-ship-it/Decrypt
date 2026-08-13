.class public abstract Lx9/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/j;
.implements Lw9/f;


# instance fields
.field private final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method private final F(Lv9/f;I)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/C0;->X(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->O(Ljava/lang/Object;I)V

    return-void
.end method

.method public final B(Lv9/f;IJ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, Lx9/C0;->P(Ljava/lang/Object;J)V

    return-void
.end method

.method public final C(Lv9/f;IC)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->J(Ljava/lang/Object;C)V

    return-void
.end method

.method public final D(J)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lx9/C0;->P(Ljava/lang/Object;J)V

    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->R(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic G(Lt9/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/i;->c(Lw9/j;Lt9/e;Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract H(Ljava/lang/Object;Z)V
.end method

.method protected abstract I(Ljava/lang/Object;B)V
.end method

.method protected abstract J(Ljava/lang/Object;C)V
.end method

.method protected abstract K(Ljava/lang/Object;D)V
.end method

.method protected abstract L(Ljava/lang/Object;Lv9/f;I)V
.end method

.method protected abstract M(Ljava/lang/Object;F)V
.end method

.method protected N(Ljava/lang/Object;Lv9/f;)Lw9/j;
    .locals 1

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx9/C0;->X(Ljava/lang/Object;)V

    return-object p0
.end method

.method protected abstract O(Ljava/lang/Object;I)V
.end method

.method protected abstract P(Ljava/lang/Object;J)V
.end method

.method protected abstract Q(Ljava/lang/Object;S)V
.end method

.method protected abstract R(Ljava/lang/Object;Ljava/lang/String;)V
.end method

.method protected abstract S(Lv9/f;)V
.end method

.method protected final T()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final U()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected abstract V(Lv9/f;I)Ljava/lang/Object;
.end method

.method protected final W()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lt9/d;

    const-string v1, "No tag in stack for requested element"

    invoke-direct {v0, v1}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final X(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lv9/f;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx9/C0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lx9/C0;->S(Lv9/f;)V

    return-void
.end method

.method public final c(Lv9/f;IS)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->Q(Ljava/lang/Object;S)V

    return-void
.end method

.method public final e(Lv9/f;IF)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->M(Ljava/lang/Object;F)V

    return-void
.end method

.method public final f(Lv9/f;IZ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->H(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final g(D)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lx9/C0;->K(Ljava/lang/Object;D)V

    return-void
.end method

.method public final h(S)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->Q(Ljava/lang/Object;S)V

    return-void
.end method

.method public final i(Lv9/f;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lx9/C0;->L(Ljava/lang/Object;Lv9/f;I)V

    return-void
.end method

.method public final j(B)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->I(Ljava/lang/Object;B)V

    return-void
.end method

.method public synthetic k(Lv9/f;I)Lw9/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/i;->a(Lw9/j;Lv9/f;I)Lw9/f;

    move-result-object p1

    return-object p1
.end method

.method public final l(Z)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->H(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final m(Lv9/f;II)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->O(Ljava/lang/Object;I)V

    return-void
.end method

.method public final n(F)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->M(Ljava/lang/Object;F)V

    return-void
.end method

.method public final p(C)V
    .locals 1

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->J(Ljava/lang/Object;C)V

    return-void
.end method

.method public r(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lx9/C0;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lx9/C0;->t(Lt9/e;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final s(Lv9/f;IB)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->I(Ljava/lang/Object;B)V

    return-void
.end method

.method public abstract synthetic t(Lt9/e;Ljava/lang/Object;)V
.end method

.method public final u(Lv9/f;I)Lw9/j;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lx9/C0;->N(Ljava/lang/Object;Lv9/f;)Lw9/j;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lv9/f;ID)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, Lx9/C0;->K(Ljava/lang/Object;D)V

    return-void
.end method

.method public w(Lv9/f;)Lw9/j;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/C0;->N(Ljava/lang/Object;Lv9/f;)Lw9/j;

    move-result-object p1

    return-object p1
.end method

.method public x(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lx9/C0;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lx9/C0;->G(Lt9/e;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final y(Lv9/f;ILjava/lang/String;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/C0;->V(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lx9/C0;->R(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
