.class public abstract LQ1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LQ1/f;
    .locals 3

    new-instance v0, LQ1/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2, v1}, LQ1/c;-><init>(Ljava/util/Map;ZILy7/k;)V

    return-object v0
.end method

.method public static final varargs b([LQ1/f$b;)LQ1/c;
    .locals 4

    const-string v0, "pairs"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQ1/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, LQ1/c;-><init>(Ljava/util/Map;ZILy7/k;)V

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LQ1/f$b;

    invoke-virtual {v0, p0}, LQ1/c;->g([LQ1/f$b;)V

    return-object v0
.end method
