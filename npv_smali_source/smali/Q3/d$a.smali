.class public final LQ3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/accounts/Account;

.field private b:Lr/b;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private final e:Lj4/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj4/a;->L:Lj4/a;

    iput-object v0, p0, LQ3/d$a;->e:Lj4/a;

    return-void
.end method


# virtual methods
.method public a()LQ3/d;
    .locals 11

    new-instance v10, LQ3/d;

    iget-object v1, p0, LQ3/d$a;->a:Landroid/accounts/Account;

    iget-object v2, p0, LQ3/d$a;->b:Lr/b;

    iget-object v6, p0, LQ3/d$a;->c:Ljava/lang/String;

    iget-object v7, p0, LQ3/d$a;->d:Ljava/lang/String;

    iget-object v8, p0, LQ3/d$a;->e:Lj4/a;

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LQ3/d;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lj4/a;Z)V

    return-object v10
.end method

.method public b(Ljava/lang/String;)LQ3/d$a;
    .locals 0

    iput-object p1, p0, LQ3/d$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Collection;)LQ3/d$a;
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/d$a;->b:Lr/b;

    if-nez v0, :cond_0

    new-instance v0, Lr/b;

    invoke-direct {v0}, Lr/b;-><init>()V

    iput-object v0, p0, LQ3/d$a;->b:Lr/b;

    :cond_0
    iget-object v0, p0, LQ3/d$a;->b:Lr/b;

    invoke-virtual {v0, p1}, Lr/b;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final d(Landroid/accounts/Account;)LQ3/d$a;
    .locals 0

    iput-object p1, p0, LQ3/d$a;->a:Landroid/accounts/Account;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)LQ3/d$a;
    .locals 0

    iput-object p1, p0, LQ3/d$a;->d:Ljava/lang/String;

    return-object p0
.end method
