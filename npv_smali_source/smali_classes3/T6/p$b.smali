.class public abstract LT6/p$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static a(LT6/p;Lx7/p;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LW6/y$a;->a(LW6/y;Lx7/p;)V

    return-void
.end method

.method public static b(LT6/p;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LW6/y$a;->b(LW6/y;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
