.class public final La4/p;
.super LO3/e;
.source "SourceFile"

# interfaces
.implements LH3/b;


# static fields
.field private static final m:LO3/a$g;

.field private static final n:LO3/a$a;

.field private static final o:LO3/a;


# instance fields
.field private final k:Landroid/content/Context;

.field private final l:LN3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO3/a$g;

    invoke-direct {v0}, LO3/a$g;-><init>()V

    sput-object v0, La4/p;->m:LO3/a$g;

    new-instance v1, La4/n;

    invoke-direct {v1}, La4/n;-><init>()V

    sput-object v1, La4/p;->n:LO3/a$a;

    new-instance v2, LO3/a;

    const-string v3, "AppSet.API"

    invoke-direct {v2, v3, v1, v0}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v2, La4/p;->o:LO3/a;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;LN3/h;)V
    .locals 3

    sget-object v0, La4/p;->o:LO3/a;

    sget-object v1, LO3/a$d;->c:LO3/a$d$a;

    sget-object v2, LO3/e$a;->c:LO3/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, LO3/e;-><init>(Landroid/content/Context;LO3/a;LO3/a$d;LO3/e$a;)V

    iput-object p1, p0, La4/p;->k:Landroid/content/Context;

    iput-object p2, p0, La4/p;->l:LN3/h;

    return-void
.end method


# virtual methods
.method public final a()Ll4/l;
    .locals 4

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, La4/p;->l:LN3/h;

    iget-object v2, p0, La4/p;->k:Landroid/content/Context;

    const v3, 0xcaf1200

    invoke-virtual {v1, v2, v3}, LN3/h;->h(Landroid/content/Context;I)I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [LN3/d;

    sget-object v3, LH3/h;->a:LN3/d;

    aput-object v3, v2, v0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/d$a;->d([LN3/d;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v1

    new-instance v2, La4/m;

    invoke-direct {v2, p0}, La4/m;-><init>(La4/p;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/d$a;->b(LP3/i;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/16 v1, 0x6bd1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object v0

    invoke-virtual {p0, v0}, LO3/e;->f(Lcom/google/android/gms/common/api/internal/d;)Ll4/l;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LO3/b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v0, v1}, LO3/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {v0}, Ll4/o;->d(Ljava/lang/Exception;)Ll4/l;

    move-result-object v0

    return-object v0
.end method
