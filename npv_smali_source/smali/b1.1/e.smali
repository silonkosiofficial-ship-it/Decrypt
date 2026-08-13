.class public final Lb1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/e$a;,
        Lb1/e$b;,
        Lb1/e$c;
    }
.end annotation


# static fields
.field static final synthetic C:[LF7/k;


# instance fields
.field private A:F

.field private B:F

.field private final a:Ljava/lang/Object;

.field private final b:Li1/f;

.field private final c:Lb1/f;

.field private final d:Lb1/B;

.field private final e:Lb1/B;

.field private final f:Lb1/u;

.field private final g:Lb1/B;

.field private final h:Lb1/B;

.field private final i:Lb1/u;

.field private final j:Lb1/d;

.field private final k:Lb1/e$a;

.field private final l:Lb1/e$a;

.field private final m:Lb1/e$d;

.field private n:F

.field private final o:Lb1/e$c;

.field private final p:Lb1/e$c;

.field private final q:Lb1/e$c;

.field private final r:Lb1/e$c;

.field private final s:Lb1/e$c;

.field private final t:Lb1/e$b;

.field private final u:Lb1/e$b;

.field private final v:Lb1/e$b;

.field private final w:Lb1/e$c;

.field private final x:Lb1/e$c;

.field private final y:Lb1/e$c;

.field private final z:Lb1/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Ly7/A;

    const-class v1, Lb1/e;

    const-string v2, "width"

    const-string v3, "getWidth()Landroidx/constraintlayout/compose/Dimension;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v0

    new-instance v2, Ly7/A;

    const-string v3, "height"

    const-string v5, "getHeight()Landroidx/constraintlayout/compose/Dimension;"

    invoke-direct {v2, v1, v3, v5, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v2

    new-instance v3, Ly7/A;

    const-string v5, "visibility"

    const-string v6, "getVisibility()Landroidx/constraintlayout/compose/Visibility;"

    invoke-direct {v3, v1, v5, v6, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v3

    new-instance v5, Ly7/A;

    const-string v6, "scaleX"

    const-string v7, "getScaleX()F"

    invoke-direct {v5, v1, v6, v7, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v5

    new-instance v6, Ly7/A;

    const-string v7, "scaleY"

    const-string v8, "getScaleY()F"

    invoke-direct {v6, v1, v7, v8, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v6

    new-instance v7, Ly7/A;

    const-string v8, "rotationX"

    const-string v9, "getRotationX()F"

    invoke-direct {v7, v1, v8, v9, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v7

    new-instance v8, Ly7/A;

    const-string v9, "rotationY"

    const-string v10, "getRotationY()F"

    invoke-direct {v8, v1, v9, v10, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v8

    new-instance v9, Ly7/A;

    const-string v10, "rotationZ"

    const-string v11, "getRotationZ()F"

    invoke-direct {v9, v1, v10, v11, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v9

    new-instance v10, Ly7/A;

    const-string v11, "translationX"

    const-string v12, "getTranslationX-D9Ej5fM()F"

    invoke-direct {v10, v1, v11, v12, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v10

    new-instance v11, Ly7/A;

    const-string v12, "translationY"

    const-string v13, "getTranslationY-D9Ej5fM()F"

    invoke-direct {v11, v1, v12, v13, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v11

    new-instance v12, Ly7/A;

    const-string v13, "translationZ"

    const-string v14, "getTranslationZ-D9Ej5fM()F"

    invoke-direct {v12, v1, v13, v14, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v12

    new-instance v13, Ly7/A;

    const-string v14, "pivotX"

    const-string v15, "getPivotX()F"

    invoke-direct {v13, v1, v14, v15, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v13}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v13

    new-instance v14, Ly7/A;

    const-string v15, "pivotY"

    move-object/from16 v16, v13

    const-string v13, "getPivotY()F"

    invoke-direct {v14, v1, v15, v13, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v13

    new-instance v14, Ly7/A;

    const-string v15, "horizontalChainWeight"

    move-object/from16 v17, v13

    const-string v13, "getHorizontalChainWeight()F"

    invoke-direct {v14, v1, v15, v13, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v13

    new-instance v14, Ly7/A;

    const-string v15, "verticalChainWeight"

    move-object/from16 v18, v13

    const-string v13, "getVerticalChainWeight()F"

    invoke-direct {v14, v1, v15, v13, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v1

    const/16 v13, 0xf

    new-array v13, v13, [LF7/k;

    aput-object v0, v13, v4

    const/4 v0, 0x1

    aput-object v2, v13, v0

    const/4 v0, 0x2

    aput-object v3, v13, v0

    const/4 v0, 0x3

    aput-object v5, v13, v0

    const/4 v0, 0x4

    aput-object v6, v13, v0

    const/4 v0, 0x5

    aput-object v7, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v0, 0x9

    aput-object v11, v13, v0

    const/16 v0, 0xa

    aput-object v12, v13, v0

    const/16 v0, 0xb

    aput-object v16, v13, v0

    const/16 v0, 0xc

    aput-object v17, v13, v0

    const/16 v0, 0xd

    aput-object v18, v13, v0

    const/16 v0, 0xe

    aput-object v1, v13, v0

    sput-object v13, Lb1/e;->C:[LF7/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Li1/f;)V
    .locals 13

    const-string v0, "id"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerObject"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/e;->a:Ljava/lang/Object;

    iput-object p2, p0, Lb1/e;->b:Li1/f;

    new-instance p1, Lb1/f;

    const-string v0, "parent"

    invoke-direct {p1, v0}, Lb1/f;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb1/e;->c:Lb1/f;

    new-instance p1, Lb1/p;

    const/4 v0, -0x2

    invoke-direct {p1, v0, p2}, Lb1/p;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->d:Lb1/B;

    new-instance p1, Lb1/p;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Lb1/p;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->e:Lb1/B;

    new-instance p1, Lb1/h;

    invoke-direct {p1, v0, p2}, Lb1/h;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->f:Lb1/u;

    new-instance p1, Lb1/p;

    const/4 v1, -0x1

    invoke-direct {p1, v1, p2}, Lb1/p;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->g:Lb1/B;

    new-instance p1, Lb1/p;

    const/4 v1, 0x1

    invoke-direct {p1, v1, p2}, Lb1/p;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->h:Lb1/B;

    new-instance p1, Lb1/h;

    invoke-direct {p1, v1, p2}, Lb1/h;-><init>(ILi1/f;)V

    iput-object p1, p0, Lb1/e;->i:Lb1/u;

    new-instance p1, Lb1/g;

    invoke-direct {p1, p2}, Lb1/g;-><init>(Li1/f;)V

    iput-object p1, p0, Lb1/e;->j:Lb1/d;

    new-instance p1, Lb1/e$a;

    sget-object p2, Lb1/r;->a:Lb1/r$b;

    invoke-virtual {p2}, Lb1/r$b;->b()Lb1/r;

    move-result-object v1

    invoke-direct {p1, p0, v1}, Lb1/e$a;-><init>(Lb1/e;Lb1/r;)V

    iput-object p1, p0, Lb1/e;->k:Lb1/e$a;

    new-instance p1, Lb1/e$a;

    invoke-virtual {p2}, Lb1/r$b;->b()Lb1/r;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Lb1/e$a;-><init>(Lb1/e;Lb1/r;)V

    iput-object p1, p0, Lb1/e;->l:Lb1/e$a;

    sget-object p1, Lb1/C;->b:Lb1/C$a;

    invoke-virtual {p1}, Lb1/C$a;->a()Lb1/C;

    move-result-object p1

    new-instance p2, Lb1/e$d;

    invoke-direct {p2, p0, p1}, Lb1/e$d;-><init>(Lb1/e;Lb1/C;)V

    iput-object p2, p0, Lb1/e;->m:Lb1/e$d;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lb1/e;->n:F

    new-instance p1, Lb1/e$c;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->o:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object v7, p1

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->p:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->q:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const/4 v9, 0x0

    move-object v7, p1

    invoke-direct/range {v7 .. v12}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->r:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->s:Lb1/e$c;

    new-instance p1, Lb1/e$b;

    int-to-float p2, v0

    invoke-static {p2}, LY0/i;->q(F)F

    move-result v9

    move-object v7, p1

    invoke-direct/range {v7 .. v12}, Lb1/e$b;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->t:Lb1/e$b;

    new-instance p1, Lb1/e$b;

    invoke-static {p2}, LY0/i;->q(F)F

    move-result v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lb1/e$b;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->u:Lb1/e$b;

    new-instance p1, Lb1/e$b;

    invoke-static {p2}, LY0/i;->q(F)F

    move-result v8

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Lb1/e$b;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->v:Lb1/e$b;

    new-instance p1, Lb1/e$c;

    const/high16 v2, 0x3f000000    # 0.5f

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->w:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;ILy7/k;)V

    iput-object p1, p0, Lb1/e;->x:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const-string p2, "hWeight"

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-direct {p1, p0, v0, p2}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;)V

    iput-object p1, p0, Lb1/e;->y:Lb1/e$c;

    new-instance p1, Lb1/e$c;

    const-string p2, "vWeight"

    invoke-direct {p1, p0, v0, p2}, Lb1/e$c;-><init>(Lb1/e;FLjava/lang/String;)V

    iput-object p1, p0, Lb1/e;->z:Lb1/e$c;

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lb1/e;->A:F

    iput p1, p0, Lb1/e;->B:F

    return-void
.end method


# virtual methods
.method public final a()Lb1/u;
    .locals 1

    iget-object v0, p0, Lb1/e;->i:Lb1/u;

    return-object v0
.end method

.method public final b()Li1/f;
    .locals 1

    iget-object v0, p0, Lb1/e;->b:Li1/f;

    return-object v0
.end method

.method public final c()Lb1/B;
    .locals 1

    iget-object v0, p0, Lb1/e;->g:Lb1/B;

    return-object v0
.end method

.method public final d()Lb1/f;
    .locals 1

    iget-object v0, p0, Lb1/e;->c:Lb1/f;

    return-object v0
.end method

.method public final e()Lb1/B;
    .locals 1

    iget-object v0, p0, Lb1/e;->d:Lb1/B;

    return-object v0
.end method

.method public final f()Lb1/u;
    .locals 1

    iget-object v0, p0, Lb1/e;->f:Lb1/u;

    return-object v0
.end method

.method public final g(Lb1/r;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb1/e;->k:Lb1/e$a;

    sget-object v1, Lb1/e;->C:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LB7/b;->b(Ljava/lang/Object;LF7/k;Ljava/lang/Object;)V

    return-void
.end method
