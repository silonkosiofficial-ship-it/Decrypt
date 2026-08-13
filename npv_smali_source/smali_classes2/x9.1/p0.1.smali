.class public abstract Lx9/p0;
.super Lx9/o;
.source "SourceFile"


# instance fields
.field private final b:Lv9/f;


# direct methods
.method public constructor <init>(Lt9/b;)V
    .locals 1

    const-string v0, "primitiveSerializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx9/o;-><init>(Lt9/b;Ly7/k;)V

    new-instance v0, Lx9/o0;

    invoke-interface {p1}, Lt9/b;->a()Lv9/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lx9/o0;-><init>(Lv9/f;)V

    iput-object v0, p0, Lx9/p0;->b:Lv9/f;

    return-void
.end method


# virtual methods
.method public final a()Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/p0;->b:Lv9/f;

    return-object v0
.end method

.method public final b(Lw9/h;)Ljava/lang/Object;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lx9/a;->k(Lw9/h;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lw9/j;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lx9/a;->j(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lx9/p0;->b:Lv9/f;

    invoke-interface {p1, v1, v0}, Lw9/j;->k(Lv9/f;I)Lw9/f;

    move-result-object p1

    invoke-virtual {p0, p1, p2, v0}, Lx9/p0;->z(Lw9/f;Ljava/lang/Object;I)V

    invoke-interface {p1, v1}, Lw9/f;->b(Lv9/f;)V

    return-void
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx9/p0;->t()Lx9/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lx9/n0;

    invoke-virtual {p0, p1}, Lx9/p0;->u(Lx9/n0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lx9/n0;

    invoke-virtual {p0, p1, p2}, Lx9/p0;->v(Lx9/n0;I)V

    return-void
.end method

.method protected final i(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method lead to boxing and must not be used, use writeContents instead"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx9/n0;

    invoke-virtual {p0, p1}, Lx9/p0;->y(Lx9/n0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Lx9/n0;

    invoke-virtual {p0, p1, p2, p3}, Lx9/p0;->x(Lx9/n0;ILjava/lang/Object;)V

    return-void
.end method

.method protected final t()Lx9/n0;
    .locals 1

    invoke-virtual {p0}, Lx9/p0;->w()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/a;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx9/n0;

    return-object v0
.end method

.method protected final u(Lx9/n0;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx9/n0;->d()I

    move-result p1

    return p1
.end method

.method protected final v(Lx9/n0;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lx9/n0;->b(I)V

    return-void
.end method

.method protected abstract w()Ljava/lang/Object;
.end method

.method protected final x(Lx9/n0;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method lead to boxing and must not be used, use Builder.append instead"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final y(Lx9/n0;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx9/n0;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract z(Lw9/f;Ljava/lang/Object;I)V
.end method
