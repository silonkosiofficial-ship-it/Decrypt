.class public abstract Lh9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh9/j;Li9/n;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Li9/n;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Li9/n;
    .locals 1

    sget-object v0, Lh9/j$b;->a:Lh9/j$b;

    invoke-virtual {v0}, Lh9/j$b;->a()Li9/n;

    move-result-object v0

    return-object v0
.end method
