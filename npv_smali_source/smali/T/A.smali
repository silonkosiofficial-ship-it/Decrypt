.class public abstract LT/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/A$p;
    }
.end annotation


# static fields
.field private static final a:J

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:Landroidx/compose/ui/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    sput-wide v0, LT/A;->a:J

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->b:F

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->c:F

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->d:F

    const/4 v1, 0x2

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->e:F

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->f:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LT/A;->g:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LT/A;->h:F

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/p;->a(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v0

    sput-object v0, LT/A;->i:Landroidx/compose/ui/d;

    return-void
.end method

.method public static final a(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;LV/n;III)V
    .locals 48

    .prologue
    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v15, p14

    move-object/from16 v14, p15

    move-object/from16 v13, p16

    move-object/from16 v12, p17

    move/from16 v11, p19

    move/from16 v10, p20

    move/from16 v9, p21

    const-string v0, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    const/16 v18, 0x10

    const/16 v19, 0x4

    const/16 v7, 0x30

    const/4 v6, 0x6

    const v8, 0x5a44f6ef

    move-object/from16 v2, p18

    invoke-interface {v2, v8}, LV/n;->r(I)LV/n;

    move-result-object v2

    const/4 v8, 0x1

    and-int/lit8 v27, v9, 0x1

    const/4 v8, 0x2

    if-eqz v27, :cond_0

    or-int/lit8 v27, v11, 0x6

    move-object/from16 v6, p0

    move/from16 v28, v27

    goto :goto_1

    :cond_0
    and-int/lit8 v27, v11, 0x6

    move-object/from16 v6, p0

    if-nez v27, :cond_2

    invoke-interface {v2, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1

    move/from16 v28, v19

    goto :goto_0

    :cond_1
    move/from16 v28, v8

    :goto_0
    or-int v28, v11, v28

    goto :goto_1

    :cond_2
    move/from16 v28, v11

    :goto_1
    and-int/lit8 v29, v9, 0x2

    if-eqz v29, :cond_4

    or-int/lit8 v28, v28, 0x30

    move-object/from16 v8, p1

    :cond_3
    :goto_2
    move/from16 v7, v28

    goto :goto_4

    :cond_4
    and-int/lit8 v29, v11, 0x30

    move-object/from16 v8, p1

    if-nez v29, :cond_3

    invoke-interface {v2, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_5

    const/16 v31, 0x20

    goto :goto_3

    :cond_5
    move/from16 v31, v18

    :goto_3
    or-int v28, v28, v31

    goto :goto_2

    :goto_4
    and-int/lit8 v28, v9, 0x4

    if-eqz v28, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v2, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_8

    const/16 v31, 0x100

    goto :goto_5

    :cond_8
    const/16 v31, 0x80

    :goto_5
    or-int v7, v7, v31

    :goto_6
    and-int/lit8 v31, v9, 0x8

    if-eqz v31, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_b

    invoke-interface {v2, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_7

    :cond_a
    const/16 v3, 0x400

    :goto_7
    or-int/2addr v7, v3

    :cond_b
    :goto_8
    and-int/lit8 v3, v9, 0x10

    if-eqz v3, :cond_c

    or-int/lit16 v7, v7, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v3, v11, 0x6000

    if-nez v3, :cond_e

    invoke-interface {v2, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v3, 0x4000

    goto :goto_9

    :cond_d
    const/16 v3, 0x2000

    :goto_9
    or-int/2addr v7, v3

    :cond_e
    :goto_a
    and-int/lit8 v3, v9, 0x20

    const/high16 v33, 0x30000

    if-eqz v3, :cond_f

    or-int v7, v7, v33

    move-object/from16 v6, p5

    goto :goto_c

    :cond_f
    and-int v34, v11, v33

    move-object/from16 v6, p5

    if-nez v34, :cond_11

    invoke-interface {v2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_10

    const/high16 v34, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v34, 0x10000

    :goto_b
    or-int v7, v7, v34

    :cond_11
    :goto_c
    and-int/lit8 v34, v9, 0x40

    const/high16 v35, 0x180000

    if-eqz v34, :cond_13

    or-int v7, v7, v35

    :cond_12
    :goto_d
    const/16 v6, 0x80

    goto :goto_f

    :cond_13
    and-int v36, v11, v35

    move-object/from16 v6, p6

    if-nez v36, :cond_12

    invoke-interface {v2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_14

    const/high16 v36, 0x100000

    goto :goto_e

    :cond_14
    const/high16 v36, 0x80000

    :goto_e
    or-int v7, v7, v36

    goto :goto_d

    :goto_f
    and-int/lit16 v8, v9, 0x80

    const/high16 v28, 0xc00000

    if-eqz v8, :cond_16

    or-int v7, v7, v28

    :cond_15
    :goto_10
    move-object/from16 v25, v0

    const/16 v6, 0x100

    goto :goto_12

    :cond_16
    and-int v36, v11, v28

    move-object/from16 v6, p7

    if-nez v36, :cond_15

    invoke-interface {v2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_17

    const/high16 v37, 0x800000

    goto :goto_11

    :cond_17
    const/high16 v37, 0x400000

    :goto_11
    or-int v7, v7, v37

    goto :goto_10

    :goto_12
    and-int/lit16 v0, v9, 0x100

    const/high16 v37, 0x6000000

    if-eqz v0, :cond_18

    or-int v7, v7, v37

    move-object/from16 v6, p8

    goto :goto_14

    :cond_18
    and-int v37, v11, v37

    move-object/from16 v6, p8

    if-nez v37, :cond_1a

    invoke-interface {v2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_19

    const/high16 v38, 0x4000000

    goto :goto_13

    :cond_19
    const/high16 v38, 0x2000000

    :goto_13
    or-int v7, v7, v38

    :cond_1a
    :goto_14
    and-int/lit16 v6, v9, 0x200

    const/high16 v38, 0x30000000

    if-eqz v6, :cond_1c

    :goto_15
    or-int v7, v7, v38

    :cond_1b
    move-object/from16 v24, v1

    const/16 v11, 0x400

    goto :goto_16

    :cond_1c
    and-int v38, v11, v38

    move-object/from16 v11, p9

    if-nez v38, :cond_1b

    invoke-interface {v2, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_1d

    const/high16 v38, 0x20000000

    goto :goto_15

    :cond_1d
    const/high16 v38, 0x10000000

    goto :goto_15

    :goto_16
    and-int/lit16 v1, v9, 0x400

    const/16 v27, 0x6

    if-eqz v1, :cond_1e

    or-int/lit8 v19, v10, 0x6

    move-object/from16 v11, p10

    goto :goto_18

    :cond_1e
    and-int/lit8 v38, v10, 0x6

    move-object/from16 v11, p10

    if-nez v38, :cond_20

    invoke-interface {v2, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_1f

    goto :goto_17

    :cond_1f
    const/16 v19, 0x2

    :goto_17
    or-int v19, v10, v19

    goto :goto_18

    :cond_20
    move/from16 v19, v10

    :goto_18
    and-int/lit16 v11, v9, 0x800

    const/16 v32, 0x30

    if-eqz v11, :cond_22

    or-int/lit8 v19, v19, 0x30

    :cond_21
    :goto_19
    move/from16 v5, v19

    goto :goto_1a

    :cond_22
    and-int/lit8 v39, v10, 0x30

    move/from16 v5, p11

    if-nez v39, :cond_21

    invoke-interface {v2, v5}, LV/n;->d(Z)Z

    move-result v39

    if-eqz v39, :cond_23

    const/16 v18, 0x20

    :cond_23
    or-int v19, v19, v18

    goto :goto_19

    :goto_1a
    and-int/lit16 v4, v9, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v5, v5, 0x180

    move/from16 v18, v4

    :goto_1b
    move/from16 v19, v11

    const/16 v4, 0x2000

    goto :goto_1d

    :cond_24
    move/from16 v18, v4

    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_26

    move/from16 v4, p12

    invoke-interface {v2, v4}, LV/n;->d(Z)Z

    move-result v19

    if-eqz v19, :cond_25

    const/16 v36, 0x100

    goto :goto_1c

    :cond_25
    const/16 v36, 0x80

    :goto_1c
    or-int v5, v5, v36

    goto :goto_1b

    :cond_26
    move/from16 v4, p12

    goto :goto_1b

    :goto_1d
    and-int/lit16 v11, v9, 0x2000

    if-eqz v11, :cond_27

    or-int/lit16 v5, v5, 0xc00

    :goto_1e
    move/from16 v20, v11

    const/16 v4, 0x4000

    goto :goto_20

    :cond_27
    and-int/lit16 v4, v10, 0xc00

    if-nez v4, :cond_29

    move/from16 v4, p13

    invoke-interface {v2, v4}, LV/n;->d(Z)Z

    move-result v36

    if-eqz v36, :cond_28

    const/16 v38, 0x800

    goto :goto_1f

    :cond_28
    const/16 v38, 0x400

    :goto_1f
    or-int v5, v5, v38

    goto :goto_1e

    :cond_29
    move/from16 v4, p13

    goto :goto_1e

    :goto_20
    and-int/lit16 v11, v9, 0x4000

    if-eqz v11, :cond_2a

    or-int/lit16 v5, v5, 0x6000

    goto :goto_22

    :cond_2a
    and-int/lit16 v11, v10, 0x6000

    if-nez v11, :cond_2c

    invoke-interface {v2, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2b

    goto :goto_21

    :cond_2b
    const/16 v4, 0x2000

    :goto_21
    or-int/2addr v5, v4

    :cond_2c
    :goto_22
    const v4, 0x8000

    and-int/2addr v4, v9

    if-eqz v4, :cond_2e

    or-int v5, v5, v33

    :cond_2d
    :goto_23
    const/high16 v4, 0x10000

    goto :goto_25

    :cond_2e
    and-int v4, v10, v33

    if-nez v4, :cond_2d

    invoke-interface {v2, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    const/high16 v4, 0x20000

    goto :goto_24

    :cond_2f
    const/high16 v4, 0x10000

    :goto_24
    or-int/2addr v5, v4

    goto :goto_23

    :goto_25
    and-int/2addr v4, v9

    if-eqz v4, :cond_31

    or-int v5, v5, v35

    :cond_30
    :goto_26
    const/high16 v4, 0x20000

    goto :goto_28

    :cond_31
    and-int v4, v10, v35

    if-nez v4, :cond_30

    invoke-interface {v2, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_32

    const/high16 v4, 0x100000

    goto :goto_27

    :cond_32
    const/high16 v4, 0x80000

    :goto_27
    or-int/2addr v5, v4

    goto :goto_26

    :goto_28
    and-int/2addr v4, v9

    if-eqz v4, :cond_33

    or-int v5, v5, v28

    goto :goto_2a

    :cond_33
    and-int v4, v10, v28

    if-nez v4, :cond_35

    invoke-interface {v2, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    const/high16 v4, 0x800000

    goto :goto_29

    :cond_34
    const/high16 v4, 0x400000

    :goto_29
    or-int/2addr v5, v4

    :cond_35
    :goto_2a
    const v4, 0x12492493

    and-int/2addr v4, v7

    const v11, 0x12492492

    if-ne v4, v11, :cond_37

    const v4, 0x492493

    and-int/2addr v4, v5

    const v11, 0x492492

    if-ne v4, v11, :cond_37

    invoke-interface {v2}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_36

    goto :goto_2b

    :cond_36
    invoke-interface {v2}, LV/n;->A()V

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v33, p11

    move/from16 v42, p12

    move-object v15, v14

    move/from16 v14, p13

    goto/16 :goto_56

    :cond_37
    :goto_2b
    if-eqz v3, :cond_38

    const/4 v3, 0x0

    goto :goto_2c

    :cond_38
    move-object/from16 v3, p5

    :goto_2c
    if-eqz v34, :cond_39

    const/4 v11, 0x0

    goto :goto_2d

    :cond_39
    move-object/from16 v11, p6

    :goto_2d
    if-eqz v8, :cond_3a

    const/4 v8, 0x0

    goto :goto_2e

    :cond_3a
    move-object/from16 v8, p7

    :goto_2e
    if-eqz v0, :cond_3b

    const/4 v0, 0x0

    goto :goto_2f

    :cond_3b
    move-object/from16 v0, p8

    :goto_2f
    if-eqz v6, :cond_3c

    const/4 v6, 0x0

    goto :goto_30

    :cond_3c
    move-object/from16 v6, p9

    :goto_30
    if-eqz v1, :cond_3d

    const/4 v1, 0x0

    goto :goto_31

    :cond_3d
    move-object/from16 v1, p10

    :goto_31
    if-eqz v19, :cond_3e

    const/16 v33, 0x0

    goto :goto_32

    :cond_3e
    move/from16 v33, p11

    :goto_32
    if-eqz v18, :cond_3f

    const/4 v4, 0x1

    goto :goto_33

    :cond_3f
    move/from16 v4, p12

    :goto_33
    if-eqz v20, :cond_40

    const/4 v9, 0x0

    goto :goto_34

    :cond_40
    move/from16 v9, p13

    :goto_34
    invoke-static {}, LV/q;->H()Z

    move-result v18

    if-eqz v18, :cond_41

    const-string v10, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)"

    const v12, 0x5a44f6ef

    invoke-static {v12, v7, v5, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_41
    and-int/lit8 v10, v7, 0x70

    const/16 v12, 0x20

    if-ne v10, v12, :cond_42

    const/4 v10, 0x1

    goto :goto_35

    :cond_42
    const/4 v10, 0x0

    :goto_35
    and-int/lit16 v12, v7, 0x1c00

    move/from16 v18, v7

    const/16 v7, 0x800

    if-ne v12, v7, :cond_43

    const/4 v7, 0x1

    goto :goto_36

    :cond_43
    const/4 v7, 0x0

    :goto_36
    or-int/2addr v7, v10

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_45

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v10, v7, :cond_44

    goto :goto_37

    :cond_44
    move-object v7, v10

    move-object/from16 v10, p3

    goto :goto_38

    :cond_45
    :goto_37
    new-instance v7, LM0/d;

    const/4 v10, 0x6

    const/4 v12, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 p5, v7

    move-object/from16 p6, p1

    move-object/from16 p7, v19

    move-object/from16 p8, v20

    move/from16 p9, v10

    move-object/from16 p10, v12

    invoke-direct/range {p5 .. p10}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    move-object/from16 v10, p3

    invoke-interface {v10, v7}, LS0/g0;->a(LM0/d;)LS0/e0;

    move-result-object v7

    invoke-interface {v2, v7}, LV/n;->K(Ljava/lang/Object;)V

    :goto_38
    check-cast v7, LS0/e0;

    invoke-virtual {v7}, LS0/e0;->b()LM0/d;

    move-result-object v7

    invoke-virtual {v7}, LM0/d;->i()Ljava/lang/String;

    move-result-object v7

    shr-int/lit8 v12, v5, 0xc

    and-int/lit8 v12, v12, 0xe

    invoke-static {v15, v2, v12}, Lz/f;->a(Lz/j;LV/n;I)LV/G1;

    move-result-object v12

    invoke-interface {v12}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_46

    sget-object v19, LT/p;->C:LT/p;

    :goto_39
    move-object/from16 v10, v19

    goto :goto_3a

    :cond_46
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v19

    if-nez v19, :cond_47

    sget-object v19, LT/p;->D:LT/p;

    goto :goto_39

    :cond_47
    sget-object v19, LT/p;->E:LT/p;

    goto :goto_39

    :goto_3a
    invoke-virtual {v13, v4, v9, v12}, LS/i1;->e(ZZZ)J

    move-result-wide v19

    sget-object v15, LS/o0;->a:LS/o0;

    move/from16 v23, v5

    const/4 v5, 0x6

    invoke-virtual {v15, v2, v5}, LS/o0;->c(LV/n;I)LS/A1;

    move-result-object v15

    invoke-virtual {v15}, LS/A1;->a()LM0/P;

    move-result-object v5

    invoke-virtual {v15}, LS/A1;->c()LM0/P;

    move-result-object v15

    move-object/from16 v34, v0

    move-object/from16 v35, v1

    invoke-virtual {v5}, LM0/P;->h()J

    move-result-wide v0

    sget-object v26, Lo0/y0;->b:Lo0/y0$a;

    move-object/from16 v36, v6

    move-object/from16 p13, v7

    invoke-virtual/range {v26 .. v26}, Lo0/y0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {v15}, LM0/P;->h()J

    move-result-wide v0

    invoke-virtual/range {v26 .. v26}, Lo0/y0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-eqz v0, :cond_49

    :cond_48
    invoke-virtual {v5}, LM0/P;->h()J

    move-result-wide v0

    invoke-virtual/range {v26 .. v26}, Lo0/y0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_4a

    invoke-virtual {v15}, LM0/P;->h()J

    move-result-wide v0

    invoke-virtual/range {v26 .. v26}, Lo0/y0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-eqz v0, :cond_4a

    :cond_49
    const/4 v0, 0x1

    goto :goto_3b

    :cond_4a
    const/4 v0, 0x0

    :goto_3b
    invoke-virtual {v15}, LM0/P;->h()J

    move-result-wide v6

    if-eqz v0, :cond_4c

    const-wide/16 v28, 0x10

    cmp-long v1, v6, v28

    if-eqz v1, :cond_4b

    goto :goto_3c

    :cond_4b
    move-wide/from16 v6, v19

    :cond_4c
    :goto_3c
    invoke-virtual {v5}, LM0/P;->h()J

    move-result-wide v28

    if-eqz v0, :cond_4e

    const-wide/16 v37, 0x10

    cmp-long v1, v28, v37

    if-eqz v1, :cond_4d

    goto :goto_3d

    :cond_4d
    move-wide/from16 v28, v19

    :cond_4e
    :goto_3d
    move-wide/from16 v37, v6

    if-eqz p4, :cond_4f

    const/4 v1, 0x1

    goto :goto_3e

    :cond_4f
    const/4 v1, 0x0

    :goto_3e
    const-string v6, "TextFieldInputState"

    const/4 v7, 0x0

    const/16 v14, 0x30

    invoke-static {v10, v6, v2, v14, v7}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v6

    sget-object v7, LT/C;->D:LT/C;

    sget-object v10, Ly7/m;->a:Ly7/m;

    invoke-static {v10}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v14

    invoke-virtual {v6}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v31

    check-cast v31, LT/p;

    move-object/from16 v39, v8

    const v8, -0x796609df

    invoke-interface {v2, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v40

    const/4 v8, -0x1

    if-eqz v40, :cond_50

    move-object/from16 v40, v11

    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    move-object/from16 v41, v3

    move/from16 v42, v4

    const/4 v3, 0x0

    const v4, -0x796609df

    invoke-static {v4, v3, v8, v11}, LV/q;->Q(IIILjava/lang/String;)V

    goto :goto_3f

    :cond_50
    move-object/from16 v41, v3

    move/from16 v42, v4

    move-object/from16 v40, v11

    :goto_3f
    sget-object v3, LT/A$p;->b:[I

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v3, v4

    const/4 v11, 0x3

    const/high16 v43, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    if-eq v4, v8, :cond_51

    const/4 v8, 0x2

    if-eq v4, v8, :cond_53

    if-ne v4, v11, :cond_52

    :cond_51
    move/from16 v4, v43

    goto :goto_40

    :cond_52
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_53
    const/4 v4, 0x0

    :goto_40
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_54

    invoke-static {}, LV/q;->P()V

    :cond_54
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LT/p;

    const v11, -0x796609df

    invoke-interface {v2, v11}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v44

    if-eqz v44, :cond_55

    move/from16 v44, v9

    const-string v9, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    move/from16 v45, v12

    const/4 v12, 0x0

    const/4 v13, -0x1

    invoke-static {v11, v12, v13, v9}, LV/q;->Q(IIILjava/lang/String;)V

    goto :goto_41

    :cond_55
    move/from16 v44, v9

    move/from16 v45, v12

    :goto_41
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v3, v8

    const/4 v9, 0x1

    if-eq v8, v9, :cond_56

    const/4 v9, 0x2

    if-eq v8, v9, :cond_58

    const/4 v9, 0x3

    if-ne v8, v9, :cond_57

    :cond_56
    move/from16 v8, v43

    goto :goto_42

    :cond_57
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_58
    const/4 v8, 0x0

    :goto_42
    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_59

    invoke-static {}, LV/q;->P()V

    :cond_59
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v6}, Lu/s0;->n()Lu/s0$b;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v9, v2, v12}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu/I;

    const-string v9, "LabelProgress"

    const/high16 v11, 0x30000

    move-object/from16 p5, v6

    move-object/from16 p6, v4

    move-object/from16 p7, v8

    move-object/from16 p8, v7

    move-object/from16 p9, v14

    move-object/from16 p10, v9

    move-object/from16 p11, v2

    move/from16 p12, v11

    invoke-static/range {p5 .. p12}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v4

    sget-object v7, LT/E;->D:LT/E;

    invoke-static {v10}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v8

    invoke-virtual {v6}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LT/p;

    const v12, 0x55952420

    invoke-interface {v2, v12}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v13

    if-eqz v13, :cond_5a

    const-string v13, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    const/4 v11, -0x1

    const/4 v14, 0x0

    invoke-static {v12, v14, v11, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_5a
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v3, v9

    const/4 v11, 0x1

    if-eq v9, v11, :cond_5d

    const/4 v11, 0x2

    if-eq v9, v11, :cond_5c

    const/4 v11, 0x3

    if-ne v9, v11, :cond_5b

    :goto_43
    const/4 v9, 0x0

    goto :goto_44

    :cond_5b
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_5c
    if-eqz v1, :cond_5d

    goto :goto_43

    :cond_5d
    move/from16 v9, v43

    :goto_44
    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_5e

    invoke-static {}, LV/q;->P()V

    :cond_5e
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LT/p;

    const v12, 0x55952420

    invoke-interface {v2, v12}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v13

    if-eqz v13, :cond_5f

    const-string v13, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    move/from16 v22, v0

    const/4 v0, -0x1

    const/4 v14, 0x0

    invoke-static {v12, v14, v0, v13}, LV/q;->Q(IIILjava/lang/String;)V

    goto :goto_45

    :cond_5f
    move/from16 v22, v0

    :goto_45
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v11, 0x1

    if-eq v0, v11, :cond_62

    const/4 v11, 0x2

    if-eq v0, v11, :cond_61

    const/4 v11, 0x3

    if-ne v0, v11, :cond_60

    :goto_46
    const/4 v0, 0x0

    goto :goto_47

    :cond_60
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_61
    if-eqz v1, :cond_62

    goto :goto_46

    :cond_62
    move/from16 v0, v43

    :goto_47
    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_63

    invoke-static {}, LV/q;->P()V

    :cond_63
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6}, Lu/s0;->n()Lu/s0$b;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v7, v11, v2, v13}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu/I;

    const-string v11, "PlaceholderOpacity"

    move-object/from16 p5, v6

    move-object/from16 p6, v9

    move-object/from16 p7, v0

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v11

    move-object/from16 p11, v2

    const/high16 v0, 0x30000

    move/from16 p12, v0

    invoke-static/range {p5 .. p12}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v0

    sget-object v7, LT/F;->D:LT/F;

    invoke-static {v10}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v8

    invoke-virtual {v6}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LT/p;

    const v10, 0x433c6eba

    invoke-interface {v2, v10}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_64

    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    const/4 v12, 0x0

    const/4 v13, -0x1

    invoke-static {v10, v12, v13, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_64
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v3, v9

    const/4 v10, 0x1

    if-eq v9, v10, :cond_65

    const/4 v10, 0x2

    if-eq v9, v10, :cond_67

    const/4 v10, 0x3

    if-ne v9, v10, :cond_66

    :cond_65
    move/from16 v9, v43

    goto :goto_48

    :cond_66
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_67
    if-eqz v1, :cond_65

    const/4 v9, 0x0

    :goto_48
    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_68

    invoke-static {}, LV/q;->P()V

    :cond_68
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LT/p;

    const v11, 0x433c6eba

    invoke-interface {v2, v11}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v12

    if-eqz v12, :cond_69

    const-string v12, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    const/4 v13, 0x0

    const/4 v14, -0x1

    invoke-static {v11, v13, v14, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_69
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v3, v10

    const/4 v11, 0x1

    if-eq v10, v11, :cond_6a

    const/4 v11, 0x2

    if-eq v10, v11, :cond_6c

    const/4 v11, 0x3

    if-ne v10, v11, :cond_6b

    :cond_6a
    move/from16 v11, v43

    goto :goto_49

    :cond_6b
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_6c
    if-eqz v1, :cond_6a

    const/4 v11, 0x0

    :goto_49
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_6d

    invoke-static {}, LV/q;->P()V

    :cond_6d
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v6}, Lu/s0;->n()Lu/s0$b;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v10, v2, v12}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu/I;

    const-string v10, "PrefixSuffixOpacity"

    move-object/from16 p5, v6

    move-object/from16 p6, v9

    move-object/from16 p7, v1

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v10

    move-object/from16 p11, v2

    const/high16 v1, 0x30000

    move/from16 p12, v1

    invoke-static/range {p5 .. p12}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v1

    sget-object v7, LT/D;->D:LT/D;

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LT/p;

    const v9, -0x66748bf

    invoke-interface {v2, v9}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v10

    move-object/from16 v12, v24

    if-eqz v10, :cond_6e

    const/4 v10, 0x0

    const/4 v11, -0x1

    invoke-static {v9, v10, v11, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6e
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v3, v8

    const/4 v10, 0x1

    if-ne v8, v10, :cond_6f

    move-wide/from16 v10, v37

    goto :goto_4a

    :cond_6f
    move-wide/from16 v10, v28

    :goto_4a
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_70

    invoke-static {}, LV/q;->P()V

    :cond_70
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v10, v11}, Lo0/y0;->r(J)Lp0/c;

    move-result-object v8

    invoke-interface {v2, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_71

    sget-object v10, LV/n;->a:LV/n$a;

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_72

    :cond_71
    invoke-static/range {v26 .. v26}, Lt/j;->a(Lo0/y0$a;)Lx7/l;

    move-result-object v10

    invoke-interface {v10, v8}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lu/x0;

    invoke-interface {v2, v11}, LV/n;->K(Ljava/lang/Object;)V

    :cond_72
    move-object v8, v11

    check-cast v8, Lu/x0;

    invoke-virtual {v6}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LT/p;

    invoke-interface {v2, v9}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_73

    const/4 v11, 0x0

    const/4 v13, -0x1

    invoke-static {v9, v11, v13, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_73
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v3, v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_74

    move-wide/from16 v10, v37

    goto :goto_4b

    :cond_74
    move-wide/from16 v10, v28

    :goto_4b
    invoke-static {}, LV/q;->H()Z

    move-result v13

    if-eqz v13, :cond_75

    invoke-static {}, LV/q;->P()V

    :cond_75
    invoke-interface {v2}, LV/n;->J()V

    invoke-static {v10, v11}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v10

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LT/p;

    invoke-interface {v2, v9}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v13

    if-eqz v13, :cond_76

    const/4 v13, 0x0

    const/4 v14, -0x1

    invoke-static {v9, v13, v14, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_76
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v3, v3, v9

    const/4 v9, 0x1

    if-ne v3, v9, :cond_77

    move-wide/from16 v28, v37

    :cond_77
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_78

    invoke-static {}, LV/q;->P()V

    :cond_78
    invoke-interface {v2}, LV/n;->J()V

    invoke-static/range {v28 .. v29}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v3

    invoke-virtual {v6}, Lu/s0;->n()Lu/s0$b;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v9, v2, v12}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu/I;

    const-string v9, "LabelTextStyleColor"

    move-object/from16 p5, v6

    move-object/from16 p6, v10

    move-object/from16 p7, v3

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v2

    const/high16 v3, 0x30000

    move/from16 p12, v3

    invoke-static/range {p5 .. p12}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v3

    sget-object v7, LT/B;->D:LT/B;

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LT/p;

    const v8, 0x3cff1b76

    invoke-interface {v2, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    move-object/from16 v11, v25

    if-eqz v9, :cond_79

    const/4 v9, 0x0

    const/4 v10, -0x1

    invoke-static {v8, v9, v10, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_79
    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_7a

    invoke-static {}, LV/q;->P()V

    :cond_7a
    invoke-interface {v2}, LV/n;->J()V

    invoke-static/range {v19 .. v20}, Lo0/y0;->r(J)Lp0/c;

    move-result-object v9

    invoke-interface {v2, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_7b

    sget-object v10, LV/n;->a:LV/n$a;

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v12, v10, :cond_7c

    :cond_7b
    invoke-static/range {v26 .. v26}, Lt/j;->a(Lo0/y0$a;)Lx7/l;

    move-result-object v10

    invoke-interface {v10, v9}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lu/x0;

    invoke-interface {v2, v12}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7c
    move-object v9, v12

    check-cast v9, Lu/x0;

    invoke-virtual {v6}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LT/p;

    invoke-interface {v2, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_7d

    const/4 v10, 0x0

    const/4 v12, -0x1

    invoke-static {v8, v10, v12, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7d
    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_7e

    invoke-static {}, LV/q;->P()V

    :cond_7e
    invoke-interface {v2}, LV/n;->J()V

    invoke-static/range {v19 .. v20}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v10

    invoke-virtual {v6}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LT/p;

    invoke-interface {v2, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v12

    if-eqz v12, :cond_7f

    const/4 v12, 0x0

    const/4 v13, -0x1

    invoke-static {v8, v12, v13, v11}, LV/q;->Q(IIILjava/lang/String;)V

    goto :goto_4c

    :cond_7f
    const/4 v12, 0x0

    :goto_4c
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_80

    invoke-static {}, LV/q;->P()V

    :cond_80
    invoke-interface {v2}, LV/n;->J()V

    invoke-static/range {v19 .. v20}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v8

    invoke-virtual {v6}, Lu/s0;->n()Lu/s0$b;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v11, v2, v12}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu/I;

    const-string v11, "LabelContentColor"

    move-object/from16 p5, v6

    move-object/from16 p6, v10

    move-object/from16 p7, v8

    move-object/from16 p8, v7

    move-object/from16 p9, v9

    move-object/from16 p10, v11

    move-object/from16 p11, v2

    const/high16 v6, 0x30000

    move/from16 p12, v6

    invoke-static/range {p5 .. p12}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v6

    invoke-interface {v4}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    const v7, -0x95b99d5

    invoke-interface {v2, v7}, LV/n;->T(I)V

    const/16 v7, 0x36

    if-nez p4, :cond_81

    const/4 v3, 0x0

    goto :goto_4d

    :cond_81
    new-instance v8, LT/A$d;

    move-object/from16 p5, v8

    move-object/from16 p6, v5

    move-object/from16 p7, v15

    move/from16 p8, v4

    move-object/from16 p9, v6

    move-object/from16 p10, p4

    move/from16 p11, v22

    move-object/from16 p12, v3

    invoke-direct/range {p5 .. p12}, LT/A$d;-><init>(LM0/P;LM0/P;FLV/G1;Lx7/p;ZLV/G1;)V

    const v3, -0x49b4cc60

    const/4 v6, 0x1

    invoke-static {v3, v6, v8, v2, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v3

    :goto_4d
    invoke-interface {v2}, LV/n;->J()V

    move-object/from16 v13, p16

    move/from16 v6, v42

    move/from16 v8, v44

    move/from16 v9, v45

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->g(ZZZ)J

    move-result-wide v10

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, LV/n;->a:LV/n$a;

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v12, v7, :cond_82

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object v7

    new-instance v12, LT/A$k;

    invoke-direct {v12, v0}, LT/A$k;-><init>(LV/G1;)V

    invoke-static {v7, v12}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object v12

    invoke-interface {v2, v12}, LV/n;->K(Ljava/lang/Object;)V

    :cond_82
    check-cast v12, LV/G1;

    const v7, -0x95b1996

    invoke-interface {v2, v7}, LV/n;->T(I)V

    if-eqz v41, :cond_83

    invoke-interface/range {p13 .. p13}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_83

    invoke-static {v12}, LT/A;->b(LV/G1;)Z

    move-result v7

    if-eqz v7, :cond_83

    new-instance v7, LT/A$f;

    move-object/from16 p5, v7

    move-object/from16 p6, v0

    move-wide/from16 p7, v10

    move-object/from16 p9, v5

    move-object/from16 p10, v41

    invoke-direct/range {p5 .. p10}, LT/A$f;-><init>(LV/G1;JLM0/P;Lx7/p;)V

    const v0, -0x275ecc34

    const/4 v10, 0x1

    const/16 v11, 0x36

    invoke-static {v0, v10, v7, v2, v11}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_4e

    :cond_83
    const/16 v19, 0x0

    :goto_4e
    invoke-interface {v2}, LV/n;->J()V

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->h(ZZZ)J

    move-result-wide v10

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v0, v7, :cond_84

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object v0

    new-instance v7, LT/A$l;

    invoke-direct {v7, v1}, LT/A$l;-><init>(LV/G1;)V

    invoke-static {v0, v7}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object v0

    invoke-interface {v2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_84
    check-cast v0, LV/G1;

    const v7, -0x95ab8ec

    invoke-interface {v2, v7}, LV/n;->T(I)V

    if-eqz v34, :cond_85

    invoke-static {v0}, LT/A;->c(LV/G1;)Z

    move-result v7

    if-eqz v7, :cond_85

    new-instance v7, LT/A$g;

    move-object/from16 p5, v7

    move-object/from16 p6, v1

    move-wide/from16 p7, v10

    move-object/from16 p9, v5

    move-object/from16 p10, v34

    invoke-direct/range {p5 .. p10}, LT/A$g;-><init>(LV/G1;JLM0/P;Lx7/p;)V

    const v10, 0x105afde6

    const/4 v11, 0x1

    const/16 v12, 0x36

    invoke-static {v10, v11, v7, v2, v12}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v7

    move-object/from16 v22, v7

    goto :goto_4f

    :cond_85
    const/16 v22, 0x0

    :goto_4f
    invoke-interface {v2}, LV/n;->J()V

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->i(ZZZ)J

    move-result-wide v10

    const v7, -0x95a706c

    invoke-interface {v2, v7}, LV/n;->T(I)V

    if-eqz v36, :cond_86

    invoke-static {v0}, LT/A;->c(LV/G1;)Z

    move-result v0

    if-eqz v0, :cond_86

    new-instance v0, LT/A$h;

    move-object/from16 p5, v0

    move-object/from16 p6, v1

    move-wide/from16 p7, v10

    move-object/from16 p9, v5

    move-object/from16 p10, v36

    invoke-direct/range {p5 .. p10}, LT/A$h;-><init>(LV/G1;JLM0/P;Lx7/p;)V

    const v1, -0x5af8699b

    const/4 v5, 0x1

    const/16 v7, 0x36

    invoke-static {v1, v5, v0, v2, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    goto :goto_50

    :cond_86
    const/4 v0, 0x0

    :goto_50
    invoke-interface {v2}, LV/n;->J()V

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->f(ZZZ)J

    move-result-wide v10

    const v1, -0x95a2632

    invoke-interface {v2, v1}, LV/n;->T(I)V

    if-nez v40, :cond_87

    move-object/from16 v5, v40

    const/4 v10, 0x1

    const/16 v11, 0x36

    const/16 v20, 0x0

    goto :goto_51

    :cond_87
    new-instance v1, LT/A$e;

    move-object/from16 v5, v40

    invoke-direct {v1, v10, v11, v5}, LT/A$e;-><init>(JLx7/p;)V

    const v7, -0x7c1480e

    const/4 v10, 0x1

    const/16 v11, 0x36

    invoke-static {v7, v10, v1, v2, v11}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_51
    invoke-interface {v2}, LV/n;->J()V

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->l(ZZZ)J

    move-result-wide v10

    const v1, -0x95a02f1

    invoke-interface {v2, v1}, LV/n;->T(I)V

    if-nez v39, :cond_88

    move-object/from16 v7, v39

    const/4 v11, 0x1

    const/16 v12, 0x36

    const/16 v21, 0x0

    goto :goto_52

    :cond_88
    new-instance v1, LT/A$j;

    move-object/from16 v7, v39

    invoke-direct {v1, v10, v11, v7}, LT/A$j;-><init>(JLx7/p;)V

    const v10, 0x7bf77be6

    const/4 v11, 0x1

    const/16 v12, 0x36

    invoke-static {v10, v11, v1, v2, v12}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    move-object/from16 v21, v1

    :goto_52
    invoke-interface {v2}, LV/n;->J()V

    invoke-virtual {v13, v6, v8, v9}, LS/i1;->j(ZZZ)J

    move-result-wide v9

    const v1, -0x959ddf6

    invoke-interface {v2, v1}, LV/n;->T(I)V

    if-nez v35, :cond_89

    move v10, v11

    move-object/from16 v11, v35

    const/4 v1, 0x0

    goto :goto_53

    :cond_89
    new-instance v1, LT/A$i;

    move-object/from16 v11, v35

    invoke-direct {v1, v9, v10, v15, v11}, LT/A$i;-><init>(JLM0/P;Lx7/p;)V

    const v9, 0x4b52a37d    # 1.3804413E7f

    const/4 v10, 0x1

    invoke-static {v9, v10, v1, v2, v12}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    :goto_53
    invoke-interface {v2}, LV/n;->J()V

    sget-object v9, LT/A$p;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v9, v9, v12

    if-eq v9, v10, :cond_8e

    const/4 v10, 0x2

    if-eq v9, v10, :cond_8a

    const v0, -0x21b15a9f

    invoke-interface {v2, v0}, LV/n;->T(I)V

    invoke-interface {v2}, LV/n;->J()V

    sget-object v0, Li7/M;->a:Li7/M;

    move-object/from16 v15, p15

    move-object/from16 v12, p17

    move-object/from16 v40, v5

    move/from16 v42, v6

    move-object/from16 v39, v7

    goto/16 :goto_55

    :cond_8a
    const v9, -0x21cc046f

    invoke-interface {v2, v9}, LV/n;->T(I)V

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_8b

    sget-object v9, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v9}, Ln0/m$a;->b()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/m;->c(J)Ln0/m;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v12, 0x0

    invoke-static {v9, v12, v10, v12}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v9

    invoke-interface {v2, v9}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8b
    check-cast v9, LV/w0;

    new-instance v10, LT/A$b;

    move-object/from16 v15, p15

    move-object/from16 v12, p17

    invoke-direct {v10, v9, v15, v12}, LT/A$b;-><init>(LV/w0;LA/B;Lx7/p;)V

    move-object/from16 v40, v5

    const v5, 0x96014d9

    move/from16 v42, v6

    move-object/from16 v39, v7

    const/4 v6, 0x1

    const/16 v7, 0x36

    invoke-static {v5, v6, v10, v2, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v5

    sget-object v16, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v2, v4}, LV/n;->h(F)Z

    move-result v6

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_8c

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_8d

    :cond_8c
    new-instance v7, LT/A$a;

    invoke-direct {v7, v4, v9}, LT/A$a;-><init>(FLV/w0;)V

    invoke-interface {v2, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8d
    move-object/from16 v26, v7

    check-cast v26, Lx7/l;

    const/4 v6, 0x3

    shr-int/lit8 v6, v18, 0x3

    and-int/lit8 v6, v6, 0x70

    const/4 v7, 0x6

    or-int/2addr v6, v7

    shl-int/lit8 v9, v23, 0x15

    const/high16 v10, 0xe000000

    and-int/2addr v9, v10

    or-int v31, v6, v9

    shr-int/lit8 v6, v23, 0x6

    and-int/lit16 v6, v6, 0x1c00

    const/16 v7, 0x30

    or-int/lit8 v32, v6, 0x30

    move-object/from16 v17, p2

    move-object/from16 v18, v19

    move-object/from16 v19, v3

    move-object/from16 v23, v0

    move/from16 v24, v33

    move/from16 v25, v4

    move-object/from16 v27, v5

    move-object/from16 v28, v1

    move-object/from16 v29, p15

    move-object/from16 v30, v2

    invoke-static/range {v16 .. v32}, LS/y0;->c(Landroidx/compose/ui/d;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/l;Lx7/p;Lx7/p;LA/B;LV/n;II)V

    :goto_54
    invoke-interface {v2}, LV/n;->J()V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_55

    :cond_8e
    move-object/from16 v15, p15

    move-object/from16 v12, p17

    move-object/from16 v40, v5

    move/from16 v42, v6

    move-object/from16 v39, v7

    const v5, -0x21dc9887

    invoke-interface {v2, v5}, LV/n;->T(I)V

    new-instance v5, LT/A$c;

    invoke-direct {v5, v12}, LT/A$c;-><init>(Lx7/p;)V

    const v6, 0x6853e27c

    const/4 v7, 0x1

    const/16 v9, 0x36

    invoke-static {v6, v7, v5, v2, v9}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v26

    sget-object v16, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v5, 0x3

    shr-int/lit8 v5, v18, 0x3

    and-int/lit8 v5, v5, 0x70

    const/4 v6, 0x6

    or-int/2addr v5, v6

    shl-int/lit8 v7, v23, 0x15

    const/high16 v9, 0xe000000

    and-int/2addr v7, v9

    or-int v30, v5, v7

    shr-int/lit8 v5, v23, 0x9

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v31, v5, 0x6

    move-object/from16 v17, p2

    move-object/from16 v18, v3

    move-object/from16 v23, v0

    move/from16 v24, v33

    move/from16 v25, v4

    move-object/from16 v27, v1

    move-object/from16 v28, p15

    move-object/from16 v29, v2

    invoke-static/range {v16 .. v31}, LS/k1;->b(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;LV/n;II)V

    goto :goto_54

    :goto_55
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_8f

    invoke-static {}, LV/q;->P()V

    :cond_8f
    move v14, v8

    move-object/from16 v9, v34

    move-object/from16 v10, v36

    move-object/from16 v8, v39

    move-object/from16 v7, v40

    move-object/from16 v6, v41

    :goto_56
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v5

    if-eqz v5, :cond_90

    new-instance v4, LT/A$m;

    move-object v0, v4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v46, v4

    move-object/from16 v4, p3

    move-object/from16 v47, v5

    move-object/from16 v5, p4

    move/from16 v12, v33

    move/from16 v13, v42

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    invoke-direct/range {v0 .. v21}, LT/A$m;-><init>(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;III)V

    move-object/from16 v1, v46

    move-object/from16 v0, v47

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_90
    return-void
.end method

.method private static final b(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final c(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final d(JLM0/P;Lx7/p;LV/n;I)V
    .locals 7

    .prologue
    const v0, 0x480b140c

    invoke-interface {p4, v0}, LV/n;->r(I)LV/n;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0, p1}, LV/n;->j(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p4}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    and-int/lit16 v6, v1, 0x3fe

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v6}, LT/w;->a(JLM0/P;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    invoke-interface {p4}, LV/n;->x()LV/e1;

    move-result-object p4

    if-eqz p4, :cond_a

    new-instance v6, LT/A$n;

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LT/A$n;-><init>(JLM0/P;Lx7/p;I)V

    invoke-interface {p4, v6}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method

.method private static final e(JLx7/p;LV/n;I)V
    .locals 4

    .prologue
    const v0, 0x2758fb84

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0, p1}, LV/n;->j(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v0

    invoke-static {p0, p1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v0

    sget v2, LV/P0;->i:I

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {v0, p2, p3, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_4
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance v0, LT/A$o;

    invoke-direct {v0, p0, p1, p2, p4}, LT/A$o;-><init>(JLx7/p;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_8
    return-void
.end method

.method public static final synthetic f(JLM0/P;Lx7/p;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LT/A;->d(JLM0/P;Lx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic g(JLx7/p;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LT/A;->e(JLx7/p;LV/n;I)V

    return-void
.end method

.method public static final h(ZZZLS/i1;FFLV/n;I)LV/G1;
    .locals 16

    .prologue
    move/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)"

    const v4, 0x7a02f0b5

    invoke-static {v4, v11, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    move/from16 v2, p1

    move-object/from16 v3, p3

    invoke-virtual {v3, v0, v2, v1}, LS/i1;->d(ZZZ)J

    move-result-wide v2

    const/4 v12, 0x6

    const/16 v13, 0x96

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v0, :cond_1

    const v4, 0x3cfa90ae

    invoke-interface {v10, v4}, LV/n;->T(I)V

    invoke-static {v13, v15, v14, v12, v14}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/16 v8, 0x30

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p6

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v2

    :goto_0
    invoke-interface/range {p6 .. p6}, LV/n;->J()V

    move-object v7, v2

    goto :goto_1

    :cond_1
    const v4, 0x3cfc4441

    invoke-interface {v10, v4}, LV/n;->T(I)V

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-static {v2, v10, v15}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v2

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_3

    const v0, 0x3cfdda29

    invoke-interface {v10, v0}, LV/n;->T(I)V

    if-eqz v1, :cond_2

    move/from16 v0, p4

    goto :goto_2

    :cond_2
    move/from16 v0, p5

    :goto_2
    invoke-static {v13, v15, v14, v12, v14}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v1

    const/16 v5, 0x30

    const/16 v6, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p6

    invoke-static/range {v0 .. v6}, Lu/c;->c(FLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v0

    :goto_3
    invoke-interface/range {p6 .. p6}, LV/n;->J()V

    goto :goto_4

    :cond_3
    const v0, 0x3d010a74

    invoke-interface {v10, v0}, LV/n;->T(I)V

    invoke-static/range {p5 .. p5}, LY0/i;->m(F)LY0/i;

    move-result-object v0

    shr-int/lit8 v1, v11, 0xf

    and-int/lit8 v1, v1, 0xe

    invoke-static {v0, v10, v1}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/i;

    invoke-virtual {v0}, LY0/i;->v()F

    move-result v0

    invoke-interface {v7}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lv/h;->a(FJ)Lv/g;

    move-result-object v0

    invoke-static {v0, v10, v15}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object v0
.end method

.method public static final i(Landroidx/compose/ui/d;ZLjava/lang/String;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    new-instance p1, LT/A$q;

    invoke-direct {p1, p2}, LT/A$q;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, p2, v0}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final j()F
    .locals 1

    sget v0, LT/A;->c:F

    return v0
.end method

.method public static final k()Landroidx/compose/ui/d;
    .locals 1

    sget-object v0, LT/A;->i:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public static final l(LD0/n;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p0}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LD0/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LD0/w;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, LD0/w;->Q()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final m()F
    .locals 1

    sget v0, LT/A;->g:F

    return v0
.end method

.method public static final n()F
    .locals 1

    sget v0, LT/A;->h:F

    return v0
.end method

.method public static final o()F
    .locals 1

    sget v0, LT/A;->f:F

    return v0
.end method

.method public static final p()F
    .locals 1

    sget v0, LT/A;->e:F

    return v0
.end method

.method public static final q()F
    .locals 1

    sget v0, LT/A;->d:F

    return v0
.end method

.method public static final r()F
    .locals 1

    sget v0, LT/A;->b:F

    return v0
.end method

.method public static final s()J
    .locals 2

    sget-wide v0, LT/A;->a:J

    return-wide v0
.end method

.method public static final t(LD0/X;)I
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LD0/X;->w0()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final u(Landroidx/compose/ui/d;Lo0/B0;Lo0/e2;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LT/A$r;

    invoke-direct {v0, p2, p1}, LT/A$r;-><init>(Lo0/e2;Lo0/B0;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->c(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final v(LD0/X;)I
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LD0/X;->I0()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
