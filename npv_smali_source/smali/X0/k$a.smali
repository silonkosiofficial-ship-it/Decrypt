.class public final LX0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LX0/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LX0/k;
    .locals 4

    .prologue
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LX0/k;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3}, LX0/k;->e()I

    move-result v3

    or-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, LX0/k;

    invoke-direct {v0, p1}, LX0/k;-><init>(I)V

    return-object v0
.end method

.method public final b()LX0/k;
    .locals 1

    invoke-static {}, LX0/k;->a()LX0/k;

    move-result-object v0

    return-object v0
.end method

.method public final c()LX0/k;
    .locals 1

    invoke-static {}, LX0/k;->b()LX0/k;

    move-result-object v0

    return-object v0
.end method

.method public final d()LX0/k;
    .locals 1

    invoke-static {}, LX0/k;->c()LX0/k;

    move-result-object v0

    return-object v0
.end method
