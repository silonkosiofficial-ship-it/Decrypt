.class public final synthetic LB3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/w;

.field public final synthetic D:[Lcom/google/android/gms/internal/ads/PL;


# direct methods
.method public synthetic constructor <init>(LB3/w;[Lcom/google/android/gms/internal/ads/PL;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/i;->C:LB3/w;

    iput-object p2, p0, LB3/i;->D:[Lcom/google/android/gms/internal/ads/PL;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LB3/i;->C:LB3/w;

    iget-object v1, p0, LB3/i;->D:[Lcom/google/android/gms/internal/ads/PL;

    invoke-virtual {v0, v1}, LB3/w;->y6([Lcom/google/android/gms/internal/ads/PL;)V

    return-void
.end method
