.class public abstract Lh2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh2/Z;Lh2/Z;Lh2/t;)Z
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, p1, Lh2/Z$b;

    if-eqz v1, :cond_1

    instance-of v1, p0, Lh2/Z$a;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    instance-of v1, p0, Lh2/Z$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    instance-of v1, p1, Lh2/Z$a;

    if-eqz v1, :cond_2

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lh2/Z;->a()I

    move-result v1

    invoke-virtual {p1}, Lh2/Z;->a()I

    move-result v3

    if-eq v1, v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lh2/Z;->b()I

    move-result v1

    invoke-virtual {p1}, Lh2/Z;->b()I

    move-result v3

    if-eq v1, v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1, p2}, Lh2/Z;->e(Lh2/t;)I

    move-result p1

    invoke-virtual {p0, p2}, Lh2/Z;->e(Lh2/t;)I

    move-result p0

    if-gt p1, p0, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    return v0
.end method
