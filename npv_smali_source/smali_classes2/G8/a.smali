.class public abstract LG8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZZLG8/b;LG8/f;LG8/g;)LF8/d0;
    .locals 8

    const-string v0, "typeSystemContext"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/d0;

    const/4 v4, 0x1

    move-object v1, v0

    move v2, p0

    move v3, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, LF8/d0;-><init>(ZZZLJ8/o;LF8/g;LF8/h;)V

    return-object v0
.end method

.method public static synthetic b(ZZLG8/b;LG8/f;LG8/g;ILjava/lang/Object;)LF8/d0;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    sget-object p2, LG8/o;->a:LG8/o;

    :cond_1
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_2

    sget-object p3, LG8/f$a;->a:LG8/f$a;

    :cond_2
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_3

    sget-object p4, LG8/g$a;->a:LG8/g$a;

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, LG8/a;->a(ZZLG8/b;LG8/f;LG8/g;)LF8/d0;

    move-result-object p0

    return-object p0
.end method
