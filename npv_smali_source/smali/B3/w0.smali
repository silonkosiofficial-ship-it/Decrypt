.class public final synthetic LB3/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/kO;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:[Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kO;Lcom/google/android/gms/internal/ads/YN;Ljava/lang/String;[Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/w0;->C:Lcom/google/android/gms/internal/ads/kO;

    iput-object p3, p0, LB3/w0;->D:Ljava/lang/String;

    iput-object p4, p0, LB3/w0;->E:[Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LB3/w0;->C:Lcom/google/android/gms/internal/ads/kO;

    iget-object v1, p0, LB3/w0;->D:Ljava/lang/String;

    iget-object v2, p0, LB3/w0;->E:[Landroid/util/Pair;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LB3/c;->e(Lcom/google/android/gms/internal/ads/kO;Lcom/google/android/gms/internal/ads/YN;Ljava/lang/String;[Landroid/util/Pair;)V

    return-void
.end method
