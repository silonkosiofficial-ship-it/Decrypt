.class public Lcom/google/android/gms/auth/api/signin/b;
.super LO3/e;
.source "SourceFile"


# static fields
.field private static final k:Lcom/google/android/gms/auth/api/signin/f;

.field static l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/signin/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/f;-><init>(LK3/d;)V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/b;->k:Lcom/google/android/gms/auth/api/signin/f;

    const/4 v0, 0x1

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 3

    sget-object v0, LI3/a;->b:LO3/a;

    new-instance v1, LO3/e$a$a;

    invoke-direct {v1}, LO3/e$a$a;-><init>()V

    new-instance v2, LP3/a;

    invoke-direct {v2}, LP3/a;-><init>()V

    invoke-virtual {v1, v2}, LO3/e$a$a;->b(LP3/k;)LO3/e$a$a;

    move-result-object v1

    invoke-virtual {v1}, LO3/e$a$a;->a()LO3/e$a;

    move-result-object v1

    invoke-direct {p0, p1, v0, p2, v1}, LO3/e;-><init>(Landroid/content/Context;LO3/a;LO3/a$d;LO3/e$a;)V

    return-void
.end method

.method private final declared-synchronized t()I
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    sget v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LO3/e;->j()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, LN3/g;->m()LN3/g;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v0, v2}, LN3/g;->h(Landroid/content/Context;I)I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x4

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, LN3/g;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public r()Ll4/l;
    .locals 4

    .prologue
    invoke-virtual {p0}, LO3/e;->c()LO3/f;

    move-result-object v0

    invoke-virtual {p0}, LO3/e;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->t()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, LL3/o;->a(LO3/f;Landroid/content/Context;Z)LO3/g;

    move-result-object v0

    invoke-static {v0}, LQ3/o;->b(LO3/g;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public s()Ll4/l;
    .locals 4

    .prologue
    invoke-virtual {p0}, LO3/e;->c()LO3/f;

    move-result-object v0

    invoke-virtual {p0}, LO3/e;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->t()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, LL3/o;->b(LO3/f;Landroid/content/Context;Z)LO3/g;

    move-result-object v0

    invoke-static {v0}, LQ3/o;->b(LO3/g;)Ll4/l;

    move-result-object v0

    return-object v0
.end method
