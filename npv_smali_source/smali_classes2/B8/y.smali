.class public abstract LB8/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lk8/c;I)Ln8/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lk8/c;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, p1}, Lk8/c;->b(I)Z

    move-result p0

    invoke-static {v0, p0}, Ln8/b;->f(Ljava/lang/String;Z)Ln8/b;

    move-result-object p0

    const-string p1, "fromString(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Lk8/c;I)Ln8/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ln8/f;->n(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    const-string p1, "guessByFirstCharacter(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
