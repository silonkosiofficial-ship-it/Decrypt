.class public final Lcom/google/android/gms/internal/ads/NR;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/qR;

.field private final c:Lcom/google/android/gms/internal/ads/Uy0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/qR;Lcom/google/android/gms/internal/ads/Uy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NR;->b:Lcom/google/android/gms/internal/ads/qR;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/NR;->c:Lcom/google/android/gms/internal/ads/Uy0;

    return-void
.end method

.method private final g(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/tk0;)LP4/d;
    .locals 3

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Po;->F:Ljava/lang/String;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {v0}, Lv3/E0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/AR;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/MR;->a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/KR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/KR;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v2, Ljava/util/concurrent/ExecutionException;

    invoke-static {p2, v2, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/IR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/IR;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/Dk0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2, p4, v0}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v0, Lcom/google/android/gms/internal/ads/JR;

    invoke-direct {v0, p0, p3, p1, p4}, Lcom/google/android/gms/internal/ads/JR;-><init>(Lcom/google/android/gms/internal/ads/NR;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/tk0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    const-class p3, Lcom/google/android/gms/internal/ads/AR;

    invoke-static {p2, p3, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/FR;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/FR;-><init>(Lcom/google/android/gms/internal/ads/Po;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/NR;->b:Lcom/google/android/gms/internal/ads/qR;

    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/GR;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/GR;-><init>(Lcom/google/android/gms/internal/ads/qR;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/HR;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/HR;-><init>(Lcom/google/android/gms/internal/ads/NR;)V

    invoke-direct {p0, p1, v2, v1, v0}, Lcom/google/android/gms/internal/ads/NR;->g(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/tk0;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/tk0;Lcom/google/android/gms/internal/ads/AR;)LP4/d;
    .locals 0

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/NR;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/MR;->a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NR;->c:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/gS;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/gS;->o6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NR;->b:Lcom/google/android/gms/internal/ads/qR;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/qR;->d(Ljava/lang/String;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic e(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NR;->c:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/gS;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/gS;->r6(Ljava/lang/String;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/CR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/CR;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/DR;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/DR;-><init>(Lcom/google/android/gms/internal/ads/NR;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ER;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ER;-><init>(Lcom/google/android/gms/internal/ads/NR;)V

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/NR;->g(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/MR;Lcom/google/android/gms/internal/ads/tk0;)LP4/d;

    move-result-object p1

    return-object p1
.end method
