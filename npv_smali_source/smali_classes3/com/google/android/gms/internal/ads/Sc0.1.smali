.class public final synthetic Lcom/google/android/gms/internal/ads/Sc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Z7;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Z7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Sc0;->a:Lcom/google/android/gms/internal/ads/Z7;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Sc0;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 2

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/Vc0;->f:I

    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/Sc0;->b:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Sc0;->a:Lcom/google/android/gms/internal/ads/Z7;

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Zd0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/d8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Zd0;->a([B)Lcom/google/android/gms/internal/ads/Xd0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xd0;->a(I)Lcom/google/android/gms/internal/ads/Xd0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Xd0;->c()V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object p1
.end method
