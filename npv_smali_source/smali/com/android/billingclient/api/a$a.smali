.class public final Lcom/android/billingclient/api/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private volatile a:Lcom/android/billingclient/api/e;

.field private final b:Landroid/content/Context;

.field private volatile c:LT2/e;

.field private volatile d:Z

.field private volatile e:Z


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;LT2/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    return-void
.end method

.method private final e()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.google.android.play.billingclient.enableBillingOverridesTesting"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    const-string v2, "BillingClient"

    const-string v3, "Unable to retrieve metadata value for enableBillingOverridesTesting."

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/a;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->c:LT2/e;

    if-nez v1, :cond_3

    iget-boolean v1, v0, Lcom/android/billingclient/api/a$a;->d:Z

    if-nez v1, :cond_1

    iget-boolean v1, v0, Lcom/android/billingclient/api/a$a;->e:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Please provide a valid listener for purchases updates."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/a$a;->e()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    new-instance v2, Lcom/android/billingclient/api/w;

    invoke-direct {v2, v3, v1, v3, v3}, Lcom/android/billingclient/api/w;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/android/billingclient/api/b;

    invoke-direct {v2, v3, v1, v3, v3}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->a:Lcom/android/billingclient/api/e;

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->a:Lcom/android/billingclient/api/e;

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->a()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/android/billingclient/api/a$a;->c:LT2/e;

    if-eqz v1, :cond_5

    iget-object v4, v0, Lcom/android/billingclient/api/a$a;->a:Lcom/android/billingclient/api/e;

    iget-object v5, v0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    iget-object v6, v0, Lcom/android/billingclient/api/a$a;->c:LT2/e;

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/a$a;->e()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Lcom/android/billingclient/api/w;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/android/billingclient/api/w;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/e;LT2/k;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_4
    new-instance v1, Lcom/android/billingclient/api/b;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/e;LT2/k;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_5
    iget-object v12, v0, Lcom/android/billingclient/api/a$a;->a:Lcom/android/billingclient/api/e;

    iget-object v13, v0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/a$a;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v2, Lcom/android/billingclient/api/w;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, Lcom/android/billingclient/api/w;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/u;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    goto :goto_1

    :cond_6
    new-instance v2, Lcom/android/billingclient/api/b;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/u;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V

    :goto_1
    return-object v2

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Pending purchases for one-time products must be supported."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Please provide a valid Context."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b()Lcom/android/billingclient/api/a$a;
    .locals 1

    invoke-static {}, Lcom/android/billingclient/api/e;->c()Lcom/android/billingclient/api/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/e$a;->b()Lcom/android/billingclient/api/e$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e$a;->a()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/billingclient/api/a$a;->c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/a$a;

    return-object p0
.end method

.method public c(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/a$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->a:Lcom/android/billingclient/api/e;

    return-object p0
.end method

.method public d(LT2/e;)Lcom/android/billingclient/api/a$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->c:LT2/e;

    return-object p0
.end method
