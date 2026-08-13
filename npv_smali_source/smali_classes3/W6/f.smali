.class public abstract LW6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/l;Lx7/l;I)Ljava/util/Map;
    .locals 1

    const-string v0, "supplier"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "close"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW6/u;

    invoke-direct {v0, p0, p1, p2}, LW6/u;-><init>(Lx7/l;Lx7/l;I)V

    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "synchronizedMap(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
