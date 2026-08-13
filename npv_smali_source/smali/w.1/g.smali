.class public final Lw/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LV/v1;->f()Lf0/r;

    move-result-object v0

    iput-object v0, p0, Lw/g;->a:Lf0/r;

    return-void
.end method

.method public static synthetic d(Lw/g;Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;ILjava/lang/Object;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x1

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lw/g;->c(Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lw/b;LV/n;I)V
    .locals 6

    .prologue
    const v0, 0x4eb252f8

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LV/n;->A()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lw/g;->a:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_7

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx7/q;

    and-int/lit8 v5, v1, 0xe

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, p1, p2, v5}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    :goto_5
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lw/g$a;

    invoke-direct {v0, p0, p1, p3}, Lw/g$a;-><init>(Lw/g;Lw/b;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_9
    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lw/g;->a:Lf0/r;

    invoke-virtual {v0}, Lf0/r;->clear()V

    return-void
.end method

.method public final c(Lx7/p;Landroidx/compose/ui/d;ZLx7/q;Lx7/a;)V
    .locals 8

    iget-object v0, p0, Lw/g;->a:Lf0/r;

    new-instance v7, Lw/g$b;

    move-object v1, v7

    move-object v2, p1

    move v3, p3

    move-object v4, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lw/g$b;-><init>(Lx7/p;ZLandroidx/compose/ui/d;Lx7/q;Lx7/a;)V

    const p1, 0xf9f600c

    const/4 p2, 0x1

    invoke-static {p1, p2, v7}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
