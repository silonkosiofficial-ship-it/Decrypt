.class public abstract Lz9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz9/A;Ly9/b;)Lz9/n;
    .locals 1

    .prologue
    const-string v0, "sb"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lz9/w;

    invoke-direct {v0, p0, p1}, Lz9/w;-><init>(Lz9/A;Ly9/b;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lz9/n;

    invoke-direct {v0, p0}, Lz9/n;-><init>(Lz9/A;)V

    :goto_0
    return-object v0
.end method
