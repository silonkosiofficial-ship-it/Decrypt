.class public final synthetic LB3/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/s0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/YN;

.field public final synthetic E:Ljava/util/ArrayDeque;

.field public final synthetic F:Ljava/util/ArrayDeque;


# direct methods
.method public synthetic constructor <init>(LB3/s0;Lcom/google/android/gms/internal/ads/YN;Ljava/util/ArrayDeque;Ljava/util/ArrayDeque;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/p0;->C:LB3/s0;

    iput-object p2, p0, LB3/p0;->D:Lcom/google/android/gms/internal/ads/YN;

    iput-object p3, p0, LB3/p0;->E:Ljava/util/ArrayDeque;

    iput-object p4, p0, LB3/p0;->F:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LB3/p0;->C:LB3/s0;

    iget-object v1, p0, LB3/p0;->D:Lcom/google/android/gms/internal/ads/YN;

    iget-object v2, p0, LB3/p0;->E:Ljava/util/ArrayDeque;

    iget-object v3, p0, LB3/p0;->F:Ljava/util/ArrayDeque;

    invoke-virtual {v0, v1, v2, v3}, LB3/s0;->e(Lcom/google/android/gms/internal/ads/YN;Ljava/util/ArrayDeque;Ljava/util/ArrayDeque;)V

    return-void
.end method
