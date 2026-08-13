.class public final Li9/S$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Li9/S$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/S$a;

    invoke-direct {v0}, Li9/S$a;-><init>()V

    sput-object v0, Li9/S$a;->a:Li9/S$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Li9/S;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    const-string v1, "pattern"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/util/List;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v3}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    const-string v5, ""

    const/4 v6, 0x0

    move v7, v4

    move v8, v7

    move v11, v8

    move-object v10, v5

    move-object v9, v6

    :goto_0
    if-ge v7, v3, :cond_10

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-nez v9, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v9}, Ljava/lang/Character;->charValue()C

    move-result v13

    if-ne v12, v13, :cond_1

    add-int/2addr v8, v2

    goto/16 :goto_4

    :cond_1
    :goto_1
    const/16 v13, 0x27

    if-eqz v11, :cond_5

    if-ne v12, v13, :cond_4

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_2

    const-string v10, "\'"

    :cond_2
    new-instance v12, Li9/S$e;

    invoke-direct {v12, v10}, Li9/S$e;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move v11, v4

    :goto_2
    move-object v10, v5

    goto/16 :goto_4

    :cond_4
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    :goto_3
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_4

    :cond_5
    if-lez v8, :cond_7

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_6

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Character;->charValue()C

    move-result v9

    invoke-static {v9, v8}, Li9/T;->d(CI)Li9/S;

    move-result-object v8

    invoke-interface {v14, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    move v8, v4

    move-object v9, v6

    :cond_7
    invoke-static {}, Li9/T;->b()Ljava/util/List;

    move-result-object v14

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_3

    :cond_8
    invoke-static {v10, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_9

    new-instance v15, Li9/S$e;

    invoke-direct {v15, v10}, Li9/S$e;-><init>(Ljava/lang/String;)V

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    move-object v10, v5

    :cond_a
    if-ne v12, v13, :cond_b

    move v11, v2

    goto :goto_2

    :cond_b
    const/16 v13, 0x5b

    if-ne v12, v13, :cond_c

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_c
    const/16 v13, 0x5d

    if-ne v12, v13, :cond_e

    invoke-static {v1}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_d

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_f

    new-instance v14, Li9/S$c;

    new-instance v15, Li9/S$d;

    invoke-direct {v15, v12}, Li9/S$d;-><init>(Ljava/util/List;)V

    invoke-direct {v14, v15}, Li9/S$c;-><init>(Li9/S;)V

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unmatched closing bracket"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    move v8, v2

    :cond_f
    :goto_4
    add-int/2addr v7, v2

    goto/16 :goto_0

    :cond_10
    if-lez v8, :cond_11

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_11

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-static {v2, v8}, Li9/T;->d(CI)Li9/S;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-static {v10, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_12

    new-instance v2, Li9/S$e;

    invoke-direct {v2, v10}, Li9/S$e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v0, Li9/S$d;

    invoke-static {v1}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_13

    invoke-direct {v0, v1}, Li9/S$d;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unmatched opening bracket"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
