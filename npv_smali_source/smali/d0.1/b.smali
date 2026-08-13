.class public final Ld0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/a;


# instance fields
.field private final C:I

.field private final D:Z

.field private E:Ljava/lang/Object;

.field private F:LV/Q0;

.field private G:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IZLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld0/b;->C:I

    iput-boolean p2, p0, Ld0/b;->D:Z

    iput-object p3, p0, Ld0/b;->E:Ljava/lang/Object;

    return-void
.end method

.method private final k(LV/n;)V
    .locals 4

    .prologue
    iget-boolean v0, p0, Ld0/b;->D:Z

    if-eqz v0, :cond_4

    invoke-interface {p1}, LV/n;->b()LV/Q0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {p1, v0}, LV/n;->z(LV/Q0;)V

    iget-object p1, p0, Ld0/b;->F:LV/Q0;

    invoke-static {p1, v0}, Ld0/c;->f(LV/Q0;LV/Q0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v0, p0, Ld0/b;->F:LV/Q0;

    goto :goto_1

    :cond_0
    iget-object p1, p0, Ld0/b;->G:Ljava/util/List;

    if-nez p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ld0/b;->G:Ljava/util/List;

    :cond_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/Q0;

    invoke-static {v3, v0}, Ld0/c;->f(LV/Q0;LV/Q0;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method private final m()V
    .locals 4

    .prologue
    iget-boolean v0, p0, Ld0/b;->D:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ld0/b;->F:LV/Q0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/Q0;->invalidate()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld0/b;->F:LV/Q0;

    :cond_0
    iget-object v0, p0, Ld0/b;->G:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/Q0;

    invoke-interface {v3}, LV/Q0;->invalidate()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_2
    return-void
.end method


# virtual methods
.method public a(LV/n;I)Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, Ld0/b;->C:I

    invoke-interface {p1, v0}, LV/n;->r(I)LV/n;

    move-result-object p1

    invoke-direct {p0, p1}, Ld0/b;->k(LV/n;)V

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v1}, Ld0/c;->d(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ld0/c;->g(I)I

    move-result v0

    :goto_0
    or-int/2addr p2, v0

    iget-object v0, p0, Ld0/b;->E:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/p;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v1}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/p;

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_1
    return-object p2
.end method

.method public e(Ljava/lang/Object;LV/n;I)Ljava/lang/Object;
    .locals 3

    .prologue
    iget v0, p0, Ld0/b;->C:I

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    invoke-direct {p0, p2}, Ld0/b;->k(LV/n;)V

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {v1}, Ld0/c;->d(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ld0/c;->g(I)I

    move-result v0

    :goto_0
    or-int/2addr v0, p3

    iget-object v1, p0, Ld0/b;->E:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/q;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, Ld0/b$a;

    invoke-direct {v1, p0, p1, p3}, Ld0/b$a;-><init>(Ld0/b;Ljava/lang/Object;I)V

    invoke-interface {p2, v1}, LV/e1;->a(Lx7/p;)V

    :cond_1
    return-object v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;
    .locals 3

    .prologue
    iget v0, p0, Ld0/b;->C:I

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    invoke-direct {p0, p3}, Ld0/b;->k(LV/n;)V

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    invoke-static {v1}, Ld0/c;->d(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ld0/c;->g(I)I

    move-result v0

    :goto_0
    or-int/2addr v0, p4

    iget-object v1, p0, Ld0/b;->E:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-static {v1, v2}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/r;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, p3, v0}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_1

    new-instance v1, Ld0/b$b;

    invoke-direct {v1, p0, p1, p2, p4}, Ld0/b$b;-><init>(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p3, v1}, LV/e1;->a(Lx7/p;)V

    :cond_1
    return-object v0
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;
    .locals 8

    .prologue
    iget v0, p0, Ld0/b;->C:I

    invoke-interface {p4, v0}, LV/n;->r(I)LV/n;

    move-result-object p4

    invoke-direct {p0, p4}, Ld0/b;->k(LV/n;)V

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    invoke-static {v1}, Ld0/c;->d(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ld0/c;->g(I)I

    move-result v0

    :goto_0
    or-int/2addr v0, p5

    iget-object v1, p0, Ld0/b;->E:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-static {v1, v2}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/s;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v6}, Lx7/s;->v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p4}, LV/n;->x()LV/e1;

    move-result-object p4

    if-eqz p4, :cond_1

    new-instance v7, Ld0/b$c;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p5

    invoke-direct/range {v1 .. v6}, Ld0/b$c;-><init>(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p4, v7}, LV/e1;->a(Lx7/p;)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ld0/b;->e(Ljava/lang/Object;LV/n;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ld0/b;->E:Ljava/lang/Object;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld0/b;->E:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Ld0/b;->E:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-direct {p0}, Ld0/b;->m()V

    :cond_1
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ld0/b;->f(Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ld0/b;->a(LV/n;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p4

    check-cast v4, LV/n;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Ld0/b;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
