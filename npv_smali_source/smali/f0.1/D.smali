.class public final Lf0/D;
.super Lf0/k;
.source "SourceFile"


# instance fields
.field private final g:Lf0/k;

.field private final h:Z

.field private final i:Z

.field private j:Lx7/l;

.field private final k:Lx7/l;

.field private final l:J

.field private final m:Lf0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/k;Lx7/l;ZZ)V
    .locals 3

    .prologue
    sget-object v0, Lf0/n;->G:Lf0/n$a;

    invoke-virtual {v0}, Lf0/n$a;->a()Lf0/n;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lf0/k;-><init>(ILf0/n;Ly7/k;)V

    iput-object p1, p0, Lf0/D;->g:Lf0/k;

    iput-boolean p3, p0, Lf0/D;->h:Z

    iput-boolean p4, p0, Lf0/D;->i:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf0/k;->h()Lx7/l;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/a;

    invoke-virtual {p1}, Lf0/c;->H()Lx7/l;

    move-result-object p1

    :cond_1
    invoke-static {p2, p1, p3}, Lf0/p;->l(Lx7/l;Lx7/l;Z)Lx7/l;

    move-result-object p1

    iput-object p1, p0, Lf0/D;->j:Lx7/l;

    invoke-static {}, LV/c;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lf0/D;->l:J

    iput-object p0, p0, Lf0/D;->m:Lf0/k;

    return-void
.end method

.method private final A()Lf0/k;
    .locals 1

    .prologue
    iget-object v0, p0, Lf0/D;->g:Lf0/k;

    if-nez v0, :cond_0

    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public B()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/D;->j:Lx7/l;

    return-object v0
.end method

.method public final C()J
    .locals 2

    iget-wide v0, p0, Lf0/D;->l:J

    return-wide v0
.end method

.method public D(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public E(Lf0/k;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/t;->a()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public F(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lf0/D;->j:Lx7/l;

    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf0/k;->t(Z)V

    iget-boolean v0, p0, Lf0/D;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf0/D;->g:Lf0/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/k;->d()V

    :cond_0
    return-void
.end method

.method public f()I
    .locals 1

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->f()I

    move-result v0

    return v0
.end method

.method public g()Lf0/n;
    .locals 1

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->g()Lf0/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lx7/l;
    .locals 1

    invoke-virtual {p0}, Lf0/D;->B()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->i()Z

    move-result v0

    return v0
.end method

.method public k()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/D;->k:Lx7/l;

    return-object v0
.end method

.method public bridge synthetic m(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/D;->D(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic n(Lf0/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/D;->E(Lf0/k;)Ljava/lang/Void;

    return-void
.end method

.method public o()V
    .locals 1

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->o()V

    return-void
.end method

.method public p(Lf0/y;)V
    .locals 1

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/k;->p(Lf0/y;)V

    return-void
.end method

.method public x(Lx7/l;)Lf0/k;
    .locals 4

    .prologue
    invoke-virtual {p0}, Lf0/D;->B()Lx7/l;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    iget-boolean v0, p0, Lf0/D;->h:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0, v3}, Lf0/k;->x(Lx7/l;)Lf0/k;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lf0/p;->d(Lf0/k;Lx7/l;Z)Lf0/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lf0/D;->A()Lf0/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/k;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method
