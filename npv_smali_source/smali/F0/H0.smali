.class public final LF0/H0;
.super LV/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 0

    invoke-direct {p0, p1}, LV/a;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    invoke-virtual {p0}, LV/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-virtual {v0, p1, p2}, LF0/J;->n1(II)V

    return-void
.end method

.method public bridge synthetic c(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, LF0/J;

    invoke-virtual {p0, p1, p2}, LF0/H0;->m(ILF0/J;)V

    return-void
.end method

.method public f(III)V
    .locals 1

    invoke-virtual {p0}, LV/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-virtual {v0, p1, p2, p3}, LF0/J;->e1(III)V

    return-void
.end method

.method public bridge synthetic h(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, LF0/J;

    invoke-virtual {p0, p1, p2}, LF0/H0;->n(ILF0/J;)V

    return-void
.end method

.method public i()V
    .locals 1

    .prologue
    invoke-super {p0}, LV/a;->i()V

    invoke-virtual {p0}, LV/a;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-virtual {v0}, LF0/J;->n0()LF0/o0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/o0;->r()V

    :cond_0
    return-void
.end method

.method protected k()V
    .locals 1

    invoke-virtual {p0}, LV/a;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-virtual {v0}, LF0/J;->m1()V

    return-void
.end method

.method public m(ILF0/J;)V
    .locals 1

    invoke-virtual {p0}, LV/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF0/J;

    invoke-virtual {v0, p1, p2}, LF0/J;->B0(ILF0/J;)V

    return-void
.end method

.method public n(ILF0/J;)V
    .locals 0

    return-void
.end method
