.class public abstract Lw9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/j;
.implements Lw9/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public final B(Lv9/f;IJ)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lw9/b;->D(J)V

    :cond_0
    return-void
.end method

.method public final C(Lv9/f;IC)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->p(C)V

    :cond_0
    return-void
.end method

.method public D(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public E(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public F(Lv9/f;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic G(Lt9/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/i;->c(Lw9/j;Lt9/e;Ljava/lang/Object;)V

    return-void
.end method

.method public H(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Non-serializable "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported by "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " encoder"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lv9/f;)Lw9/f;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Lv9/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lv9/f;IS)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->h(S)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    new-instance v0, Lt9/d;

    const-string v1, "\'null\' is not supported by default"

    invoke-direct {v0, v1}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lv9/f;IF)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->n(F)V

    :cond_0
    return-void
.end method

.method public final f(Lv9/f;IZ)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->l(Z)V

    :cond_0
    return-void
.end method

.method public g(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public h(S)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public i(Lv9/f;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public j(B)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic k(Lv9/f;I)Lw9/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/i;->a(Lw9/j;Lv9/f;I)Lw9/f;

    move-result-object p1

    return-object p1
.end method

.method public l(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lv9/f;II)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->A(I)V

    :cond_0
    return-void
.end method

.method public n(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic o(Lv9/f;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/e;->a(Lw9/f;Lv9/f;I)Z

    move-result p1

    return p1
.end method

.method public p(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic q()V
    .locals 0

    invoke-static {p0}, Lw9/i;->b(Lw9/j;)V

    return-void
.end method

.method public r(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lw9/b;->t(Lt9/e;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final s(Lv9/f;IB)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->j(B)V

    :cond_0
    return-void
.end method

.method public synthetic t(Lt9/e;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw9/i;->d(Lw9/j;Lt9/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final u(Lv9/f;I)Lw9/j;
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/b;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lx9/W;->a:Lx9/W;

    :goto_0
    return-object p1
.end method

.method public final v(Lv9/f;ID)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lw9/b;->g(D)V

    :cond_0
    return-void
.end method

.method public w(Lv9/f;)Lw9/j;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public x(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lw9/b;->G(Lt9/e;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final y(Lv9/f;ILjava/lang/String;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lw9/b;->F(Lv9/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lw9/b;->E(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
