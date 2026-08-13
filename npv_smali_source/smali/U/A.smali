.class public final LU/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/A;

.field private static final b:LG/f;

.field private static final c:LG/f;

.field private static final d:LG/f;

.field private static final e:LG/f;

.field private static final f:LG/f;

.field private static final g:LG/f;

.field private static final h:LG/f;

.field private static final i:LG/f;

.field private static final j:LG/f;

.field private static final k:Lo0/e2;

.field private static final l:LG/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LU/A;

    invoke-direct {v0}, LU/A;-><init>()V

    sput-object v0, LU/A;->a:LU/A;

    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/g;->c(F)LG/f;

    move-result-object v1

    sput-object v1, LU/A;->b:LG/f;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    const-wide/16 v2, 0x0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    invoke-static {v1, v0, v3, v4}, LG/g;->d(FFFF)LG/f;

    move-result-object v0

    sput-object v0, LU/A;->c:LG/f;

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/g;->c(F)LG/f;

    move-result-object v1

    sput-object v1, LU/A;->d:LG/f;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    invoke-static {v1, v0, v3, v4}, LG/g;->d(FFFF)LG/f;

    move-result-object v0

    sput-object v0, LU/A;->e:LG/f;

    invoke-static {}, LG/g;->e()LG/f;

    move-result-object v0

    sput-object v0, LU/A;->f:LG/f;

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/g;->c(F)LG/f;

    move-result-object v1

    sput-object v1, LU/A;->g:LG/f;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v4

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v5

    invoke-static {v1, v3, v4, v5}, LG/g;->d(FFFF)LG/f;

    move-result-object v1

    sput-object v1, LU/A;->h:LG/f;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v1, v0, v3, v2}, LG/g;->d(FFFF)LG/f;

    move-result-object v0

    sput-object v0, LU/A;->i:LG/f;

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/g;->c(F)LG/f;

    move-result-object v0

    sput-object v0, LU/A;->j:LG/f;

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v0

    sput-object v0, LU/A;->k:Lo0/e2;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/g;->c(F)LG/f;

    move-result-object v0

    sput-object v0, LU/A;->l:LG/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LG/f;
    .locals 1

    sget-object v0, LU/A;->b:LG/f;

    return-object v0
.end method

.method public final b()LG/f;
    .locals 1

    sget-object v0, LU/A;->d:LG/f;

    return-object v0
.end method

.method public final c()LG/f;
    .locals 1

    sget-object v0, LU/A;->g:LG/f;

    return-object v0
.end method

.method public final d()LG/f;
    .locals 1

    sget-object v0, LU/A;->j:LG/f;

    return-object v0
.end method

.method public final e()LG/f;
    .locals 1

    sget-object v0, LU/A;->l:LG/f;

    return-object v0
.end method
