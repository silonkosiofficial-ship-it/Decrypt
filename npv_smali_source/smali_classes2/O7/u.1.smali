.class public abstract LO7/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO7/u;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LO7/u;->b()LO7/n0;

    move-result-object v0

    invoke-virtual {p1}, LO7/u;->b()LO7/n0;

    move-result-object p1

    invoke-virtual {v0, p1}, LO7/n0;->a(LO7/n0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public abstract b()LO7/n0;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, LO7/u;->b()LO7/n0;

    move-result-object v0

    invoke-virtual {v0}, LO7/n0;->c()Z

    move-result v0

    return v0
.end method

.method public abstract e(Lz8/g;LO7/q;LO7/m;Z)Z
.end method

.method public abstract f()LO7/u;
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LO7/u;->b()LO7/n0;

    move-result-object v0

    invoke-virtual {v0}, LO7/n0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
