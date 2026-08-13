.class final Lcom/google/android/gms/internal/ads/B50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/b80;

.field private final b:Lcom/google/android/gms/internal/ads/jC;

.field private final c:Ljava/util/concurrent/Executor;

.field private d:Lcom/google/android/gms/internal/ads/y50;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/jC;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B50;->a:Lcom/google/android/gms/internal/ads/b80;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/B50;->b:Lcom/google/android/gms/internal/ads/jC;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/B50;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/B50;)Lcom/google/android/gms/internal/ads/y50;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/B50;->d:Lcom/google/android/gms/internal/ads/y50;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/B50;)Lcom/google/android/gms/internal/ads/m80;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/B50;->e()Lcom/google/android/gms/internal/ads/m80;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/B50;Lcom/google/android/gms/internal/ads/y50;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/B50;->d:Lcom/google/android/gms/internal/ads/y50;

    return-void
.end method

.method private final e()Lcom/google/android/gms/internal/ads/m80;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B50;->b:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->i()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->j:Ls3/i2;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/B50;->a:Lcom/google/android/gms/internal/ads/b80;

    invoke-interface {v3, v1, v2, v0}, Lcom/google/android/gms/internal/ads/b80;->d(Ls3/X1;Ljava/lang/String;Ls3/i2;)Lcom/google/android/gms/internal/ads/m80;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B50;->d:Lcom/google/android/gms/internal/ads/y50;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Jg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/y50;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/B50;->e()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/y50;-><init>(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/A50;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/B50;->d:Lcom/google/android/gms/internal/ads/y50;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/B50;->b:Lcom/google/android/gms/internal/ads/jC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/B50;->a:Lcom/google/android/gms/internal/ads/b80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/b80;->a()Lcom/google/android/gms/internal/ads/j80;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/LA;->e(Lcom/google/android/gms/internal/ads/j80;)LP4/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/x50;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/x50;-><init>(Lcom/google/android/gms/internal/ads/B50;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/B50;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/w50;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/w50;-><init>(Lcom/google/android/gms/internal/ads/B50;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/B50;->c:Ljava/util/concurrent/Executor;

    const-class v3, Lcom/google/android/gms/internal/ads/AR;

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->e(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/v50;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/v50;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/B50;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
