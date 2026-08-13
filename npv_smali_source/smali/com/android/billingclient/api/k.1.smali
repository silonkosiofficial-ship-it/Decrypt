.class final Lcom/android/billingclient/api/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LT2/d;

.field final synthetic c:Lcom/android/billingclient/api/b;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/b;Ljava/lang/String;LT2/d;)V
    .locals 0

    iput-object p2, p0, Lcom/android/billingclient/api/k;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/k;->b:LT2/d;

    iput-object p1, p0, Lcom/android/billingclient/api/k;->c:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/k;->c:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lcom/android/billingclient/api/k;->a:Ljava/lang/String;

    const/16 v2, 0x9

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->c0(Lcom/android/billingclient/api/b;Ljava/lang/String;I)LT2/w;

    move-result-object v0

    invoke-virtual {v0}, LT2/w;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/k;->b:LT2/d;

    invoke-virtual {v0}, LT2/w;->a()Lcom/android/billingclient/api/d;

    move-result-object v2

    invoke-virtual {v0}, LT2/w;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0}, LT2/d;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/android/billingclient/api/k;->b:LT2/d;

    invoke-virtual {v0}, LT2/w;->a()Lcom/android/billingclient/api/d;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e0;->E()Lcom/google/android/gms/internal/play_billing/e0;

    move-result-object v2

    invoke-interface {v1, v0, v2}, LT2/d;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
