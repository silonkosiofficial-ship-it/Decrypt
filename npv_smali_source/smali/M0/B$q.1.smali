.class final LM0/B$q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$q;

    invoke-direct {v0}, LM0/B$q;-><init>()V

    sput-object v0, LM0/B$q;->D:LM0/B$q;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LT0/h;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-virtual {p2}, LT0/h;->g()Ljava/util/List;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT0/g;

    sget-object v4, LT0/g;->b:LT0/g$a;

    invoke-static {v4}, LM0/B;->l(LT0/g$a;)Le0/j;

    move-result-object v4

    invoke-static {v3, v4, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LT0/h;

    invoke-virtual {p0, p1, p2}, LM0/B$q;->a(Le0/l;LT0/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
