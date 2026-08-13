.class public abstract Lg8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg8/r;Le8/g;Lm8/e;)Lg8/t;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lg8/r;->b(Le8/g;Lm8/e;)Lg8/r$a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lg8/r$a;->a()Lg8/t;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lg8/r;->a(Ln8/b;Lm8/e;)Lg8/r$a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lg8/r$a;->a()Lg8/t;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
