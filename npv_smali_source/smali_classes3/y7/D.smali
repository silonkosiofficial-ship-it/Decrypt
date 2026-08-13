.class public abstract Ly7/D;
.super Ly7/J;
.source "SourceFile"

# interfaces
.implements LF7/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly7/J;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, LF7/l;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()LF7/k$b;
    .locals 1

    invoke-virtual {p0}, Ly7/D;->d()LF7/l$a;

    move-result-object v0

    return-object v0
.end method

.method public d()LF7/l$a;
    .locals 1

    invoke-virtual {p0}, Ly7/J;->p()LF7/k;

    move-result-object v0

    check-cast v0, LF7/l;

    invoke-interface {v0}, LF7/l;->d()LF7/l$a;

    move-result-object v0

    return-object v0
.end method

.method protected e()LF7/b;
    .locals 1

    invoke-static {p0}, Ly7/P;->i(Ly7/D;)LF7/l;

    move-result-object v0

    return-object v0
.end method
