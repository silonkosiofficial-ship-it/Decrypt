.class public abstract Lr8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LO7/b;)V
.end method

.method public abstract b(LO7/b;LO7/b;)V
.end method

.method public abstract c(LO7/b;LO7/b;)V
.end method

.method public d(LO7/b;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overridden"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LO7/b;->G0(Ljava/util/Collection;)V

    return-void
.end method
