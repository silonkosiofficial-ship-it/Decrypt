.class public abstract LJ7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LJ7/e;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LJ7/e;->m()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method
