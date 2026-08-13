.class public final Lcom/google/android/gms/internal/ads/iF0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/mE0;

.field private c:Z

.field private final d:Lcom/google/android/gms/internal/ads/fF0;

.field private final e:Lcom/google/android/gms/internal/ads/gF0;

.field private f:Lcom/google/android/gms/internal/ads/kF0;

.field private g:Lcom/google/android/gms/internal/ads/ZE0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iF0;->a:Landroid/content/Context;

    sget-object p1, Lcom/google/android/gms/internal/ads/mE0;->c:Lcom/google/android/gms/internal/ads/mE0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iF0;->b:Lcom/google/android/gms/internal/ads/mE0;

    sget-object p1, Lcom/google/android/gms/internal/ads/fF0;->a:Lcom/google/android/gms/internal/ads/fF0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iF0;->d:Lcom/google/android/gms/internal/ads/fF0;

    sget-object p1, Lcom/google/android/gms/internal/ads/gF0;->a:Lcom/google/android/gms/internal/ads/gF0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iF0;->e:Lcom/google/android/gms/internal/ads/gF0;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/iF0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iF0;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/iF0;)Lcom/google/android/gms/internal/ads/mE0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iF0;->b:Lcom/google/android/gms/internal/ads/mE0;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/iF0;)Lcom/google/android/gms/internal/ads/gF0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iF0;->e:Lcom/google/android/gms/internal/ads/gF0;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/iF0;)Lcom/google/android/gms/internal/ads/kF0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iF0;->f:Lcom/google/android/gms/internal/ads/kF0;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/iF0;)Lcom/google/android/gms/internal/ads/ZE0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iF0;->g:Lcom/google/android/gms/internal/ads/ZE0;

    return-object p0
.end method


# virtual methods
.method public final d()Lcom/google/android/gms/internal/ads/EF0;
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/iF0;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/iF0;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iF0;->f:Lcom/google/android/gms/internal/ads/kF0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/kF0;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/Vu;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/kF0;-><init>([Lcom/google/android/gms/internal/ads/Vu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/iF0;->f:Lcom/google/android/gms/internal/ads/kF0;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iF0;->g:Lcom/google/android/gms/internal/ads/ZE0;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iF0;->a:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ads/ZE0;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ZE0;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/iF0;->g:Lcom/google/android/gms/internal/ads/ZE0;

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/EF0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/EF0;-><init>(Lcom/google/android/gms/internal/ads/iF0;Lcom/google/android/gms/internal/ads/zF0;)V

    return-object v0
.end method
