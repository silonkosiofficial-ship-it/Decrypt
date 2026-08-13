.class public abstract Lx9/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IILv9/f;)V
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    not-int p0, p0

    and-int/2addr p0, p1

    const/4 p1, 0x0

    :goto_0
    const/16 v1, 0x20

    if-ge p1, v1, :cond_1

    and-int/lit8 v1, p0, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p2, p1}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    ushr-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lt9/c;

    invoke-interface {p2}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lt9/c;-><init>(Ljava/util/List;Ljava/lang/String;)V

    throw p0
.end method
