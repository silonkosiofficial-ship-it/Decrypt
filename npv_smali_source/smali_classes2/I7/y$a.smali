.class public abstract LI7/y$a;
.super LI7/j;
.source "SourceFile"

# interfaces
.implements LF7/f;
.implements LF7/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI7/j;-><init>()V

    return-void
.end method


# virtual methods
.method public E()Z
    .locals 1

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->E()Z

    move-result v0

    return v0
.end method

.method public abstract F()LO7/T;
.end method

.method public abstract G()LI7/y;
.end method

.method public t()LI7/n;
    .locals 1

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->t()LI7/n;

    move-result-object v0

    return-object v0
.end method

.method public x()LJ7/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public y()Z
    .locals 1

    invoke-virtual {p0}, LI7/y$a;->F()LO7/T;

    move-result-object v0

    invoke-interface {v0}, LO7/y;->y()Z

    move-result v0

    return v0
.end method
