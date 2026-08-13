.class public abstract Lx9/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Lt9/b;)Lv9/f;
    .locals 2

    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitiveSerializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx9/F;

    new-instance v1, Lx9/G$a;

    invoke-direct {v1, p1}, Lx9/G$a;-><init>(Lt9/b;)V

    invoke-direct {v0, p0, v1}, Lx9/F;-><init>(Ljava/lang/String;Lx9/E;)V

    return-object v0
.end method
