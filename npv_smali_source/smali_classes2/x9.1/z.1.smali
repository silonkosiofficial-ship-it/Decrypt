.class public abstract Lx9/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;[Ljava/lang/Enum;)Lt9/b;
    .locals 1

    const-string v0, "serialName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx9/y;

    invoke-direct {v0, p0, p1}, Lx9/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    return-object v0
.end method
