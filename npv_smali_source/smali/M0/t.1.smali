.class public abstract LM0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;)LM0/s;
    .locals 0

    invoke-static/range {p0 .. p5}, LU0/e;->a(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;)LM0/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;ILjava/lang/Object;)LM0/s;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LM0/t;->a(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;)LM0/s;

    move-result-object p0

    return-object p0
.end method
