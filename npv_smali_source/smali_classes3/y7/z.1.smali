.class public abstract Ly7/z;
.super Ly7/B;
.source "SourceFile"

# interfaces
.implements LF7/i;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly7/B;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d()LF7/k$b;
    .locals 1

    invoke-virtual {p0}, Ly7/z;->d()LF7/m$a;

    move-result-object v0

    return-object v0
.end method

.method public d()LF7/m$a;
    .locals 1

    invoke-virtual {p0}, Ly7/J;->p()LF7/k;

    move-result-object v0

    check-cast v0, LF7/i;

    invoke-interface {v0}, LF7/m;->d()LF7/m$a;

    move-result-object v0

    return-object v0
.end method

.method protected e()LF7/b;
    .locals 1

    invoke-static {p0}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()LF7/g$a;
    .locals 1

    invoke-virtual {p0}, Ly7/z;->i()LF7/i$a;

    move-result-object v0

    return-object v0
.end method

.method public i()LF7/i$a;
    .locals 1

    invoke-virtual {p0}, Ly7/J;->p()LF7/k;

    move-result-object v0

    check-cast v0, LF7/i;

    invoke-interface {v0}, LF7/i;->i()LF7/i$a;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, LF7/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
