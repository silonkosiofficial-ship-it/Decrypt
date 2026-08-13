.class public abstract LT6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT6/n;)Ljava/nio/charset/Charset;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-virtual {p0, v0}, LT6/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    sget-object v1, LS8/d;->a:LS8/d;

    invoke-static {v1, p0}, Lc7/a;->e(LS8/d;Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static final b(LT6/h;Ljava/nio/charset/Charset;)LT6/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc7/a;->g(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LT6/h;->g(Ljava/lang/String;Ljava/lang/String;)LT6/h;

    move-result-object p0

    return-object p0
.end method
