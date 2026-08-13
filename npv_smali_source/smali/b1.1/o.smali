.class public final Lb1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/n;
.implements LV/Z0;


# instance fields
.field private final C:Lb1/l;

.field private final D:LW8/N;

.field private final E:Lf0/u;

.field private F:Z

.field private final G:Lx7/l;

.field private final H:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lb1/l;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/o;->C:Lb1/l;

    invoke-static {}, LW8/O;->b()LW8/N;

    move-result-object p1

    iput-object p1, p0, Lb1/o;->D:LW8/N;

    new-instance p1, Lf0/u;

    new-instance v0, Lb1/o$b;

    invoke-direct {v0, p0}, Lb1/o$b;-><init>(Lb1/o;)V

    invoke-direct {p1, v0}, Lf0/u;-><init>(Lx7/l;)V

    iput-object p1, p0, Lb1/o;->E:Lf0/u;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb1/o;->F:Z

    new-instance p1, Lb1/o$c;

    invoke-direct {p1, p0}, Lb1/o$c;-><init>(Lb1/o;)V

    iput-object p1, p0, Lb1/o;->G:Lx7/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb1/o;->H:Ljava/util/List;

    return-void
.end method

.method public static final synthetic f(Lb1/o;)LW8/N;
    .locals 0

    iget-object p0, p0, Lb1/o;->D:LW8/N;

    return-object p0
.end method

.method public static final synthetic g(Lb1/o;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lb1/o;->H:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/List;)Z
    .locals 6

    .prologue
    const-string v0, "measurables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lb1/o;->F:Z

    const/4 v1, 0x1

    if-nez v0, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Lb1/o;->H:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/G;

    invoke-interface {v4}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lb1/k;

    if-eqz v5, :cond_1

    check-cast v4, Lb1/k;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, p0, Lb1/o;->H:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    return v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_2
    return v1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lb1/o;->E:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->t()V

    iget-object v0, p0, Lb1/o;->E:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->j()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lb1/o;->E:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->s()V

    return-void
.end method

.method public e(Lb1/z;Ljava/util/List;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb1/o;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lb1/o;->E:Lf0/u;

    sget-object v1, Li7/M;->a:Li7/M;

    iget-object v2, p0, Lb1/o;->G:Lx7/l;

    new-instance v3, Lb1/o$a;

    invoke-direct {v3, p2, p0, p1}, Lb1/o$a;-><init>(Ljava/util/List;Lb1/o;Lb1/z;)V

    invoke-virtual {v0, v1, v2, v3}, Lf0/u;->o(Ljava/lang/Object;Lx7/l;Lx7/a;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb1/o;->F:Z

    return-void
.end method

.method public final h()Lb1/l;
    .locals 1

    iget-object v0, p0, Lb1/o;->C:Lb1/l;

    return-object v0
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lb1/o;->F:Z

    return-void
.end method
