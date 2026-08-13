.class public final LH8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# instance fields
.field private final a:LH8/j;

.field private final b:[Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(LH8/j;[Ljava/lang/String;)V
    .locals 4

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/i;->a:LH8/j;

    iput-object p2, p0, LH8/i;->b:[Ljava/lang/String;

    sget-object v0, LH8/b;->I:LH8/b;

    invoke-virtual {v0}, LH8/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LH8/j;->g()Ljava/lang/String;

    move-result-object p1

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/i;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()LH8/j;
    .locals 1

    iget-object v0, p0, LH8/i;->a:LH8/j;

    return-object v0
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/i;->b:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public t()LL7/g;
    .locals 1

    sget-object v0, LL7/e;->h:LL7/e$b;

    invoke-virtual {v0}, LL7/e$b;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public v(LG8/g;)LF8/e0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public w()LO7/h;
    .locals 1

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0}, LH8/k;->h()LH8/a;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
