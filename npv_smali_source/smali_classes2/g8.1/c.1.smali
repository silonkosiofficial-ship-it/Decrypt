.class public abstract Lg8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Li8/n;Lk8/c;Lk8/g;ZZZ)Lg8/w;
    .locals 2

    .prologue
    const-string v0, "proto"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll8/a;->d:Lp8/i$f;

    const-string v1, "propertySignature"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p3, :cond_2

    sget-object p3, Lm8/i;->a:Lm8/i;

    invoke-virtual {p3, p0, p1, p2, p5}, Lm8/i;->c(Li8/n;Lk8/c;Lk8/g;Z)Lm8/d$a;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    sget-object p1, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p1, p0}, Lg8/w$a;->b(Lm8/d;)Lg8/w;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz p4, :cond_3

    invoke-virtual {v0}, Ll8/a$d;->I()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {v0}, Ll8/a$d;->D()Ll8/a$c;

    move-result-object p2

    const-string p3, "getSyntheticMethod(...)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lg8/w$a;->c(Lk8/c;Ll8/a$c;)Lg8/w;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static synthetic b(Li8/n;Lk8/c;Lk8/g;ZZZILjava/lang/Object;)Lg8/w;
    .locals 7

    .prologue
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x20

    if-eqz p3, :cond_2

    const/4 p5, 0x1

    :cond_2
    move v6, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lg8/c;->a(Li8/n;Lk8/c;Lk8/g;ZZZ)Lg8/w;

    move-result-object p0

    return-object p0
.end method
