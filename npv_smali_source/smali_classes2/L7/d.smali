.class public abstract LL7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL7/c;LO7/e;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/f;->x(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LL7/c;->b()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p1}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ln8/b;->g()Ln8/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method
