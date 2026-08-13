.class public final LB8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE8/n;

.field private final b:LO7/G;

.field private final c:LB8/l;

.field private final d:LB8/h;

.field private final e:LB8/c;

.field private final f:LO7/L;

.field private final g:LB8/w;

.field private final h:LB8/r;

.field private final i:LW7/c;

.field private final j:LB8/s;

.field private final k:Ljava/lang/Iterable;

.field private final l:LO7/J;

.field private final m:LB8/j;

.field private final n:LQ7/a;

.field private final o:LQ7/c;

.field private final p:Lp8/g;

.field private final q:LG8/l;

.field private final r:Lx8/a;

.field private final s:Ljava/util/List;

.field private final t:LB8/q;

.field private final u:LB8/i;


# direct methods
.method public constructor <init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;)V
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

    const-string v0, "moduleDescriptor"

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localClassifierTypeSettings"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleTypeDeserializer"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fictitiousClassDescriptorFactories"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    invoke-static {v14, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionRegistryLite"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntriesDeserializationSupport"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    iput-object v1, v0, LB8/k;->a:LE8/n;

    iput-object v2, v0, LB8/k;->b:LO7/G;

    iput-object v3, v0, LB8/k;->c:LB8/l;

    iput-object v4, v0, LB8/k;->d:LB8/h;

    iput-object v5, v0, LB8/k;->e:LB8/c;

    iput-object v6, v0, LB8/k;->f:LO7/L;

    iput-object v7, v0, LB8/k;->g:LB8/w;

    iput-object v8, v0, LB8/k;->h:LB8/r;

    iput-object v9, v0, LB8/k;->i:LW7/c;

    iput-object v10, v0, LB8/k;->j:LB8/s;

    iput-object v11, v0, LB8/k;->k:Ljava/lang/Iterable;

    iput-object v12, v0, LB8/k;->l:LO7/J;

    iput-object v13, v0, LB8/k;->m:LB8/j;

    iput-object v14, v0, LB8/k;->n:LQ7/a;

    move-object/from16 v1, p15

    iput-object v1, v0, LB8/k;->o:LQ7/c;

    iput-object v15, v0, LB8/k;->p:Lp8/g;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    iput-object v1, v0, LB8/k;->q:LG8/l;

    iput-object v2, v0, LB8/k;->r:Lx8/a;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    iput-object v1, v0, LB8/k;->s:Ljava/util/List;

    iput-object v2, v0, LB8/k;->t:LB8/q;

    new-instance v1, LB8/i;

    invoke-direct {v1, v0}, LB8/i;-><init>(LB8/k;)V

    iput-object v1, v0, LB8/k;->u:LB8/i;

    return-void
.end method

.method public synthetic constructor <init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;ILy7/k;)V
    .locals 23

    .prologue
    move/from16 v0, p21

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    sget-object v1, LQ7/a$a;->a:LQ7/a$a;

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_1

    sget-object v1, LQ7/c$a;->a:LQ7/c$a;

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p15

    :goto_1
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    sget-object v1, LG8/l;->b:LG8/l$a;

    invoke-virtual {v1}, LG8/l$a;->a()LG8/m;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_2

    :cond_2
    move-object/from16 v19, p17

    :goto_2
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    sget-object v1, LF8/n;->a:LF8/n;

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_3

    :cond_3
    move-object/from16 v21, p19

    :goto_3
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    sget-object v0, LB8/q$a;->a:LB8/q$a;

    move-object/from16 v22, v0

    goto :goto_4

    :cond_4
    move-object/from16 v22, p20

    :goto_4
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v18, p16

    move-object/from16 v20, p18

    invoke-direct/range {v2 .. v22}, LB8/k;-><init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;)V

    return-void
.end method


# virtual methods
.method public final a(LO7/K;Lk8/c;Lk8/g;Lk8/h;Lk8/a;LD8/f;)LB8/m;
    .locals 11

    const-string v0, "descriptor"

    move-object v4, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    move-object v3, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    move-object v5, p3

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    move-object v6, p4

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LB8/m;

    const/4 v9, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v10

    move-object v1, v0

    move-object v2, p0

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v10}, LB8/m;-><init>(LB8/k;Lk8/c;LO7/m;Lk8/g;Lk8/h;Lk8/a;LD8/f;LB8/E;Ljava/util/List;)V

    return-object v0
.end method

.method public final b(Ln8/b;)LO7/e;
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/k;->u:LB8/i;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, LB8/i;->e(LB8/i;Ln8/b;LB8/g;ILjava/lang/Object;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public final c()LQ7/a;
    .locals 1

    iget-object v0, p0, LB8/k;->n:LQ7/a;

    return-object v0
.end method

.method public final d()LB8/c;
    .locals 1

    iget-object v0, p0, LB8/k;->e:LB8/c;

    return-object v0
.end method

.method public final e()LB8/h;
    .locals 1

    iget-object v0, p0, LB8/k;->d:LB8/h;

    return-object v0
.end method

.method public final f()LB8/i;
    .locals 1

    iget-object v0, p0, LB8/k;->u:LB8/i;

    return-object v0
.end method

.method public final g()LB8/l;
    .locals 1

    iget-object v0, p0, LB8/k;->c:LB8/l;

    return-object v0
.end method

.method public final h()LB8/j;
    .locals 1

    iget-object v0, p0, LB8/k;->m:LB8/j;

    return-object v0
.end method

.method public final i()LB8/q;
    .locals 1

    iget-object v0, p0, LB8/k;->t:LB8/q;

    return-object v0
.end method

.method public final j()LB8/r;
    .locals 1

    iget-object v0, p0, LB8/k;->h:LB8/r;

    return-object v0
.end method

.method public final k()Lp8/g;
    .locals 1

    iget-object v0, p0, LB8/k;->p:Lp8/g;

    return-object v0
.end method

.method public final l()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, LB8/k;->k:Ljava/lang/Iterable;

    return-object v0
.end method

.method public final m()LB8/s;
    .locals 1

    iget-object v0, p0, LB8/k;->j:LB8/s;

    return-object v0
.end method

.method public final n()LG8/l;
    .locals 1

    iget-object v0, p0, LB8/k;->q:LG8/l;

    return-object v0
.end method

.method public final o()LB8/w;
    .locals 1

    iget-object v0, p0, LB8/k;->g:LB8/w;

    return-object v0
.end method

.method public final p()LW7/c;
    .locals 1

    iget-object v0, p0, LB8/k;->i:LW7/c;

    return-object v0
.end method

.method public final q()LO7/G;
    .locals 1

    iget-object v0, p0, LB8/k;->b:LO7/G;

    return-object v0
.end method

.method public final r()LO7/J;
    .locals 1

    iget-object v0, p0, LB8/k;->l:LO7/J;

    return-object v0
.end method

.method public final s()LO7/L;
    .locals 1

    iget-object v0, p0, LB8/k;->f:LO7/L;

    return-object v0
.end method

.method public final t()LQ7/c;
    .locals 1

    iget-object v0, p0, LB8/k;->o:LQ7/c;

    return-object v0
.end method

.method public final u()LE8/n;
    .locals 1

    iget-object v0, p0, LB8/k;->a:LE8/n;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LB8/k;->s:Ljava/util/List;

    return-object v0
.end method
