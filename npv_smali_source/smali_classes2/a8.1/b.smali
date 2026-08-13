.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE8/n;

.field private final b:LX7/p;

.field private final c:Lg8/r;

.field private final d:Lg8/j;

.field private final e:LY7/j;

.field private final f:LB8/r;

.field private final g:LY7/g;

.field private final h:LY7/f;

.field private final i:Lx8/a;

.field private final j:Ld8/b;

.field private final k:La8/i;

.field private final l:Lg8/z;

.field private final m:LO7/d0;

.field private final n:LW7/c;

.field private final o:LO7/G;

.field private final p:LL7/i;

.field private final q:LX7/d;

.field private final r:Lf8/l;

.field private final s:LX7/q;

.field private final t:La8/c;

.field private final u:LG8/l;

.field private final v:LX7/x;

.field private final w:LX7/u;

.field private final x:Lw8/f;


# direct methods
.method public constructor <init>(LE8/n;LX7/p;Lg8/r;Lg8/j;LY7/j;LB8/r;LY7/g;LY7/f;Lx8/a;Ld8/b;La8/i;Lg8/z;LO7/d0;LW7/c;LO7/G;LL7/i;LX7/d;Lf8/l;LX7/q;La8/c;LG8/l;LX7/x;LX7/u;Lw8/f;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v14, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, La8/b;->a:LE8/n;

    iput-object v2, v0, La8/b;->b:LX7/p;

    iput-object v3, v0, La8/b;->c:Lg8/r;

    iput-object v4, v0, La8/b;->d:Lg8/j;

    iput-object v5, v0, La8/b;->e:LY7/j;

    iput-object v6, v0, La8/b;->f:LB8/r;

    iput-object v7, v0, La8/b;->g:LY7/g;

    iput-object v8, v0, La8/b;->h:LY7/f;

    iput-object v9, v0, La8/b;->i:Lx8/a;

    iput-object v10, v0, La8/b;->j:Ld8/b;

    iput-object v11, v0, La8/b;->k:La8/i;

    iput-object v12, v0, La8/b;->l:Lg8/z;

    iput-object v13, v0, La8/b;->m:LO7/d0;

    iput-object v14, v0, La8/b;->n:LW7/c;

    move-object/from16 v1, p15

    iput-object v1, v0, La8/b;->o:LO7/G;

    iput-object v15, v0, La8/b;->p:LL7/i;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    iput-object v1, v0, La8/b;->q:LX7/d;

    iput-object v2, v0, La8/b;->r:Lf8/l;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    iput-object v1, v0, La8/b;->s:LX7/q;

    iput-object v2, v0, La8/b;->t:La8/c;

    move-object/from16 v1, p21

    move-object/from16 v2, p22

    iput-object v1, v0, La8/b;->u:LG8/l;

    iput-object v2, v0, La8/b;->v:LX7/x;

    move-object/from16 v1, p23

    move-object/from16 v2, p24

    iput-object v1, v0, La8/b;->w:LX7/u;

    iput-object v2, v0, La8/b;->x:Lw8/f;

    return-void
.end method

.method public synthetic constructor <init>(LE8/n;LX7/p;Lg8/r;Lg8/j;LY7/j;LB8/r;LY7/g;LY7/f;Lx8/a;Ld8/b;La8/i;Lg8/z;LO7/d0;LW7/c;LO7/G;LL7/i;LX7/d;Lf8/l;LX7/q;La8/c;LG8/l;LX7/x;LX7/u;Lw8/f;ILy7/k;)V
    .locals 26

    .prologue
    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    sget-object v0, Lw8/f;->a:Lw8/f$a;

    invoke-virtual {v0}, Lw8/f$a;->a()Lw8/a;

    move-result-object v0

    move-object/from16 v25, v0

    goto :goto_0

    :cond_0
    move-object/from16 v25, p24

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    invoke-direct/range {v1 .. v25}, La8/b;-><init>(LE8/n;LX7/p;Lg8/r;Lg8/j;LY7/j;LB8/r;LY7/g;LY7/f;Lx8/a;Ld8/b;La8/i;Lg8/z;LO7/d0;LW7/c;LO7/G;LL7/i;LX7/d;Lf8/l;LX7/q;La8/c;LG8/l;LX7/x;LX7/u;Lw8/f;)V

    return-void
.end method


# virtual methods
.method public final a()LX7/d;
    .locals 1

    iget-object v0, p0, La8/b;->q:LX7/d;

    return-object v0
.end method

.method public final b()Lg8/j;
    .locals 1

    iget-object v0, p0, La8/b;->d:Lg8/j;

    return-object v0
.end method

.method public final c()LB8/r;
    .locals 1

    iget-object v0, p0, La8/b;->f:LB8/r;

    return-object v0
.end method

.method public final d()LX7/p;
    .locals 1

    iget-object v0, p0, La8/b;->b:LX7/p;

    return-object v0
.end method

.method public final e()LX7/q;
    .locals 1

    iget-object v0, p0, La8/b;->s:LX7/q;

    return-object v0
.end method

.method public final f()LX7/u;
    .locals 1

    iget-object v0, p0, La8/b;->w:LX7/u;

    return-object v0
.end method

.method public final g()LY7/f;
    .locals 1

    iget-object v0, p0, La8/b;->h:LY7/f;

    return-object v0
.end method

.method public final h()LY7/g;
    .locals 1

    iget-object v0, p0, La8/b;->g:LY7/g;

    return-object v0
.end method

.method public final i()LX7/x;
    .locals 1

    iget-object v0, p0, La8/b;->v:LX7/x;

    return-object v0
.end method

.method public final j()Lg8/r;
    .locals 1

    iget-object v0, p0, La8/b;->c:Lg8/r;

    return-object v0
.end method

.method public final k()LG8/l;
    .locals 1

    iget-object v0, p0, La8/b;->u:LG8/l;

    return-object v0
.end method

.method public final l()LW7/c;
    .locals 1

    iget-object v0, p0, La8/b;->n:LW7/c;

    return-object v0
.end method

.method public final m()LO7/G;
    .locals 1

    iget-object v0, p0, La8/b;->o:LO7/G;

    return-object v0
.end method

.method public final n()La8/i;
    .locals 1

    iget-object v0, p0, La8/b;->k:La8/i;

    return-object v0
.end method

.method public final o()Lg8/z;
    .locals 1

    iget-object v0, p0, La8/b;->l:Lg8/z;

    return-object v0
.end method

.method public final p()LL7/i;
    .locals 1

    iget-object v0, p0, La8/b;->p:LL7/i;

    return-object v0
.end method

.method public final q()La8/c;
    .locals 1

    iget-object v0, p0, La8/b;->t:La8/c;

    return-object v0
.end method

.method public final r()Lf8/l;
    .locals 1

    iget-object v0, p0, La8/b;->r:Lf8/l;

    return-object v0
.end method

.method public final s()LY7/j;
    .locals 1

    iget-object v0, p0, La8/b;->e:LY7/j;

    return-object v0
.end method

.method public final t()Ld8/b;
    .locals 1

    iget-object v0, p0, La8/b;->j:Ld8/b;

    return-object v0
.end method

.method public final u()LE8/n;
    .locals 1

    iget-object v0, p0, La8/b;->a:LE8/n;

    return-object v0
.end method

.method public final v()LO7/d0;
    .locals 1

    iget-object v0, p0, La8/b;->m:LO7/d0;

    return-object v0
.end method

.method public final w()Lw8/f;
    .locals 1

    iget-object v0, p0, La8/b;->x:Lw8/f;

    return-object v0
.end method

.method public final x(LY7/g;)La8/b;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-string v1, "javaResolverCache"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v28, La8/b;

    move-object/from16 v1, v28

    iget-object v2, v0, La8/b;->a:LE8/n;

    iget-object v3, v0, La8/b;->b:LX7/p;

    iget-object v4, v0, La8/b;->c:Lg8/r;

    iget-object v5, v0, La8/b;->d:Lg8/j;

    iget-object v6, v0, La8/b;->e:LY7/j;

    iget-object v7, v0, La8/b;->f:LB8/r;

    iget-object v9, v0, La8/b;->h:LY7/f;

    iget-object v10, v0, La8/b;->i:Lx8/a;

    iget-object v11, v0, La8/b;->j:Ld8/b;

    iget-object v12, v0, La8/b;->k:La8/i;

    iget-object v13, v0, La8/b;->l:Lg8/z;

    iget-object v14, v0, La8/b;->m:LO7/d0;

    iget-object v15, v0, La8/b;->n:LW7/c;

    move-object/from16 p1, v1

    iget-object v1, v0, La8/b;->o:LO7/G;

    move-object/from16 v16, v1

    iget-object v1, v0, La8/b;->p:LL7/i;

    move-object/from16 v17, v1

    iget-object v1, v0, La8/b;->q:LX7/d;

    move-object/from16 v18, v1

    iget-object v1, v0, La8/b;->r:Lf8/l;

    move-object/from16 v19, v1

    iget-object v1, v0, La8/b;->s:LX7/q;

    move-object/from16 v20, v1

    iget-object v1, v0, La8/b;->t:La8/c;

    move-object/from16 v21, v1

    iget-object v1, v0, La8/b;->u:LG8/l;

    move-object/from16 v22, v1

    iget-object v1, v0, La8/b;->v:LX7/x;

    move-object/from16 v23, v1

    iget-object v1, v0, La8/b;->w:LX7/u;

    move-object/from16 v24, v1

    const/high16 v26, 0x800000

    const/16 v27, 0x0

    const/16 v25, 0x0

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v27}, La8/b;-><init>(LE8/n;LX7/p;Lg8/r;Lg8/j;LY7/j;LB8/r;LY7/g;LY7/f;Lx8/a;Ld8/b;La8/i;Lg8/z;LO7/d0;LW7/c;LO7/G;LL7/i;LX7/d;Lf8/l;LX7/q;La8/c;LG8/l;LX7/x;LX7/u;Lw8/f;ILy7/k;)V

    return-object v28
.end method
