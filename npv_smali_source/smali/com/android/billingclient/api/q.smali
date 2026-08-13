.class public final synthetic Lcom/android/billingclient/api/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/android/billingclient/api/w;

.field public final synthetic D:Lcom/android/billingclient/api/f;

.field public final synthetic E:LT2/g;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/w;Lcom/android/billingclient/api/f;LT2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/q;->C:Lcom/android/billingclient/api/w;

    iput-object p2, p0, Lcom/android/billingclient/api/q;->D:Lcom/android/billingclient/api/f;

    iput-object p3, p0, Lcom/android/billingclient/api/q;->E:LT2/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/q;->C:Lcom/android/billingclient/api/w;

    iget-object v1, p0, Lcom/android/billingclient/api/q;->D:Lcom/android/billingclient/api/f;

    iget-object v2, p0, Lcom/android/billingclient/api/q;->E:LT2/g;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/w;->E0(Lcom/android/billingclient/api/f;LT2/g;)V

    return-void
.end method
