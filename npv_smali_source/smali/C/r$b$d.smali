.class final LC/r$b$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r$b;->a(LD/w;J)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/J;

.field final synthetic E:LC/r$b$c;


# direct methods
.method constructor <init>(LC/J;LC/r$b$c;)V
    .locals 0

    iput-object p1, p0, LC/r$b$d;->D:LC/J;

    iput-object p2, p0, LC/r$b$d;->E:LC/r$b$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/util/ArrayList;
    .locals 10

    .prologue
    iget-object v0, p0, LC/r$b$d;->D:LC/J;

    invoke-virtual {v0, p1}, LC/J;->c(I)LC/J$c;

    move-result-object p1

    invoke-virtual {p1}, LC/J$c;->a()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, LC/J$c;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, LC/J$c;->b()Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, LC/r$b$d;->E:LC/r$b$c;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC/c;

    invoke-virtual {v6}, LC/c;->g()J

    move-result-wide v6

    invoke-static {v6, v7}, LC/c;->d(J)I

    move-result v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v5, v6}, LC/y;->a(II)J

    move-result-wide v8

    invoke-static {v8, v9}, LY0/b;->a(J)LY0/b;

    move-result-object v8

    invoke-static {v7, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LC/r$b$d;->a(I)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
