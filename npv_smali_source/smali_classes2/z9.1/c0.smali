.class public abstract Lz9/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly9/b;Ljava/lang/String;)Lz9/b0;
    .locals 1

    .prologue
    const-string v0, "json"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly9/b;->e()Ly9/g;

    move-result-object p0

    invoke-virtual {p0}, Ly9/g;->a()Z

    move-result p0

    if-nez p0, :cond_0

    new-instance p0, Lz9/b0;

    invoke-direct {p0, p1}, Lz9/b0;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lz9/d0;

    invoke-direct {p0, p1}, Lz9/d0;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method
