.class public abstract Lq2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly2/c;Ljava/lang/String;II)Lq2/b;
    .locals 1

    const-string v0, "driver"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq2/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lq2/c;-><init>(Ly2/c;Ljava/lang/String;II)V

    return-object v0
.end method

.method public static final b(Ly2/c;Ljava/lang/String;)Lq2/b;
    .locals 1

    const-string v0, "driver"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq2/c;

    invoke-direct {v0, p0, p1}, Lq2/c;-><init>(Ly2/c;Ljava/lang/String;)V

    return-object v0
.end method
