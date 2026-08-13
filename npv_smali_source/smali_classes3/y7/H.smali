.class public abstract Ly7/H;
.super Ly7/J;
.source "SourceFile"

# interfaces
.implements LF7/n;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    sget-object v1, Ly7/f;->I:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ly7/J;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d()LF7/k$b;
    .locals 1

    invoke-virtual {p0}, Ly7/H;->d()LF7/n$a;

    move-result-object v0

    return-object v0
.end method

.method public d()LF7/n$a;
    .locals 1

    invoke-virtual {p0}, Ly7/J;->p()LF7/k;

    move-result-object v0

    check-cast v0, LF7/n;

    invoke-interface {v0}, LF7/n;->d()LF7/n$a;

    move-result-object v0

    return-object v0
.end method

.method protected e()LF7/b;
    .locals 1

    invoke-static {p0}, Ly7/P;->k(Ly7/H;)LF7/n;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1, p2}, LF7/n;->w(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
