.class public abstract Lt8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/G;)Ljava/util/Collection;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/G;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->D()LF8/M;

    move-result-object v0

    invoke-interface {p0}, LO7/G;->t()LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->F()LF8/M;

    move-result-object v1

    invoke-interface {p0}, LO7/G;->t()LL7/g;

    move-result-object v2

    invoke-virtual {v2}, LL7/g;->t()LF8/M;

    move-result-object v2

    invoke-interface {p0}, LO7/G;->t()LL7/g;

    move-result-object p0

    invoke-virtual {p0}, LL7/g;->T()LF8/M;

    move-result-object p0

    const/4 v3, 0x4

    new-array v3, v3, [LF8/M;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    aput-object p0, v3, v0

    invoke-static {v3}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method
