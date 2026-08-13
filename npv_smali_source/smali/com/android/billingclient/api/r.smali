.class public final synthetic Lcom/android/billingclient/api/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/android/billingclient/api/w;

.field public final synthetic D:LT2/a;

.field public final synthetic E:LT2/b;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/w;LT2/a;LT2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/r;->C:Lcom/android/billingclient/api/w;

    iput-object p2, p0, Lcom/android/billingclient/api/r;->D:LT2/a;

    iput-object p3, p0, Lcom/android/billingclient/api/r;->E:LT2/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/r;->C:Lcom/android/billingclient/api/w;

    iget-object v1, p0, Lcom/android/billingclient/api/r;->D:LT2/a;

    iget-object v2, p0, Lcom/android/billingclient/api/r;->E:LT2/b;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/w;->C0(LT2/a;LT2/b;)V

    return-void
.end method
