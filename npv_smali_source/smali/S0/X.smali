.class public LS0/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LS0/P;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS0/P;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/X;->a:LS0/P;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LS0/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()LS0/d0;
    .locals 1

    iget-object v0, p0, LS0/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS0/d0;

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LS0/X;->a:LS0/P;

    invoke-interface {v0}, LS0/P;->h()V

    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LS0/X;->a()LS0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LS0/X;->a:LS0/P;

    invoke-interface {v0}, LS0/P;->c()V

    :cond_0
    return-void
.end method

.method public d(LS0/V;LS0/s;Lx7/l;Lx7/l;)LS0/d0;
    .locals 1

    iget-object v0, p0, LS0/X;->a:LS0/P;

    invoke-interface {v0, p1, p2, p3, p4}, LS0/P;->g(LS0/V;LS0/s;Lx7/l;Lx7/l;)V

    new-instance p1, LS0/d0;

    iget-object p2, p0, LS0/X;->a:LS0/P;

    invoke-direct {p1, p0, p2}, LS0/d0;-><init>(LS0/X;LS0/P;)V

    iget-object p2, p0, LS0/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LS0/X;->a:LS0/P;

    invoke-interface {v0}, LS0/P;->a()V

    new-instance v0, LS0/d0;

    iget-object v1, p0, LS0/X;->a:LS0/P;

    invoke-direct {v0, p0, v1}, LS0/d0;-><init>(LS0/X;LS0/P;)V

    iget-object v1, p0, LS0/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, LS0/X;->a:LS0/P;

    invoke-interface {v0}, LS0/P;->e()V

    return-void
.end method

.method public g(LS0/d0;)V
    .locals 2

    .prologue
    iget-object v0, p0, LS0/X;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LS0/X;->a:LS0/P;

    invoke-interface {p1}, LS0/P;->e()V

    :cond_0
    return-void
.end method
