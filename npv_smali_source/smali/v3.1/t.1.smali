.class public final synthetic Lv3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lv3/v;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Yk0;


# direct methods
.method public synthetic constructor <init>(Lv3/v;Lcom/google/android/gms/internal/ads/Yk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/t;->C:Lv3/v;

    iput-object p2, p0, Lv3/t;->D:Lcom/google/android/gms/internal/ads/Yk0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/t;->C:Lv3/v;

    iget-object v1, p0, Lv3/t;->D:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {v0, v1}, Lv3/v;->e(Lcom/google/android/gms/internal/ads/Yk0;)V

    return-void
.end method
