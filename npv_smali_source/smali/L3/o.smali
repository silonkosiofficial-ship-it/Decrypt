.class public abstract LL3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, LT3/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, LL3/o;->a:LT3/a;

    return-void
.end method

.method public static a(LO3/f;Landroid/content/Context;Z)LO3/g;
    .locals 3

    .prologue
    sget-object v0, LL3/o;->a:LT3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Revoking access"

    invoke-virtual {v0, v2, v1}, LT3/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, LL3/c;->b(Landroid/content/Context;)LL3/c;

    move-result-object v0

    invoke-virtual {v0}, LL3/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, LL3/o;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    invoke-static {v0}, LL3/f;->a(Ljava/lang/String;)LO3/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, LL3/m;

    invoke-direct {p1, p0}, LL3/m;-><init>(LO3/f;)V

    invoke-virtual {p0, p1}, LO3/f;->a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(LO3/f;Landroid/content/Context;Z)LO3/g;
    .locals 3

    .prologue
    sget-object v0, LL3/o;->a:LT3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Signing out"

    invoke-virtual {v0, v2, v1}, LT3/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, LL3/o;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->H:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, p0}, LO3/h;->b(Lcom/google/android/gms/common/api/Status;LO3/f;)LO3/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, LL3/k;

    invoke-direct {p1, p0}, LL3/k;-><init>(LO3/f;)V

    invoke-virtual {p0, p1}, LO3/f;->a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 1

    .prologue
    invoke-static {p0}, LL3/p;->a(Landroid/content/Context;)LL3/p;

    move-result-object p0

    invoke-virtual {p0}, LL3/p;->b()V

    invoke-static {}, LO3/f;->b()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO3/f;

    invoke-virtual {v0}, LO3/f;->e()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->a()V

    return-void
.end method
