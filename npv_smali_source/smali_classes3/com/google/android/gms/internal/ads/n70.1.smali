.class public final Lcom/google/android/gms/internal/ads/n70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls3/Q1;

.field public final b:Lcom/google/android/gms/internal/ads/mk;

.field public final c:Lcom/google/android/gms/internal/ads/UX;

.field public final d:Ls3/X1;

.field public final e:Ls3/c2;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Lcom/google/android/gms/internal/ads/dh;

.field public final j:Ls3/i2;

.field public final k:I

.field public final l:Ln3/a;

.field public final m:Ln3/f;

.field public final n:Ls3/i0;

.field public final o:Lcom/google/android/gms/internal/ads/Z60;

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Landroid/os/Bundle;

.field public final t:Ls3/m0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/l70;Lcom/google/android/gms/internal/ads/m70;)V
    .locals 32

    .prologue
    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->C(Lcom/google/android/gms/internal/ads/l70;)Ls3/c2;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->e:Ls3/c2;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->k(Lcom/google/android/gms/internal/ads/l70;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->u(Lcom/google/android/gms/internal/ads/l70;)Ls3/m0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->t:Ls3/m0;

    new-instance v1, Ls3/X1;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v3, v2, Ls3/X1;->C:I

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-wide v4, v2, Ls3/X1;->D:J

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v6, v2, Ls3/X1;->E:Landroid/os/Bundle;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v7, v2, Ls3/X1;->F:I

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v8, v2, Ls3/X1;->G:Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-boolean v9, v2, Ls3/X1;->H:Z

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v10, v2, Ls3/X1;->I:I

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-boolean v2, v2, Ls3/X1;->J:Z

    const/4 v11, 0x1

    if-nez v2, :cond_1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->r(Lcom/google/android/gms/internal/ads/l70;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    move v11, v2

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v12, v2, Ls3/X1;->K:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v13, v2, Ls3/X1;->L:Ls3/M1;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v14, v2, Ls3/X1;->M:Landroid/location/Location;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v15, v2, Ls3/X1;->N:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->O:Landroid/os/Bundle;

    move-object/from16 v16, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->P:Landroid/os/Bundle;

    move-object/from16 v17, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->Q:Ljava/util/List;

    move-object/from16 v18, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->R:Ljava/lang/String;

    move-object/from16 v19, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->S:Ljava/lang/String;

    move-object/from16 v20, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-boolean v2, v2, Ls3/X1;->T:Z

    move/from16 v21, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->U:Ls3/X;

    move-object/from16 v22, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v2, v2, Ls3/X1;->V:I

    move/from16 v23, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->W:Ljava/lang/String;

    move-object/from16 v24, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->X:Ljava/util/List;

    move-object/from16 v25, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v2, v2, Ls3/X1;->Y:I

    invoke-static {v2}, Lv3/E0;->A(I)I

    move-result v26

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget-object v2, v2, Ls3/X1;->Z:Ljava/lang/String;

    move-object/from16 v27, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    iget v2, v2, Ls3/X1;->a0:I

    move/from16 v28, v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->A(Lcom/google/android/gms/internal/ads/l70;)Ls3/X1;

    move-result-object v2

    move-object/from16 p2, v12

    move-object/from16 v31, v13

    iget-wide v12, v2, Ls3/X1;->b0:J

    move-wide/from16 v29, v12

    move-object v2, v1

    move-object/from16 v12, p2

    move-object/from16 v13, v31

    invoke-direct/range {v2 .. v30}, Ls3/X1;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Ls3/M1;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLs3/X;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJ)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->G(Lcom/google/android/gms/internal/ads/l70;)Ls3/Q1;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->G(Lcom/google/android/gms/internal/ads/l70;)Ls3/Q1;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->H(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/dh;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->H(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/dh;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/dh;->H:Ls3/Q1;

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->m(Lcom/google/android/gms/internal/ads/l70;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->n(Lcom/google/android/gms/internal/ads/l70;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->h:Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->m(Lcom/google/android/gms/internal/ads/l70;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, v2

    goto :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->H(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/dh;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lcom/google/android/gms/internal/ads/dh;

    new-instance v3, Ln3/e$a;

    invoke-direct {v3}, Ln3/e$a;-><init>()V

    invoke-virtual {v3}, Ln3/e$a;->a()Ln3/e;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/dh;-><init>(Ln3/e;)V

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->H(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/dh;

    move-result-object v1

    :goto_2
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->i:Lcom/google/android/gms/internal/ads/dh;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->E(Lcom/google/android/gms/internal/ads/l70;)Ls3/i2;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->j:Ls3/i2;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->w(Lcom/google/android/gms/internal/ads/l70;)I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/ads/n70;->k:I

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->y(Lcom/google/android/gms/internal/ads/l70;)Ln3/a;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->l:Ln3/a;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->z(Lcom/google/android/gms/internal/ads/l70;)Ln3/f;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->m:Ln3/f;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->F(Lcom/google/android/gms/internal/ads/l70;)Ls3/i0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->n:Ls3/i0;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->I(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/mk;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->b:Lcom/google/android/gms/internal/ads/mk;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->K(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/X60;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/Z60;

    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/internal/ads/Z60;-><init>(Lcom/google/android/gms/internal/ads/X60;Lcom/google/android/gms/internal/ads/Y60;)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/n70;->o:Lcom/google/android/gms/internal/ads/Z60;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->o(Lcom/google/android/gms/internal/ads/l70;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/n70;->p:Z

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->p(Lcom/google/android/gms/internal/ads/l70;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/n70;->q:Z

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->J(Lcom/google/android/gms/internal/ads/l70;)Lcom/google/android/gms/internal/ads/UX;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->c:Lcom/google/android/gms/internal/ads/UX;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->q(Lcom/google/android/gms/internal/ads/l70;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/n70;->r:Z

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/l70;->x(Lcom/google/android/gms/internal/ads/l70;)Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n70;->s:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/fi;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n70;->m:Ln3/f;

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n70;->l:Ln3/a;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ln3/f;->f()Lcom/google/android/gms/internal/ads/fi;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n70;->l:Ln3/a;

    invoke-virtual {v0}, Ln3/a;->f()Lcom/google/android/gms/internal/ads/fi;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
