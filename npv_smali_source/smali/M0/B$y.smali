.class final LM0/B$y;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$y;

    invoke-direct {v0}, LM0/B$y;-><init>()V

    sput-object v0, LM0/B$y;->D:LM0/B$y;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LM0/v;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    new-instance v14, LM0/v;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v1, LX0/j;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LX0/j;->n()I

    move-result v3

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, LX0/l;

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LX0/l;->m()I

    move-result v4

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v5, LY0/x;->b:LY0/x$a;

    invoke-static {v5}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    instance-of v7, v5, LM0/n;

    if-nez v7, :cond_3

    :cond_2
    move-object v1, v2

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_2

    invoke-interface {v5, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/x;

    :goto_2
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LY0/x;->k()J

    move-result-wide v7

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LX0/r;->c:LX0/r$a;

    invoke-static {v1}, LM0/B;->q(LX0/r$a;)Le0/j;

    move-result-object v1

    invoke-static {v0, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    instance-of v5, v1, LM0/n;

    if-nez v5, :cond_5

    :cond_4
    move-object v6, v2

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_4

    invoke-interface {v1, v0}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/r;

    move-object v6, v0

    :goto_3
    const/16 v12, 0x1f0

    const/4 v13, 0x0

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    move-object v1, v14

    move v2, v3

    move v3, v4

    move-wide v4, v7

    move-object v7, v0

    move-object v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v15

    invoke-direct/range {v1 .. v13}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;ILy7/k;)V

    return-object v14
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$y;->a(Ljava/lang/Object;)LM0/v;

    move-result-object p1

    return-object p1
.end method
