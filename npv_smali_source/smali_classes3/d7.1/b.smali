.class public abstract Ld7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo9/a;I)[B
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lo9/r;->b(Lo9/q;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lo9/a;IILjava/lang/Object;)[B
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide p1

    long-to-int p1, p1

    :cond_0
    invoke-static {p0, p1}, Ld7/b;->a(Lo9/a;I)[B

    move-result-object p0

    return-object p0
.end method
