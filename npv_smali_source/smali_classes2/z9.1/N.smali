.class public abstract Lz9/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly9/b;Lz9/A;Lt9/e;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "json"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz9/Z;

    sget-object v1, Lz9/i0;->E:Lz9/i0;

    invoke-static {}, Lz9/i0;->g()Lp7/a;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ly9/s;

    invoke-direct {v0, p1, p0, v1, v2}, Lz9/Z;-><init>(Lz9/A;Ly9/b;Lz9/i0;[Ly9/s;)V

    invoke-virtual {v0, p2, p3}, Lz9/Z;->t(Lt9/e;Ljava/lang/Object;)V

    return-void
.end method
