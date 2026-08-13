.class final Lf9/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/l;
.implements LW8/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final C:LW8/n;

.field public final D:Ljava/lang/Object;

.field final synthetic E:Lf9/f;


# direct methods
.method public constructor <init>(Lf9/f;LW8/n;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lf9/f$a;->E:Lf9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf9/f$a;->C:LW8/n;

    iput-object p3, p0, Lf9/f$a;->D:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;Li7/M;Lm7/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf9/f$a;->i(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;Li7/M;Lm7/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, Lf9/f$a;->e(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    iget-object p1, p1, Lf9/f$a;->D:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lf9/f;->d(Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final i(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;Li7/M;Lm7/i;)Li7/M;
    .locals 0

    invoke-static {}, Lf9/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p1, Lf9/f$a;->D:Ljava/lang/Object;

    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p1, Lf9/f$a;->D:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lf9/f;->d(Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic C(Ljava/lang/Object;Lx7/q;)V
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, Lf9/f$a;->d(Li7/M;Lx7/q;)V

    return-void
.end method

.method public bridge synthetic F(LW8/J;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, Lf9/f$a;->g(LW8/J;Li7/M;)V

    return-void
.end method

.method public G(Lx7/l;)V
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1}, LW8/n;->G(Lx7/l;)V

    return-void
.end method

.method public J(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1}, LW8/n;->J(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lb9/A;I)V
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1, p2}, LW8/n;->b(Lb9/A;I)V

    return-void
.end method

.method public d(Li7/M;Lx7/q;)V
    .locals 2

    invoke-static {}, Lf9/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object v0, p0, Lf9/f$a;->E:Lf9/f;

    iget-object v1, p0, Lf9/f$a;->D:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lf9/f$a;->C:LW8/n;

    iget-object v0, p0, Lf9/f$a;->E:Lf9/f;

    new-instance v1, Lf9/e;

    invoke-direct {v1, v0, p0}, Lf9/e;-><init>(Lf9/f;Lf9/f$a;)V

    invoke-virtual {p2, p1, v1}, LW8/n;->S(Ljava/lang/Object;Lx7/l;)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0}, LW8/n;->f()Z

    move-result v0

    return v0
.end method

.method public g(LW8/J;Li7/M;)V
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1, p2}, LW8/n;->F(LW8/J;Ljava/lang/Object;)V

    return-void
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0}, LW8/n;->getContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public h(Li7/M;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object p3, p0, Lf9/f$a;->E:Lf9/f;

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    new-instance v1, Lf9/d;

    invoke-direct {v1, p3, p0}, Lf9/d;-><init>(Lf9/f;Lf9/f$a;)V

    invoke-virtual {v0, p1, p2, v1}, LW8/n;->s(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lf9/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p0, Lf9/f$a;->E:Lf9/f;

    iget-object v0, p0, Lf9/f$a;->D:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0}, LW8/n;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public k(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1}, LW8/n;->k(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2, p3}, Lf9/f$a;->h(Li7/M;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf9/f$a;->C:LW8/n;

    invoke-virtual {v0, p1}, LW8/n;->t(Ljava/lang/Object;)V

    return-void
.end method
