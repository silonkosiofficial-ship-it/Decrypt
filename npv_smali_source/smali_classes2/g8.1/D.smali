.class public final Lg8/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/D$a;,
        Lg8/D$b;
    }
.end annotation


# static fields
.field public static final k:Lg8/D$a;

.field public static final l:Lg8/D;

.field public static final m:Lg8/D;

.field public static final n:Lg8/D;

.field public static final o:Lg8/D;

.field public static final p:Lg8/D;

.field public static final q:Lg8/D;

.field public static final r:Lg8/D;

.field public static final s:Lg8/D;

.field public static final t:Lg8/D;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Lg8/D;

.field private final g:Z

.field private final h:Lg8/D;

.field private final i:Lg8/D;

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 28

    new-instance v0, Lg8/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/D$a;-><init>(Ly7/k;)V

    sput-object v0, Lg8/D;->k:Lg8/D$a;

    new-instance v0, Lg8/D;

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v0, Lg8/D;->l:Lg8/D;

    new-instance v1, Lg8/D;

    const/16 v26, 0x1ff

    const/16 v27, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x1

    move-object v15, v1

    invoke-direct/range {v15 .. v27}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v1, Lg8/D;->m:Lg8/D;

    new-instance v15, Lg8/D;

    const/16 v13, 0x3fd

    const/4 v4, 0x1

    move-object v2, v15

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v15, Lg8/D;->n:Lg8/D;

    new-instance v15, Lg8/D;

    const/16 v13, 0x3dc

    const/4 v4, 0x0

    move-object v2, v15

    move-object v8, v0

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v15, Lg8/D;->o:Lg8/D;

    new-instance v2, Lg8/D;

    const/16 v26, 0x1dc

    move-object v15, v2

    move-object/from16 v21, v1

    invoke-direct/range {v15 .. v27}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v2, Lg8/D;->p:Lg8/D;

    new-instance v1, Lg8/D;

    const/4 v4, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v1, Lg8/D;->q:Lg8/D;

    new-instance v1, Lg8/D;

    const/16 v13, 0x3d7

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v1, Lg8/D;->r:Lg8/D;

    new-instance v1, Lg8/D;

    const/16 v13, 0x397

    move-object v2, v1

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v1, Lg8/D;->s:Lg8/D;

    new-instance v1, Lg8/D;

    const/16 v13, 0x3d8

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v14}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    sput-object v1, Lg8/D;->t:Lg8/D;

    return-void
.end method

.method public constructor <init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg8/D;->a:Z

    iput-boolean p2, p0, Lg8/D;->b:Z

    iput-boolean p3, p0, Lg8/D;->c:Z

    iput-boolean p4, p0, Lg8/D;->d:Z

    iput-boolean p5, p0, Lg8/D;->e:Z

    iput-object p6, p0, Lg8/D;->f:Lg8/D;

    iput-boolean p7, p0, Lg8/D;->g:Z

    iput-object p8, p0, Lg8/D;->h:Lg8/D;

    iput-object p9, p0, Lg8/D;->i:Lg8/D;

    iput-boolean p10, p0, Lg8/D;->j:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V
    .locals 11

    .prologue
    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move v6, v5

    goto :goto_3

    :cond_3
    move v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move v7, v5

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v2, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v8

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v8

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    move/from16 v5, p10

    :goto_9
    move-object p1, p0

    move p2, v1

    move p3, v3

    move p4, v4

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v2

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v5

    invoke-direct/range {p1 .. p11}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;Z)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lg8/D;->g:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lg8/D;->j:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lg8/D;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg8/D;->a:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lg8/D;->c:Z

    return v0
.end method

.method public final f(LF8/u0;Z)Lg8/D;
    .locals 1

    .prologue
    const-string v0, "effectiveVariance"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-boolean p2, p0, Lg8/D;->c:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lg8/D$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    iget-object p1, p0, Lg8/D;->f:Lg8/D;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lg8/D;->i:Lg8/D;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lg8/D;->h:Lg8/D;

    if-nez p1, :cond_3

    :goto_0
    move-object p1, p0

    :cond_3
    return-object p1
.end method

.method public final g()Lg8/D;
    .locals 14

    new-instance v13, Lg8/D;

    iget-boolean v1, p0, Lg8/D;->a:Z

    iget-boolean v3, p0, Lg8/D;->c:Z

    iget-boolean v4, p0, Lg8/D;->d:Z

    iget-boolean v5, p0, Lg8/D;->e:Z

    iget-object v6, p0, Lg8/D;->f:Lg8/D;

    iget-boolean v7, p0, Lg8/D;->g:Z

    iget-object v8, p0, Lg8/D;->h:Lg8/D;

    iget-object v9, p0, Lg8/D;->i:Lg8/D;

    const/16 v11, 0x200

    const/4 v12, 0x0

    const/4 v2, 0x1

    const/4 v10, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lg8/D;-><init>(ZZZZZLg8/D;ZLg8/D;Lg8/D;ZILy7/k;)V

    return-object v13
.end method
