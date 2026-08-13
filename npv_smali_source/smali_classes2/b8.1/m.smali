.class public abstract Lb8/m;
.super Lb8/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(La8/g;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lb8/j;-><init>(La8/g;Lb8/j;ILy7/k;)V

    return-void
.end method


# virtual methods
.method protected H(Le8/r;Ljava/util/List;LF8/E;Ljava/util/List;)Lb8/j$a;
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "methodTypeParameters"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "returnType"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "valueParameters"

    invoke-static {p4, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb8/j$a;

    const/4 v5, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v6

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p3

    move-object v3, p4

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lb8/j$a;-><init>(LF8/E;LF8/E;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    return-object p1
.end method

.method protected s(Ln8/f;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected z()LO7/X;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
