.class public final LM/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM/c$a;
    }
.end annotation


# static fields
.field public static final h:LM/c$a;

.field public static final i:I

.field private static j:LM/c;


# instance fields
.field private final a:LY0/v;

.field private final b:LM0/P;

.field private final c:LY0/e;

.field private final d:LR0/h$b;

.field private final e:LM0/P;

.field private f:F

.field private g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM/c$a;-><init>(Ly7/k;)V

    sput-object v0, LM/c;->h:LM/c$a;

    const/16 v0, 0x8

    sput v0, LM/c;->i:I

    return-void
.end method

.method private constructor <init>(LY0/v;LM0/P;LY0/e;LR0/h$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/c;->a:LY0/v;

    iput-object p2, p0, LM/c;->b:LM0/P;

    iput-object p3, p0, LM/c;->c:LY0/e;

    iput-object p4, p0, LM/c;->d:LR0/h$b;

    invoke-static {p2, p1}, LM0/Q;->d(LM0/P;LY0/v;)LM0/P;

    move-result-object p1

    iput-object p1, p0, LM/c;->e:LM0/P;

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, LM/c;->f:F

    iput p1, p0, LM/c;->g:F

    return-void
.end method

.method public synthetic constructor <init>(LY0/v;LM0/P;LY0/e;LR0/h$b;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LM/c;-><init>(LY0/v;LM0/P;LY0/e;LR0/h$b;)V

    return-void
.end method

.method public static final synthetic a()LM/c;
    .locals 1

    sget-object v0, LM/c;->j:LM/c;

    return-object v0
.end method

.method public static final synthetic b(LM/c;)V
    .locals 0

    sput-object p0, LM/c;->j:LM/c;

    return-void
.end method


# virtual methods
.method public final c(JI)J
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p3

    iget v2, v0, LM/c;->g:F

    iget v3, v0, LM/c;->f:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    invoke-static {}, LM/d;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, LM/c;->e:LM0/P;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v7

    iget-object v9, v0, LM/c;->c:LY0/e;

    iget-object v10, v0, LM/c;->d:LR0/h$b;

    const/16 v15, 0x60

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, LM0/u;->b(Ljava/lang/String;LM0/P;JLY0/e;LR0/h$b;Ljava/util/List;Ljava/util/List;IZILjava/lang/Object;)LM0/p;

    move-result-object v2

    invoke-interface {v2}, LM0/p;->getHeight()F

    move-result v2

    invoke-static {}, LM/d;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, LM/c;->e:LM0/P;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v5

    iget-object v7, v0, LM/c;->c:LY0/e;

    iget-object v8, v0, LM/c;->d:LR0/h$b;

    const/16 v13, 0x60

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static/range {v3 .. v14}, LM0/u;->b(Ljava/lang/String;LM0/P;JLY0/e;LR0/h$b;Ljava/util/List;Ljava/util/List;IZILjava/lang/Object;)LM0/p;

    move-result-object v3

    invoke-interface {v3}, LM0/p;->getHeight()F

    move-result v3

    sub-float/2addr v3, v2

    iput v2, v0, LM/c;->g:F

    iput v3, v0, LM/c;->f:F

    :cond_1
    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    sub-int/2addr v1, v4

    int-to-float v1, v1

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LE7/j;->d(II)I

    move-result v1

    invoke-static/range {p1 .. p2}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v1, v2}, LE7/j;->g(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p2}, LY0/b;->m(J)I

    move-result v1

    :goto_0
    invoke-static/range {p1 .. p2}, LY0/b;->k(J)I

    move-result v2

    invoke-static/range {p1 .. p2}, LY0/b;->n(J)I

    move-result v3

    invoke-static/range {p1 .. p2}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v3, v4, v1, v2}, LY0/c;->a(IIII)J

    move-result-wide v1

    return-wide v1
.end method

.method public final d()LY0/e;
    .locals 1

    iget-object v0, p0, LM/c;->c:LY0/e;

    return-object v0
.end method

.method public final e()LR0/h$b;
    .locals 1

    iget-object v0, p0, LM/c;->d:LR0/h$b;

    return-object v0
.end method

.method public final f()LM0/P;
    .locals 1

    iget-object v0, p0, LM/c;->b:LM0/P;

    return-object v0
.end method

.method public final g()LY0/v;
    .locals 1

    iget-object v0, p0, LM/c;->a:LY0/v;

    return-object v0
.end method
