.class public abstract LM0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/z;LM0/y;)LM0/A;
    .locals 1

    new-instance v0, LM0/A;

    invoke-direct {v0, p0, p1}, LM0/A;-><init>(LM0/z;LM0/y;)V

    return-object v0
.end method

.method public static final b(LM0/y;LM0/y;F)LM0/y;
    .locals 3

    .prologue
    invoke-virtual {p0}, LM0/y;->c()Z

    move-result v0

    invoke-virtual {p1}, LM0/y;->c()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LM0/y;

    invoke-virtual {p0}, LM0/y;->b()I

    move-result v1

    invoke-static {v1}, LM0/g;->d(I)LM0/g;

    move-result-object v1

    invoke-virtual {p1}, LM0/y;->b()I

    move-result v2

    invoke-static {v2}, LM0/g;->d(I)LM0/g;

    move-result-object v2

    invoke-static {v1, v2, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM0/g;

    invoke-virtual {v1}, LM0/g;->j()I

    move-result v1

    invoke-virtual {p0}, LM0/y;->c()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1}, LM0/y;->c()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p0, p1, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    const/4 p1, 0x0

    invoke-direct {v0, v1, p0, p1}, LM0/y;-><init>(IZLy7/k;)V

    return-object v0
.end method

.method public static final c(LM0/z;LM0/z;F)LM0/z;
    .locals 0

    return-object p0
.end method
