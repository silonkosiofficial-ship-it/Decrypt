.class public abstract LX7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ln8/c;Ljava/lang/String;)Ln8/c;
    .locals 0

    invoke-static {p0, p1}, LX7/h;->c(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ln8/d;Ljava/lang/String;)Ln8/c;
    .locals 0

    invoke-static {p0, p1}, LX7/h;->d(Ln8/d;Ljava/lang/String;)Ln8/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ln8/c;Ljava/lang/String;)Ln8/c;
    .locals 0

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object p0

    const-string p1, "child(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final d(Ln8/d;Ljava/lang/String;)Ln8/c;
    .locals 0

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln8/d;->c(Ln8/f;)Ln8/d;

    move-result-object p0

    invoke-virtual {p0}, Ln8/d;->l()Ln8/c;

    move-result-object p0

    const-string p1, "toSafe(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
