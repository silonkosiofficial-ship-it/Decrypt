.class public abstract LS/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/k1;->a:F

    return-void
.end method

.method public static final a(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLS0/g0;LH/v;LH/u;ZIILz/l;Lo0/e2;LS/i1;LV/n;IIII)V
    .locals 82

    .prologue
    move/from16 v15, p24

    move/from16 v14, p25

    move/from16 v13, p26

    move/from16 v12, p27

    const v0, -0x284ea3bd

    move-object/from16 v1, p23

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v0

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v15

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v4, v15

    :goto_1
    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, v12, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v15, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v4, v4, v16

    :goto_5
    and-int/lit8 v16, v12, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v2, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_9

    move/from16 v2, p3

    invoke-interface {v0, v2}, LV/n;->d(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v4, v4, v19

    :goto_7
    and-int/lit8 v19, v12, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v3, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v3, v15, 0x6000

    if-nez v3, :cond_c

    move/from16 v3, p4

    invoke-interface {v0, v3}, LV/n;->d(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v4, v4, v23

    :goto_9
    const/high16 v23, 0x30000

    and-int v23, v15, v23

    if-nez v23, :cond_10

    and-int/lit8 v23, v12, 0x20

    move-object/from16 v6, p5

    if-nez v23, :cond_f

    invoke-interface {v0, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v24, 0x10000

    :goto_a
    or-int v4, v4, v24

    goto :goto_b

    :cond_10
    move-object/from16 v6, p5

    :goto_b
    and-int/lit8 v24, v12, 0x40

    const/high16 v25, 0x180000

    if-eqz v24, :cond_11

    or-int v4, v4, v25

    move-object/from16 v7, p6

    goto :goto_d

    :cond_11
    and-int v26, v15, v25

    move-object/from16 v7, p6

    if-nez v26, :cond_13

    invoke-interface {v0, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v27, 0x80000

    :goto_c
    or-int v4, v4, v27

    :cond_13
    :goto_d
    and-int/lit16 v9, v12, 0x80

    const/high16 v28, 0x400000

    const/high16 v29, 0xc00000

    if-eqz v9, :cond_14

    or-int v4, v4, v29

    move-object/from16 v10, p7

    goto :goto_f

    :cond_14
    and-int v30, v15, v29

    move-object/from16 v10, p7

    if-nez v30, :cond_16

    invoke-interface {v0, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_15

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_15
    move/from16 v31, v28

    :goto_e
    or-int v4, v4, v31

    :cond_16
    :goto_f
    and-int/lit16 v1, v12, 0x100

    const/high16 v31, 0x6000000

    if-eqz v1, :cond_17

    or-int v4, v4, v31

    move-object/from16 v2, p8

    goto :goto_11

    :cond_17
    and-int v31, v15, v31

    move-object/from16 v2, p8

    if-nez v31, :cond_19

    invoke-interface {v0, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_18

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v31, 0x2000000

    :goto_10
    or-int v4, v4, v31

    :cond_19
    :goto_11
    and-int/lit16 v2, v12, 0x200

    const/high16 v31, 0x30000000

    if-eqz v2, :cond_1a

    or-int v4, v4, v31

    move-object/from16 v3, p9

    goto :goto_13

    :cond_1a
    and-int v32, v15, v31

    move-object/from16 v3, p9

    if-nez v32, :cond_1c

    invoke-interface {v0, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1b

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v32, 0x10000000

    :goto_12
    or-int v4, v4, v32

    :cond_1c
    :goto_13
    and-int/lit16 v3, v12, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v32, v14, 0x6

    move-object/from16 v5, p10

    goto :goto_15

    :cond_1d
    and-int/lit8 v32, v14, 0x6

    move-object/from16 v5, p10

    if-nez v32, :cond_1f

    invoke-interface {v0, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1e

    const/16 v32, 0x4

    goto :goto_14

    :cond_1e
    const/16 v32, 0x2

    :goto_14
    or-int v32, v14, v32

    goto :goto_15

    :cond_1f
    move/from16 v32, v14

    :goto_15
    and-int/lit16 v5, v12, 0x800

    if-eqz v5, :cond_21

    or-int/lit8 v32, v32, 0x30

    :cond_20
    :goto_16
    move/from16 v6, v32

    goto :goto_18

    :cond_21
    and-int/lit8 v33, v14, 0x30

    move-object/from16 v6, p11

    if-nez v33, :cond_20

    invoke-interface {v0, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v33, 0x20

    goto :goto_17

    :cond_22
    const/16 v33, 0x10

    :goto_17
    or-int v32, v32, v33

    goto :goto_16

    :goto_18
    and-int/lit16 v7, v12, 0x1000

    if-eqz v7, :cond_24

    or-int/lit16 v6, v6, 0x180

    :cond_23
    move-object/from16 v10, p12

    goto :goto_1a

    :cond_24
    and-int/lit16 v10, v14, 0x180

    if-nez v10, :cond_23

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_25

    const/16 v32, 0x100

    goto :goto_19

    :cond_25
    const/16 v32, 0x80

    :goto_19
    or-int v6, v6, v32

    :goto_1a
    and-int/lit16 v10, v12, 0x2000

    if-eqz v10, :cond_27

    or-int/lit16 v6, v6, 0xc00

    :cond_26
    move/from16 v11, p13

    goto :goto_1b

    :cond_27
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_26

    move/from16 v11, p13

    invoke-interface {v0, v11}, LV/n;->d(Z)Z

    move-result v32

    if-eqz v32, :cond_28

    move/from16 v17, v18

    :cond_28
    or-int v6, v6, v17

    :goto_1b
    and-int/lit16 v11, v12, 0x4000

    if-eqz v11, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    move/from16 v17, v11

    :cond_29
    move-object/from16 v11, p14

    goto :goto_1c

    :cond_2a
    move/from16 v17, v11

    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_29

    move-object/from16 v11, p14

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2b

    move/from16 v20, v21

    :cond_2b
    or-int v6, v6, v20

    :goto_1c
    const v18, 0x8000

    and-int v18, v12, v18

    const/high16 v20, 0x30000

    if-eqz v18, :cond_2c

    or-int v6, v6, v20

    move-object/from16 v11, p15

    goto :goto_1e

    :cond_2c
    and-int v20, v14, v20

    move-object/from16 v11, p15

    if-nez v20, :cond_2e

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2d

    const/high16 v20, 0x20000

    goto :goto_1d

    :cond_2d
    const/high16 v20, 0x10000

    :goto_1d
    or-int v6, v6, v20

    :cond_2e
    :goto_1e
    const/high16 v20, 0x10000

    and-int v20, v12, v20

    if-eqz v20, :cond_2f

    or-int v6, v6, v25

    move-object/from16 v11, p16

    goto :goto_20

    :cond_2f
    and-int v21, v14, v25

    move-object/from16 v11, p16

    if-nez v21, :cond_31

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_30

    const/high16 v21, 0x100000

    goto :goto_1f

    :cond_30
    const/high16 v21, 0x80000

    :goto_1f
    or-int v6, v6, v21

    :cond_31
    :goto_20
    const/high16 v21, 0x20000

    and-int v21, v12, v21

    if-eqz v21, :cond_32

    or-int v6, v6, v29

    move/from16 v11, p17

    goto :goto_22

    :cond_32
    and-int v25, v14, v29

    move/from16 v11, p17

    if-nez v25, :cond_34

    invoke-interface {v0, v11}, LV/n;->d(Z)Z

    move-result v25

    if-eqz v25, :cond_33

    const/high16 v25, 0x800000

    goto :goto_21

    :cond_33
    move/from16 v25, v28

    :goto_21
    or-int v6, v6, v25

    :cond_34
    :goto_22
    const/high16 v25, 0x6000000

    and-int v25, v14, v25

    if-nez v25, :cond_36

    const/high16 v25, 0x40000

    and-int v25, v12, v25

    move/from16 v11, p18

    if-nez v25, :cond_35

    invoke-interface {v0, v11}, LV/n;->i(I)Z

    move-result v25

    if-eqz v25, :cond_35

    const/high16 v25, 0x4000000

    goto :goto_23

    :cond_35
    const/high16 v25, 0x2000000

    :goto_23
    or-int v6, v6, v25

    goto :goto_24

    :cond_36
    move/from16 v11, p18

    :goto_24
    const/high16 v25, 0x80000

    and-int v25, v12, v25

    if-eqz v25, :cond_37

    or-int v6, v6, v31

    move/from16 v11, p19

    goto :goto_26

    :cond_37
    and-int v29, v14, v31

    move/from16 v11, p19

    if-nez v29, :cond_39

    invoke-interface {v0, v11}, LV/n;->i(I)Z

    move-result v29

    if-eqz v29, :cond_38

    const/high16 v29, 0x20000000

    goto :goto_25

    :cond_38
    const/high16 v29, 0x10000000

    :goto_25
    or-int v6, v6, v29

    :cond_39
    :goto_26
    const/high16 v29, 0x100000

    and-int v29, v12, v29

    if-eqz v29, :cond_3a

    or-int/lit8 v22, v13, 0x6

    move-object/from16 v11, p20

    goto :goto_28

    :cond_3a
    and-int/lit8 v31, v13, 0x6

    move-object/from16 v11, p20

    if-nez v31, :cond_3c

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_3b

    const/16 v22, 0x4

    goto :goto_27

    :cond_3b
    const/16 v22, 0x2

    :goto_27
    or-int v22, v13, v22

    goto :goto_28

    :cond_3c
    move/from16 v22, v13

    :goto_28
    and-int/lit8 v31, v13, 0x30

    if-nez v31, :cond_3e

    const/high16 v31, 0x200000

    and-int v31, v12, v31

    move-object/from16 v11, p21

    if-nez v31, :cond_3d

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_3d

    const/16 v23, 0x20

    goto :goto_29

    :cond_3d
    const/16 v23, 0x10

    :goto_29
    or-int v22, v22, v23

    goto :goto_2a

    :cond_3e
    move-object/from16 v11, p21

    :goto_2a
    and-int/lit16 v11, v13, 0x180

    if-nez v11, :cond_41

    and-int v11, v12, v28

    if-nez v11, :cond_3f

    move-object/from16 v11, p22

    invoke-interface {v0, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_40

    const/16 v27, 0x100

    goto :goto_2b

    :cond_3f
    move-object/from16 v11, p22

    :cond_40
    const/16 v27, 0x80

    :goto_2b
    or-int v22, v22, v27

    :goto_2c
    move/from16 v11, v22

    goto :goto_2d

    :cond_41
    move-object/from16 v11, p22

    goto :goto_2c

    :goto_2d
    const v22, 0x12492493

    and-int v13, v4, v22

    const v14, 0x12492492

    if-ne v13, v14, :cond_43

    const v13, 0x12492493

    and-int/2addr v13, v6

    const v14, 0x12492492

    if-ne v13, v14, :cond_43

    and-int/lit16 v11, v11, 0x93

    const/16 v13, 0x92

    if-ne v11, v13, :cond_43

    invoke-interface {v0}, LV/n;->u()Z

    move-result v11

    if-nez v11, :cond_42

    goto :goto_2e

    :cond_42
    invoke-interface {v0}, LV/n;->A()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    goto/16 :goto_4b

    :cond_43
    :goto_2e
    invoke-interface {v0}, LV/n;->q()V

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_47

    invoke-interface {v0}, LV/n;->G()Z

    move-result v11

    if-eqz v11, :cond_44

    goto :goto_2f

    :cond_44
    invoke-interface {v0}, LV/n;->A()V

    and-int/lit8 v1, v12, 0x20

    if-eqz v1, :cond_45

    const v1, -0x70001

    and-int/2addr v4, v1

    :cond_45
    const/high16 v1, 0x40000

    and-int/2addr v1, v12

    if-eqz v1, :cond_46

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_46
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v1, p4

    move-object/from16 v14, p5

    move-object/from16 v2, p6

    move-object/from16 v9, p7

    move-object/from16 v3, p8

    move-object/from16 v5, p10

    move-object/from16 p2, p12

    move/from16 v10, p13

    move-object/from16 v13, p14

    move-object/from16 v40, p15

    move-object/from16 v41, p16

    move/from16 v42, p17

    move/from16 v43, p18

    move/from16 v44, p19

    move-object/from16 v45, p20

    move-object/from16 v46, p21

    move-object/from16 v12, p22

    move v15, v4

    move v7, v6

    move-object/from16 v4, p9

    move-object/from16 v6, p11

    goto/16 :goto_46

    :cond_47
    :goto_2f
    if-eqz v8, :cond_48

    sget-object v8, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_30

    :cond_48
    move-object/from16 v8, p2

    :goto_30
    if-eqz v16, :cond_49

    const/4 v11, 0x1

    goto :goto_31

    :cond_49
    move/from16 v11, p3

    :goto_31
    if-eqz v19, :cond_4a

    const/16 v16, 0x0

    goto :goto_32

    :cond_4a
    move/from16 v16, p4

    :goto_32
    and-int/lit8 v19, v12, 0x20

    if-eqz v19, :cond_4b

    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object v14

    invoke-interface {v0, v14}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LM0/P;

    const v19, -0x70001

    and-int v4, v4, v19

    goto :goto_33

    :cond_4b
    move-object/from16 v14, p5

    :goto_33
    const/16 v19, 0x0

    if-eqz v24, :cond_4c

    move-object/from16 v22, v19

    goto :goto_34

    :cond_4c
    move-object/from16 v22, p6

    :goto_34
    if-eqz v9, :cond_4d

    move-object/from16 v9, v19

    goto :goto_35

    :cond_4d
    move-object/from16 v9, p7

    :goto_35
    if-eqz v1, :cond_4e

    move-object/from16 v1, v19

    goto :goto_36

    :cond_4e
    move-object/from16 v1, p8

    :goto_36
    if-eqz v2, :cond_4f

    move-object/from16 v2, v19

    goto :goto_37

    :cond_4f
    move-object/from16 v2, p9

    :goto_37
    if-eqz v3, :cond_50

    move-object/from16 v3, v19

    goto :goto_38

    :cond_50
    move-object/from16 v3, p10

    :goto_38
    if-eqz v5, :cond_51

    move-object/from16 v5, v19

    goto :goto_39

    :cond_51
    move-object/from16 v5, p11

    :goto_39
    if-eqz v7, :cond_52

    move-object/from16 v7, v19

    goto :goto_3a

    :cond_52
    move-object/from16 v7, p12

    :goto_3a
    if-eqz v10, :cond_53

    const/4 v10, 0x0

    goto :goto_3b

    :cond_53
    move/from16 v10, p13

    :goto_3b
    if-eqz v17, :cond_54

    sget-object v17, LS0/g0;->a:LS0/g0$a;

    invoke-virtual/range {v17 .. v17}, LS0/g0$a;->c()LS0/g0;

    move-result-object v17

    goto :goto_3c

    :cond_54
    move-object/from16 v17, p14

    :goto_3c
    if-eqz v18, :cond_55

    sget-object v18, LH/v;->g:LH/v$a;

    invoke-virtual/range {v18 .. v18}, LH/v$a;->a()LH/v;

    move-result-object v18

    goto :goto_3d

    :cond_55
    move-object/from16 v18, p15

    :goto_3d
    if-eqz v20, :cond_56

    sget-object v20, LH/u;->g:LH/u$a;

    invoke-virtual/range {v20 .. v20}, LH/u$a;->a()LH/u;

    move-result-object v20

    goto :goto_3e

    :cond_56
    move-object/from16 v20, p16

    :goto_3e
    if-eqz v21, :cond_57

    const/16 v21, 0x0

    goto :goto_3f

    :cond_57
    move/from16 v21, p17

    :goto_3f
    const/high16 v23, 0x40000

    and-int v23, v12, v23

    if-eqz v23, :cond_59

    if-eqz v21, :cond_58

    const/16 v23, 0x1

    goto :goto_40

    :cond_58
    const v23, 0x7fffffff

    :goto_40
    const v24, -0xe000001

    and-int v6, v6, v24

    goto :goto_41

    :cond_59
    move/from16 v23, p18

    :goto_41
    if-eqz v25, :cond_5a

    const/16 v24, 0x1

    goto :goto_42

    :cond_5a
    move/from16 v24, p19

    :goto_42
    if-eqz v29, :cond_5b

    goto :goto_43

    :cond_5b
    move-object/from16 v19, p20

    :goto_43
    const/high16 v25, 0x200000

    and-int v25, v12, v25

    const/4 v13, 0x6

    move-object/from16 p2, v1

    if-eqz v25, :cond_5c

    sget-object v1, LS/j1;->a:LS/j1;

    invoke-virtual {v1, v0, v13}, LS/j1;->l(LV/n;I)Lo0/e2;

    move-result-object v1

    goto :goto_44

    :cond_5c
    move-object/from16 v1, p21

    :goto_44
    and-int v25, v12, v28

    move-object/from16 p3, v1

    if-eqz v25, :cond_5d

    sget-object v1, LS/j1;->a:LS/j1;

    invoke-virtual {v1, v0, v13}, LS/j1;->c(LV/n;I)LS/i1;

    move-result-object v1

    move-object/from16 v46, p3

    move-object v12, v1

    :goto_45
    move v15, v4

    move/from16 v1, v16

    move-object/from16 v13, v17

    move-object/from16 v40, v18

    move-object/from16 v45, v19

    move-object/from16 v41, v20

    move/from16 v42, v21

    move/from16 v43, v23

    move/from16 v44, v24

    move-object v4, v2

    move-object/from16 v2, v22

    move-object/from16 v81, v3

    move-object/from16 v3, p2

    move-object/from16 p2, v7

    move v7, v6

    move-object v6, v5

    move-object/from16 v5, v81

    goto :goto_46

    :cond_5d
    move-object/from16 v46, p3

    move-object/from16 v12, p22

    goto :goto_45

    :goto_46
    invoke-interface {v0}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v16

    if-eqz v16, :cond_5e

    move-object/from16 p3, v6

    const v6, -0x284ea3bd

    move-object/from16 p4, v5

    const-string v5, "androidx.compose.material3.TextField (TextField.kt:219)"

    invoke-static {v6, v15, v7, v5}, LV/q;->Q(IIILjava/lang/String;)V

    goto :goto_47

    :cond_5e
    move-object/from16 p4, v5

    move-object/from16 p3, v6

    :goto_47
    const v5, -0x1e4f53da

    invoke-interface {v0, v5}, LV/n;->T(I)V

    if-nez v45, :cond_60

    invoke-interface {v0}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LV/n;->a:LV/n$a;

    invoke-virtual {v6}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_5f

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object v5

    invoke-interface {v0, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5f
    check-cast v5, Lz/l;

    goto :goto_48

    :cond_60
    move-object/from16 v5, v45

    :goto_48
    invoke-interface {v0}, LV/n;->J()V

    const v6, -0x1e4f3bfc

    invoke-interface {v0, v6}, LV/n;->T(I)V

    invoke-virtual {v14}, LM0/P;->h()J

    move-result-wide v6

    const-wide/16 v15, 0x10

    cmp-long v15, v6, v15

    if-eqz v15, :cond_61

    :goto_49
    move-wide/from16 v48, v6

    goto :goto_4a

    :cond_61
    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, Lz/f;->a(Lz/j;LV/n;I)LV/G1;

    move-result-object v6

    invoke-interface {v6}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v12, v11, v10, v6}, LS/i1;->k(ZZZ)J

    move-result-wide v6

    goto :goto_49

    :goto_4a
    invoke-interface {v0}, LV/n;->J()V

    new-instance v6, LM0/P;

    move-object/from16 v47, v6

    const v77, 0xfffffe

    const/16 v78, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const-wide/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const-wide/16 v69, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    invoke-direct/range {v47 .. v78}, LM0/P;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LM0/A;LX0/h;IILX0/t;ILy7/k;)V

    invoke-virtual {v14, v6}, LM0/P;->I(LM0/P;)LM0/P;

    move-result-object v24

    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object v6

    invoke-virtual {v12}, LS/i1;->c()LN/J;

    move-result-object v7

    invoke-virtual {v6, v7}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v6

    new-instance v7, LS/k1$a;

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move/from16 v18, v10

    move-object/from16 v19, v12

    move-object/from16 v20, p0

    move-object/from16 v21, p1

    move/from16 v22, v11

    move/from16 v23, v1

    move-object/from16 v25, v40

    move-object/from16 v26, v41

    move/from16 v27, v42

    move/from16 v28, v43

    move/from16 v29, v44

    move-object/from16 v30, v13

    move-object/from16 v31, v5

    move-object/from16 v32, v2

    move-object/from16 v33, v9

    move-object/from16 v34, v3

    move-object/from16 v35, v4

    move-object/from16 v36, p4

    move-object/from16 v37, p3

    move-object/from16 v38, p2

    move-object/from16 v39, v46

    invoke-direct/range {v16 .. v39}, LS/k1$a;-><init>(Landroidx/compose/ui/d;ZLS/i1;Ljava/lang/String;Lx7/l;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lz/l;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;)V

    const/16 v5, 0x36

    const v15, 0x6ed05103

    move/from16 p5, v1

    const/4 v1, 0x1

    invoke-static {v15, v1, v7, v0, v5}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    sget v5, LV/P0;->i:I

    or-int/lit8 v5, v5, 0x30

    invoke-static {v6, v1, v0, v5}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_62

    invoke-static {}, LV/q;->P()V

    :cond_62
    move/from16 v5, p5

    move-object v7, v2

    move-object/from16 v23, v12

    move-object v15, v13

    move-object v6, v14

    move-object/from16 v16, v40

    move-object/from16 v17, v41

    move/from16 v18, v42

    move/from16 v19, v43

    move/from16 v20, v44

    move-object/from16 v21, v45

    move-object/from16 v22, v46

    move-object/from16 v13, p2

    move-object/from16 v12, p3

    move v14, v10

    move-object v10, v4

    move v4, v11

    move-object/from16 v11, p4

    move-object/from16 v81, v9

    move-object v9, v3

    move-object v3, v8

    move-object/from16 v8, v81

    :goto_4b
    invoke-interface {v0}, LV/n;->x()LV/e1;

    move-result-object v2

    if-eqz v2, :cond_63

    new-instance v1, LS/k1$b;

    move-object v0, v1

    move-object/from16 v79, v1

    move-object/from16 v1, p0

    move-object/from16 v80, v2

    move-object/from16 v2, p1

    move/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move/from16 v27, p27

    invoke-direct/range {v0 .. v27}, LS/k1$b;-><init>(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLS0/g0;LH/v;LH/u;ZIILz/l;Lo0/e2;LS/i1;IIII)V

    move-object/from16 v1, v79

    move-object/from16 v0, v80

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_63
    return-void
.end method

.method public static final b(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;LV/n;II)V
    .locals 35

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    const v0, -0x6d184570

    move-object/from16 v13, p13

    invoke-interface {v13, v0}, LV/n;->r(I)LV/n;

    move-result-object v13

    and-int/lit8 v16, v14, 0x6

    const/16 v17, 0x4

    if-nez v16, :cond_1

    invoke-interface {v13, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_0

    move/from16 v16, v17

    goto :goto_0

    :cond_0
    const/16 v16, 0x2

    :goto_0
    or-int v16, v14, v16

    goto :goto_1

    :cond_1
    move/from16 v16, v14

    :goto_1
    and-int/lit8 v18, v14, 0x30

    const/16 v19, 0x10

    const/16 v20, 0x20

    if-nez v18, :cond_3

    invoke-interface {v13, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    move/from16 v18, v20

    goto :goto_2

    :cond_2
    move/from16 v18, v19

    :goto_2
    or-int v16, v16, v18

    :cond_3
    and-int/lit16 v0, v14, 0x180

    const/16 v18, 0x80

    if-nez v0, :cond_5

    invoke-interface {v13, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    move/from16 v0, v18

    :goto_3
    or-int v16, v16, v0

    :cond_5
    and-int/lit16 v0, v14, 0xc00

    if-nez v0, :cond_7

    invoke-interface {v13, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x800

    goto :goto_4

    :cond_6
    const/16 v0, 0x400

    :goto_4
    or-int v16, v16, v0

    :cond_7
    and-int/lit16 v0, v14, 0x6000

    if-nez v0, :cond_9

    invoke-interface {v13, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4000

    goto :goto_5

    :cond_8
    const/16 v0, 0x2000

    :goto_5
    or-int v16, v16, v0

    :cond_9
    const/high16 v0, 0x30000

    and-int/2addr v0, v14

    if-nez v0, :cond_b

    invoke-interface {v13, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/high16 v0, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v0, 0x10000

    :goto_6
    or-int v16, v16, v0

    :cond_b
    const/high16 v0, 0x180000

    and-int/2addr v0, v14

    if-nez v0, :cond_d

    invoke-interface {v13, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/high16 v0, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v0, 0x80000

    :goto_7
    or-int v16, v16, v0

    :cond_d
    const/high16 v0, 0xc00000

    and-int/2addr v0, v14

    if-nez v0, :cond_f

    invoke-interface {v13, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/high16 v0, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v0, 0x400000

    :goto_8
    or-int v16, v16, v0

    :cond_f
    const/high16 v0, 0x6000000

    and-int/2addr v0, v14

    if-nez v0, :cond_11

    invoke-interface {v13, v9}, LV/n;->d(Z)Z

    move-result v0

    if-eqz v0, :cond_10

    const/high16 v0, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v0, 0x2000000

    :goto_9
    or-int v16, v16, v0

    :cond_11
    const/high16 v0, 0x30000000

    and-int/2addr v0, v14

    if-nez v0, :cond_13

    invoke-interface {v13, v10}, LV/n;->h(F)Z

    move-result v0

    if-eqz v0, :cond_12

    const/high16 v0, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v0, 0x10000000

    :goto_a
    or-int v16, v16, v0

    :cond_13
    move/from16 v0, v16

    and-int/lit8 v16, v15, 0x6

    if-nez v16, :cond_15

    invoke-interface {v13, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    goto :goto_b

    :cond_14
    const/16 v17, 0x2

    :goto_b
    or-int v16, v15, v17

    goto :goto_c

    :cond_15
    move/from16 v16, v15

    :goto_c
    and-int/lit8 v17, v15, 0x30

    if-nez v17, :cond_17

    invoke-interface {v13, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    move/from16 v19, v20

    :cond_16
    or-int v16, v16, v19

    :cond_17
    and-int/lit16 v2, v15, 0x180

    if-nez v2, :cond_19

    move-object/from16 v2, p12

    invoke-interface {v13, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_18

    const/16 v18, 0x100

    :cond_18
    or-int v16, v16, v18

    :goto_d
    move/from16 v14, v16

    goto :goto_e

    :cond_19
    move-object/from16 v2, p12

    goto :goto_d

    :goto_e
    const v16, 0x12492493

    and-int v15, v0, v16

    const v12, 0x12492492

    if-ne v15, v12, :cond_1b

    and-int/lit16 v12, v14, 0x93

    const/16 v15, 0x92

    if-ne v12, v15, :cond_1b

    invoke-interface {v13}, LV/n;->u()Z

    move-result v12

    if-nez v12, :cond_1a

    goto :goto_f

    :cond_1a
    invoke-interface {v13}, LV/n;->A()V

    move-object/from16 v2, p1

    move-object/from16 v12, p11

    move v11, v10

    goto/16 :goto_20

    :cond_1b
    :goto_f
    invoke-static {}, LV/q;->H()Z

    move-result v12

    if-eqz v12, :cond_1c

    const-string v12, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)"

    const v15, -0x6d184570

    invoke-static {v15, v0, v14, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1c
    const/high16 v12, 0xe000000

    and-int/2addr v12, v0

    const/high16 v15, 0x4000000

    if-ne v12, v15, :cond_1d

    const/4 v12, 0x1

    goto :goto_10

    :cond_1d
    const/4 v12, 0x0

    :goto_10
    const/high16 v15, 0x70000000

    and-int/2addr v15, v0

    const/high16 v4, 0x20000000

    if-ne v15, v4, :cond_1e

    const/4 v4, 0x1

    goto :goto_11

    :cond_1e
    const/4 v4, 0x0

    :goto_11
    or-int/2addr v4, v12

    and-int/lit16 v12, v14, 0x380

    const/16 v15, 0x100

    if-ne v12, v15, :cond_1f

    const/4 v12, 0x1

    goto :goto_12

    :cond_1f
    const/4 v12, 0x0

    :goto_12
    or-int/2addr v4, v12

    invoke-interface {v13}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    if-nez v4, :cond_20

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v12, v4, :cond_21

    :cond_20
    new-instance v12, LS/l1;

    invoke-direct {v12, v9, v10, v2}, LS/l1;-><init>(ZFLA/B;)V

    invoke-interface {v13, v12}, LV/n;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v12, LS/l1;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v4

    invoke-interface {v13, v4}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY0/v;

    const/4 v15, 0x0

    invoke-static {v13, v15}, LV/k;->a(LV/n;I)I

    move-result v17

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v15

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    sget-object v18, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v1

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_22

    invoke-static {}, LV/k;->c()V

    :cond_22
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_23

    invoke-interface {v13, v1}, LV/n;->B(Lx7/a;)V

    goto :goto_13

    :cond_23
    invoke-interface {v13}, LV/n;->H()V

    :goto_13
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v1, v12, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v10

    invoke-static {v1, v15, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v10

    invoke-interface {v1}, LV/n;->o()Z

    move-result v12

    if-nez v12, :cond_24

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_25

    :cond_24
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v1, v12}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v1, v12, v10}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_25
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v10

    invoke-static {v1, v9, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    and-int/lit8 v1, v14, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v11, v13, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x4ff5ed83

    invoke-interface {v13, v1}, LV/n;->T(I)V

    if-eqz v5, :cond_2a

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v9, "Leading"

    invoke-static {v1, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {}, LT/A;->k()Landroidx/compose/ui/d;

    move-result-object v9

    invoke-interface {v1, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v9, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v9}, Lh0/c$a;->e()Lh0/c;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v9

    invoke-static {v13, v10}, LV/k;->a(LV/n;I)I

    move-result v12

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_26

    invoke-static {}, LV/k;->c()V

    :cond_26
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_27

    invoke-interface {v13, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_14

    :cond_27
    invoke-interface {v13}, LV/n;->H()V

    :goto_14
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v11

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v11, v9, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v9

    invoke-static {v11, v10, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v9

    invoke-interface {v11}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_28

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_29

    :cond_28
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10, v9}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_29
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v9

    invoke-static {v11, v1, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v0, 0xc

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v13, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    :cond_2a
    invoke-interface {v13}, LV/n;->J()V

    const v1, 0x4ff61126

    invoke-interface {v13, v1}, LV/n;->T(I)V

    if-eqz v6, :cond_2f

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v9, "Trailing"

    invoke-static {v1, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {}, LT/A;->k()Landroidx/compose/ui/d;

    move-result-object v9

    invoke-interface {v1, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v9, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v9}, Lh0/c$a;->e()Lh0/c;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v9

    invoke-static {v13, v10}, LV/k;->a(LV/n;I)I

    move-result v11

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v12

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v15

    instance-of v15, v15, LV/g;

    if-nez v15, :cond_2b

    invoke-static {}, LV/k;->c()V

    :cond_2b
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v15

    if-eqz v15, :cond_2c

    invoke-interface {v13, v12}, LV/n;->B(Lx7/a;)V

    goto :goto_15

    :cond_2c
    invoke-interface {v13}, LV/n;->H()V

    :goto_15
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v12

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v12, v9, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v9

    invoke-static {v12, v10, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v9

    invoke-interface {v12}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_2d

    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2e

    :cond_2d
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10, v9}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_2e
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v9

    invoke-static {v12, v1, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v0, 0xf

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v13, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    :cond_2f
    invoke-interface {v13}, LV/n;->J()V

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/m;->g(LA/B;LY0/v;)F

    move-result v1

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/m;->f(LA/B;LY0/v;)F

    move-result v4

    if-eqz v5, :cond_30

    invoke-static {}, LT/A;->j()F

    move-result v9

    sub-float/2addr v1, v9

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    const/4 v9, 0x0

    int-to-float v10, v9

    invoke-static {v10}, LY0/i;->q(F)F

    move-result v10

    invoke-static {v1, v10}, LE7/j;->c(FF)F

    move-result v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    goto :goto_16

    :cond_30
    const/4 v9, 0x0

    :goto_16
    if-eqz v6, :cond_31

    invoke-static {}, LT/A;->j()F

    move-result v10

    sub-float/2addr v4, v10

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    int-to-float v10, v9

    invoke-static {v10}, LY0/i;->q(F)F

    move-result v9

    invoke-static {v4, v9}, LE7/j;->c(FF)F

    move-result v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    :cond_31
    const v9, 0x4ff688bc    # 8.2723123E9f

    invoke-interface {v13, v9}, LV/n;->T(I)V

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    if-eqz v7, :cond_36

    sget-object v12, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v15, "Prefix"

    invoke-static {v12, v15}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v12

    invoke-static {}, LT/A;->o()F

    move-result v15

    const/4 v2, 0x2

    invoke-static {v12, v15, v9, v2, v11}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v12

    const/4 v2, 0x0

    invoke-static {v12, v11, v2, v10, v11}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v19

    invoke-static {}, LT/A;->p()F

    move-result v22

    const/16 v24, 0xa

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move/from16 v20, v1

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v12, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v12}, Lh0/c$a;->o()Lh0/c;

    move-result-object v12

    const/4 v15, 0x0

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v12

    invoke-static {v13, v15}, LV/k;->a(LV/n;I)I

    move-result v17

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v15

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v10

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v9

    instance-of v9, v9, LV/g;

    if-nez v9, :cond_32

    invoke-static {}, LV/k;->c()V

    :cond_32
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v9

    if-eqz v9, :cond_33

    invoke-interface {v13, v10}, LV/n;->B(Lx7/a;)V

    goto :goto_17

    :cond_33
    invoke-interface {v13}, LV/n;->H()V

    :goto_17
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v9, v12, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v10

    invoke-static {v9, v15, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v10

    invoke-interface {v9}, LV/n;->o()Z

    move-result v12

    if-nez v12, :cond_34

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_35

    :cond_34
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v9, v12}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v9, v12, v10}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_35
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v10

    invoke-static {v9, v2, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v2, v0, 0x12

    and-int/lit8 v2, v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v13, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    :cond_36
    invoke-interface {v13}, LV/n;->J()V

    const v2, 0x4ff6b77a

    invoke-interface {v13, v2}, LV/n;->T(I)V

    if-eqz v8, :cond_3b

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v9, "Suffix"

    invoke-static {v2, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-static {}, LT/A;->o()F

    move-result v9

    const/4 v10, 0x2

    const/4 v12, 0x0

    invoke-static {v2, v9, v12, v10, v11}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static {v2, v11, v9, v10, v11}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v19

    invoke-static {}, LT/A;->p()F

    move-result v20

    const/16 v24, 0xa

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move/from16 v22, v4

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v9, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v9}, Lh0/c$a;->o()Lh0/c;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v9

    invoke-static {v13, v10}, LV/k;->a(LV/n;I)I

    move-result v12

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_37

    invoke-static {}, LV/k;->c()V

    :cond_37
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_38

    invoke-interface {v13, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_18

    :cond_38
    invoke-interface {v13}, LV/n;->H()V

    :goto_18
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v11

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v11, v9, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v9

    invoke-static {v11, v10, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v9

    invoke-interface {v11}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_39

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3a

    :cond_39
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10, v9}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_3a
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v9

    invoke-static {v11, v2, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v2, v0, 0x15

    and-int/lit8 v2, v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v13, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    :cond_3b
    invoke-interface {v13}, LV/n;->J()V

    const v2, 0x4ff6e724

    invoke-interface {v13, v2}, LV/n;->T(I)V

    if-eqz v3, :cond_40

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v9, "Label"

    invoke-static {v2, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-static {}, LT/A;->o()F

    move-result v9

    invoke-static {}, LT/A;->m()F

    move-result v10

    move/from16 v11, p9

    invoke-static {v9, v10, v11}, LY0/j;->c(FFF)F

    move-result v9

    const/4 v10, 0x2

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-static {v2, v9, v12, v10, v15}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static {v2, v15, v9, v10, v15}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v19

    const/16 v24, 0xa

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move/from16 v20, v1

    move/from16 v22, v4

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v9, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v9}, Lh0/c$a;->o()Lh0/c;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v9

    invoke-static {v13, v10}, LV/k;->a(LV/n;I)I

    move-result v12

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    move/from16 v19, v1

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v1

    instance-of v1, v1, LV/g;

    if-nez v1, :cond_3c

    invoke-static {}, LV/k;->c()V

    :cond_3c
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-interface {v13, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_19

    :cond_3d
    invoke-interface {v13}, LV/n;->H()V

    :goto_19
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v1, v9, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v9

    invoke-static {v1, v10, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v9

    invoke-interface {v1}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_3e

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3f

    :cond_3e
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v1, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v1, v10, v9}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_3f
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v9

    invoke-static {v1, v2, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v0, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v13, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    goto :goto_1a

    :cond_40
    move/from16 v11, p9

    move/from16 v19, v1

    :goto_1a
    invoke-interface {v13}, LV/n;->J()V

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {}, LT/A;->o()F

    move-result v2

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v2, v10, v9, v12}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static {v2, v12, v9, v10, v12}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v26

    if-nez v7, :cond_41

    move/from16 v27, v19

    goto :goto_1b

    :cond_41
    int-to-float v2, v9

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    move/from16 v27, v2

    :goto_1b
    if-nez v8, :cond_42

    :goto_1c
    move/from16 v29, v4

    goto :goto_1d

    :cond_42
    int-to-float v2, v9

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    goto :goto_1c

    :goto_1d
    const/16 v31, 0xa

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v26 .. v32}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const v4, 0x4ff75e6b

    invoke-interface {v13, v4}, LV/n;->T(I)V

    move-object/from16 v4, p3

    if-eqz v4, :cond_43

    const-string v9, "Hint"

    invoke-static {v1, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v9

    invoke-interface {v9, v2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    shr-int/lit8 v10, v0, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v9, v13, v10}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_43
    invoke-interface {v13}, LV/n;->J()V

    const-string v9, "TextField"

    invoke-static {v1, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v9

    invoke-interface {v9, v2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v9, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v9}, Lh0/c$a;->o()Lh0/c;

    move-result-object v10

    const/4 v12, 0x1

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v10

    const/4 v12, 0x0

    invoke-static {v13, v12}, LV/k;->a(LV/n;I)I

    move-result v15

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v12

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v3

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v4

    instance-of v4, v4, LV/g;

    if-nez v4, :cond_44

    invoke-static {}, LV/k;->c()V

    :cond_44
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v4

    if-eqz v4, :cond_45

    invoke-interface {v13, v3}, LV/n;->B(Lx7/a;)V

    goto :goto_1e

    :cond_45
    invoke-interface {v13}, LV/n;->H()V

    :goto_1e
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v4

    invoke-static {v3, v10, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v3, v12, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v4

    invoke-interface {v3}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_46

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_47

    :cond_46
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v10, v4}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_47
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v3, v2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v2, 0x3

    shr-int/2addr v0, v2

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p1

    invoke-interface {v2, v13, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    const v0, 0x4ff78960    # 8.3059507E9f

    invoke-interface {v13, v0}, LV/n;->T(I)V

    move-object/from16 v12, p11

    if-eqz v12, :cond_4c

    const-string v0, "Supporting"

    invoke-static {v1, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {}, LT/A;->n()F

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v10, 0x0

    invoke-static {v0, v1, v4, v3, v10}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x3

    invoke-static {v0, v10, v1, v3, v10}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v19, LS/j1;->a:LS/j1;

    const/16 v24, 0xf

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v19 .. v25}, LS/j1;->p(LS/j1;FFFFILjava/lang/Object;)LA/B;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/m;->h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual {v9}, Lh0/c$a;->o()Lh0/c;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v1

    invoke-static {v13, v3}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {v13}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {v13, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface {v13}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_48

    invoke-static {}, LV/k;->c()V

    :cond_48
    invoke-interface {v13}, LV/n;->t()V

    invoke-interface {v13}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_49

    invoke-interface {v13, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_1f

    :cond_49
    invoke-interface {v13}, LV/n;->H()V

    :goto_1f
    invoke-static {v13}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v9, v1, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v9, v4, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v9}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_4a

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4b

    :cond_4a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v9, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v9, v3, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_4b
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v9, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    const/4 v0, 0x3

    shr-int/lit8 v0, v14, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v12, v13, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LV/n;->Q()V

    :cond_4c
    invoke-interface {v13}, LV/n;->J()V

    invoke-interface {v13}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-static {}, LV/q;->P()V

    :cond_4d
    :goto_20
    invoke-interface {v13}, LV/n;->x()LV/e1;

    move-result-object v15

    if-eqz v15, :cond_4e

    new-instance v14, LS/k1$c;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v33, v14

    move/from16 v14, p14

    move-object/from16 v34, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, LS/k1$c;-><init>(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;II)V

    move-object/from16 v1, v33

    move-object/from16 v0, v34

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_4e
    return-void
.end method

.method public static final synthetic c(IIIIIIIIFJFLA/B;)I
    .locals 0

    invoke-static/range {p0 .. p12}, LS/k1;->h(IIIIIIIIFJFLA/B;)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(IIIIIIIJ)I
    .locals 0

    invoke-static/range {p0 .. p8}, LS/k1;->i(IIIIIIIJ)I

    move-result p0

    return p0
.end method

.method public static final synthetic e(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZIIFF)V
    .locals 0

    invoke-static/range {p0 .. p16}, LS/k1;->l(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZIIFF)V

    return-void
.end method

.method public static final synthetic f(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZFLA/B;)V
    .locals 0

    invoke-static/range {p0 .. p13}, LS/k1;->m(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZFLA/B;)V

    return-void
.end method

.method public static final synthetic g(II)I
    .locals 0

    invoke-static {p0, p1}, LS/k1;->o(II)I

    move-result p0

    return p0
.end method

.method private static final h(IIIIIIIIFJFLA/B;)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-interface {p12}, LA/B;->d()F

    move-result v2

    invoke-interface {p12}, LA/B;->c()F

    move-result p12

    add-float/2addr v2, p12

    invoke-static {v2}, LY0/i;->q(F)F

    move-result p12

    mul-float/2addr p12, p11

    if-eqz v1, :cond_1

    invoke-static {}, LT/A;->r()F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    mul-float/2addr v1, p11

    invoke-static {v1, p12, p8}, La1/b;->b(FFF)F

    move-result p12

    :cond_1
    invoke-static {p1, v0, p8}, La1/b;->c(IIF)I

    move-result p11

    filled-new-array {p6, p4, p5, p11}, [I

    move-result-object p4

    invoke-static {p0, p4}, Ll7/a;->g(I[I)I

    move-result p0

    invoke-static {v0, p1, p8}, La1/b;->c(IIF)I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p12, p1

    int-to-float p0, p0

    add-float/2addr p12, p0

    invoke-static {p9, p10}, LY0/b;->m(J)I

    move-result p0

    invoke-static {p12}, LA7/a;->d(F)I

    move-result p1

    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, p7

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private static final i(IIIIIIIJ)I
    .locals 0

    add-int/2addr p2, p3

    add-int/2addr p4, p2

    add-int/2addr p6, p2

    invoke-static {p6, p5}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p4, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p0, p2

    add-int/2addr p0, p1

    invoke-static {p7, p8}, LY0/b;->n(J)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final j(Landroidx/compose/ui/d;LV/G1;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LS/k1$d;

    invoke-direct {v0, p1}, LS/k1$d;-><init>(LV/G1;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final k()F
    .locals 1

    sget v0, LS/k1;->a:F

    return v0
.end method

.method private static final l(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZIIFF)V
    .locals 17

    .prologue
    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p10

    invoke-static/range {v1 .. v7}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    invoke-static/range {p11 .. p11}, LT/A;->t(LD0/X;)I

    move-result v0

    sub-int v0, p2, v0

    if-eqz p6, :cond_0

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v1

    invoke-virtual/range {p6 .. p6}, LD0/X;->w0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lh0/c$c;->a(II)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    if-eqz p4, :cond_2

    if-eqz p12, :cond_1

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, LD0/X;->w0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lh0/c$c;->a(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {}, LT/A;->r()F

    move-result v1

    mul-float v1, v1, p16

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    :goto_0
    sub-int v2, v1, p13

    int-to-float v2, v2

    mul-float v2, v2, p15

    invoke-static {v2}, LA7/a;->d(F)I

    move-result v2

    sub-int v11, v1, v2

    invoke-static/range {p6 .. p6}, LT/A;->v(LD0/X;)I

    move-result v10

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p0

    move-object/from16 v9, p4

    invoke-static/range {v8 .. v14}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_2
    if-eqz p8, :cond_3

    invoke-static/range {p6 .. p6}, LT/A;->v(LD0/X;)I

    move-result v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p8

    move/from16 v4, p14

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_3
    invoke-static/range {p6 .. p6}, LT/A;->v(LD0/X;)I

    move-result v1

    invoke-static/range {p8 .. p8}, LT/A;->v(LD0/X;)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p3

    move v5, v1

    move/from16 v6, p14

    invoke-static/range {v3 .. v9}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    if-eqz p5, :cond_4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p5

    move v5, v1

    move/from16 v6, p14

    invoke-static/range {v3 .. v9}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_4
    if-eqz p9, :cond_5

    invoke-static/range {p7 .. p7}, LT/A;->v(LD0/X;)I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual/range {p9 .. p9}, LD0/X;->I0()I

    move-result v2

    sub-int v12, v1, v2

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v10, p0

    move-object/from16 v11, p9

    move/from16 v13, p14

    invoke-static/range {v10 .. v16}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_5
    if-eqz p7, :cond_6

    invoke-virtual/range {p7 .. p7}, LD0/X;->I0()I

    move-result v1

    sub-int v3, p1, v1

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v1

    invoke-virtual/range {p7 .. p7}, LD0/X;->w0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lh0/c$c;->a(II)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p7

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_6
    if-eqz p11, :cond_7

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p1, p11

    move/from16 p2, v3

    move/from16 p3, v0

    move/from16 p4, v4

    move/from16 p5, v1

    move-object/from16 p6, v2

    invoke-static/range {p0 .. p6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_7
    return-void
.end method

.method private static final m(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZFLA/B;)V
    .locals 20

    .prologue
    move-object/from16 v1, p4

    move-object/from16 v0, p7

    move-object/from16 v9, p8

    move/from16 v10, p11

    sget-object v2, LY0/p;->b:LY0/p$a;

    invoke-virtual {v2}, LY0/p$a;->a()J

    move-result-wide v13

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, p0

    move-object/from16 v12, p9

    invoke-static/range {v11 .. v17}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    invoke-static/range {p10 .. p10}, LT/A;->t(LD0/X;)I

    move-result v2

    sub-int v11, p2, v2

    invoke-interface/range {p13 .. p13}, LA/B;->d()F

    move-result v2

    mul-float v2, v2, p12

    invoke-static {v2}, LA7/a;->d(F)I

    move-result v12

    if-eqz p5, :cond_0

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v2

    invoke-virtual/range {p5 .. p5}, LD0/X;->w0()I

    move-result v3

    invoke-interface {v2, v3, v11}, Lh0/c$c;->a(II)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p5

    invoke-static/range {v2 .. v8}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-static/range {p5 .. p5}, LT/A;->v(LD0/X;)I

    move-result v4

    invoke-static {v10, v11, v12, v0}, LS/k1;->n(ZIILD0/X;)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p7

    invoke-static/range {v2 .. v8}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_1
    invoke-static/range {p5 .. p5}, LT/A;->v(LD0/X;)I

    move-result v2

    invoke-static/range {p7 .. p7}, LT/A;->v(LD0/X;)I

    move-result v0

    add-int/2addr v2, v0

    move-object/from16 v0, p3

    invoke-static {v10, v11, v12, v0}, LS/k1;->n(ZIILD0/X;)I

    move-result v16

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, p0

    move-object/from16 v14, p3

    move v15, v2

    invoke-static/range {v13 .. v19}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    if-eqz v1, :cond_2

    invoke-static {v10, v11, v12, v1}, LS/k1;->n(ZIILD0/X;)I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_2
    if-eqz v9, :cond_3

    invoke-static/range {p6 .. p6}, LT/A;->v(LD0/X;)I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual/range {p8 .. p8}, LD0/X;->I0()I

    move-result v1

    sub-int v2, v0, v1

    invoke-static {v10, v11, v12, v9}, LS/k1;->n(ZIILD0/X;)I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p8

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_3
    if-eqz p6, :cond_4

    invoke-virtual/range {p6 .. p6}, LD0/X;->I0()I

    move-result v0

    sub-int v14, p1, v0

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, LD0/X;->w0()I

    move-result v1

    invoke-interface {v0, v1, v11}, Lh0/c$c;->a(II)I

    move-result v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p0

    move-object/from16 v13, p6

    invoke-static/range {v12 .. v18}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_4
    if-eqz p10, :cond_5

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 p1, p10

    move/from16 p2, v2

    move/from16 p3, v11

    move/from16 p4, v3

    move/from16 p5, v0

    move-object/from16 p6, v1

    invoke-static/range {p0 .. p6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method private static final n(ZIILD0/X;)I
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    sget-object p0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p0}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object p0

    invoke-virtual {p3}, LD0/X;->w0()I

    move-result p2

    invoke-interface {p0, p2, p1}, Lh0/c$c;->a(II)I

    move-result p2

    :cond_0
    return p2
.end method

.method private static final o(II)I
    .locals 1

    .prologue
    const v0, 0x7fffffff

    if-ne p0, v0, :cond_0

    return p0

    :cond_0
    sub-int/2addr p0, p1

    return p0
.end method
