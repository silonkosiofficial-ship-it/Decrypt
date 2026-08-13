.class public final Lcom/google/android/gms/internal/ads/K10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/n70;

.field private final c:Landroid/content/pm/PackageInfo;

.field private final d:Lv3/s0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/n70;Landroid/content/pm/PackageInfo;Lv3/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/K10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/K10;->b:Lcom/google/android/gms/internal/ads/n70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/K10;->c:Landroid/content/pm/PackageInfo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/K10;->d:Lv3/s0;

    return-void
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/K10;)Lcom/google/android/gms/internal/ads/L10;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/L10;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/K10;->b:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/K10;->c:Landroid/content/pm/PackageInfo;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/K10;->d:Lv3/s0;

    invoke-direct {v0, v1, v2, p0}, Lcom/google/android/gms/internal/ads/L10;-><init>(Lcom/google/android/gms/internal/ads/n70;Landroid/content/pm/PackageInfo;Lv3/s0;)V

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x1a

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/J10;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/J10;-><init>(Lcom/google/android/gms/internal/ads/K10;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/K10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method
