.class public final synthetic LB3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LB3/w;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Fq;

.field public final synthetic c:I

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(LB3/w;Lcom/google/android/gms/internal/ads/Fq;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/m;->a:LB3/w;

    iput-object p2, p0, LB3/m;->b:Lcom/google/android/gms/internal/ads/Fq;

    iput p3, p0, LB3/m;->c:I

    iput-object p4, p0, LB3/m;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LB3/m;->a:LB3/w;

    iget-object v1, p0, LB3/m;->b:Lcom/google/android/gms/internal/ads/Fq;

    iget v2, p0, LB3/m;->c:I

    iget-object v3, p0, LB3/m;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, LB3/w;->U6(Lcom/google/android/gms/internal/ads/Fq;ILandroid/os/Bundle;)LB3/e;

    move-result-object v0

    return-object v0
.end method
