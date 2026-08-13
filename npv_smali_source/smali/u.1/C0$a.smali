.class public final Lu/C0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/C0;->c(Lu/r;FF)Lu/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method constructor <init>(Lu/r;FF)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lu/r;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LE7/j;->q(II)LE7/i;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lj7/O;

    invoke-virtual {v2}, Lj7/O;->b()I

    move-result v2

    new-instance v3, Lu/N;

    invoke-virtual {p1, v2}, Lu/r;->a(I)F

    move-result v2

    invoke-direct {v3, p2, p3, v2}, Lu/N;-><init>(FFF)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lu/C0$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(I)Lu/N;
    .locals 1

    iget-object v0, p0, Lu/C0$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/N;

    return-object p1
.end method

.method public bridge synthetic get(I)Lu/K;
    .locals 0

    invoke-virtual {p0, p1}, Lu/C0$a;->a(I)Lu/N;

    move-result-object p1

    return-object p1
.end method
