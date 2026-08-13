.class public final Lf0/C;
.super Lf0/c;
.source "SourceFile"


# instance fields
.field private final s:Lf0/c;

.field private final t:Z

.field private final u:Z

.field private v:Lx7/l;

.field private w:Lx7/l;

.field private final x:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/c;Lx7/l;Lx7/l;ZZ)V
    .locals 2

    .prologue
    sget-object v0, Lf0/n;->G:Lf0/n$a;

    invoke-virtual {v0}, Lf0/n$a;->a()Lf0/n;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf0/c;->H()Lx7/l;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf0/a;

    invoke-virtual {v1}, Lf0/c;->H()Lx7/l;

    move-result-object v1

    :cond_1
    invoke-static {p2, v1, p4}, Lf0/p;->l(Lx7/l;Lx7/l;Z)Lx7/l;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lf0/c;->k()Lx7/l;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf0/a;

    invoke-virtual {v1}, Lf0/c;->k()Lx7/l;

    move-result-object v1

    :cond_3
    invoke-static {p3, v1}, Lf0/p;->m(Lx7/l;Lx7/l;)Lx7/l;

    move-result-object p3

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p2, p3}, Lf0/c;-><init>(ILf0/n;Lx7/l;Lx7/l;)V

    iput-object p1, p0, Lf0/C;->s:Lf0/c;

    iput-boolean p4, p0, Lf0/C;->t:Z

    iput-boolean p5, p0, Lf0/C;->u:Z

    invoke-super {p0}, Lf0/c;->H()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Lf0/C;->v:Lx7/l;

    invoke-super {p0}, Lf0/c;->k()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Lf0/C;->w:Lx7/l;

    invoke-static {}, LV/c;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lf0/C;->x:J

    return-void
.end method

.method private final T()Lf0/c;
    .locals 1

    .prologue
    iget-object v0, p0, Lf0/C;->s:Lf0/c;

    if-nez v0, :cond_0

    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/c;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public C()Lf0/l;
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->C()Lf0/l;

    move-result-object v0

    return-object v0
.end method

.method public E()Lr/L;
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->E()Lr/L;

    move-result-object v0

    return-object v0
.end method

.method public H()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/C;->v:Lx7/l;

    return-object v0
.end method

.method public P(Lr/L;)V
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public Q(Lx7/l;Lx7/l;)Lf0/c;
    .locals 10

    .prologue
    invoke-virtual {p0}, Lf0/C;->H()Lx7/l;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object v6

    invoke-virtual {p0}, Lf0/C;->k()Lx7/l;

    move-result-object p1

    invoke-static {p2, p1}, Lf0/p;->m(Lx7/l;Lx7/l;)Lx7/l;

    move-result-object v7

    iget-boolean p1, p0, Lf0/C;->t:Z

    if-nez p1, :cond_0

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object p1

    invoke-virtual {p1, v3, v7}, Lf0/c;->Q(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object v5

    new-instance p1, Lf0/C;

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lf0/C;-><init>(Lf0/c;Lx7/l;Lx7/l;ZZ)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object p1

    invoke-virtual {p1, v6, v7}, Lf0/c;->Q(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final U()J
    .locals 2

    iget-wide v0, p0, Lf0/C;->x:J

    return-wide v0
.end method

.method public V(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public W(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public X(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lf0/C;->v:Lx7/l;

    return-void
.end method

.method public Y(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lf0/C;->w:Lx7/l;

    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf0/k;->t(Z)V

    iget-boolean v0, p0, Lf0/C;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf0/C;->s:Lf0/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/c;->d()V

    :cond_0
    return-void
.end method

.method public f()I
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->f()I

    move-result v0

    return v0
.end method

.method public g()Lf0/n;
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->g()Lf0/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lx7/l;
    .locals 1

    invoke-virtual {p0}, Lf0/C;->H()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->i()Z

    move-result v0

    return v0
.end method

.method public j()I
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->j()I

    move-result v0

    return v0
.end method

.method public k()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/C;->w:Lx7/l;

    return-object v0
.end method

.method public bridge synthetic m(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/C;->V(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/C;->W(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->o()V

    return-void
.end method

.method public p(Lf0/y;)V
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/c;->p(Lf0/y;)V

    return-void
.end method

.method public u(I)V
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public v(Lf0/n;)V
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public w(I)V
    .locals 1

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/c;->w(I)V

    return-void
.end method

.method public x(Lx7/l;)Lf0/k;
    .locals 4

    .prologue
    invoke-virtual {p0}, Lf0/C;->H()Lx7/l;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    iget-boolean v0, p0, Lf0/C;->t:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lf0/c;->x(Lx7/l;)Lf0/k;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lf0/p;->d(Lf0/k;Lx7/l;Z)Lf0/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lf0/C;->T()Lf0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/c;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method
