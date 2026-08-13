.class public final Lw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw/h;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:Lh0/c$c;

.field private static final h:I

.field private static final i:F

.field private static final j:F

.field private static final k:F

.field private static final l:J

.field private static final m:LR0/q;

.field private static final n:J

.field private static final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/h;

    invoke-direct {v0}, Lw/h;-><init>()V

    sput-object v0, Lw/h;->a:Lw/h;

    const/16 v0, 0x70

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->c:F

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->d:F

    const/4 v0, 0x3

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->e:F

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->f:F

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v0

    sput-object v0, Lw/h;->g:Lh0/c$c;

    sget-object v0, LX0/j;->b:LX0/j$a;

    invoke-virtual {v0}, LX0/j$a;->f()I

    move-result v0

    sput v0, Lw/h;->h:I

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->i:F

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->j:F

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lw/h;->k:F

    const/16 v0, 0xe

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide v0

    sput-wide v0, Lw/h;->l:J

    sget-object v0, LR0/q;->D:LR0/q$a;

    invoke-virtual {v0}, LR0/q$a;->c()LR0/q;

    move-result-object v0

    sput-object v0, Lw/h;->m:LR0/q;

    const/16 v0, 0x14

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide v0

    sput-wide v0, Lw/h;->n:J

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0}, LY0/y;->e(F)J

    move-result-wide v0

    sput-wide v0, Lw/h;->o:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, Lw/h;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lw/h;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, Lw/h;->f:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, Lw/h;->i:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, Lw/h;->k:F

    return v0
.end method

.method public final f()Lh0/c$c;
    .locals 1

    sget-object v0, Lw/h;->g:Lh0/c$c;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, Lw/h;->d:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, Lw/h;->e:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, Lw/h;->j:F

    return v0
.end method

.method public final j(J)LM0/P;
    .locals 33

    move-wide/from16 v1, p1

    sget v20, Lw/h;->h:I

    sget-wide v3, Lw/h;->l:J

    sget-object v5, Lw/h;->m:LR0/q;

    sget-wide v22, Lw/h;->n:J

    sget-wide v10, Lw/h;->o:J

    new-instance v32, LM0/P;

    move-object/from16 v0, v32

    const v30, 0xfd7f78

    const/16 v31, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v0 .. v31}, LM0/P;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LM0/A;LX0/h;IILX0/t;ILy7/k;)V

    return-object v32
.end method
