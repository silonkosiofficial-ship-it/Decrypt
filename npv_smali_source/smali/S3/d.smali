.class public final LS3/d;
.super LO3/e;
.source "SourceFile"

# interfaces
.implements LQ3/v;


# static fields
.field private static final k:LO3/a$g;

.field private static final l:LO3/a$a;

.field private static final m:LO3/a;

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO3/a$g;

    invoke-direct {v0}, LO3/a$g;-><init>()V

    sput-object v0, LS3/d;->k:LO3/a$g;

    new-instance v1, LS3/c;

    invoke-direct {v1}, LS3/c;-><init>()V

    sput-object v1, LS3/d;->l:LO3/a$a;

    new-instance v2, LO3/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, LO3/a;-><init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V

    sput-object v2, LS3/d;->m:LO3/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LQ3/w;)V
    .locals 2

    sget-object v0, LS3/d;->m:LO3/a;

    sget-object v1, LO3/e$a;->c:LO3/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, LO3/e;-><init>(Landroid/content/Context;LO3/a;LO3/a$d;LO3/e$a;)V

    return-void
.end method


# virtual methods
.method public final b(LQ3/t;)Ll4/l;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LN3/d;

    sget-object v2, Ld4/d;->a:LN3/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([LN3/d;)Lcom/google/android/gms/common/api/internal/d$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    new-instance v1, LS3/b;

    invoke-direct {v1, p1}, LS3/b;-><init>(LQ3/t;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(LP3/i;)Lcom/google/android/gms/common/api/internal/d$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    invoke-virtual {p0, p1}, LO3/e;->e(Lcom/google/android/gms/common/api/internal/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
