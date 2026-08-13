.class public final LU7/j;
.super LU7/f;
.source "SourceFile"

# interfaces
.implements Le8/e;


# instance fields
.field private final c:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln8/f;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "values"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU7/f;-><init>(Ln8/f;Ly7/k;)V

    iput-object p2, p0, LU7/j;->c:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e()Ljava/util/List;
    .locals 7

    .prologue
    iget-object v0, p0, LU7/j;->c:[Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, LU7/f;->b:LU7/f$a;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, LU7/f$a;->a(Ljava/lang/Object;Ln8/f;)LU7/f;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
