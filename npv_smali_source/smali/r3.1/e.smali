.class public final synthetic Lr3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/eO;

.field public final synthetic D:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Lr3/f;Lcom/google/android/gms/internal/ads/eO;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr3/e;->C:Lcom/google/android/gms/internal/ads/eO;

    iput-object p3, p0, Lr3/e;->D:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr3/e;->C:Lcom/google/android/gms/internal/ads/eO;

    iget-object v1, p0, Lr3/e;->D:Ljava/lang/Long;

    invoke-static {v0, v1}, Lr3/f;->e(Lcom/google/android/gms/internal/ads/eO;Ljava/lang/Long;)V

    return-void
.end method
