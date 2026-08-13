.class final Lf4/h;
.super Lf4/a;
.source "SourceFile"


# instance fields
.field private final b:Lf4/h;

.field private final c:Lf4/V0;

.field private final d:Lf4/V0;

.field private final e:Lf4/V0;

.field private final f:Lf4/V0;

.field private final g:Lf4/V0;

.field private final h:Lf4/V0;

.field private final i:Lf4/V0;

.field private final j:Lf4/V0;

.field private final k:Lf4/V0;

.field private final l:Lf4/V0;

.field private final m:Lf4/V0;


# direct methods
.method synthetic constructor <init>(Landroid/app/Application;Lf4/g;)V
    .locals 11

    invoke-direct {p0}, Lf4/a;-><init>()V

    iput-object p0, p0, Lf4/h;->b:Lf4/h;

    invoke-static {p1}, Lf4/T0;->b(Ljava/lang/Object;)Lf4/S0;

    move-result-object v1

    iput-object v1, p0, Lf4/h;->c:Lf4/V0;

    new-instance p1, Lf4/r;

    invoke-direct {p1, v1}, Lf4/r;-><init>(Lf4/W0;)V

    invoke-static {p1}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object p1

    iput-object p1, p0, Lf4/h;->d:Lf4/V0;

    invoke-static {}, Lf4/d;->a()Lf4/e;

    move-result-object p2

    invoke-static {p2}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object v2

    iput-object v2, p0, Lf4/h;->e:Lf4/V0;

    new-instance p2, Lf4/f;

    invoke-direct {p2, p0}, Lf4/f;-><init>(Lf4/h;)V

    iput-object p2, p0, Lf4/h;->f:Lf4/V0;

    invoke-static {}, Lf4/u;->a()Lf4/v;

    move-result-object v0

    new-instance v3, Lf4/Q;

    invoke-direct {v3, p2, v0}, Lf4/Q;-><init>(Lf4/W0;Lf4/W0;)V

    invoke-static {v3}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object p2

    iput-object p2, p0, Lf4/h;->g:Lf4/V0;

    new-instance v7, Lf4/j1;

    invoke-direct {v7, v1, p1}, Lf4/j1;-><init>(Lf4/W0;Lf4/W0;)V

    iput-object v7, p0, Lf4/h;->h:Lf4/V0;

    invoke-static {}, Lf4/u;->a()Lf4/v;

    move-result-object v0

    new-instance v3, Lf4/Y0;

    invoke-direct {v3, v0}, Lf4/Y0;-><init>(Lf4/W0;)V

    invoke-static {v3}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object v9

    iput-object v9, p0, Lf4/h;->i:Lf4/V0;

    invoke-static {}, Lf4/u;->a()Lf4/v;

    move-result-object v0

    new-instance v3, Lf4/p;

    invoke-direct {v3, v1, p1, v0}, Lf4/p;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;)V

    iput-object v3, p0, Lf4/h;->j:Lf4/V0;

    new-instance v8, Lf4/b;

    invoke-direct {v8, v9, v3, p1}, Lf4/b;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;)V

    iput-object v8, p0, Lf4/h;->k:Lf4/V0;

    invoke-static {}, Lf4/s;->a()Lf4/t;

    move-result-object v3

    invoke-static {}, Lf4/u;->a()Lf4/v;

    move-result-object v4

    new-instance v10, Lf4/q1;

    move-object v0, v10

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v9}, Lf4/q1;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V

    iput-object v10, p0, Lf4/h;->l:Lf4/V0;

    new-instance v0, Lf4/d1;

    invoke-direct {v0, p1, v10, p2}, Lf4/d1;-><init>(Lf4/W0;Lf4/W0;Lf4/W0;)V

    invoke-static {v0}, Lf4/R0;->b(Lf4/V0;)Lf4/V0;

    move-result-object p1

    iput-object p1, p0, Lf4/h;->m:Lf4/V0;

    return-void
.end method

.method static bridge synthetic d(Lf4/h;)Lf4/h;
    .locals 0

    iget-object p0, p0, Lf4/h;->b:Lf4/h;

    return-object p0
.end method

.method static bridge synthetic e(Lf4/h;)Lf4/V0;
    .locals 0

    iget-object p0, p0, Lf4/h;->c:Lf4/V0;

    return-object p0
.end method

.method static bridge synthetic f(Lf4/h;)Lf4/V0;
    .locals 0

    iget-object p0, p0, Lf4/h;->i:Lf4/V0;

    return-object p0
.end method

.method static bridge synthetic g(Lf4/h;)Lf4/V0;
    .locals 0

    iget-object p0, p0, Lf4/h;->e:Lf4/V0;

    return-object p0
.end method

.method static bridge synthetic h(Lf4/h;)Lf4/V0;
    .locals 0

    iget-object p0, p0, Lf4/h;->j:Lf4/V0;

    return-object p0
.end method

.method static bridge synthetic i(Lf4/h;)Lf4/V0;
    .locals 0

    iget-object p0, p0, Lf4/h;->d:Lf4/V0;

    return-object p0
.end method


# virtual methods
.method public final b()Lf4/c1;
    .locals 1

    iget-object v0, p0, Lf4/h;->m:Lf4/V0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/c1;

    return-object v0
.end method

.method public final c()Lf4/P;
    .locals 1

    iget-object v0, p0, Lf4/h;->g:Lf4/V0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/P;

    return-object v0
.end method
