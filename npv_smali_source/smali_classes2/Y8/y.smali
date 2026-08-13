.class final LY8/y;
.super LY8/k;
.source "SourceFile"

# interfaces
.implements LY8/z;


# direct methods
.method public constructor <init>(Lm7/i;LY8/j;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, v0}, LY8/k;-><init>(Lm7/i;LY8/j;ZZ)V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    invoke-super {p0}, LW8/a;->f()Z

    move-result v0

    return v0
.end method

.method protected h1(Ljava/lang/Throwable;Z)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LY8/k;->k1()LY8/j;

    move-result-object v0

    invoke-interface {v0, p1}, LY8/C;->c(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p0}, LW8/a;->getContext()Lm7/i;

    move-result-object p2

    invoke-static {p2, p1}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic i1(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1}, LY8/y;->n1(Li7/M;)V

    return-void
.end method

.method protected n1(Li7/M;)V
    .locals 2

    invoke-virtual {p0}, LY8/k;->k1()LY8/j;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method
