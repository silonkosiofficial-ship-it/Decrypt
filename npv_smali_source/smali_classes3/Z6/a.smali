.class public abstract LZ6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)Lfa/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfa/f;->k(Ljava/lang/String;)Lfa/d;

    move-result-object p0

    const-string v0, "getLogger(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
