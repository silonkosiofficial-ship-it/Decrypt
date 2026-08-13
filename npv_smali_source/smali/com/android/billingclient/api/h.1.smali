.class public final synthetic Lcom/android/billingclient/api/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/android/billingclient/api/b;

.field public final synthetic D:LT2/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;LT2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/h;->C:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lcom/android/billingclient/api/h;->D:LT2/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/h;->C:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lcom/android/billingclient/api/h;->D:LT2/d;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/b;->Y(LT2/d;)V

    return-void
.end method
