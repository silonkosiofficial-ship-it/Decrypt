.class public final LD0/C$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/i0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/C;->G(Ljava/lang/Object;Lx7/p;)LD0/i0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD0/C;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LD0/C;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LD0/C$g;->a:LD0/C;

    iput-object p2, p0, LD0/C$g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 2

    .prologue
    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v0}, LD0/C;->g(LD0/C;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LD0/C$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->H()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 4

    .prologue
    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-virtual {v0}, LD0/C;->B()V

    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v0}, LD0/C;->g(LD0/C;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LD0/C$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eqz v0, :cond_2

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->h(LD0/C;)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v2}, LD0/C;->h(LD0/C;)I

    move-result v2

    sub-int/2addr v1, v2

    if-lt v0, v1, :cond_0

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->j(LD0/C;)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-static {v1, v2}, LD0/C;->t(LD0/C;I)V

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->h(LD0/C;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, LD0/C;->s(LD0/C;I)V

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v2}, LD0/C;->h(LD0/C;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v2}, LD0/C;->j(LD0/C;)I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v2, v0, v1, v3}, LD0/C;->n(LD0/C;III)V

    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-virtual {v0, v1}, LD0/C;->x(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Item is not in pre-composed item range"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pre-composed items to dispose"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public f(Ljava/lang/Object;Lx7/l;)V
    .locals 2

    .prologue
    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v0}, LD0/C;->g(LD0/C;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LD0/C$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->k0()LF0/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, LF0/F0;->e(LF0/j;Ljava/lang/Object;Lx7/l;)V

    :cond_0
    return-void
.end method

.method public g(IJ)V
    .locals 3

    .prologue
    iget-object v0, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v0}, LD0/C;->g(LD0/C;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LD0/C$g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/J;->K0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LF0/J;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ltz p1, :cond_1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0}, LF0/J;->k()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget-object v1, p0, LD0/C$g;->a:LD0/C;

    invoke-static {v1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object v1

    invoke-static {v1, v2}, LF0/J;->s(LF0/J;Z)V

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v2

    invoke-virtual {v0}, LF0/J;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF0/J;

    invoke-interface {v2, p1, p2, p3}, LF0/o0;->l(LF0/J;J)V

    const/4 p1, 0x0

    invoke-static {v1, p1}, LF0/J;->s(LF0/J;Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pre-measure called on node that is not placed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bound of [0, "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void
.end method
