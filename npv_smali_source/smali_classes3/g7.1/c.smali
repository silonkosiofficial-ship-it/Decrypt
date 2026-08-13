.class public abstract Lg7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg7/b$b;)Lg7/a;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg7/b;->a()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    invoke-virtual {p0}, Lg7/b;->a()[B

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    invoke-static/range {v3 .. v8}, Ld7/c;->e(Lo9/p;[BIIILjava/lang/Object;)V

    invoke-interface {v0}, Lo9/q;->p()S

    move-result p0

    const/4 v1, 0x0

    const/4 v3, 0x3

    invoke-static {v0, v2, v1, v3, v2}, Ld7/e;->b(Lo9/q;Ljava/nio/charset/Charset;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lg7/a;

    invoke-direct {v1, p0, v0}, Lg7/a;-><init>(SLjava/lang/String;)V

    return-object v1
.end method
