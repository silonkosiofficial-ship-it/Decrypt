.class public abstract Lv3/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private volatile b:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv3/a;

    invoke-direct {v0, p0}, Lv3/a;-><init>(Lv3/B;)V

    iput-object v0, p0, Lv3/B;->a:Ljava/lang/Runnable;

    return-void
.end method

.method static bridge synthetic c(Lv3/B;Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Lv3/B;->b:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b()LP4/d;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iget-object v1, p0, Lv3/B;->a:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    move-result-object v0

    return-object v0
.end method
