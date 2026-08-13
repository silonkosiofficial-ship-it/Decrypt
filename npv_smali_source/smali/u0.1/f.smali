.class public final Lu0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(FFFZZFF)Lu0/f;
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v10, Lu0/h$j;

    move-object v2, v10

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-direct/range {v2 .. v9}, Lu0/h$j;-><init>(FFFZZFF)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final b()Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    sget-object v1, Lu0/h$b;->c:Lu0/h$b;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c(FFFFFF)Lu0/f;
    .locals 9

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v8, Lu0/h$c;

    move-object v1, v8

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lu0/h$c;-><init>(FFFFFF)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final d(FFFFFF)Lu0/f;
    .locals 9

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v8, Lu0/h$k;

    move-object v1, v8

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lu0/h$k;-><init>(FFFFFF)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final f(F)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$d;

    invoke-direct {v1, p1}, Lu0/h$d;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final g(F)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$l;

    invoke-direct {v1, p1}, Lu0/h$l;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final h(FF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$e;

    invoke-direct {v1, p1, p2}, Lu0/h$e;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final i(FF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$m;

    invoke-direct {v1, p1, p2}, Lu0/h$m;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final j(FF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$f;

    invoke-direct {v1, p1, p2}, Lu0/h$f;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final k(FF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$n;

    invoke-direct {v1, p1, p2}, Lu0/h$n;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final l(FFFF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$h;

    invoke-direct {v1, p1, p2, p3, p4}, Lu0/h$h;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final m(FFFF)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$p;

    invoke-direct {v1, p1, p2, p3, p4}, Lu0/h$p;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final n(F)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$s;

    invoke-direct {v1, p1}, Lu0/h$s;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final o(F)Lu0/f;
    .locals 2

    iget-object v0, p0, Lu0/f;->a:Ljava/util/ArrayList;

    new-instance v1, Lu0/h$r;

    invoke-direct {v1, p1}, Lu0/h$r;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
