.class public final Lcom/google/android/gms/internal/ads/tI0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/KH0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Oh0;

.field private b:I

.field private final c:Lcom/google/android/gms/internal/ads/sI0;

.field private final d:Lcom/google/android/gms/internal/ads/cK0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Oh0;Lcom/google/android/gms/internal/ads/sI0;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/cK0;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/cK0;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tI0;->a:Lcom/google/android/gms/internal/ads/Oh0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/tI0;->c:Lcom/google/android/gms/internal/ads/sI0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tI0;->d:Lcom/google/android/gms/internal/ads/cK0;

    const/high16 p1, 0x100000

    iput p1, p0, Lcom/google/android/gms/internal/ads/tI0;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/tI0;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/tI0;->b:I

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Q7;)Lcom/google/android/gms/internal/ads/vI0;
    .locals 11

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tI0;->a:Lcom/google/android/gms/internal/ads/Oh0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/tI0;->c:Lcom/google/android/gms/internal/ads/sI0;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/tI0;->d:Lcom/google/android/gms/internal/ads/cK0;

    new-instance v0, Lcom/google/android/gms/internal/ads/vI0;

    sget-object v5, Lcom/google/android/gms/internal/ads/XF0;->a:Lcom/google/android/gms/internal/ads/XF0;

    iget v7, p0, Lcom/google/android/gms/internal/ads/tI0;->b:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/vI0;-><init>(Lcom/google/android/gms/internal/ads/Q7;Lcom/google/android/gms/internal/ads/Oh0;Lcom/google/android/gms/internal/ads/sI0;Lcom/google/android/gms/internal/ads/XF0;Lcom/google/android/gms/internal/ads/cK0;IZLcom/google/android/gms/internal/ads/Tg0;Lcom/google/android/gms/internal/ads/uI0;)V

    return-object v0
.end method
