.class public abstract LH/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
    .locals 54

    .prologue
    move-object/from16 v15, p0

    move/from16 v14, p17

    move/from16 v13, p18

    move/from16 v12, p19

    const/high16 v3, 0xc00000

    const/high16 v4, 0x180000

    const/16 v8, 0x100

    const/16 v9, 0x80

    const/16 v10, 0x20

    const/16 v11, 0x10

    const/16 v5, 0x180

    const/4 v6, 0x6

    const v0, -0x3924b996

    move-object/from16 v7, p16

    invoke-interface {v7, v0}, LV/n;->r(I)LV/n;

    move-result-object v7

    const/4 v0, 0x1

    and-int/lit8 v22, v12, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-eqz v22, :cond_0

    or-int/lit8 v22, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v22, v14, 0x6

    if-nez v22, :cond_2

    invoke-interface {v7, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1

    move/from16 v22, v1

    goto :goto_0

    :cond_1
    move/from16 v22, v0

    :goto_0
    or-int v22, v14, v22

    goto :goto_1

    :cond_2
    move/from16 v22, v14

    :goto_1
    and-int/lit8 v24, v12, 0x2

    if-eqz v24, :cond_4

    or-int/lit8 v22, v22, 0x30

    move-object/from16 v0, p1

    :cond_3
    :goto_2
    move/from16 v6, v22

    goto :goto_4

    :cond_4
    and-int/lit8 v24, v14, 0x30

    move-object/from16 v0, p1

    if-nez v24, :cond_3

    invoke-interface {v7, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_5

    move/from16 v25, v10

    goto :goto_3

    :cond_5
    move/from16 v25, v11

    :goto_3
    or-int v22, v22, v25

    goto :goto_2

    :goto_4
    and-int/lit8 v22, v12, 0x4

    if-eqz v22, :cond_7

    or-int/2addr v6, v5

    :cond_6
    move-object/from16 v1, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v1, v14, 0x180

    if-nez v1, :cond_6

    move-object/from16 v1, p2

    invoke-interface {v7, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_8

    move/from16 v27, v8

    goto :goto_5

    :cond_8
    move/from16 v27, v9

    :goto_5
    or-int v6, v6, v27

    :goto_6
    and-int/lit8 v27, v12, 0x8

    if-eqz v27, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v5, v14, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-interface {v7, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_b

    const/16 v29, 0x800

    goto :goto_7

    :cond_b
    const/16 v29, 0x400

    :goto_7
    or-int v6, v6, v29

    :goto_8
    and-int/lit8 v29, v12, 0x10

    if-eqz v29, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v7, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_e

    const/16 v31, 0x4000

    goto :goto_9

    :cond_e
    const/16 v31, 0x2000

    :goto_9
    or-int v6, v6, v31

    :goto_a
    and-int/lit8 v31, v12, 0x20

    const/high16 v32, 0x10000

    const/high16 v33, 0x20000

    const/high16 v34, 0x30000

    if-eqz v31, :cond_f

    or-int v6, v6, v34

    move-object/from16 v10, p5

    goto :goto_c

    :cond_f
    and-int v35, v14, v34

    move-object/from16 v10, p5

    if-nez v35, :cond_11

    invoke-interface {v7, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_10

    move/from16 v36, v33

    goto :goto_b

    :cond_10
    move/from16 v36, v32

    :goto_b
    or-int v6, v6, v36

    :cond_11
    :goto_c
    and-int/lit8 v36, v12, 0x40

    if-eqz v36, :cond_13

    or-int/2addr v6, v4

    :cond_12
    move-object/from16 v4, p6

    goto :goto_e

    :cond_13
    and-int/2addr v4, v14

    if-nez v4, :cond_12

    move-object/from16 v4, p6

    invoke-interface {v7, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_14

    const/high16 v37, 0x100000

    goto :goto_d

    :cond_14
    const/high16 v37, 0x80000

    :goto_d
    or-int v6, v6, v37

    :goto_e
    and-int/lit16 v2, v12, 0x80

    if-eqz v2, :cond_16

    or-int/2addr v6, v3

    :cond_15
    move-object/from16 v3, p7

    goto :goto_10

    :cond_16
    and-int/2addr v3, v14

    if-nez v3, :cond_15

    move-object/from16 v3, p7

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_17

    const/high16 v38, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v38, 0x400000

    :goto_f
    or-int v6, v6, v38

    :goto_10
    and-int/lit16 v9, v12, 0x100

    const/high16 v37, 0x6000000

    if-eqz v9, :cond_18

    or-int v6, v6, v37

    move/from16 v8, p8

    goto :goto_12

    :cond_18
    and-int v37, v14, v37

    move/from16 v8, p8

    if-nez v37, :cond_1a

    invoke-interface {v7, v8}, LV/n;->d(Z)Z

    move-result v39

    if-eqz v39, :cond_19

    const/high16 v39, 0x4000000

    goto :goto_11

    :cond_19
    const/high16 v39, 0x2000000

    :goto_11
    or-int v6, v6, v39

    :cond_1a
    :goto_12
    and-int/lit16 v0, v12, 0x200

    const/high16 v23, 0x30000000

    if-eqz v0, :cond_1c

    :goto_13
    or-int v6, v6, v23

    :cond_1b
    const/16 v1, 0x400

    goto :goto_14

    :cond_1c
    and-int v23, v14, v23

    move/from16 v1, p9

    if-nez v23, :cond_1b

    invoke-interface {v7, v1}, LV/n;->i(I)Z

    move-result v23

    if-eqz v23, :cond_1d

    const/high16 v23, 0x20000000

    goto :goto_13

    :cond_1d
    const/high16 v23, 0x10000000

    goto :goto_13

    :goto_14
    and-int/lit16 v3, v12, 0x400

    const/16 v20, 0x6

    if-eqz v3, :cond_1e

    or-int/lit8 v23, v13, 0x6

    move/from16 v1, p10

    goto :goto_16

    :cond_1e
    and-int/lit8 v23, v13, 0x6

    move/from16 v1, p10

    if-nez v23, :cond_20

    invoke-interface {v7, v1}, LV/n;->i(I)Z

    move-result v23

    if-eqz v23, :cond_1f

    const/16 v23, 0x4

    goto :goto_15

    :cond_1f
    const/16 v23, 0x2

    :goto_15
    or-int v23, v13, v23

    goto :goto_16

    :cond_20
    move/from16 v23, v13

    :goto_16
    and-int/lit8 v39, v13, 0x30

    if-nez v39, :cond_22

    const/16 v1, 0x800

    and-int/lit16 v4, v12, 0x800

    move-object/from16 v1, p11

    if-nez v4, :cond_21

    invoke-interface {v7, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_21

    const/16 v30, 0x20

    goto :goto_17

    :cond_21
    const/16 v30, 0x10

    :goto_17
    or-int v23, v23, v30

    :goto_18
    move/from16 v4, v23

    goto :goto_19

    :cond_22
    move-object/from16 v1, p11

    goto :goto_18

    :goto_19
    and-int/lit16 v1, v12, 0x1000

    const/16 v5, 0x180

    if-eqz v1, :cond_23

    or-int/2addr v4, v5

    :goto_1a
    const/16 v5, 0x2000

    goto :goto_1c

    :cond_23
    and-int/lit16 v8, v13, 0x180

    if-nez v8, :cond_25

    move-object/from16 v8, p12

    invoke-interface {v7, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_24

    const/16 v37, 0x100

    goto :goto_1b

    :cond_24
    const/16 v37, 0x80

    :goto_1b
    or-int v4, v4, v37

    goto :goto_1a

    :cond_25
    move-object/from16 v8, p12

    goto :goto_1a

    :goto_1c
    and-int/lit16 v8, v12, 0x2000

    if-eqz v8, :cond_26

    or-int/lit16 v4, v4, 0xc00

    :goto_1d
    const/16 v5, 0x4000

    goto :goto_1f

    :cond_26
    and-int/lit16 v5, v13, 0xc00

    if-nez v5, :cond_28

    move/from16 v5, p13

    invoke-interface {v7, v5}, LV/n;->d(Z)Z

    move-result v23

    if-eqz v23, :cond_27

    const/16 v20, 0x800

    goto :goto_1e

    :cond_27
    const/16 v20, 0x400

    :goto_1e
    or-int v4, v4, v20

    goto :goto_1d

    :cond_28
    move/from16 v5, p13

    goto :goto_1d

    :goto_1f
    and-int/lit16 v10, v12, 0x4000

    if-eqz v10, :cond_2a

    or-int/lit16 v4, v4, 0x6000

    :cond_29
    move/from16 v5, p14

    goto :goto_21

    :cond_2a
    and-int/lit16 v5, v13, 0x6000

    if-nez v5, :cond_29

    move/from16 v5, p14

    invoke-interface {v7, v5}, LV/n;->d(Z)Z

    move-result v20

    if-eqz v20, :cond_2b

    const/16 v18, 0x4000

    goto :goto_20

    :cond_2b
    const/16 v18, 0x2000

    :goto_20
    or-int v4, v4, v18

    :goto_21
    const v18, 0x8000

    and-int v18, v12, v18

    if-eqz v18, :cond_2c

    or-int v4, v4, v34

    move-object/from16 v5, p15

    goto :goto_22

    :cond_2c
    and-int v20, v13, v34

    move-object/from16 v5, p15

    if-nez v20, :cond_2e

    invoke-interface {v7, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2d

    move/from16 v32, v33

    :cond_2d
    or-int v4, v4, v32

    :cond_2e
    :goto_22
    const v20, 0x12492493

    and-int v5, v6, v20

    const v11, 0x12492492

    if-ne v5, v11, :cond_30

    const v5, 0x12493

    and-int/2addr v5, v4

    const v11, 0x12492

    if-ne v5, v11, :cond_30

    invoke-interface {v7}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_2f

    goto :goto_23

    :cond_2f
    invoke-interface {v7}, LV/n;->A()V

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object v2, v7

    move-object/from16 v7, p6

    goto/16 :goto_59

    :cond_30
    :goto_23
    invoke-interface {v7}, LV/n;->q()V

    const/4 v5, 0x1

    and-int/lit8 v11, v14, 0x1

    const/4 v5, 0x0

    if-eqz v11, :cond_33

    invoke-interface {v7}, LV/n;->G()Z

    move-result v11

    if-eqz v11, :cond_31

    goto :goto_24

    :cond_31
    invoke-interface {v7}, LV/n;->A()V

    const/16 v0, 0x800

    and-int/lit16 v1, v12, 0x800

    if-eqz v1, :cond_32

    and-int/lit8 v4, v4, -0x71

    :cond_32
    move-object/from16 v14, p2

    move-object/from16 v20, p3

    move-object/from16 v13, p4

    move-object/from16 v23, p5

    move-object/from16 v11, p6

    move-object/from16 v22, p7

    move/from16 v27, p8

    move/from16 v10, p9

    move/from16 v29, p10

    move-object/from16 v9, p11

    move-object/from16 v30, p12

    move/from16 v8, p13

    move/from16 v31, p14

    move-object/from16 v32, p15

    goto/16 :goto_34

    :cond_33
    :goto_24
    if-eqz v22, :cond_34

    sget-object v11, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_25

    :cond_34
    move-object/from16 v11, p2

    :goto_25
    if-eqz v27, :cond_35

    sget-object v20, LM0/P;->d:LM0/P$a;

    invoke-virtual/range {v20 .. v20}, LM0/P$a;->a()LM0/P;

    move-result-object v20

    goto :goto_26

    :cond_35
    move-object/from16 v20, p3

    :goto_26
    if-eqz v29, :cond_36

    sget-object v22, LS0/g0;->a:LS0/g0$a;

    invoke-virtual/range {v22 .. v22}, LS0/g0$a;->c()LS0/g0;

    move-result-object v22

    goto :goto_27

    :cond_36
    move-object/from16 v22, p4

    :goto_27
    if-eqz v31, :cond_37

    sget-object v23, LH/h$a;->D:LH/h$a;

    goto :goto_28

    :cond_37
    move-object/from16 v23, p5

    :goto_28
    if-eqz v36, :cond_38

    move-object/from16 v27, v5

    goto :goto_29

    :cond_38
    move-object/from16 v27, p6

    :goto_29
    if-eqz v2, :cond_39

    new-instance v2, Lo0/f2;

    sget-object v29, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual/range {v29 .. v29}, Lo0/y0$a;->g()J

    move-result-wide v13

    invoke-direct {v2, v13, v14, v5}, Lo0/f2;-><init>(JLy7/k;)V

    goto :goto_2a

    :cond_39
    move-object/from16 v2, p7

    :goto_2a
    if-eqz v9, :cond_3a

    const/4 v9, 0x1

    goto :goto_2b

    :cond_3a
    move/from16 v9, p8

    :goto_2b
    if-eqz v0, :cond_3b

    const v0, 0x7fffffff

    goto :goto_2c

    :cond_3b
    move/from16 v0, p9

    :goto_2c
    if-eqz v3, :cond_3c

    const/4 v3, 0x1

    :goto_2d
    const/16 v13, 0x800

    goto :goto_2e

    :cond_3c
    move/from16 v3, p10

    goto :goto_2d

    :goto_2e
    and-int/lit16 v14, v12, 0x800

    if-eqz v14, :cond_3d

    sget-object v13, LS0/s;->g:LS0/s$a;

    invoke-virtual {v13}, LS0/s$a;->a()LS0/s;

    move-result-object v13

    and-int/lit8 v4, v4, -0x71

    goto :goto_2f

    :cond_3d
    move-object/from16 v13, p11

    :goto_2f
    if-eqz v1, :cond_3e

    sget-object v1, LH/u;->g:LH/u$a;

    invoke-virtual {v1}, LH/u$a;->a()LH/u;

    move-result-object v1

    goto :goto_30

    :cond_3e
    move-object/from16 v1, p12

    :goto_30
    if-eqz v8, :cond_3f

    const/4 v8, 0x1

    goto :goto_31

    :cond_3f
    move/from16 v8, p13

    :goto_31
    if-eqz v10, :cond_40

    const/4 v10, 0x0

    goto :goto_32

    :cond_40
    move/from16 v10, p14

    :goto_32
    if-eqz v18, :cond_41

    sget-object v14, LH/e;->a:LH/e;

    invoke-virtual {v14}, LH/e;->a()Lx7/q;

    move-result-object v14

    move-object/from16 v30, v1

    move/from16 v29, v3

    move/from16 v31, v10

    move-object/from16 v32, v14

    move v10, v0

    move-object v14, v11

    move-object/from16 v11, v27

    :goto_33
    move/from16 v27, v9

    move-object v9, v13

    move-object/from16 v13, v22

    move-object/from16 v22, v2

    goto :goto_34

    :cond_41
    move-object/from16 v32, p15

    move-object/from16 v30, v1

    move/from16 v29, v3

    move/from16 v31, v10

    move-object v14, v11

    move-object/from16 v11, v27

    move v10, v0

    goto :goto_33

    :goto_34
    invoke-interface {v7}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_42

    const-string v0, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)"

    const v1, -0x3924b996

    invoke-static {v1, v6, v4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_42
    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_43

    new-instance v0, Landroidx/compose/ui/focus/n;

    invoke-direct {v0}, Landroidx/compose/ui/focus/n;-><init>()V

    invoke-interface {v7, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_43
    check-cast v0, Landroidx/compose/ui/focus/n;

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_44

    invoke-static {}, LK/r0;->b()LK/q0;

    move-result-object v2

    invoke-interface {v7, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_44
    check-cast v2, LK/q0;

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_45

    new-instance v3, LS0/X;

    invoke-direct {v3, v2}, LS0/X;-><init>(LS0/P;)V

    invoke-interface {v7, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_45
    check-cast v3, LS0/X;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v21, v5

    check-cast v21, LY0/e;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->g()LV/O0;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LR0/h$b;

    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object v12

    invoke-interface {v7, v12}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LN/J;

    invoke-virtual {v12}, LN/J;->a()J

    move-result-wide v33

    invoke-static {}, Landroidx/compose/ui/platform/p0;->f()LV/O0;

    move-result-object v12

    invoke-interface {v7, v12}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm0/f;

    move-object/from16 v36, v14

    invoke-static {}, Landroidx/compose/ui/platform/p0;->s()LV/O0;

    move-result-object v14

    invoke-interface {v7, v14}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/platform/J1;

    move-object/from16 p14, v2

    invoke-static {}, Landroidx/compose/ui/platform/p0;->o()LV/O0;

    move-result-object v2

    invoke-interface {v7, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/s1;

    move-object/from16 p15, v14

    const/4 v14, 0x1

    if-ne v10, v14, :cond_46

    if-nez v27, :cond_46

    invoke-virtual {v9}, LS0/s;->h()Z

    move-result v37

    if-eqz v37, :cond_46

    sget-object v37, Lx/s;->D:Lx/s;

    :goto_35
    move/from16 v38, v10

    move-object/from16 v10, v37

    move-object/from16 v37, v11

    goto :goto_36

    :cond_46
    sget-object v37, Lx/s;->C:Lx/s;

    goto :goto_35

    :goto_36
    new-array v11, v14, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v10, v11, v14

    sget-object v14, LH/Q;->f:LH/Q$c;

    invoke-virtual {v14}, LH/Q$c;->a()Le0/j;

    move-result-object v14

    invoke-interface {v7, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v39

    move-object/from16 v40, v9

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v9

    if-nez v39, :cond_47

    move-object/from16 v39, v3

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_48

    goto :goto_37

    :cond_47
    move-object/from16 v39, v3

    :goto_37
    new-instance v9, LH/h$m;

    invoke-direct {v9, v10}, LH/h$m;-><init>(Lx/s;)V

    invoke-interface {v7, v9}, LV/n;->K(Ljava/lang/Object;)V

    :cond_48
    move-object v3, v9

    check-cast v3, Lx7/a;

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/16 v41, 0x0

    move-object/from16 p2, v11

    move-object/from16 p3, v14

    move-object/from16 p4, v41

    move-object/from16 p5, v3

    move-object/from16 p6, v7

    move/from16 p7, v9

    move/from16 p8, v10

    invoke-static/range {p2 .. p8}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, LH/Q;

    and-int/lit8 v3, v6, 0xe

    const/4 v10, 0x4

    if-ne v3, v10, :cond_49

    const/4 v10, 0x1

    goto :goto_38

    :cond_49
    const/4 v10, 0x0

    :goto_38
    const v11, 0xe000

    and-int/2addr v6, v11

    const/16 v11, 0x4000

    if-ne v6, v11, :cond_4a

    const/4 v6, 0x1

    goto :goto_39

    :cond_4a
    const/4 v6, 0x0

    :goto_39
    or-int/2addr v6, v10

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_4b

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v10, v6, :cond_4e

    :cond_4b
    invoke-virtual/range {p0 .. p0}, LS0/V;->f()LM0/d;

    move-result-object v6

    invoke-static {v13, v6}, LH/c0;->c(LS0/g0;LM0/d;)LS0/e0;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LS0/V;->g()LM0/N;

    move-result-object v10

    if-eqz v10, :cond_4c

    invoke-virtual {v10}, LM0/N;->r()J

    move-result-wide v10

    sget-object v14, LH/H;->a:LH/H$a;

    invoke-virtual {v14, v10, v11, v6}, LH/H$a;->a(JLS0/e0;)LS0/e0;

    move-result-object v10

    if-nez v10, :cond_4d

    :cond_4c
    move-object v10, v6

    :cond_4d
    invoke-interface {v7, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4e
    move-object v6, v10

    check-cast v6, LS0/e0;

    invoke-virtual {v6}, LS0/e0;->b()LM0/d;

    move-result-object v10

    invoke-virtual {v6}, LS0/e0;->a()LS0/L;

    move-result-object v14

    move-object/from16 v41, v9

    const/4 v11, 0x0

    invoke-static {v7, v11}, LV/k;->b(LV/n;I)LV/Q0;

    move-result-object v9

    invoke-interface {v7, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    move-object/from16 v42, v6

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_4f

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v6, v11, :cond_50

    :cond_4f
    new-instance v6, LH/w;

    new-instance v11, LH/D;

    const/16 v43, 0x12c

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 p2, v11

    move-object/from16 p3, v10

    move-object/from16 p4, v20

    move/from16 p5, v45

    move/from16 p6, v46

    move/from16 p7, v27

    move/from16 p8, v47

    move-object/from16 p9, v21

    move-object/from16 p10, v5

    move-object/from16 p11, v48

    move/from16 p12, v43

    move-object/from16 p13, v44

    invoke-direct/range {p2 .. p13}, LH/D;-><init>(LM0/d;LM0/P;IIZILY0/e;LR0/h$b;Ljava/util/List;ILy7/k;)V

    invoke-direct {v6, v11, v9, v2}, LH/w;-><init>(LH/D;LV/Q0;Landroidx/compose/ui/platform/s1;)V

    invoke-interface {v7, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_50
    move-object v2, v6

    check-cast v2, LH/w;

    invoke-virtual/range {p0 .. p0}, LS0/V;->f()LM0/d;

    move-result-object v6

    move-object/from16 p2, v2

    move-object/from16 p3, v6

    move-object/from16 p4, v10

    move-object/from16 p5, v20

    move/from16 p6, v27

    move-object/from16 p7, v21

    move-object/from16 p8, v5

    move-object/from16 p9, p1

    move-object/from16 p10, v30

    move-object/from16 p11, v12

    move-wide/from16 p12, v33

    invoke-virtual/range {p2 .. p13}, LH/w;->N(LM0/d;LM0/d;LM0/P;ZLY0/e;LR0/h$b;Lx7/l;LH/u;Lm0/f;J)V

    invoke-virtual {v2}, LH/w;->n()LS0/k;

    move-result-object v5

    invoke-virtual {v2}, LH/w;->g()LS0/d0;

    move-result-object v6

    invoke-virtual {v5, v15, v6}, LS0/k;->d(LS0/V;LS0/d0;)V

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_51

    new-instance v5, LH/Y;

    const/4 v6, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct {v5, v10, v6, v9}, LH/Y;-><init>(IILy7/k;)V

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_51
    check-cast v5, LH/Y;

    const/4 v6, 0x2

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object/from16 p2, v5

    move-object/from16 p3, p0

    move-wide/from16 p4, v10

    move/from16 p6, v6

    move-object/from16 p7, v9

    invoke-static/range {p2 .. p7}, LH/Y;->f(LH/Y;LS0/V;JILjava/lang/Object;)V

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_52

    new-instance v6, LN/F;

    invoke-direct {v6, v5}, LN/F;-><init>(LH/Y;)V

    invoke-interface {v7, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_52
    move-object v11, v6

    check-cast v11, LN/F;

    invoke-virtual {v11, v14}, LN/F;->e0(LS0/L;)V

    invoke-virtual {v11, v13}, LN/F;->k0(LS0/g0;)V

    invoke-virtual {v2}, LH/w;->m()Lx7/l;

    move-result-object v6

    invoke-virtual {v11, v6}, LN/F;->f0(Lx7/l;)V

    invoke-virtual {v11, v2}, LN/F;->h0(LH/w;)V

    invoke-virtual {v11, v15}, LN/F;->j0(LS0/V;)V

    invoke-static {}, Landroidx/compose/ui/platform/p0;->d()LV/O0;

    move-result-object v6

    invoke-interface {v7, v6}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/platform/m0;

    invoke-virtual {v11, v6}, LN/F;->V(Landroidx/compose/ui/platform/m0;)V

    invoke-static {}, Landroidx/compose/ui/platform/p0;->p()LV/O0;

    move-result-object v6

    invoke-interface {v7, v6}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/platform/t1;

    invoke-virtual {v11, v6}, LN/F;->i0(Landroidx/compose/ui/platform/t1;)V

    invoke-static {}, Landroidx/compose/ui/platform/p0;->i()LV/O0;

    move-result-object v6

    invoke-interface {v7, v6}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv0/a;

    invoke-virtual {v11, v6}, LN/F;->d0(Lv0/a;)V

    invoke-virtual {v11, v0}, LN/F;->b0(Landroidx/compose/ui/focus/n;)V

    const/4 v6, 0x1

    xor-int/lit8 v9, v31, 0x1

    invoke-virtual {v11, v9}, LN/F;->Z(Z)V

    invoke-virtual {v11, v8}, LN/F;->a0(Z)V

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_53

    sget-object v6, Lm7/j;->C:Lm7/j;

    invoke-static {v6, v7}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v6

    new-instance v9, LV/C;

    invoke-direct {v9, v6}, LV/C;-><init>(LW8/N;)V

    invoke-interface {v7, v9}, LV/n;->K(Ljava/lang/Object;)V

    move-object v6, v9

    :cond_53
    check-cast v6, LV/C;

    invoke-virtual {v6}, LV/C;->a()LW8/N;

    move-result-object v6

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_54

    invoke-static {}, Landroidx/compose/foundation/relocation/b;->a()LE/b;

    move-result-object v9

    invoke-interface {v7, v9}, LV/n;->K(Ljava/lang/Object;)V

    :cond_54
    move-object v10, v9

    check-cast v10, LE/b;

    sget-object v9, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v33

    move-object/from16 p13, v12

    and-int/lit16 v12, v4, 0x1c00

    move-object/from16 v34, v5

    const/16 v5, 0x800

    if-ne v12, v5, :cond_55

    const/4 v5, 0x1

    goto :goto_3a

    :cond_55
    const/4 v5, 0x0

    :goto_3a
    or-int v5, v33, v5

    const v33, 0xe000

    move-object/from16 v43, v13

    and-int v13, v4, v33

    const/16 v15, 0x4000

    if-ne v13, v15, :cond_56

    const/4 v15, 0x1

    goto :goto_3b

    :cond_56
    const/4 v15, 0x0

    :goto_3b
    or-int/2addr v5, v15

    move-object/from16 v15, v39

    invoke-interface {v7, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v33

    or-int v5, v5, v33

    move/from16 v33, v12

    const/4 v12, 0x4

    if-ne v3, v12, :cond_57

    const/4 v12, 0x1

    goto :goto_3c

    :cond_57
    const/4 v12, 0x0

    :goto_3c
    or-int/2addr v5, v12

    and-int/lit8 v12, v4, 0x70

    xor-int/lit8 v12, v12, 0x30

    move/from16 v39, v3

    const/16 v3, 0x20

    if-le v12, v3, :cond_59

    move-object/from16 v3, v40

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v40

    if-nez v40, :cond_58

    :goto_3d
    move/from16 v40, v13

    goto :goto_3e

    :cond_58
    move/from16 v44, v4

    move/from16 v40, v13

    goto :goto_3f

    :cond_59
    move-object/from16 v3, v40

    goto :goto_3d

    :goto_3e
    and-int/lit8 v13, v4, 0x30

    move/from16 v44, v4

    const/16 v4, 0x20

    if-ne v13, v4, :cond_5a

    :goto_3f
    const/4 v4, 0x1

    goto :goto_40

    :cond_5a
    const/4 v4, 0x0

    :goto_40
    or-int/2addr v4, v5

    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {v7, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {v7, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5b

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_5c

    :cond_5b
    new-instance v5, LH/h$i;

    move-object/from16 p2, v5

    move-object/from16 p3, v2

    move/from16 p4, v8

    move/from16 p5, v31

    move-object/from16 p6, v15

    move-object/from16 p7, p0

    move-object/from16 p8, v3

    move-object/from16 p9, v14

    move-object/from16 p10, v11

    move-object/from16 p11, v6

    move-object/from16 p12, v10

    invoke-direct/range {p2 .. p12}, LH/h$i;-><init>(LH/w;ZZLS0/X;LS0/V;LS0/s;LS0/L;LN/F;LW8/N;LE/b;)V

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5c
    check-cast v5, Lx7/l;

    move-object/from16 v13, v37

    invoke-static {v9, v8, v0, v13, v5}, LH/K;->a(Landroidx/compose/ui/d;ZLandroidx/compose/ui/focus/n;Lz/l;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v4

    if-eqz v8, :cond_5d

    if-nez v31, :cond_5d

    const/4 v5, 0x1

    goto :goto_41

    :cond_5d
    const/4 v5, 0x0

    :goto_41
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v7, v6}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v5

    sget-object v6, Li7/M;->a:Li7/M;

    invoke-interface {v7, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v37

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v45

    or-int v37, v37, v45

    invoke-interface {v7, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v45

    or-int v37, v37, v45

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v45

    or-int v37, v37, v45

    move-object/from16 v45, v10

    const/16 v10, 0x20

    if-le v12, v10, :cond_5e

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v35

    if-nez v35, :cond_5f

    :cond_5e
    move-object/from16 v46, v4

    goto :goto_42

    :cond_5f
    move-object/from16 v46, v4

    goto :goto_43

    :goto_42
    and-int/lit8 v4, v44, 0x30

    if-ne v4, v10, :cond_60

    :goto_43
    const/4 v4, 0x1

    goto :goto_44

    :cond_60
    const/4 v4, 0x0

    :goto_44
    or-int v4, v37, v4

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_61

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_62

    :cond_61
    new-instance v10, LH/h$b;

    const/4 v4, 0x0

    move-object/from16 p2, v10

    move-object/from16 p3, v2

    move-object/from16 p4, v5

    move-object/from16 p5, v15

    move-object/from16 p6, v11

    move-object/from16 p7, v3

    move-object/from16 p8, v4

    invoke-direct/range {p2 .. p8}, LH/h$b;-><init>(LH/w;LV/G1;LS0/X;LN/F;LS0/s;Lm7/e;)V

    invoke-interface {v7, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_62
    check-cast v10, Lx7/p;

    const/4 v4, 0x6

    invoke-static {v6, v10, v7, v4}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_63

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_64

    :cond_63
    new-instance v6, LH/h$k;

    invoke-direct {v6, v2}, LH/h$k;-><init>(LH/w;)V

    invoke-interface {v7, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_64
    check-cast v6, Lx7/l;

    invoke-static {v9, v6}, LN/s;->k(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v25, v5

    move/from16 v10, v40

    const/16 v5, 0x4000

    if-ne v10, v5, :cond_65

    const/4 v5, 0x1

    goto :goto_45

    :cond_65
    const/4 v5, 0x0

    :goto_45
    or-int/2addr v5, v6

    move/from16 v6, v33

    move-object/from16 v33, v15

    const/16 v15, 0x800

    if-ne v6, v15, :cond_66

    const/4 v15, 0x1

    goto :goto_46

    :cond_66
    const/4 v15, 0x0

    :goto_46
    or-int/2addr v5, v15

    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v5, v15

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v5, v15

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v15

    if-nez v5, :cond_67

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v15, v5, :cond_68

    :cond_67
    new-instance v15, LH/h$l;

    move-object/from16 p2, v15

    move-object/from16 p3, v2

    move-object/from16 p4, v0

    move/from16 p5, v31

    move/from16 p6, v8

    move-object/from16 p7, v11

    move-object/from16 p8, v14

    invoke-direct/range {p2 .. p8}, LH/h$l;-><init>(LH/w;Landroidx/compose/ui/focus/n;ZZLN/F;LS0/L;)V

    invoke-interface {v7, v15}, LV/n;->K(Ljava/lang/Object;)V

    :cond_68
    check-cast v15, Lx7/l;

    invoke-static {v4, v13, v8, v15}, LH/O;->a(Landroidx/compose/ui/d;Lz/l;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-virtual {v11}, LN/F;->I()LN/h;

    move-result-object v5

    invoke-virtual {v11}, LN/F;->M()LH/F;

    move-result-object v15

    invoke-static {v4, v5, v15}, LN/s;->i(Landroidx/compose/ui/d;LN/h;LH/F;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {}, LH/X;->a()Lz0/w;

    move-result-object v5

    move-object/from16 v18, v0

    move-object/from16 v37, v13

    const/4 v0, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x2

    invoke-static {v4, v5, v0, v15, v13}, Lz0/x;->b(Landroidx/compose/ui/d;Lz0/w;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v13, v39

    const/4 v5, 0x4

    if-ne v13, v5, :cond_69

    const/4 v5, 0x1

    goto :goto_47

    :cond_69
    const/4 v5, 0x0

    :goto_47
    or-int/2addr v0, v5

    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_6b

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_6a

    goto :goto_48

    :cond_6a
    move-object/from16 v15, p0

    goto :goto_49

    :cond_6b
    :goto_48
    new-instance v5, LH/h$h;

    move-object/from16 v15, p0

    invoke-direct {v5, v2, v15, v14}, LH/h$h;-><init>(LH/w;LS0/V;LS0/L;)V

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    :goto_49
    check-cast v5, Lx7/l;

    invoke-static {v9, v5}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v24

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    const/16 v5, 0x800

    if-ne v6, v5, :cond_6c

    const/4 v5, 0x1

    goto :goto_4a

    :cond_6c
    const/4 v5, 0x0

    :goto_4a
    or-int/2addr v0, v5

    move-object/from16 v5, p15

    invoke-interface {v7, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v39

    or-int v0, v0, v39

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v39

    or-int v0, v0, v39

    move-object/from16 p15, v4

    const/4 v4, 0x4

    if-ne v13, v4, :cond_6d

    const/4 v4, 0x1

    goto :goto_4b

    :cond_6d
    const/4 v4, 0x0

    :goto_4b
    or-int/2addr v0, v4

    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_6e

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_6f

    :cond_6e
    new-instance v4, LH/h$j;

    move-object/from16 p2, v4

    move-object/from16 p3, v2

    move/from16 p4, v8

    move-object/from16 p5, v5

    move-object/from16 p6, v11

    move-object/from16 p7, p0

    move-object/from16 p8, v14

    invoke-direct/range {p2 .. p8}, LH/h$j;-><init>(LH/w;ZLandroidx/compose/ui/platform/J1;LN/F;LS0/V;LS0/L;)V

    invoke-interface {v7, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6f
    check-cast v4, Lx7/l;

    invoke-static {v9, v4}, Landroidx/compose/ui/layout/c;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v39

    move-object/from16 v4, v43

    instance-of v0, v4, LS0/N;

    move-object/from16 v4, v42

    invoke-interface {v7, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v40

    const/4 v15, 0x4

    if-ne v13, v15, :cond_70

    const/4 v15, 0x1

    goto :goto_4c

    :cond_70
    const/4 v15, 0x0

    :goto_4c
    or-int v15, v40, v15

    move/from16 v40, v13

    const/16 v13, 0x800

    if-ne v6, v13, :cond_71

    const/4 v6, 0x1

    goto :goto_4d

    :cond_71
    const/4 v6, 0x0

    :goto_4d
    or-int/2addr v6, v15

    invoke-interface {v7, v0}, LV/n;->d(Z)Z

    move-result v13

    or-int/2addr v6, v13

    const/16 v13, 0x4000

    if-ne v10, v13, :cond_72

    const/4 v10, 0x1

    goto :goto_4e

    :cond_72
    const/4 v10, 0x0

    :goto_4e
    or-int/2addr v6, v10

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    const/16 v10, 0x20

    if-le v12, v10, :cond_73

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_74

    :cond_73
    and-int/lit8 v13, v44, 0x30

    if-ne v13, v10, :cond_75

    :cond_74
    const/4 v10, 0x1

    goto :goto_4f

    :cond_75
    const/4 v10, 0x0

    :goto_4f
    or-int/2addr v6, v10

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_76

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v10, v6, :cond_77

    :cond_76
    new-instance v10, LH/h$n;

    move-object/from16 p2, v10

    move-object/from16 p3, v4

    move-object/from16 p4, p0

    move/from16 p5, v8

    move/from16 p6, v0

    move/from16 p7, v31

    move-object/from16 p8, v3

    move-object/from16 p9, v2

    move-object/from16 p10, v14

    move-object/from16 p11, v11

    move-object/from16 p12, v18

    invoke-direct/range {p2 .. p12}, LH/h$n;-><init>(LS0/e0;LS0/V;ZZZLS0/s;LH/w;LS0/L;LN/F;Landroidx/compose/ui/focus/n;)V

    invoke-interface {v7, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_77
    check-cast v10, Lx7/l;

    const/4 v0, 0x1

    invoke-static {v9, v0, v10}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object v4

    if-eqz v8, :cond_78

    if-nez v31, :cond_78

    invoke-interface {v5}, Landroidx/compose/ui/platform/J1;->a()Z

    move-result v0

    if-eqz v0, :cond_78

    invoke-virtual {v2}, LH/w;->x()Z

    move-result v0

    if-nez v0, :cond_78

    const/4 v0, 0x1

    goto :goto_50

    :cond_78
    const/4 v0, 0x0

    :goto_50
    move-object/from16 p2, v9

    move-object/from16 p3, v2

    move-object/from16 p4, p0

    move-object/from16 p5, v14

    move-object/from16 p6, v22

    move/from16 p7, v0

    invoke-static/range {p2 .. p7}, LH/G;->a(Landroidx/compose/ui/d;LH/w;LS0/V;LS0/L;Lo0/n0;Z)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-interface {v7, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_79

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_7a

    :cond_79
    new-instance v6, LH/h$c;

    invoke-direct {v6, v11}, LH/h$c;-><init>(LN/F;)V

    invoke-interface {v7, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7a
    check-cast v6, Lx7/l;

    const/4 v0, 0x0

    invoke-static {v11, v6, v7, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v13, v33

    invoke-interface {v7, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v6, v15

    move/from16 v0, v40

    const/4 v15, 0x4

    if-ne v0, v15, :cond_7b

    const/4 v0, 0x1

    goto :goto_51

    :cond_7b
    const/4 v0, 0x0

    :goto_51
    or-int/2addr v0, v6

    const/16 v6, 0x20

    if-le v12, v6, :cond_7c

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7d

    :cond_7c
    and-int/lit8 v15, v44, 0x30

    if-ne v15, v6, :cond_7e

    :cond_7d
    const/4 v6, 0x1

    goto :goto_52

    :cond_7e
    const/4 v6, 0x0

    :goto_52
    or-int/2addr v0, v6

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_80

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_7f

    goto :goto_53

    :cond_7f
    move-object/from16 v15, p0

    goto :goto_54

    :cond_80
    :goto_53
    new-instance v6, LH/h$d;

    move-object/from16 v15, p0

    invoke-direct {v6, v2, v13, v15, v3}, LH/h$d;-><init>(LH/w;LS0/X;LS0/V;LS0/s;)V

    invoke-interface {v7, v6}, LV/n;->K(Ljava/lang/Object;)V

    :goto_54
    check-cast v6, Lx7/l;

    shr-int/lit8 v0, v44, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v6, v7, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-virtual {v2}, LH/w;->m()Lx7/l;

    move-result-object v0

    const/4 v6, 0x1

    xor-int/lit8 v13, v31, 0x1

    move/from16 v15, v38

    if-ne v15, v6, :cond_81

    move/from16 v17, v6

    goto :goto_55

    :cond_81
    const/16 v17, 0x0

    :goto_55
    invoke-virtual {v3}, LS0/s;->e()I

    move-result v19

    move-object/from16 p2, v9

    move-object/from16 p3, v2

    move-object/from16 p4, v11

    move-object/from16 p5, p0

    move-object/from16 p6, v0

    move/from16 p7, v13

    move/from16 p8, v17

    move-object/from16 p9, v14

    move-object/from16 p10, v34

    move/from16 p11, v19

    invoke-static/range {p2 .. p11}, LH/M;->a(Landroidx/compose/ui/d;LH/w;LN/F;LS0/V;Lx7/l;ZZLS0/L;LH/Y;I)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static/range {v25 .. v25}, LH/h;->b(LV/G1;)Z

    move-result v13

    invoke-interface {v7, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    const/16 v6, 0x20

    if-le v12, v6, :cond_82

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_83

    :cond_82
    and-int/lit8 v12, v44, 0x30

    if-ne v12, v6, :cond_84

    :cond_83
    const/4 v6, 0x1

    goto :goto_56

    :cond_84
    const/4 v6, 0x0

    :goto_56
    or-int v6, v17, v6

    move-object/from16 v12, p14

    invoke-interface {v7, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    or-int v6, v6, v17

    move-object/from16 p2, v14

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    if-nez v6, :cond_85

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_86

    :cond_85
    new-instance v14, LH/h$o;

    move-object/from16 v1, v18

    invoke-direct {v14, v2, v1, v3, v12}, LH/h$o;-><init>(LH/w;Landroidx/compose/ui/focus/n;LS0/s;LK/q0;)V

    invoke-interface {v7, v14}, LV/n;->K(Ljava/lang/Object;)V

    :cond_86
    check-cast v14, Lx7/a;

    invoke-static {v9, v13, v14}, Landroidx/compose/foundation/text/handwriting/a;->c(Landroidx/compose/ui/d;ZLx7/a;)Landroidx/compose/ui/d;

    move-result-object v1

    move-object/from16 v14, v36

    invoke-static {v14, v12, v2, v11}, Landroidx/compose/foundation/text/input/internal/a;->a(Landroidx/compose/ui/d;LK/q0;LH/w;LN/F;)Landroidx/compose/ui/d;

    move-result-object v6

    invoke-interface {v6, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    move-object/from16 v6, v46

    invoke-interface {v1, v6}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    move-object/from16 v12, p13

    invoke-static {v1, v2, v12}, LH/J;->b(Landroidx/compose/ui/d;LH/w;Lm0/f;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {v1, v2, v11}, LH/h;->p(Landroidx/compose/ui/d;LH/w;LN/F;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    move-object/from16 v12, v37

    move-object/from16 v6, v41

    invoke-static {v0, v6, v12, v8}, LH/P;->d(Landroidx/compose/ui/d;LH/Q;Lz/l;Z)Landroidx/compose/ui/d;

    move-result-object v0

    move-object/from16 v1, p15

    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-interface {v0, v4}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    new-instance v1, LH/h$g;

    invoke-direct {v1, v2}, LH/h$g;-><init>(LH/w;)V

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/c;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v13

    if-eqz v8, :cond_87

    invoke-virtual {v2}, LH/w;->e()Z

    move-result v0

    if-eqz v0, :cond_87

    invoke-virtual {v2}, LH/w;->y()Z

    move-result v0

    if-eqz v0, :cond_87

    invoke-interface {v5}, Landroidx/compose/ui/platform/J1;->a()Z

    move-result v0

    if-eqz v0, :cond_87

    const/16 v16, 0x1

    goto :goto_57

    :cond_87
    const/16 v16, 0x0

    :goto_57
    if-eqz v16, :cond_88

    invoke-static {v9, v11}, LN/H;->c(Landroidx/compose/ui/d;LN/F;)Landroidx/compose/ui/d;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_58

    :cond_88
    move-object/from16 v17, v9

    :goto_58
    new-instance v9, LH/h$e;

    const/4 v5, 0x1

    move-object v0, v9

    move-object/from16 v1, v32

    move-object/from16 v18, v3

    move-object/from16 v3, v20

    move-object/from16 v19, v43

    move/from16 v4, v29

    move v5, v15

    move-object/from16 v49, v7

    move-object/from16 v7, p0

    move/from16 v25, v8

    move-object/from16 v8, v19

    move-object/from16 v50, v9

    move-object/from16 v26, v18

    move-object v9, v10

    move/from16 v28, v15

    move-object/from16 v15, v45

    move-object/from16 v10, v24

    move-object/from16 v24, v12

    move-object v12, v11

    move-object/from16 v11, v39

    move-object/from16 p3, v12

    move-object/from16 v12, v17

    move-object/from16 v51, v13

    move-object/from16 v33, v19

    move-object v13, v15

    move-object/from16 v18, p2

    move-object/from16 v34, v14

    move-object/from16 v14, p3

    move/from16 v15, v16

    move/from16 v16, v31

    move-object/from16 v17, v23

    move-object/from16 v19, v21

    invoke-direct/range {v0 .. v19}, LH/h$e;-><init>(Lx7/q;LH/w;LM0/P;IILH/Q;LS0/V;LS0/g0;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;LE/b;LN/F;ZZLx7/l;LS0/L;LY0/e;)V

    const/16 v0, 0x36

    const v1, -0x164ff220

    move-object/from16 v2, v49

    move-object/from16 v4, v50

    const/4 v3, 0x1

    invoke-static {v1, v3, v4, v2, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    move-object/from16 v6, p3

    move-object/from16 v1, v51

    const/16 v3, 0x180

    invoke-static {v1, v6, v0, v2, v3}, LH/h;->c(Landroidx/compose/ui/d;LN/F;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_89

    invoke-static {}, LV/q;->P()V

    :cond_89
    move-object/from16 v4, v20

    move-object/from16 v8, v22

    move-object/from16 v6, v23

    move-object/from16 v7, v24

    move/from16 v14, v25

    move-object/from16 v12, v26

    move/from16 v9, v27

    move/from16 v10, v28

    move/from16 v11, v29

    move-object/from16 v13, v30

    move/from16 v15, v31

    move-object/from16 v16, v32

    move-object/from16 v5, v33

    move-object/from16 v3, v34

    :goto_59
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v2

    if-eqz v2, :cond_8a

    new-instance v1, LH/h$f;

    move-object v0, v1

    move-object/from16 v52, v1

    move-object/from16 v1, p0

    move-object/from16 v53, v2

    move-object/from16 v2, p1

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, LH/h$f;-><init>(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;III)V

    move-object/from16 v1, v52

    move-object/from16 v0, v53

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_8a
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

.method private static final c(Landroidx/compose/ui/d;LN/F;Lx7/p;LV/n;I)V
    .locals 8

    .prologue
    const v0, -0x1399887

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

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

    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

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

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LV/n;->A()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->o()Lh0/c;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p3, v2}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface {p3}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {p3, p0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v4

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    invoke-interface {p3}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_9

    invoke-static {}, LV/k;->c()V

    :cond_9
    invoke-interface {p3}, LV/n;->t()V

    invoke-interface {p3}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {p3, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {p3}, LV/n;->H()V

    :goto_5
    invoke-static {p3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v0, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v0

    invoke-static {v6, v3, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v6}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v2, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_c
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v6, v4, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, p3, v0}, LH/f;->a(LN/F;Lx7/p;LV/n;I)V

    invoke-interface {p3}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LV/q;->P()V

    :cond_d
    :goto_6
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_e

    new-instance v0, LH/h$p;

    invoke-direct {v0, p0, p1, p2, p4}, LH/h$p;-><init>(Landroidx/compose/ui/d;LN/F;Lx7/p;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_e
    return-void
.end method

.method private static final d(LN/F;ZLV/n;I)V
    .locals 8

    .prologue
    const v0, 0x25552d88

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LV/n;->d(Z)Z

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

    invoke-interface {p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_e

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    if-eqz p1, :cond_11

    const v0, -0x4caa8122

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LH/V;->f()LM0/K;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, LH/w;->z()Z

    move-result v4

    goto :goto_4

    :cond_7
    move v4, v3

    :goto_4
    xor-int/2addr v4, v3

    if-eqz v4, :cond_8

    move-object v2, v0

    :cond_8
    if-nez v2, :cond_a

    const v0, -0x4ca6908c

    invoke-interface {p2, v0}, LV/n;->T(I)V

    :cond_9
    :goto_5
    invoke-interface {p2}, LV/n;->J()V

    goto/16 :goto_c

    :cond_a
    const v0, -0x4ca6908b

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v0

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->h(J)Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_d

    const v0, -0x642c2aa0

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-virtual {p0}, LN/F;->J()LS0/L;

    move-result-object v0

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v5

    invoke-virtual {v5}, LS0/V;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LM0/N;->n(J)I

    move-result v5

    invoke-interface {v0, v5}, LS0/L;->b(I)I

    move-result v0

    invoke-virtual {p0}, LN/F;->J()LS0/L;

    move-result-object v5

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v6

    invoke-virtual {v6}, LS0/V;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LM0/N;->i(J)I

    move-result v6

    invoke-interface {v5, v6}, LS0/L;->b(I)I

    move-result v5

    invoke-virtual {v2, v0}, LM0/K;->c(I)LX0/i;

    move-result-object v0

    sub-int/2addr v5, v3

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v2, v5}, LM0/K;->c(I)LX0/i;

    move-result-object v2

    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, LH/w;->u()Z

    move-result v5

    if-ne v5, v3, :cond_b

    const v5, -0x642610e1

    invoke-interface {p2, v5}, LV/n;->T(I)V

    shl-int/lit8 v5, v1, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v5, v5, 0x6

    invoke-static {v3, v0, p0, p2, v5}, LN/G;->a(ZLX0/i;LN/F;LV/n;I)V

    :goto_6
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_7

    :cond_b
    const v0, -0x642262a6

    invoke-interface {p2, v0}, LV/n;->T(I)V

    goto :goto_6

    :goto_7
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, LH/w;->t()Z

    move-result v0

    if-ne v0, v3, :cond_c

    const v0, -0x64212d60

    invoke-interface {p2, v0}, LV/n;->T(I)V

    shl-int/lit8 v0, v1, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-static {v4, v2, p0, p2, v0}, LN/G;->a(ZLX0/i;LN/F;LV/n;I)V

    :goto_8
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_9

    :cond_c
    const v0, -0x641d82e6

    invoke-interface {p2, v0}, LV/n;->T(I)V

    goto :goto_8

    :goto_9
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_a

    :cond_d
    const v0, -0x641d3d26

    invoke-interface {p2, v0}, LV/n;->T(I)V

    goto :goto_9

    :goto_a
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, LN/F;->S()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {v0, v4}, LH/w;->K(Z)V

    :cond_e
    invoke-virtual {v0}, LH/w;->e()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, LH/w;->s()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, LN/F;->l0()V

    goto :goto_b

    :cond_f
    invoke-virtual {p0}, LN/F;->R()V

    :cond_10
    :goto_b
    sget-object v0, Li7/M;->a:Li7/M;

    goto/16 :goto_5

    :goto_c
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_d

    :cond_11
    const v0, 0x26d2223f

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    invoke-virtual {p0}, LN/F;->R()V

    :goto_d
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    :goto_e
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_13

    new-instance v0, LH/h$q;

    invoke-direct {v0, p0, p1, p3}, LH/h$q;-><init>(LN/F;ZI)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_13
    return-void
.end method

.method public static final e(LN/F;LV/n;I)V
    .locals 9

    .prologue
    const v0, -0x5597ad88

    invoke-interface {p1, v0}, LV/n;->r(I)LV/n;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, LH/w;->r()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    invoke-virtual {p0}, LN/F;->N()LM0/d;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_d

    const v0, -0x11039298

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_6

    :cond_5
    invoke-virtual {p0}, LN/F;->r()LH/F;

    move-result-object v2

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, LH/F;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    invoke-virtual {p0, v0}, LN/F;->B(LY0/e;)J

    move-result-wide v3

    invoke-interface {p1, v3, v4}, LV/n;->j(J)Z

    move-result v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_7

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_8

    :cond_7
    new-instance v5, LH/h$r;

    invoke-direct {v5, v3, v4}, LH/h$r;-><init>(J)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v0, v5

    check-cast v0, LN/i;

    sget-object v5, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v6, :cond_9

    sget-object v6, LV/n;->a:LV/n$a;

    invoke-virtual {v6}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_a

    :cond_9
    new-instance v7, LH/h$s;

    invoke-direct {v7, v2, p0, v8}, LH/h$s;-><init>(LH/F;LN/F;Lm7/e;)V

    invoke-interface {p1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lx7/p;

    invoke-static {v5, v2, v7}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-interface {p1, v3, v4}, LV/n;->j(J)Z

    move-result v5

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_b

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_c

    :cond_b
    new-instance v6, LH/h$t;

    invoke-direct {v6, v3, v4}, LH/h$t;-><init>(J)V

    invoke-interface {p1, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lx7/l;

    const/4 v3, 0x0

    invoke-static {v2, v3, v6, v1, v8}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x4

    const-wide/16 v3, 0x0

    move-object v1, v0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LH/a;->a(LN/i;Landroidx/compose/ui/d;JLV/n;II)V

    :goto_3
    invoke-interface {p1}, LV/n;->J()V

    goto :goto_4

    :cond_d
    const v0, -0x10f16b42

    invoke-interface {p1, v0}, LV/n;->T(I)V

    goto :goto_3

    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LV/q;->P()V

    :cond_e
    :goto_5
    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, LH/h$u;

    invoke-direct {v0, p0, p2}, LH/h$u;-><init>(LN/F;I)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_f
    return-void
.end method

.method public static final synthetic f(LV/G1;)Z
    .locals 0

    invoke-static {p0}, LH/h;->b(LV/G1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/d;LN/F;Lx7/p;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LH/h;->c(Landroidx/compose/ui/d;LN/F;Lx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic h(LN/F;ZLV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LH/h;->d(LN/F;ZLV/n;I)V

    return-void
.end method

.method public static final synthetic i(LH/w;)V
    .locals 0

    invoke-static {p0}, LH/h;->n(LH/w;)V

    return-void
.end method

.method public static final synthetic j(LH/w;LS0/V;LS0/L;)V
    .locals 0

    invoke-static {p0, p1, p2}, LH/h;->o(LH/w;LS0/V;LS0/L;)V

    return-void
.end method

.method public static final synthetic k(LS0/X;LH/w;LS0/V;LS0/s;LS0/L;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LH/h;->q(LS0/X;LH/w;LS0/V;LS0/s;LS0/L;)V

    return-void
.end method

.method public static final synthetic l(LH/w;Landroidx/compose/ui/focus/n;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, LH/h;->r(LH/w;Landroidx/compose/ui/focus/n;Z)V

    return-void
.end method

.method public static final m(LE/b;LS0/V;LH/D;LM0/K;LS0/L;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result p1

    invoke-interface {p4, p1}, LS0/L;->b(I)I

    move-result p1

    invoke-virtual {p3}, LM0/K;->l()LM0/J;

    move-result-object p4

    invoke-virtual {p4}, LM0/J;->j()LM0/d;

    move-result-object p4

    invoke-virtual {p4}, LM0/d;->length()I

    move-result p4

    if-ge p1, p4, :cond_0

    :goto_0
    invoke-virtual {p3, p1}, LM0/K;->d(I)Ln0/i;

    move-result-object p1

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, LH/D;->j()LM0/P;

    move-result-object v0

    invoke-virtual {p2}, LH/D;->a()LY0/e;

    move-result-object v1

    invoke-virtual {p2}, LH/D;->b()LR0/h$b;

    move-result-object v2

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LH/I;->b(LM0/P;LY0/e;LR0/h$b;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide p1

    new-instance p3, Ln0/i;

    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    int-to-float p1, p1

    const/4 p2, 0x0

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-direct {p3, p2, p2, p4, p1}, Ln0/i;-><init>(FFFF)V

    move-object p1, p3

    :goto_1
    invoke-interface {p0, p1, p5}, LE/b;->a(Ln0/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final n(LH/w;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LH/w;->g()LS0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LH/H;->a:LH/H$a;

    invoke-virtual {p0}, LH/w;->n()LS0/k;

    move-result-object v2

    invoke-virtual {p0}, LH/w;->m()Lx7/l;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, LH/H$a;->f(LS0/d0;LS0/k;Lx7/l;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LH/w;->E(LS0/d0;)V

    return-void
.end method

.method private static final o(LH/w;LS0/V;LS0/L;)V
    .locals 13

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, LH/w;->j()LH/V;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_1

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p0}, LH/w;->g()LS0/d0;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v10, :cond_2

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {p0}, LH/w;->i()LD0/t;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v9, :cond_3

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :cond_3
    :try_start_3
    sget-object v5, LH/H;->a:LH/H$a;

    invoke-virtual {p0}, LH/w;->v()LH/D;

    move-result-object v7

    invoke-virtual {v4}, LH/V;->f()LM0/K;

    move-result-object v8

    invoke-virtual {p0}, LH/w;->e()Z

    move-result v11

    move-object v6, p1

    move-object v12, p2

    invoke-virtual/range {v5 .. v12}, LH/H$a;->e(LS0/V;LH/D;LM0/K;LD0/t;LS0/d0;ZLS0/L;)V

    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0, v1, v3, v2}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p0
.end method

.method private static final p(Landroidx/compose/ui/d;LH/w;LN/F;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LH/h$v;

    invoke-direct {v0, p1, p2}, LH/h$v;-><init>(LH/w;LN/F;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final q(LS0/X;LH/w;LS0/V;LS0/s;LS0/L;)V
    .locals 7

    sget-object v0, LH/H;->a:LH/H$a;

    invoke-virtual {p1}, LH/w;->n()LS0/k;

    move-result-object v3

    invoke-virtual {p1}, LH/w;->m()Lx7/l;

    move-result-object v5

    invoke-virtual {p1}, LH/w;->l()Lx7/l;

    move-result-object v6

    move-object v1, p0

    move-object v2, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, LH/H$a;->h(LS0/X;LS0/V;LS0/k;LS0/s;Lx7/l;Lx7/l;)LS0/d0;

    move-result-object p0

    invoke-virtual {p1, p0}, LH/w;->E(LS0/d0;)V

    invoke-static {p1, p2, p4}, LH/h;->o(LH/w;LS0/V;LS0/L;)V

    return-void
.end method

.method private static final r(LH/w;Landroidx/compose/ui/focus/n;Z)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LH/w;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n;->f()V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, LH/w;->h()Landroidx/compose/ui/platform/s1;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroidx/compose/ui/platform/s1;->b()V

    :cond_1
    :goto_0
    return-void
.end method
