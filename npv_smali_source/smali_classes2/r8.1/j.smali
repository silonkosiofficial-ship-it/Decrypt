.class public abstract Lr8/j;
.super Lr8/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr8/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LO7/b;LO7/b;)V
    .locals 1

    const-string v0, "first"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lr8/j;->e(LO7/b;LO7/b;)V

    return-void
.end method

.method public c(LO7/b;LO7/b;)V
    .locals 1

    const-string v0, "fromSuper"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromCurrent"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lr8/j;->e(LO7/b;LO7/b;)V

    return-void
.end method

.method protected abstract e(LO7/b;LO7/b;)V
.end method
