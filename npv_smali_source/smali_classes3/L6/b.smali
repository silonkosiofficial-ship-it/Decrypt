.class public abstract LL6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LD6/b;Lx7/a;)LD6/b;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LL6/a;

    invoke-virtual {p0}, LD6/b;->c()LC6/c;

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v1 .. v7}, LL6/a;-><init>(LC6/c;Lx7/a;LD6/b;LT6/p;ILy7/k;)V

    return-object v0
.end method
