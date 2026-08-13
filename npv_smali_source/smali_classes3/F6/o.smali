.class public abstract LF6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF6/n;Ljava/lang/String;)Ljava/net/Proxy;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlString"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LT6/X;->c(Ljava/lang/String;)LT6/g0;

    move-result-object p1

    invoke-virtual {p0, p1}, LF6/n;->a(LT6/g0;)Ljava/net/Proxy;

    move-result-object p0

    return-object p0
.end method
