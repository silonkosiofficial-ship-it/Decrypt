.class public final Lcom/google/android/gms/internal/ads/z20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Landroid/content/Context;

.field private final c:Lw3/a;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Landroid/content/Context;Lw3/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z20;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z20;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/z20;->c:Lw3/a;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/z20;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/y20;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/y20;-><init>(Lcom/google/android/gms/internal/ads/z20;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z20;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/A20;
    .locals 11

    .prologue
    new-instance v9, Lcom/google/android/gms/internal/ads/A20;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z20;->b:Landroid/content/Context;

    invoke-static {v0}, LW3/e;->a(Landroid/content/Context;)LW3/d;

    move-result-object v0

    invoke-virtual {v0}, LW3/d;->g()Z

    move-result v1

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z20;->b:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->f(Landroid/content/Context;)Z

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z20;->c:Lw3/a;

    iget-object v3, v0, Lw3/a;->C:Ljava/lang/String;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {}, Lv3/E0;->g()Z

    move-result v4

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z20;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z20;->b:Landroid/content/Context;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/z20;->d:Ljava/lang/String;

    const-string v6, "com.google.android.gms.ads.dynamite"

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v10

    move-object v0, v9

    move v6, v7

    move v7, v10

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/A20;-><init>(ZZLjava/lang/String;ZIIILjava/lang/String;)V

    return-object v9
.end method
