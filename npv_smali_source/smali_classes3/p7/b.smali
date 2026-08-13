.class public abstract Lp7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([Ljava/lang/Enum;)Lp7/a;
    .locals 1

    const-string v0, "entries"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp7/c;

    invoke-direct {v0, p0}, Lp7/c;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method
